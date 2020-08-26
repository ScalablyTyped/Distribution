package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: StartIndex): Request[Volumes] = js.native
}

object UseruploadedResource {
  @scala.inline
  def apply(list: StartIndex => Request[Volumes]): UseruploadedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UseruploadedResource]
  }
  @scala.inline
  implicit class UseruploadedResourceOps[Self <: UseruploadedResource] (val x: Self) extends AnyVal {
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
    def setList(value: StartIndex => Request[Volumes]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

