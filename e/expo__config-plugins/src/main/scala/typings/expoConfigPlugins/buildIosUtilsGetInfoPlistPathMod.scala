package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.TargetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosUtilsGetInfoPlistPathMod {
  
  @JSImport("@expo/config-plugins/build/ios/utils/getInfoPlistPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInfoPlistPathFromPbxproj(projectRootOrProject: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPathFromPbxproj")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getInfoPlistPathFromPbxproj(projectRootOrProject: String, hasTargetNameBuildConfiguration: TargetName): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPathFromPbxproj")(projectRootOrProject.asInstanceOf[js.Any], hasTargetNameBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getInfoPlistPathFromPbxproj(
    projectRootOrProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPathFromPbxproj")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getInfoPlistPathFromPbxproj(
    projectRootOrProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    hasTargetNameBuildConfiguration: TargetName
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPathFromPbxproj")(projectRootOrProject.asInstanceOf[js.Any], hasTargetNameBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
