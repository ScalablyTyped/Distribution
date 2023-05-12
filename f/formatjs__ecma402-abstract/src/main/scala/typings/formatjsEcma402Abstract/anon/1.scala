package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.CurrencyCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var long: Record[CurrencyCode, String]
  
  var narrow: Record[CurrencyCode, String]
  
  var short: Record[CurrencyCode, String]
}
object `1` {
  
  inline def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): `1` = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setLong(value: Record[CurrencyCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[CurrencyCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[CurrencyCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
