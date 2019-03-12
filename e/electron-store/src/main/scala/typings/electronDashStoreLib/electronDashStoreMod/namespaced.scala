package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-store", JSImport.Namespace)
@js.native
class namespaced[T] () extends ElectronStore[T] {
  def this(options: ElectronStoreOptions[T]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, electronDashStoreLib.JSONValue]]] = js.native
}

