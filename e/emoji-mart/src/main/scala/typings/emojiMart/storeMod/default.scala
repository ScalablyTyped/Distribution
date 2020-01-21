package typings.emojiMart.storeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
@JSImport("emoji-mart/dist-es/utils/store", "default")
@js.native
object default extends js.Object {
  def get(key: String): js.Any = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def setHandlers(): Unit = js.native
  def setHandlers(handlers: StoreHandlers): Unit = js.native
  def setNamespace(namespace: String): Unit = js.native
  def update(state: StringDictionary[js.Any]): Unit = js.native
}

