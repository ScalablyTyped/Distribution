package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRepository
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRepositorySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var repository: js.UndefOr[SnapshotRepository] = js.undefined
  
  var settings: SnapshotRepositorySettings
  
  var `type`: String
}
object Type {
  
  inline def apply(settings: SnapshotRepositorySettings, `type`: String): Type = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setRepository(value: SnapshotRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSettings(value: SnapshotRepositorySettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
