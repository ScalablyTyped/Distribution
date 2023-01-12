package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmGetLifecycleLifecycle extends StObject {
  
  var modified_date: DateTime
  
  var policy: IlmPolicy
  
  var version: VersionNumber
}
object IlmGetLifecycleLifecycle {
  
  inline def apply(modified_date: DateTime, policy: IlmPolicy, version: VersionNumber): IlmGetLifecycleLifecycle = {
    val __obj = js.Dynamic.literal(modified_date = modified_date.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmGetLifecycleLifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmGetLifecycleLifecycle] (val x: Self) extends AnyVal {
    
    inline def setModified_date(value: DateTime): Self = StObject.set(x, "modified_date", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: IlmPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
