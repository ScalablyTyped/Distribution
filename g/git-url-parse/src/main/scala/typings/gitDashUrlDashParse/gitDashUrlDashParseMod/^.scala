package typings.gitDashUrlDashParse.gitDashUrlDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-url-parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String): GitUrl = js.native
  def stringify(url: GitUrl): String = js.native
  def stringify(url: GitUrl, `type`: String): String = js.native
}

