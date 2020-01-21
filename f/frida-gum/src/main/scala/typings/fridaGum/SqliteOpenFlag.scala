package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.readonly
  - typings.fridaGum.fridaGumStrings.readwrite
  - typings.fridaGum.fridaGumStrings.create
*/
trait SqliteOpenFlag extends js.Object

object SqliteOpenFlag {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.fridaGum.fridaGumStrings.create = this.cast("create")
  @scala.inline
  def readonly: typings.fridaGum.fridaGumStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typings.fridaGum.fridaGumStrings.readwrite = this.cast("readwrite")
}

