package typings.dwt.webTwainAcquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiffTag extends js.Object {
  var content: js.UndefOr[String] = js.native
  var tagIdentifier: js.UndefOr[Double] = js.native
  var useBase64Encoding: js.UndefOr[Boolean] = js.native
}

object TiffTag {
  @scala.inline
  def apply(): TiffTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffTag]
  }
  @scala.inline
  implicit class TiffTagOps[Self <: TiffTag] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setTagIdentifier(value: Double): Self = this.set("tagIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagIdentifier: Self = this.set("tagIdentifier", js.undefined)
    @scala.inline
    def setUseBase64Encoding(value: Boolean): Self = this.set("useBase64Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBase64Encoding: Self = this.set("useBase64Encoding", js.undefined)
  }
  
}

