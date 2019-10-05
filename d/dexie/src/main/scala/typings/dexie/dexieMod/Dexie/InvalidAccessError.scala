package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie.InvalidAccessError")
@js.native
class InvalidAccessError () extends DexieError {
  def this(inner: js.Object) = this()
  def this(msg: String) = this()
  def this(msg: String, inner: js.Object) = this()
}

