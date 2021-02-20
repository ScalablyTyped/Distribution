package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsMod {
  
  @JSImport("@electron/get/dist/esm/utils", "ensureIsTruthyString")
  @js.native
  def ensureIsTruthyString[T, K /* <: /* keyof T */ String */](obj: T, key: K): Unit = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "getHostArch")
  @js.native
  def getHostArch(): String = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "getNodeArch")
  @js.native
  def getNodeArch(arch: String): String = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "isOfficialLinuxIA32Download")
  @js.native
  def isOfficialLinuxIA32Download(platform: String, arch: String, version: String): Boolean = js.native
  @JSImport("@electron/get/dist/esm/utils", "isOfficialLinuxIA32Download")
  @js.native
  def isOfficialLinuxIA32Download(platform: String, arch: String, version: String, mirrorOptions: js.Object): Boolean = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "normalizeVersion")
  @js.native
  def normalizeVersion(version: String): String = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "uname")
  @js.native
  def uname(): String = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "withTempDirectory")
  @js.native
  def withTempDirectory[T](fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = js.native
  
  @JSImport("@electron/get/dist/esm/utils", "withTempDirectoryIn")
  @js.native
  def withTempDirectoryIn[T](
    parentDirectory: js.UndefOr[scala.Nothing],
    fn: js.Function1[/* directory */ String, js.Promise[T]]
  ): js.Promise[T] = js.native
  @JSImport("@electron/get/dist/esm/utils", "withTempDirectoryIn")
  @js.native
  def withTempDirectoryIn[T](parentDirectory: String, fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = js.native
}
