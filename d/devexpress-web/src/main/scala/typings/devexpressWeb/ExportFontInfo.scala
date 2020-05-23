package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the font settings of the exported document.
  */
trait ExportFontInfo extends js.Object {
  /**
    * Specifies a value that specifies the GDI character set used by the current font.
    */
  var GdiCharSet: js.Any
  /**
    * Specifies the name of the font used in the exported document.
    */
  var Name: String
  /**
    * Specifies whether custom font settings are used in the exported document.
    */
  var UseCustomFontInfo: Boolean
}

object ExportFontInfo {
  @scala.inline
  def apply(GdiCharSet: js.Any, Name: String, UseCustomFontInfo: Boolean): ExportFontInfo = {
    val __obj = js.Dynamic.literal(GdiCharSet = GdiCharSet.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UseCustomFontInfo = UseCustomFontInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFontInfo]
  }
}

