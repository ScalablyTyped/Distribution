package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.RegionCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortRecord extends StObject {
  
  var long: Record[RegionCode, String] = js.native
  
  var narrow: Record[RegionCode, String] = js.native
  
  var short: Record[RegionCode, String] = js.native
}
object ShortRecord {
  
  @scala.inline
  def apply(
    long: Record[RegionCode, String],
    narrow: Record[RegionCode, String],
    short: Record[RegionCode, String]
  ): ShortRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortRecord]
  }
  
  @scala.inline
  implicit class ShortRecordMutableBuilder[Self <: ShortRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: Record[RegionCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[RegionCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[RegionCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
