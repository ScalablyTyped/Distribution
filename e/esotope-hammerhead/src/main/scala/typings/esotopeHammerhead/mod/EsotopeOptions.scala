package typings.esotopeHammerhead.mod

import typings.esotopeHammerhead.anon.Compact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsotopeOptions extends StObject {
  
  var base: js.UndefOr[Double] = js.undefined
  
  var directive: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[Compact] = js.undefined
  
  var indent: js.UndefOr[String] = js.undefined
  
  var parse: js.UndefOr[js.Function] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var verbatim: js.UndefOr[String] = js.undefined
}
object EsotopeOptions {
  
  inline def apply(): EsotopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsotopeOptions]
  }
  
  extension [Self <: EsotopeOptions](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setDirective(value: Boolean): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
    
    inline def setFormat(value: Compact): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setVerbatim(value: String): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
    
    inline def setVerbatimUndefined: Self = StObject.set(x, "verbatim", js.undefined)
  }
}
