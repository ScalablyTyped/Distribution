package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/xcode", JSImport.Namespace)
@js.native
object xcodeMod extends js.Object {
  def addStoryboardFileToProject(
    pbxProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXProject */ js.Any,
    filePath: String,
    hasTargetGroup: Group
  ): Unit = js.native
}

