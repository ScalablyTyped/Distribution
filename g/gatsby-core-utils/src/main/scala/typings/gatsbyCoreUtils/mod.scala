package typings.gatsbyCoreUtils

import typings.configstore.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby-core-utils/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val createRequireFromPath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Module.createRequire */ js.Any = js.native
  def cpuCoreCount(): Double = js.native
  def cpuCoreCount(ignoreEnvVar: Boolean): Double = js.native
  def createContentDigest(input: js.Any): String = js.native
  def getCIName(): String | Null = js.native
  def getConfigStore(): ^ = js.native
  def getGatsbyVersion(): String = js.native
  def isCI(): Boolean = js.native
  def isNodeInternalModulePath(fileName: String): Boolean = js.native
  def joinPath(paths: String*): String = js.native
  def slash(path: String): String = js.native
  def urlResolve(segments: String*): String = js.native
}

