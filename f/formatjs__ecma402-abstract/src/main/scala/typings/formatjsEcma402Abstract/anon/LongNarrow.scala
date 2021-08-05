package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.displaynamesMod.LanguageTag
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongNarrow extends StObject {
  
  var long: Record[LanguageTag, String]
  
  var narrow: Record[LanguageTag, String]
  
  var short: Record[LanguageTag, String]
}
object LongNarrow {
  
  inline def apply(
    long: Record[LanguageTag, String],
    narrow: Record[LanguageTag, String],
    short: Record[LanguageTag, String]
  ): LongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrow]
  }
  
  extension [Self <: LongNarrow](x: Self) {
    
    inline def setLong(value: Record[LanguageTag, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[LanguageTag, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[LanguageTag, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
