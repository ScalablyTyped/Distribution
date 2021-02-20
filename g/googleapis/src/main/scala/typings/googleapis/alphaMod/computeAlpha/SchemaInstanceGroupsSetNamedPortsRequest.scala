package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupsSetNamedPortsRequest extends StObject {
  
  /**
    * The fingerprint of the named ports information for this instance group.
    * Use this optional property to prevent conflicts when multiple users
    * change the named ports settings concurrently. Obtain the fingerprint with
    * the instanceGroups.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request. A request with an incorrect fingerprint
    * will fail with error 412 conditionNotMet.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The list of named ports to set for this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.native
}
object SchemaInstanceGroupsSetNamedPortsRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsSetNamedPortsRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupsSetNamedPortsRequestMutableBuilder[Self <: SchemaInstanceGroupsSetNamedPortsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setNamedPorts(value: js.Array[SchemaNamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    @scala.inline
    def setNamedPortsVarargs(value: SchemaNamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value :_*))
  }
}
