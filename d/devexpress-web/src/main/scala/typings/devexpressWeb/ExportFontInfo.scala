package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the font settings of the exported document.
  */
trait ExportFontInfo extends StObject {
  
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
  
  @scala.inline
  implicit class ExportFontInfoMutableBuilder[Self <: ExportFontInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGdiCharSet(value: js.Any): Self = StObject.set(x, "GdiCharSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomFontInfo(value: Boolean): Self = StObject.set(x, "UseCustomFontInfo", value.asInstanceOf[js.Any])
  }
}
