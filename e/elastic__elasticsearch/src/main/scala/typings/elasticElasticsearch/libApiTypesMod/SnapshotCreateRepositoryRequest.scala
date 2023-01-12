package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreateRepositoryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var repository: js.UndefOr[SnapshotRepository] = js.undefined
  
  var settings: SnapshotRepositorySettings
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var `type`: String
  
  var verify: js.UndefOr[Boolean] = js.undefined
}
object SnapshotCreateRepositoryRequest {
  
  inline def apply(name: Name, settings: SnapshotRepositorySettings, `type`: String): SnapshotCreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRepositoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotCreateRepositoryRequest] (val x: Self) extends AnyVal {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: SnapshotRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSettings(value: SnapshotRepositorySettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
