package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'narrow' | 'short' | 'long', string | undefined> */
trait Recordnarrowshortlongstri extends StObject {
  
  var long: js.UndefOr[String] = js.undefined
  
  var narrow: js.UndefOr[String] = js.undefined
  
  var short: js.UndefOr[String] = js.undefined
}
object Recordnarrowshortlongstri {
  
  inline def apply(): Recordnarrowshortlongstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recordnarrowshortlongstri]
  }
  
  extension [Self <: Recordnarrowshortlongstri](x: Self) {
    
    inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
  }
}
