package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBucketMetadataOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.native
}

object SetBucketMetadataOptions {
  @scala.inline
  def apply(): SetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBucketMetadataOptions]
  }
  @scala.inline
  implicit class SetBucketMetadataOptionsOps[Self <: SetBucketMetadataOptions] (val x: Self) extends AnyVal {
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
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

