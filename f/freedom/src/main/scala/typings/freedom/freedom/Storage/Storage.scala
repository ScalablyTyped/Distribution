package typings.freedom.freedom.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends js.Object {
  
  // Remove all data from storage.
  def clear(): js.Promise[Unit] = js.native
  
  // Fetch a value for a key.
  def get(key: String): js.Promise[String] = js.native
  
  // Fetch array of all keys.
  def keys(): js.Promise[js.Array[String]] = js.native
  
  // Remove a single key. Fulfills promise with previous value, if exists.
  def remove(key: String): js.Promise[String] = js.native
  
  // Sets a value to a key. Fulfills promise with the previous value, if it
  // exists.
  def set(key: String, value: String): js.Promise[String] = js.native
}
object Storage {
  
  @scala.inline
  def apply(
    clear: () => js.Promise[Unit],
    get: String => js.Promise[String],
    keys: () => js.Promise[js.Array[String]],
    remove: String => js.Promise[String],
    set: (String, String) => js.Promise[String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageOps[Self <: typings.freedom.freedom.Storage.Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => js.Promise[Unit]): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.Promise[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => js.Promise[js.Array[String]]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => js.Promise[String]): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, String) => js.Promise[String]): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
