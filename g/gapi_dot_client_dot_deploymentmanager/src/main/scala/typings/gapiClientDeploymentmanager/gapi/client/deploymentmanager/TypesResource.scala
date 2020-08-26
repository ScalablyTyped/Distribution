package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesResource extends js.Object {
  /** Lists all resource types for Deployment Manager. */
  def list(request: Filter): Request[TypesListResponse] = js.native
}

object TypesResource {
  @scala.inline
  def apply(list: Filter => Request[TypesListResponse]): TypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TypesResource]
  }
  @scala.inline
  implicit class TypesResourceOps[Self <: TypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: Filter => Request[TypesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

