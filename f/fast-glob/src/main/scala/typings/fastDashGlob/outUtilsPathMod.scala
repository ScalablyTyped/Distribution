package typings.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/path", JSImport.Namespace)
@js.native
object outUtilsPathMod extends js.Object {
  def isDotDirectory(filepath: String): Boolean = js.native
  def makeAbsolute(cwd: String, filepath: String): String = js.native
  def normalize(filepath: String): String = js.native
}

