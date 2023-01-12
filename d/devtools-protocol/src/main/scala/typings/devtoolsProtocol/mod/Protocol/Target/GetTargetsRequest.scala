package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetsRequest extends StObject {
  
  /**
    * Only targets matching filter will be reported. If filter is not specified
    * and target discovery is currently enabled, a filter used for target discovery
    * is used for consistency.
    */
  var filter: js.UndefOr[TargetFilter] = js.undefined
}
object GetTargetsRequest {
  
  inline def apply(): GetTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: TargetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterEntry*): Self = StObject.set(x, "filter", js.Array(value*))
  }
}
