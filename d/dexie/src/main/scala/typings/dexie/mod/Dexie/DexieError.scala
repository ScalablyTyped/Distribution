package typings.dexie.mod.Dexie

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie.DexieError")
@js.native
class DexieError () extends Error {
  def this(name: String) = this()
  def this(name: String, message: String) = this()
  var inner: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("stack")
  var stack_DexieError: String = js.native
}

