package typings.ellipsize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chars extends js.Object {
  /**
    * after this char(s) the text can be ellipsized and the ellipse
    * rendered. (default: [' ', '-'])
    */
  var chars: js.UndefOr[js.Array[String]] = js.native
  /**
    * ellipse element (default: '...')
    */
  var ellipse: js.UndefOr[String] = js.native
  /**
    * truncate the text or not (default: true)
    */
  var truncate: js.UndefOr[Boolean] = js.native
}

object Chars {
  @scala.inline
  def apply(): Chars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chars]
  }
  @scala.inline
  implicit class CharsOps[Self <: Chars] (val x: Self) extends AnyVal {
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
    def setCharsVarargs(value: String*): Self = this.set("chars", js.Array(value :_*))
    @scala.inline
    def setChars(value: js.Array[String]): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    @scala.inline
    def setEllipse(value: String): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
  
}

