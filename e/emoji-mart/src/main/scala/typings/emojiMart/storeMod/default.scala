package typings.emojiMart.storeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
