package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.`no-hint`
  - fridaDashGumLib.fridaDashGumLibStrings.likely
  - fridaDashGumLib.fridaDashGumLibStrings.unlikely
*/
trait X86BranchHint extends js.Object

object X86BranchHint {
  @scala.inline
  def Likely: fridaDashGumLib.fridaDashGumLibStrings.likely = this.cast("likely")
  @scala.inline
  def NoHint: fridaDashGumLib.fridaDashGumLibStrings.`no-hint` = this.cast("no-hint")
  @scala.inline
  def Unlikely: fridaDashGumLib.fridaDashGumLibStrings.unlikely = this.cast("unlikely")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

