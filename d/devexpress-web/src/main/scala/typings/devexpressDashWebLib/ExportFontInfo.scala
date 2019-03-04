package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportFontInfo extends js.Object {
  var GdiCharSet: js.Any
  var Name: java.lang.String
  var UseCustomFontInfo: scala.Boolean
}

object ExportFontInfo {
  @scala.inline
  def apply(GdiCharSet: js.Any, Name: java.lang.String, UseCustomFontInfo: scala.Boolean): ExportFontInfo = {
    val __obj = js.Dynamic.literal(GdiCharSet = GdiCharSet, Name = Name, UseCustomFontInfo = UseCustomFontInfo)
  
    __obj.asInstanceOf[ExportFontInfo]
  }
}

