package typings.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie.ReadOnlyError")
@js.native
class ReadOnlyError () extends DexieError {
  def this(inner: js.Object) = this()
  def this(msg: String) = this()
  def this(msg: String, inner: js.Object) = this()
}

