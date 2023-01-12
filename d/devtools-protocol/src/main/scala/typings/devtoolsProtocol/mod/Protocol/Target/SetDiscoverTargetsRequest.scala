package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDiscoverTargetsRequest extends StObject {
  
  /**
    * Whether to discover available targets.
    */
  var discover: Boolean
  
  /**
    * Only targets matching filter will be attached. If `discover` is false,
    * `filter` must be omitted or empty.
    */
  var filter: js.UndefOr[TargetFilter] = js.undefined
}
object SetDiscoverTargetsRequest {
  
  inline def apply(discover: Boolean): SetDiscoverTargetsRequest = {
    val __obj = js.Dynamic.literal(discover = discover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDiscoverTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDiscoverTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscover(value: Boolean): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: TargetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterEntry*): Self = StObject.set(x, "filter", js.Array(value*))
  }
}
