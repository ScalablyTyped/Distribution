package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsMod {
  
  @JSImport("@electron/get/dist/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureIsTruthyString[T, K /* <: /* keyof T */ String */](obj: T, key: K): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureIsTruthyString")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getHostArch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostArch")().asInstanceOf[String]
  
  inline def getNodeArch(arch: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeArch")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isOfficialLinuxIA32Download(platform: String, arch: String, version: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOfficialLinuxIA32Download")(platform.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isOfficialLinuxIA32Download(platform: String, arch: String, version: String, mirrorOptions: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOfficialLinuxIA32Download")(platform.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], version.asInstanceOf[js.Any], mirrorOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeVersion(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uname")().asInstanceOf[String]
  
  inline def withTempDirectory[T](fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTempDirectory")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def withTempDirectoryIn[T](parentDirectory: String, fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTempDirectoryIn")(parentDirectory.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def withTempDirectoryIn[T](parentDirectory: Unit, fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTempDirectoryIn")(parentDirectory.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
