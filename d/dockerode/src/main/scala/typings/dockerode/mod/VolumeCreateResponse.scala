package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.RefCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeCreateResponse extends StObject {
  
  var CreatedAt: js.UndefOr[String] = js.undefined
  
  var Driver: String
  
  var Labels: StringDictionary[String]
  
  var Mountpoint: String
  
  var Name: String
  
  var Options: StringDictionary[String]
  
  var Scope: String
  
  var Status: js.UndefOr[StringDictionary[String]] = js.undefined
  
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[RefCount | Null] = js.undefined
}
object VolumeCreateResponse {
  
  inline def apply(
    Driver: String,
    Labels: StringDictionary[String],
    Mountpoint: String,
    Name: String,
    Options: StringDictionary[String],
    Scope: String
  ): VolumeCreateResponse = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mountpoint = Mountpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeCreateResponse]
  }
  
  extension [Self <: VolumeCreateResponse](x: Self) {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setMountpoint(value: String): Self = StObject.set(x, "Mountpoint", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StringDictionary[String]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUsageData(value: RefCount): Self = StObject.set(x, "UsageData", value.asInstanceOf[js.Any])
    
    inline def setUsageDataNull: Self = StObject.set(x, "UsageData", null)
    
    inline def setUsageDataUndefined: Self = StObject.set(x, "UsageData", js.undefined)
  }
}
