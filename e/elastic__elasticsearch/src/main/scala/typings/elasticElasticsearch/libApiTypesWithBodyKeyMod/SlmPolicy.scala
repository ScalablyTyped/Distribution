package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmPolicy extends StObject {
  
  var config: SlmConfiguration
  
  var name: Name
  
  var repository: String
  
  var retention: SlmRetention
  
  var schedule: WatcherCronExpression
}
object SlmPolicy {
  
  inline def apply(
    config: SlmConfiguration,
    name: Name,
    repository: String,
    retention: SlmRetention,
    schedule: WatcherCronExpression
  ): SlmPolicy = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPolicy]
  }
  
  extension [Self <: SlmPolicy](x: Self) {
    
    inline def setConfig(value: SlmConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRetention(value: SlmRetention): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: WatcherCronExpression): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}
