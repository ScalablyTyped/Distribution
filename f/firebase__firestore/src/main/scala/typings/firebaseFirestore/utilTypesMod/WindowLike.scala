package typings.firebaseFirestore.utilTypesMod

import typings.std.EventListener
import typings.std.IDBFactory
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLike extends js.Object {
  val indexedDB: IDBFactory | Null
  val localStorage: Storage
  def addEventListener(`type`: String, listener: EventListener): Unit
  def removeEventListener(`type`: String, listener: EventListener): Unit
}

object WindowLike {
  @scala.inline
  def apply(
    addEventListener: (String, EventListener) => Unit,
    localStorage: Storage,
    removeEventListener: (String, EventListener) => Unit,
    indexedDB: IDBFactory = null
  ): WindowLike = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), localStorage = localStorage.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLike]
  }
}

