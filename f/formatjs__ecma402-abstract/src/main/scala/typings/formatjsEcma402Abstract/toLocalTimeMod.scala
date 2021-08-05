package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Day
import typings.formatjsEcma402Abstract.dateTimeMod.UnpackedZoneData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toLocalTimeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/ToLocalTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ToLocalTime(t: Double, calendar: String, timeZone: String, hasTzData: ToLocalTimeImplDetails): Day = (^.asInstanceOf[js.Dynamic].applyDynamic("ToLocalTime")(t.asInstanceOf[js.Any], calendar.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], hasTzData.asInstanceOf[js.Any])).asInstanceOf[Day]
  
  trait ToLocalTimeImplDetails extends StObject {
    
    var tzData: Record[String, js.Array[UnpackedZoneData]]
  }
  object ToLocalTimeImplDetails {
    
    inline def apply(tzData: Record[String, js.Array[UnpackedZoneData]]): ToLocalTimeImplDetails = {
      val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToLocalTimeImplDetails]
    }
    
    extension [Self <: ToLocalTimeImplDetails](x: Self) {
      
      inline def setTzData(value: Record[String, js.Array[UnpackedZoneData]]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    }
  }
}
