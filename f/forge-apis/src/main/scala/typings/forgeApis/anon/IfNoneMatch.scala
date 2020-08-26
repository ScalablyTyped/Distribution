package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfNoneMatch extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.native
  var ifModifiedSince: js.UndefOr[String] = js.native
  var ifNoneMatch: js.UndefOr[String] = js.native
  var range: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
}

object IfNoneMatch {
  @scala.inline
  def apply(): IfNoneMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfNoneMatch]
  }
  @scala.inline
  implicit class IfNoneMatchOps[Self <: IfNoneMatch] (val x: Self) extends AnyVal {
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
    def setAcceptEncoding(value: String): Self = this.set("acceptEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptEncoding: Self = this.set("acceptEncoding", js.undefined)
    @scala.inline
    def setIfModifiedSince(value: String): Self = this.set("ifModifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("ifModifiedSince", js.undefined)
    @scala.inline
    def setIfNoneMatch(value: String): Self = this.set("ifNoneMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("ifNoneMatch", js.undefined)
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

