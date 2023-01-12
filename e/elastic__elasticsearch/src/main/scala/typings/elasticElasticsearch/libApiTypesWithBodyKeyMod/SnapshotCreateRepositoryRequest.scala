package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreateRepositoryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Type] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var verify: js.UndefOr[Boolean] = js.undefined
}
object SnapshotCreateRepositoryRequest {
  
  inline def apply(name: Name): SnapshotCreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRepositoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotCreateRepositoryRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Type): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
