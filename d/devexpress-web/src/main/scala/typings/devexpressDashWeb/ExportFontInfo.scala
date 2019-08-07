package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the font settings of the exported document.
  */
@JSGlobal("ExportFontInfo")
@js.native
class ExportFontInfo () extends js.Object {
  /**
    * Specifies a value that specifies the GDI character set used by the current font.
    */
  var GdiCharSet: js.Any = js.native
  /**
    * Specifies the name of the font used in the exported document.
    */
  var Name: String = js.native
  /**
    * Specifies whether custom font settings are used in the exported document.
    */
  var UseCustomFontInfo: Boolean = js.native
}

