package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApksListResponse extends js.Object {
  var apks: js.UndefOr[js.Array[SchemaApk]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaApksListResponse {
  @scala.inline
  def apply(): SchemaApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksListResponse]
  }
  @scala.inline
  implicit class SchemaApksListResponseOps[Self <: SchemaApksListResponse] (val x: Self) extends AnyVal {
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
    def setApksVarargs(value: SchemaApk*): Self = this.set("apks", js.Array(value :_*))
    @scala.inline
    def setApks(value: js.Array[SchemaApk]): Self = this.set("apks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApks: Self = this.set("apks", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

