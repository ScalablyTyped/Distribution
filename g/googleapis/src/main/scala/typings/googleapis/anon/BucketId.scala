package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketId extends js.Object {
  var bucketId: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object BucketId {
  @scala.inline
  def apply(): BucketId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketId]
  }
  @scala.inline
  implicit class BucketIdOps[Self <: BucketId] (val x: Self) extends AnyVal {
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
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketId: Self = this.set("bucketId", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

