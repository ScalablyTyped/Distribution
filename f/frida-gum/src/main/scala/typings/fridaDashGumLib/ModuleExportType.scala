package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.function
  - fridaDashGumLib.fridaDashGumLibStrings.variable
*/
trait ModuleExportType extends js.Object

object ModuleExportType {
  @scala.inline
  def Function: fridaDashGumLib.fridaDashGumLibStrings.function = this.cast("function")
  @scala.inline
  def Variable: fridaDashGumLib.fridaDashGumLibStrings.variable = this.cast("variable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

