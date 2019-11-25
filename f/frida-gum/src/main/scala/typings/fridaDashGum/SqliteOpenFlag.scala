package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.readonly
  - typings.fridaDashGum.fridaDashGumStrings.readwrite
  - typings.fridaDashGum.fridaDashGumStrings.create
*/
trait SqliteOpenFlag extends js.Object

object SqliteOpenFlag {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.fridaDashGum.fridaDashGumStrings.create = this.cast("create")
  @scala.inline
  def readonly: typings.fridaDashGum.fridaDashGumStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typings.fridaDashGum.fridaDashGumStrings.readwrite = this.cast("readwrite")
}

