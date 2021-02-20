package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.RefCount
import typings.dockerode.dockerodeStrings.global
import typings.dockerode.dockerodeStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:enable:interface-name */
@js.native
trait VolumeInspectInfo extends StObject {
  
  var Driver: String = js.native
  
  var Labels: StringDictionary[String] = js.native
  
  var Mountpoint: String = js.native
  
  var Name: String = js.native
  
  // Field is always present, but sometimes is null
  var Options: StringDictionary[String] | Null = js.native
  
  var Scope: local | global = js.native
  
  var Status: js.UndefOr[StringDictionary[String]] = js.native
  
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[RefCount | Null] = js.native
}
object VolumeInspectInfo {
  
  @scala.inline
  def apply(
    Driver: String,
    Labels: StringDictionary[String],
    Mountpoint: String,
    Name: String,
    Scope: local | global
  ): VolumeInspectInfo = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mountpoint = Mountpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInspectInfo]
  }
  
  @scala.inline
  implicit class VolumeInspectInfoMutableBuilder[Self <: VolumeInspectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountpoint(value: String): Self = StObject.set(x, "Mountpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "Options", null)
    
    @scala.inline
    def setScope(value: local | global): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StringDictionary[String]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUsageData(value: RefCount): Self = StObject.set(x, "UsageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageDataNull: Self = StObject.set(x, "UsageData", null)
    
    @scala.inline
    def setUsageDataUndefined: Self = StObject.set(x, "UsageData", js.undefined)
  }
}
