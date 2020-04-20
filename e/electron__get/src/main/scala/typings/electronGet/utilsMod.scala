package typings.electronGet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@electron/get/dist/cjs/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def ensureIsTruthyString[T, K /* <: /* keyof T */ String */](obj: T, key: K): Unit = js.native
  def getHostArch(): String = js.native
  def getNodeArch(arch: String): String = js.native
  def isOfficialLinuxIA32Download(platform: String, arch: String, version: String): Boolean = js.native
  def isOfficialLinuxIA32Download(platform: String, arch: String, version: String, mirrorOptions: js.Object): Boolean = js.native
  def normalizeVersion(version: String): String = js.native
  def uname(): String = js.native
  def withTempDirectory[T](fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = js.native
  def withTempDirectoryIn[T](
    parentDirectory: js.UndefOr[scala.Nothing],
    fn: js.Function1[/* directory */ String, js.Promise[T]]
  ): js.Promise[T] = js.native
  def withTempDirectoryIn[T](parentDirectory: String, fn: js.Function1[/* directory */ String, js.Promise[T]]): js.Promise[T] = js.native
}

