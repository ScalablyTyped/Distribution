package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.readonly
  - fridaDashGumLib.fridaDashGumLibStrings.readwrite
  - fridaDashGumLib.fridaDashGumLibStrings.create
*/
trait SqliteOpenFlag extends js.Object

object SqliteOpenFlag {
  @scala.inline
  def Create: fridaDashGumLib.fridaDashGumLibStrings.create = this.cast("create")
  @scala.inline
  def ReadOnly: fridaDashGumLib.fridaDashGumLibStrings.readonly = this.cast("readonly")
  @scala.inline
  def ReadWrite: fridaDashGumLib.fridaDashGumLibStrings.readwrite = this.cast("readwrite")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

