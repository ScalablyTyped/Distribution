package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbxprojMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios/pbxproj", JSImport.Default)
  @js.native
  def default(projectRootPath: String): js.Promise[IosProject] = js.native
  
  @js.native
  trait IosProject extends StObject {
    
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
    implicit class IosProjectMutableBuilder[Self <: IosProject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationNativeTarget(value: Target): Self = StObject.set(x, "applicationNativeTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbxProject(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ js.Any
      ): Self = StObject.set(x, "pbxProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    }
  }
}
