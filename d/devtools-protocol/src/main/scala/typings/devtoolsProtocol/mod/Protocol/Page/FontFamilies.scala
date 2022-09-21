package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilies extends StObject {
  
  /**
    * The cursive font-family.
    */
  var cursive: js.UndefOr[String] = js.undefined
  
  /**
    * The fantasy font-family.
    */
  var fantasy: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed font-family.
    */
  var fixed: js.UndefOr[String] = js.undefined
  
  /**
    * The math font-family.
    */
  var math: js.UndefOr[String] = js.undefined
  
  /**
    * The sansSerif font-family.
    */
  var sansSerif: js.UndefOr[String] = js.undefined
  
  /**
    * The serif font-family.
    */
  var serif: js.UndefOr[String] = js.undefined
  
  /**
    * The standard font-family.
    */
  var standard: js.UndefOr[String] = js.undefined
}
object FontFamilies {
  
  inline def apply(): FontFamilies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilies]
  }
  
  extension [Self <: FontFamilies](x: Self) {
    
    inline def setCursive(value: String): Self = StObject.set(x, "cursive", value.asInstanceOf[js.Any])
    
    inline def setCursiveUndefined: Self = StObject.set(x, "cursive", js.undefined)
    
    inline def setFantasy(value: String): Self = StObject.set(x, "fantasy", value.asInstanceOf[js.Any])
    
    inline def setFantasyUndefined: Self = StObject.set(x, "fantasy", js.undefined)
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setMath(value: String): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    inline def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    inline def setSansSerif(value: String): Self = StObject.set(x, "sansSerif", value.asInstanceOf[js.Any])
    
    inline def setSansSerifUndefined: Self = StObject.set(x, "sansSerif", js.undefined)
    
    inline def setSerif(value: String): Self = StObject.set(x, "serif", value.asInstanceOf[js.Any])
    
    inline def setSerifUndefined: Self = StObject.set(x, "serif", js.undefined)
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
