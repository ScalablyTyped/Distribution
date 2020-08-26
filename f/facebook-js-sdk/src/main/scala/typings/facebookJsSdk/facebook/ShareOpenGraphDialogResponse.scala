package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareOpenGraphDialogResponse extends DialogResponse {
  var post_id: String = js.native
}

object ShareOpenGraphDialogResponse {
  @scala.inline
  def apply(post_id: String): ShareOpenGraphDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogResponse]
  }
  @scala.inline
  implicit class ShareOpenGraphDialogResponseOps[Self <: ShareOpenGraphDialogResponse] (val x: Self) extends AnyVal {
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
    def setPost_id(value: String): Self = this.set("post_id", value.asInstanceOf[js.Any])
  }
  
}

