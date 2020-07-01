package typings.ellipsize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chars extends js.Object {
  /**
    * after this char(s) the text can be ellipsized and the ellipse
    * rendered. (default: [' ', '-'])
    */
  var chars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * ellipse element (default: '...')
    */
  var ellipse: js.UndefOr[String] = js.undefined
  /**
    * truncate the text or not (default: true)
    */
  var truncate: js.UndefOr[Boolean] = js.undefined
}

object Chars {
  @scala.inline
  def apply(
    chars: js.Array[String] = null,
    ellipse: String = null,
    truncate: js.UndefOr[Boolean] = js.undefined
  ): Chars = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (ellipse != null) __obj.updateDynamic("ellipse")(ellipse.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chars]
  }
}

