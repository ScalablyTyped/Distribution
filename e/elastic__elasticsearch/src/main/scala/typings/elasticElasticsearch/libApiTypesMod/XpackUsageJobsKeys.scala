package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageJobsKeys extends StObject {
  
  var _all: js.UndefOr[XpackUsageAllJobs] = js.undefined
}
object XpackUsageJobsKeys {
  
  inline def apply(): XpackUsageJobsKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsageJobsKeys]
  }
  
  extension [Self <: XpackUsageJobsKeys](x: Self) {
    
    inline def set_all(value: XpackUsageAllJobs): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
    
    inline def set_allUndefined: Self = StObject.set(x, "_all", js.undefined)
  }
}
