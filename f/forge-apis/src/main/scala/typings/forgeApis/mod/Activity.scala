package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  var AllowedChildProcesses: js.Array[js.Object]
  
  var AppPackages: js.Array[String]
  
  var Description: js.UndefOr[String] = js.undefined
  
  var HostApplication: js.UndefOr[String] = js.undefined
  
  var Id: String
  
  var Instruction: js.Object
  
  var IsPublic: Boolean
  
  var Parameters: js.Object
  
  var RequiredEngineVersion: String
  
  var Version: Double
}
object Activity {
  
  inline def apply(
    AllowedChildProcesses: js.Array[js.Object],
    AppPackages: js.Array[String],
    Id: String,
    Instruction: js.Object,
    IsPublic: Boolean,
    Parameters: js.Object,
    RequiredEngineVersion: String,
    Version: Double
  ): Activity = {
    val __obj = js.Dynamic.literal(AllowedChildProcesses = AllowedChildProcesses.asInstanceOf[js.Any], AppPackages = AppPackages.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Instruction = Instruction.asInstanceOf[js.Any], IsPublic = IsPublic.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], RequiredEngineVersion = RequiredEngineVersion.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  extension [Self <: Activity](x: Self) {
    
    inline def setAllowedChildProcesses(value: js.Array[js.Object]): Self = StObject.set(x, "AllowedChildProcesses", value.asInstanceOf[js.Any])
    
    inline def setAllowedChildProcessesVarargs(value: js.Object*): Self = StObject.set(x, "AllowedChildProcesses", js.Array(value :_*))
    
    inline def setAppPackages(value: js.Array[String]): Self = StObject.set(x, "AppPackages", value.asInstanceOf[js.Any])
    
    inline def setAppPackagesVarargs(value: String*): Self = StObject.set(x, "AppPackages", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHostApplication(value: String): Self = StObject.set(x, "HostApplication", value.asInstanceOf[js.Any])
    
    inline def setHostApplicationUndefined: Self = StObject.set(x, "HostApplication", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInstruction(value: js.Object): Self = StObject.set(x, "Instruction", value.asInstanceOf[js.Any])
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setRequiredEngineVersion(value: String): Self = StObject.set(x, "RequiredEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
