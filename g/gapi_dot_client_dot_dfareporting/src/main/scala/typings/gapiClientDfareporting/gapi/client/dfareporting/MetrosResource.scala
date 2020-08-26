package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetrosResource extends js.Object {
  /** Retrieves a list of metros. */
  def list(request: Key): Request[MetrosListResponse] = js.native
}

object MetrosResource {
  @scala.inline
  def apply(list: Key => Request[MetrosListResponse]): MetrosResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MetrosResource]
  }
  @scala.inline
  implicit class MetrosResourceOps[Self <: MetrosResource] (val x: Self) extends AnyVal {
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
    def setList(value: Key => Request[MetrosListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

