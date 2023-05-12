package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.RegionCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NarrowRecordShortRecord extends StObject {
  
  var long: Record[RegionCode, String]
  
  var narrow: Record[RegionCode, String]
  
  var short: Record[RegionCode, String]
}
object NarrowRecordShortRecord {
  
  inline def apply(
    long: Record[RegionCode, String],
    narrow: Record[RegionCode, String],
    short: Record[RegionCode, String]
  ): NarrowRecordShortRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowRecordShortRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NarrowRecordShortRecord] (val x: Self) extends AnyVal {
    
    inline def setLong(value: Record[RegionCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[RegionCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[RegionCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
