package typings.gatsbyDashCoreDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby-core-utils", JSImport.Namespace)
@js.native
object gatsbyDashCoreDashUtilsMod extends js.Object {
  def cpuCoreCount(): Double = js.native
  def cpuCoreCount(ignoreEnvVar: Boolean): Double = js.native
  def createContentDigest(input: js.Any): String = js.native
  def getCIName(): String | Null = js.native
  def isCI(): Boolean = js.native
  def isNodeInternalModulePath(fileName: String): Boolean = js.native
  def joinPath(paths: String*): String = js.native
  def slash(path: String): String = js.native
  def urlResolve(segments: String*): String = js.native
}

