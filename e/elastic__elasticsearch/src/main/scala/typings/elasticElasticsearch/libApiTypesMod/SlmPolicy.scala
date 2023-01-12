package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmPolicy extends StObject {
  
  var config: js.UndefOr[SlmConfiguration] = js.undefined
  
  var name: Name
  
  var repository: String
  
  var retention: js.UndefOr[SlmRetention] = js.undefined
  
  var schedule: WatcherCronExpression
}
object SlmPolicy {
  
  inline def apply(name: Name, repository: String, schedule: WatcherCronExpression): SlmPolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlmPolicy] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: SlmConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRetention(value: SlmRetention): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setSchedule(value: WatcherCronExpression): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}
