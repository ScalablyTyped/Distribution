package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmConfiguration
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmRetention
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherCronExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  var config: js.UndefOr[SlmConfiguration] = js.undefined
  
  var name: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name] = js.undefined
  
  var repository: js.UndefOr[String] = js.undefined
  
  var retention: js.UndefOr[SlmRetention] = js.undefined
  
  var schedule: js.UndefOr[WatcherCronExpression] = js.undefined
}
object Repository {
  
  inline def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: SlmConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRetention(value: SlmRetention): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setSchedule(value: WatcherCronExpression): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
