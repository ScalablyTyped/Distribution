package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position settings for text.
  */
@js.native
trait Schema$TextPosition extends js.Object {
  /**
    * Horizontal alignment setting for the piece of text.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
}

object Schema$TextPosition {
  @scala.inline
  def apply(horizontalAlignment: String = null): Schema$TextPosition = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextPosition]
  }
}

