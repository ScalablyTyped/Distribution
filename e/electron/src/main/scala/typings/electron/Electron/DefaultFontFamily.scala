package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFontFamily extends StObject {
  
  /**
    * Defaults to `Script`.
    */
  var cursive: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `Impact`.
    */
  var fantasy: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `Courier New`.
    */
  var monospace: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `Arial`.
    */
  var sansSerif: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `Times New Roman`.
    */
  var serif: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `Times New Roman`.
    */
  var standard: js.UndefOr[String] = js.undefined
}
object DefaultFontFamily {
  
  inline def apply(): DefaultFontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultFontFamily]
  }
  
  extension [Self <: DefaultFontFamily](x: Self) {
    
    inline def setCursive(value: String): Self = StObject.set(x, "cursive", value.asInstanceOf[js.Any])
    
    inline def setCursiveUndefined: Self = StObject.set(x, "cursive", js.undefined)
    
    inline def setFantasy(value: String): Self = StObject.set(x, "fantasy", value.asInstanceOf[js.Any])
    
    inline def setFantasyUndefined: Self = StObject.set(x, "fantasy", js.undefined)
    
    inline def setMonospace(value: String): Self = StObject.set(x, "monospace", value.asInstanceOf[js.Any])
    
    inline def setMonospaceUndefined: Self = StObject.set(x, "monospace", js.undefined)
    
    inline def setSansSerif(value: String): Self = StObject.set(x, "sansSerif", value.asInstanceOf[js.Any])
    
    inline def setSansSerifUndefined: Self = StObject.set(x, "sansSerif", js.undefined)
    
    inline def setSerif(value: String): Self = StObject.set(x, "serif", value.asInstanceOf[js.Any])
    
    inline def setSerifUndefined: Self = StObject.set(x, "serif", js.undefined)
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
