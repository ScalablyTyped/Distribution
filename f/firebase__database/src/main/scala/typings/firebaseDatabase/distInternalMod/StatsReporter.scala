package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsReporter extends StObject {
  
  /* private */ var reportStats_ : Any
  
  /* private */ var server_ : Any
  
  /* private */ var statsListener_ : Any
  
  var statsToReport_ : StringDictionary[Boolean]
}
object StatsReporter {
  
  inline def apply(
    reportStats_ : Any,
    server_ : Any,
    statsListener_ : Any,
    statsToReport_ : StringDictionary[Boolean]
  ): StatsReporter = {
    val __obj = js.Dynamic.literal(reportStats_ = reportStats_.asInstanceOf[js.Any], server_ = server_.asInstanceOf[js.Any], statsListener_ = statsListener_.asInstanceOf[js.Any], statsToReport_ = statsToReport_.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsReporter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatsReporter] (val x: Self) extends AnyVal {
    
    inline def setReportStats_(value: Any): Self = StObject.set(x, "reportStats_", value.asInstanceOf[js.Any])
    
    inline def setServer_(value: Any): Self = StObject.set(x, "server_", value.asInstanceOf[js.Any])
    
    inline def setStatsListener_(value: Any): Self = StObject.set(x, "statsListener_", value.asInstanceOf[js.Any])
    
    inline def setStatsToReport_(value: StringDictionary[Boolean]): Self = StObject.set(x, "statsToReport_", value.asInstanceOf[js.Any])
  }
}
