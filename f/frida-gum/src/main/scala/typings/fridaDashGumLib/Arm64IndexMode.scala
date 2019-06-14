package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.`post-adjust`
  - fridaDashGumLib.fridaDashGumLibStrings.`signed-offset`
  - fridaDashGumLib.fridaDashGumLibStrings.`pre-adjust`
*/
trait Arm64IndexMode extends js.Object

object Arm64IndexMode {
  @scala.inline
  def PostAdjust: fridaDashGumLib.fridaDashGumLibStrings.`post-adjust` = this.cast("post-adjust")
  @scala.inline
  def PreAdjust: fridaDashGumLib.fridaDashGumLibStrings.`pre-adjust` = this.cast("pre-adjust")
  @scala.inline
  def SignedOffset: fridaDashGumLib.fridaDashGumLibStrings.`signed-offset` = this.cast("signed-offset")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

