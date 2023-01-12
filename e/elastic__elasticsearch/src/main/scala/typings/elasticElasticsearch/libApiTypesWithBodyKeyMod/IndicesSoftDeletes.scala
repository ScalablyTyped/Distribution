package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSoftDeletes extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var retention_lease: js.UndefOr[IndicesRetentionLease] = js.undefined
}
object IndicesSoftDeletes {
  
  inline def apply(): IndicesSoftDeletes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSoftDeletes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSoftDeletes] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRetention_lease(value: IndicesRetentionLease): Self = StObject.set(x, "retention_lease", value.asInstanceOf[js.Any])
    
    inline def setRetention_leaseUndefined: Self = StObject.set(x, "retention_lease", js.undefined)
  }
}
