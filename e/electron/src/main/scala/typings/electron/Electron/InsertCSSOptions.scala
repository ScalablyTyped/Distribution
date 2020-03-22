package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCSSOptions extends js.Object {
  /**
    * Can be either 'user' or 'author'; Specifying 'user' enables you to prevent
    * websites from overriding the CSS you insert. Default is 'author'.
    */
  var cssOrigin: js.UndefOr[String] = js.undefined
}

object InsertCSSOptions {
  @scala.inline
  def apply(cssOrigin: String = null): InsertCSSOptions = {
    val __obj = js.Dynamic.literal()
    if (cssOrigin != null) __obj.updateDynamic("cssOrigin")(cssOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCSSOptions]
  }
}

