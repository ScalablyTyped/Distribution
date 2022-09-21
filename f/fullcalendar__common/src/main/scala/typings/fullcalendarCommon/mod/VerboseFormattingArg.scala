package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerboseFormattingArg extends StObject {
  
  var date: ExpandedZonedMarker
  
  var defaultSeparator: String
  
  var end: js.UndefOr[ExpandedZonedMarker] = js.undefined
  
  var localeCodes: js.Array[String]
  
  var start: ExpandedZonedMarker
  
  var timeZone: String
}
object VerboseFormattingArg {
  
  inline def apply(
    date: ExpandedZonedMarker,
    defaultSeparator: String,
    localeCodes: js.Array[String],
    start: ExpandedZonedMarker,
    timeZone: String
  ): VerboseFormattingArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultSeparator = defaultSeparator.asInstanceOf[js.Any], localeCodes = localeCodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerboseFormattingArg]
  }
  
  extension [Self <: VerboseFormattingArg](x: Self) {
    
    inline def setDate(value: ExpandedZonedMarker): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDefaultSeparator(value: String): Self = StObject.set(x, "defaultSeparator", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: ExpandedZonedMarker): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setLocaleCodes(value: js.Array[String]): Self = StObject.set(x, "localeCodes", value.asInstanceOf[js.Any])
    
    inline def setLocaleCodesVarargs(value: String*): Self = StObject.set(x, "localeCodes", js.Array(value*))
    
    inline def setStart(value: ExpandedZonedMarker): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
