package typings.gitlab.baseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requester extends js.Object {
  var delete: js.Function = js.native
  var get: js.Function = js.native
  var post: js.Function = js.native
  var put: js.Function = js.native
  var stream: js.UndefOr[js.Function] = js.native
}

object Requester {
  @scala.inline
  def apply(delete: js.Function, get: js.Function, post: js.Function, put: js.Function): Requester = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requester]
  }
  @scala.inline
  implicit class RequesterOps[Self <: Requester] (val x: Self) extends AnyVal {
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
    def setDelete(value: js.Function): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: js.Function): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: js.Function): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: js.Function): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream(value: js.Function): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

