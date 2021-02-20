package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityOptional extends StObject {
  
  var AllowedChildProcesses: js.UndefOr[js.Array[js.Object]] = js.native
  
  var AppPackages: js.UndefOr[js.Array[String]] = js.native
  
  var Description: js.UndefOr[String] = js.native
  
  var HostApplication: js.UndefOr[String] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var Instruction: js.UndefOr[js.Object] = js.native
  
  var IsPublic: js.UndefOr[Boolean] = js.native
  
  var Parameters: js.UndefOr[js.Object] = js.native
  
  var RequiredEngineVersion: js.UndefOr[String] = js.native
  
  var Version: js.UndefOr[Double] = js.native
}
object ActivityOptional {
  
  @scala.inline
  def apply(): ActivityOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityOptional]
  }
  
  @scala.inline
  implicit class ActivityOptionalMutableBuilder[Self <: ActivityOptional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedChildProcesses(value: js.Array[js.Object]): Self = StObject.set(x, "AllowedChildProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedChildProcessesUndefined: Self = StObject.set(x, "AllowedChildProcesses", js.undefined)
    
    @scala.inline
    def setAllowedChildProcessesVarargs(value: js.Object*): Self = StObject.set(x, "AllowedChildProcesses", js.Array(value :_*))
    
    @scala.inline
    def setAppPackages(value: js.Array[String]): Self = StObject.set(x, "AppPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackagesUndefined: Self = StObject.set(x, "AppPackages", js.undefined)
    
    @scala.inline
    def setAppPackagesVarargs(value: String*): Self = StObject.set(x, "AppPackages", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHostApplication(value: String): Self = StObject.set(x, "HostApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostApplicationUndefined: Self = StObject.set(x, "HostApplication", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstruction(value: js.Object): Self = StObject.set(x, "Instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "Instruction", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "IsPublic", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Object): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = StObject.set(x, "RequiredEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredEngineVersionUndefined: Self = StObject.set(x, "RequiredEngineVersion", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
