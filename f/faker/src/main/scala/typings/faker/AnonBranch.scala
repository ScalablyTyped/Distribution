package typings.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBranch extends js.Object {
  def branch(): String = js.native
  def commitEntry(): String = js.native
  def commitEntry(options: AnonMerge): String = js.native
  def commitMessage(): String = js.native
  def commitSha(): String = js.native
  def shortSha(): String = js.native
}

