package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronStore[T]
  extends nodeLib.Iterable[js.Tuple2[java.lang.String, electronDashStoreLib.JSONValue]] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.Iterator[js.Tuple2[java.lang.String, electronDashStoreLib.JSONValue]]] = js.native
  /**
    * Get the path to the storage file.
    */
  var path: java.lang.String = js.native
  /**
    * Get the item count.
    */
  var size: scala.Double = js.native
  /**
    * Get all the data as an object or replace the current data with an object.
    */
  var store: T = js.native
  /**
    * Delete all items.
    */
  def clear(): scala.Unit = js.native
  /**
    * Delete an item.
    */
  def delete(key: java.lang.String): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /**
    * Get an item or defaultValue if the item does not exist.
    */
  def get[K /* <: java.lang.String */](key: K): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  def get[K /* <: java.lang.String */](key: K, defaultValue: electronDashStoreLib.JSONValue): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  /**
    * Check if an item exists.
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  def onDidChange(
    key: java.lang.String,
    callback: js.Function2[
      /* newValue */ electronDashStoreLib.JSONValue, 
      /* oldValue */ electronDashStoreLib.JSONValue, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Watches the given key, calling callback on any changes. When a key is first set oldValue
    * will be undefined, and when a key is deleted newValue will be undefined.
    */
  def onDidChange[K /* <: java.lang.String */](
    key: K,
    callback: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* newValue */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* oldValue */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Open the storage file in the user's editor.
    */
  def openInEditor(): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(`object`: T): scala.Unit = js.native
  def set(`object`: JSONObject): scala.Unit = js.native
  /**
    * Set multiple items at once.
    */
  def set(`object`: stdLib.Pick[T, java.lang.String]): scala.Unit = js.native
  /**
    * Set an item.
    */
  def set[K /* <: java.lang.String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): scala.Unit = js.native
}

