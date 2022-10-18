package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDatafeedConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlJobConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datafeedconfig extends StObject {
  
  var datafeed_config: js.UndefOr[MlDatafeedConfig] = js.undefined
  
  var job_config: js.UndefOr[MlJobConfig] = js.undefined
}
object Datafeedconfig {
  
  inline def apply(): Datafeedconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datafeedconfig]
  }
  
  extension [Self <: Datafeedconfig](x: Self) {
    
    inline def setDatafeed_config(value: MlDatafeedConfig): Self = StObject.set(x, "datafeed_config", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_configUndefined: Self = StObject.set(x, "datafeed_config", js.undefined)
    
    inline def setJob_config(value: MlJobConfig): Self = StObject.set(x, "job_config", value.asInstanceOf[js.Any])
    
    inline def setJob_configUndefined: Self = StObject.set(x, "job_config", js.undefined)
  }
}
