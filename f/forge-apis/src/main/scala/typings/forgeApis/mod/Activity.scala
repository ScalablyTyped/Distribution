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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedChildProcesses(value: js.Array[js.Object]): Self = StObject.set(x, "AllowedChildProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedChildProcessesVarargs(value: js.Object*): Self = StObject.set(x, "AllowedChildProcesses", js.Array(value :_*))
    
    @scala.inline
    def setAppPackages(value: js.Array[String]): Self = StObject.set(x, "AppPackages", value.asInstanceOf[js.Any])
    
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
    def setInstruction(value: js.Object): Self = StObject.set(x, "Instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Object): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = StObject.set(x, "RequiredEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
