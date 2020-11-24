package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkCreateOptions extends js.Object {
  
  var Attachable: js.UndefOr[Boolean] = js.native
  
  var CheckDuplicate: js.UndefOr[Boolean] = js.native
  
  var Driver: js.UndefOr[String] = js.native
  
  var EnableIPv6: js.UndefOr[Boolean] = js.native
  
  var IPAM: js.UndefOr[typings.dockerode.mod.IPAM] = js.native
  
  var Ingress: js.UndefOr[Boolean] = js.native
  
  var Internal: js.UndefOr[Boolean] = js.native
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var Name: String = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
}
object NetworkCreateOptions {
  
  @scala.inline
  def apply(Name: String): NetworkCreateOptions = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCreateOptions]
  }
  
  @scala.inline
  implicit class NetworkCreateOptionsOps[Self <: NetworkCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachable(value: Boolean): Self = this.set("Attachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachable: Self = this.set("Attachable", js.undefined)
    
    @scala.inline
    def setCheckDuplicate(value: Boolean): Self = this.set("CheckDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckDuplicate: Self = this.set("CheckDuplicate", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("Driver", js.undefined)
    
    @scala.inline
    def setEnableIPv6(value: Boolean): Self = this.set("EnableIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIPv6: Self = this.set("EnableIPv6", js.undefined)
    
    @scala.inline
    def setIPAM(value: IPAM): Self = this.set("IPAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAM: Self = this.set("IPAM", js.undefined)
    
    @scala.inline
    def setIngress(value: Boolean): Self = this.set("Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngress: Self = this.set("Ingress", js.undefined)
    
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("Internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("Internal", js.undefined)
    
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
