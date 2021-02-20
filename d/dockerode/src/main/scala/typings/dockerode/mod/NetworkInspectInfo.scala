package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Information returned from inspecting a network
@js.native
trait NetworkInspectInfo extends StObject {
  
  var Attachable: Boolean = js.native
  
  var ConfigFrom: js.UndefOr[typings.dockerode.anon.Network] = js.native
  
  var ConfigOnly: Boolean = js.native
  
  var Containers: js.UndefOr[StringDictionary[NetworkContainer]] = js.native
  
  var Created: String = js.native
  
  var Driver: String = js.native
  
  var EnableIPv6: Boolean = js.native
  
  var IPAM: js.UndefOr[typings.dockerode.mod.IPAM] = js.native
  
  var Id: String = js.native
  
  var Ingress: Boolean = js.native
  
  var Internal: Boolean = js.native
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var Name: String = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
  
  var Scope: String = js.native
}
object NetworkInspectInfo {
  
  @scala.inline
  def apply(
    Attachable: Boolean,
    ConfigOnly: Boolean,
    Created: String,
    Driver: String,
    EnableIPv6: Boolean,
    Id: String,
    Ingress: Boolean,
    Internal: Boolean,
    Name: String,
    Scope: String
  ): NetworkInspectInfo = {
    val __obj = js.Dynamic.literal(Attachable = Attachable.asInstanceOf[js.Any], ConfigOnly = ConfigOnly.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], EnableIPv6 = EnableIPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Ingress = Ingress.asInstanceOf[js.Any], Internal = Internal.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInspectInfo]
  }
  
  @scala.inline
  implicit class NetworkInspectInfoMutableBuilder[Self <: NetworkInspectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachable(value: Boolean): Self = StObject.set(x, "Attachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFrom(value: typings.dockerode.anon.Network): Self = StObject.set(x, "ConfigFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFromUndefined: Self = StObject.set(x, "ConfigFrom", js.undefined)
    
    @scala.inline
    def setConfigOnly(value: Boolean): Self = StObject.set(x, "ConfigOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainers(value: StringDictionary[NetworkContainer]): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIPv6(value: Boolean): Self = StObject.set(x, "EnableIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAM(value: IPAM): Self = StObject.set(x, "IPAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAMUndefined: Self = StObject.set(x, "IPAM", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngress(value: Boolean): Self = StObject.set(x, "Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: Boolean): Self = StObject.set(x, "Internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
