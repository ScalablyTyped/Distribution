package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - ftpdLib.ftpdLibNumbers.`0`
  - ftpdLib.ftpdLibNumbers.`1`
  - ftpdLib.ftpdLibNumbers.`2`
  - ftpdLib.ftpdLibNumbers.`3`
  - ftpdLib.ftpdLibNumbers.`4`
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def DEBUG: ftpdLib.ftpdLibNumbers.`3` = this.cast(3)
  @scala.inline
  def ERROR: ftpdLib.ftpdLibNumbers.`0` = this.cast(0)
  @scala.inline
  def INFO: ftpdLib.ftpdLibNumbers.`2` = this.cast(2)
  @scala.inline
  def TRACE: ftpdLib.ftpdLibNumbers.`4` = this.cast(4)
  @scala.inline
  def WARN: ftpdLib.ftpdLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

