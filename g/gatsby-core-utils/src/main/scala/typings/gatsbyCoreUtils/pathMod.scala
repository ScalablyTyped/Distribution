package typings.gatsbyCoreUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby-core-utils/dist/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  def isNodeInternalModulePath(fileName: String): Boolean = js.native
  def joinPath(paths: String*): String = js.native
  def slash(path: String): String = js.native
}

