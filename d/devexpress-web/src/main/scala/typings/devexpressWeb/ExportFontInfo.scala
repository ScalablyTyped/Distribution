package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the font settings of the exported document.
  */
@js.native
trait ExportFontInfo extends js.Object {
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

object ExportFontInfo {
  @scala.inline
  def apply(GdiCharSet: js.Any, Name: String, UseCustomFontInfo: Boolean): ExportFontInfo = {
    val __obj = js.Dynamic.literal(GdiCharSet = GdiCharSet.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UseCustomFontInfo = UseCustomFontInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFontInfo]
  }
  @scala.inline
  implicit class ExportFontInfoOps[Self <: ExportFontInfo] (val x: Self) extends AnyVal {
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
    def setGdiCharSet(value: js.Any): Self = this.set("GdiCharSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCustomFontInfo(value: Boolean): Self = this.set("UseCustomFontInfo", value.asInstanceOf[js.Any])
  }
  
}

