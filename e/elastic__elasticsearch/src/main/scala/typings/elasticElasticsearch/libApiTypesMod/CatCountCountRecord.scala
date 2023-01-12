package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatCountCountRecord extends StObject {
  
  var count: js.UndefOr[String] = js.undefined
  
  var dc: js.UndefOr[String] = js.undefined
  
  var docsCount: js.UndefOr[String] = js.undefined
  
  @JSName("docs.count")
  var docsDotcount: js.UndefOr[String] = js.undefined
  
  var epoch: js.UndefOr[SpecUtilsStringified[EpochTime[UnitSeconds]]] = js.undefined
  
  var hhmmss: js.UndefOr[TimeOfDay] = js.undefined
  
  var hms: js.UndefOr[TimeOfDay] = js.undefined
  
  var t: js.UndefOr[SpecUtilsStringified[EpochTime[UnitSeconds]]] = js.undefined
  
  var time: js.UndefOr[SpecUtilsStringified[EpochTime[UnitSeconds]]] = js.undefined
  
  var timestamp: js.UndefOr[TimeOfDay] = js.undefined
  
  var ts: js.UndefOr[TimeOfDay] = js.undefined
}
object CatCountCountRecord {
  
  inline def apply(): CatCountCountRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatCountCountRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatCountCountRecord] (val x: Self) extends AnyVal {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDc(value: String): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setDcUndefined: Self = StObject.set(x, "dc", js.undefined)
    
    inline def setDocsCount(value: String): Self = StObject.set(x, "docsCount", value.asInstanceOf[js.Any])
    
    inline def setDocsCountUndefined: Self = StObject.set(x, "docsCount", js.undefined)
    
    inline def setDocsDotcount(value: String): Self = StObject.set(x, "docs.count", value.asInstanceOf[js.Any])
    
    inline def setDocsDotcountUndefined: Self = StObject.set(x, "docs.count", js.undefined)
    
    inline def setEpoch(value: SpecUtilsStringified[EpochTime[UnitSeconds]]): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setHhmmss(value: TimeOfDay): Self = StObject.set(x, "hhmmss", value.asInstanceOf[js.Any])
    
    inline def setHhmmssUndefined: Self = StObject.set(x, "hhmmss", js.undefined)
    
    inline def setHms(value: TimeOfDay): Self = StObject.set(x, "hms", value.asInstanceOf[js.Any])
    
    inline def setHmsUndefined: Self = StObject.set(x, "hms", js.undefined)
    
    inline def setT(value: SpecUtilsStringified[EpochTime[UnitSeconds]]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setTime(value: SpecUtilsStringified[EpochTime[UnitSeconds]]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimestamp(value: TimeOfDay): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTs(value: TimeOfDay): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
