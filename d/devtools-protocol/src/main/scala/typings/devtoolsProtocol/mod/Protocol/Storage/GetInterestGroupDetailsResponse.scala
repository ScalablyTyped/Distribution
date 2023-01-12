package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInterestGroupDetailsResponse extends StObject {
  
  var details: InterestGroupDetails
}
object GetInterestGroupDetailsResponse {
  
  inline def apply(details: InterestGroupDetails): GetInterestGroupDetailsResponse = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInterestGroupDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInterestGroupDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: InterestGroupDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
