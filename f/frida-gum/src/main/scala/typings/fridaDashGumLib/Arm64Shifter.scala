package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.lsl
  - fridaDashGumLib.fridaDashGumLibStrings.msl
  - fridaDashGumLib.fridaDashGumLibStrings.lsr
  - fridaDashGumLib.fridaDashGumLibStrings.asr
  - fridaDashGumLib.fridaDashGumLibStrings.ror
*/
trait Arm64Shifter extends js.Object

object Arm64Shifter {
  @scala.inline
  def Asr: fridaDashGumLib.fridaDashGumLibStrings.asr = this.cast("asr")
  @scala.inline
  def Lsl: fridaDashGumLib.fridaDashGumLibStrings.lsl = this.cast("lsl")
  @scala.inline
  def Lsr: fridaDashGumLib.fridaDashGumLibStrings.lsr = this.cast("lsr")
  @scala.inline
  def Msl: fridaDashGumLib.fridaDashGumLibStrings.msl = this.cast("msl")
  @scala.inline
  def Ror: fridaDashGumLib.fridaDashGumLibStrings.ror = this.cast("ror")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

