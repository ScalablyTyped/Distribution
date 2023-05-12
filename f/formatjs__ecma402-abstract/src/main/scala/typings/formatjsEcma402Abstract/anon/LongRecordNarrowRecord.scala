package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.LanguageTag
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRecordNarrowRecord extends StObject {
  
  var long: Record[LanguageTag, String]
  
  var narrow: Record[LanguageTag, String]
  
  var short: Record[LanguageTag, String]
}
object LongRecordNarrowRecord {
  
  inline def apply(
    long: Record[LanguageTag, String],
    narrow: Record[LanguageTag, String],
    short: Record[LanguageTag, String]
  ): LongRecordNarrowRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecordNarrowRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongRecordNarrowRecord] (val x: Self) extends AnyVal {
    
    inline def setLong(value: Record[LanguageTag, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[LanguageTag, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[LanguageTag, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
