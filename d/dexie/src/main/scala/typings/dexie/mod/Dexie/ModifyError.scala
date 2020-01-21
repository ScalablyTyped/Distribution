package typings.dexie.mod.Dexie

import typings.dexie.mod.IndexableTypeArrayReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie.ModifyError")
@js.native
class ModifyError () extends DexieError {
  def this(msg: String) = this()
  def this(msg: String, failures: js.Array[_]) = this()
  def this(msg: String, failures: js.Array[_], successCount: Double) = this()
  def this(msg: String, failures: js.Array[_], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
  var failedKeys: IndexableTypeArrayReadonly = js.native
  var failures: js.Array[_] = js.native
  var successCount: Double = js.native
}

