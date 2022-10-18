package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Contents
import typings.expoConfigPlugins.anon.KindName
import typings.expoConfigPlugins.expoConfigPluginsStrings.groovy
import typings.expoConfigPlugins.expoConfigPluginsStrings.java_
import typings.expoConfigPlugins.expoConfigPluginsStrings.kt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidPathsMod {
  
  @JSImport("@expo/config-plugins/build/android/Paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidManifestAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidManifestAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getAppBuildGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBuildGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
  
  inline def getAppBuildGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBuildGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFileInfo(filePath: String): Contents = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(filePath.asInstanceOf[js.Any]).asInstanceOf[Contents]
  
  inline def getGradleFilePath(projectRoot: String, gradleName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGradleFilePath")(projectRoot.asInstanceOf[js.Any], gradleName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMainActivityAsync(projectRoot: String): js.Promise[ApplicationProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivityAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationProjectFile]]
  
  inline def getMainApplicationAsync(projectRoot: String): js.Promise[ApplicationProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationProjectFile]]
  
  inline def getProjectBuildGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectBuildGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
  
  inline def getProjectBuildGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectBuildGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectFilePath(projectRoot: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectFilePath")(projectRoot.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getProjectPathOrThrowAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectPathOrThrowAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getResourceFolderAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFolderAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getResourceXMLPathAsync(projectRoot: String, hasKindName: KindName): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourceXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKindName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getSettingsGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettingsGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
  
  inline def getSettingsGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettingsGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ApplicationProjectFile = ProjectFile[java_ | kt]
  
  type GradleProjectFile = ProjectFile[groovy | kt]
  
  trait ProjectFile[L /* <: String */] extends StObject {
    
    var contents: String
    
    var language: L
    
    var path: String
  }
  object ProjectFile {
    
    inline def apply[L /* <: String */](contents: String, language: L, path: String): ProjectFile[L] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectFile[L]]
    }
    
    extension [Self <: ProjectFile[?], L /* <: String */](x: Self & ProjectFile[L]) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: L): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
