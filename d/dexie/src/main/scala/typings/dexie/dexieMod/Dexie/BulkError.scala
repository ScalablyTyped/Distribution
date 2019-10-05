package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie.BulkError")
@js.native
class BulkError () extends DexieError {
  def this(msg: String) = this()
  def this(msg: String, failures: js.Array[_]) = this()
  var failures: js.Array[_] = js.native
}

