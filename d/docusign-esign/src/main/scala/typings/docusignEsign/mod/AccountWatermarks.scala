package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountWatermarks extends StObject {
  
  var displayAngle: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[String] = js.undefined
  
  /**
    * The font to be used for the tab value. Supported fonts include:
    *
    * - Default
    * - Arial
    * - ArialNarrow
    * - Calibri
    * - CourierNew
    * - Garamond
    * - Georgia
    * - Helvetica
    * - LucidaConsole
    * - MSGothic
    * - MSMincho
    * - OCR-A
    * - Tahoma
    * - TimesNewRoman
    * - Trebuchet
    * - Verdana
    *
    */
  var font: js.UndefOr[String] = js.undefined
  
  /**
    * The font color to use for the information in the tab. Possible values are:
    *
    * - Black
    * - BrightBlue
    * - BrightRed
    * - DarkGreen
    * - DarkRed
    * - Gold
    * - Green
    * - NavyBlue
    * - Purple
    * - White
    *
    */
  var fontColor: js.UndefOr[String] = js.undefined
  
  /**
    * The font size used for the information in the tab. Possible values are:
    *
    * - Size7
    * - Size8
    * - Size9
    * - Size10
    * - Size11
    * - Size12
    * - Size14
    * - Size16
    * - Size18
    * - Size20
    * - Size22
    * - Size24
    * - Size26
    * - Size28
    * - Size36
    * - Size48
    * - Size72
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var imageBase64: js.UndefOr[String] = js.undefined
  
  var transparency: js.UndefOr[String] = js.undefined
  
  var watermarkText: js.UndefOr[String] = js.undefined
}
object AccountWatermarks {
  
  @scala.inline
  def apply(): AccountWatermarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWatermarks]
  }
  
  @scala.inline
  implicit class AccountWatermarksMutableBuilder[Self <: AccountWatermarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayAngle(value: String): Self = StObject.set(x, "displayAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAngleUndefined: Self = StObject.set(x, "displayAngle", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageBase64(value: String): Self = StObject.set(x, "imageBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBase64Undefined: Self = StObject.set(x, "imageBase64", js.undefined)
    
    @scala.inline
    def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    @scala.inline
    def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
  }
}
