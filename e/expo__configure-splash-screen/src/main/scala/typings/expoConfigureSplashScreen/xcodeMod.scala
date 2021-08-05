package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xcodeMod {
  
  @JSImport("@expo/configure-splash-screen/build/xcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addStoryboardFileToProject(
    pbxProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ js.Any,
    filePath: String,
    hasTargetGroup: Group
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStoryboardFileToProject")(pbxProject.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], hasTargetGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
