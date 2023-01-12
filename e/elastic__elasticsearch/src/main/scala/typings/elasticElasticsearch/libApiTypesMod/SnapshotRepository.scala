package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRepository extends StObject {
  
  var settings: SnapshotRepositorySettings
  
  var `type`: String
  
  var uuid: js.UndefOr[Uuid] = js.undefined
}
object SnapshotRepository {
  
  inline def apply(settings: SnapshotRepositorySettings, `type`: String): SnapshotRepository = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotRepository] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: SnapshotRepositorySettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
