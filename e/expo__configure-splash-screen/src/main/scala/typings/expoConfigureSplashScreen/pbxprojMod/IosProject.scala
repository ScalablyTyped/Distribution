package typings.expoConfigureSplashScreen.pbxprojMod

import typings.expoConfigureSplashScreen.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosProject extends js.Object {
  
  /**
    * main application PBXNativeTarget from `.pbxproj` file.
    */
  var applicationNativeTarget: Target = js.native
  
  /**
    * pbxProject reference that allows to modify `.pbxproj` file.
    */
  var pbxProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ js.Any = js.native
  
  var projectName: String = js.native
  
  /**
    * Root path to directory containing project source files.
    */
  var projectPath: String = js.native
}
object IosProject {
  
  @scala.inline
  def apply(
    applicationNativeTarget: Target,
    pbxProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ js.Any,
    projectName: String,
    projectPath: String
  ): IosProject = {
    val __obj = js.Dynamic.literal(applicationNativeTarget = applicationNativeTarget.asInstanceOf[js.Any], pbxProject = pbxProject.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosProject]
  }
  
  @scala.inline
  implicit class IosProjectOps[Self <: IosProject] (val x: Self) extends AnyVal {
    
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
    def setApplicationNativeTarget(value: Target): Self = this.set("applicationNativeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbxProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ js.Any
    ): Self = this.set("pbxProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectPath(value: String): Self = this.set("projectPath", value.asInstanceOf[js.Any])
  }
}
