package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Information returned from inspecting a network
@js.native
trait NetworkInspectInfo extends js.Object {
  
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
  implicit class NetworkInspectInfoOps[Self <: NetworkInspectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachable(value: Boolean): Self = this.set("Attachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigOnly(value: Boolean): Self = this.set("ConfigOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIPv6(value: Boolean): Self = this.set("EnableIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngress(value: Boolean): Self = this.set("Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("Internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFrom(value: typings.dockerode.anon.Network): Self = this.set("ConfigFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFrom: Self = this.set("ConfigFrom", js.undefined)
    
    @scala.inline
    def setContainers(value: StringDictionary[NetworkContainer]): Self = this.set("Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("Containers", js.undefined)
    
    @scala.inline
    def setIPAM(value: IPAM): Self = this.set("IPAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAM: Self = this.set("IPAM", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
  }
}
