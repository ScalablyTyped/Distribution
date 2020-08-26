package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Association
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: Association): Request[Volumes] = js.native
}

object AssociatedResource {
  @scala.inline
  def apply(list: Association => Request[Volumes]): AssociatedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AssociatedResource]
  }
  @scala.inline
  implicit class AssociatedResourceOps[Self <: AssociatedResource] (val x: Self) extends AnyVal {
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
    def setList(value: Association => Request[Volumes]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

