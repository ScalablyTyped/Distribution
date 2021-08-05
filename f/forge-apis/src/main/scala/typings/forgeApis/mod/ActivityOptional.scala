package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityOptional extends StObject {
  
  var AllowedChildProcesses: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var AppPackages: js.UndefOr[js.Array[String]] = js.undefined
  
  var Description: js.UndefOr[String] = js.undefined
  
  var HostApplication: js.UndefOr[String] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Instruction: js.UndefOr[js.Object] = js.undefined
  
  var IsPublic: js.UndefOr[Boolean] = js.undefined
  
  var Parameters: js.UndefOr[js.Object] = js.undefined
  
  var RequiredEngineVersion: js.UndefOr[String] = js.undefined
  
  var Version: js.UndefOr[Double] = js.undefined
}
object ActivityOptional {
  
  inline def apply(): ActivityOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityOptional]
  }
  
  extension [Self <: ActivityOptional](x: Self) {
    
    inline def setAllowedChildProcesses(value: js.Array[js.Object]): Self = StObject.set(x, "AllowedChildProcesses", value.asInstanceOf[js.Any])
    
    inline def setAllowedChildProcessesUndefined: Self = StObject.set(x, "AllowedChildProcesses", js.undefined)
    
    inline def setAllowedChildProcessesVarargs(value: js.Object*): Self = StObject.set(x, "AllowedChildProcesses", js.Array(value :_*))
    
    inline def setAppPackages(value: js.Array[String]): Self = StObject.set(x, "AppPackages", value.asInstanceOf[js.Any])
    
    inline def setAppPackagesUndefined: Self = StObject.set(x, "AppPackages", js.undefined)
    
    inline def setAppPackagesVarargs(value: String*): Self = StObject.set(x, "AppPackages", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHostApplication(value: String): Self = StObject.set(x, "HostApplication", value.asInstanceOf[js.Any])
    
    inline def setHostApplicationUndefined: Self = StObject.set(x, "HostApplication", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstruction(value: js.Object): Self = StObject.set(x, "Instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "Instruction", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "IsPublic", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRequiredEngineVersion(value: String): Self = StObject.set(x, "RequiredEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setRequiredEngineVersionUndefined: Self = StObject.set(x, "RequiredEngineVersion", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
