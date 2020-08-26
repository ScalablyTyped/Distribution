package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: PrettyPrint): Request[CustomDataSources] = js.native
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(list: PrettyPrint => Request[CustomDataSources]): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
  @scala.inline
  implicit class CustomDataSourcesResourceOps[Self <: CustomDataSourcesResource] (val x: Self) extends AnyVal {
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
    def setList(value: PrettyPrint => Request[CustomDataSources]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

