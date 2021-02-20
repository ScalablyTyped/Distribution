package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkCreateOptions extends StObject {
  
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
  implicit class NetworkCreateOptionsMutableBuilder[Self <: NetworkCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachable(value: Boolean): Self = StObject.set(x, "Attachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachableUndefined: Self = StObject.set(x, "Attachable", js.undefined)
    
    @scala.inline
    def setCheckDuplicate(value: Boolean): Self = StObject.set(x, "CheckDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckDuplicateUndefined: Self = StObject.set(x, "CheckDuplicate", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    @scala.inline
    def setEnableIPv6(value: Boolean): Self = StObject.set(x, "EnableIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIPv6Undefined: Self = StObject.set(x, "EnableIPv6", js.undefined)
    
    @scala.inline
    def setIPAM(value: IPAM): Self = StObject.set(x, "IPAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAMUndefined: Self = StObject.set(x, "IPAM", js.undefined)
    
    @scala.inline
    def setIngress(value: Boolean): Self = StObject.set(x, "Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressUndefined: Self = StObject.set(x, "Ingress", js.undefined)
    
    @scala.inline
    def setInternal(value: Boolean): Self = StObject.set(x, "Internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "Internal", js.undefined)
    
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
  }
}
