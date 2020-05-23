package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the font settings of the exported document.
  */
@JSGlobal("ExportFontInfo")
@js.native
class ExportFontInfo ()
  extends typings.devexpressWeb.ExportFontInfo {
  /**
    * Specifies a value that specifies the GDI character set used by the current font.
    */
  /* CompleteClass */
  override var GdiCharSet: js.Any = js.native
  /**
    * Specifies the name of the font used in the exported document.
    */
  /* CompleteClass */
  override var Name: String = js.native
  /**
    * Specifies whether custom font settings are used in the exported document.
    */
  /* CompleteClass */
  override var UseCustomFontInfo: Boolean = js.native
}

