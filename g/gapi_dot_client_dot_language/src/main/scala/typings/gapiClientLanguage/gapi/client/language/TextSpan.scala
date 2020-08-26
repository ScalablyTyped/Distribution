package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSpan extends js.Object {
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[Double] = js.native
  /** The content of the output text. */
  var content: js.UndefOr[String] = js.native
}

object TextSpan {
  @scala.inline
  def apply(): TextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpan]
  }
  @scala.inline
  implicit class TextSpanOps[Self <: TextSpan] (val x: Self) extends AnyVal {
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
    def setBeginOffset(value: Double): Self = this.set("beginOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginOffset: Self = this.set("beginOffset", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

