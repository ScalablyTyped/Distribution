package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportFontInfo extends js.Object {
  var GdiCharSet: js.Any
  var Name: String
  var UseCustomFontInfo: Boolean
}

object ExportFontInfo {
  @scala.inline
  def apply(GdiCharSet: js.Any, Name: String, UseCustomFontInfo: Boolean): ExportFontInfo = {
    val __obj = js.Dynamic.literal(GdiCharSet = GdiCharSet, Name = Name, UseCustomFontInfo = UseCustomFontInfo)
  
    __obj.asInstanceOf[ExportFontInfo]
  }
}

