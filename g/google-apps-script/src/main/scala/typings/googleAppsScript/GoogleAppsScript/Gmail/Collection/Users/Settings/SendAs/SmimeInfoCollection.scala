package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSmimeInfoResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmimeInfoCollection extends js.Object {
  
  // Gets the specified S/MIME config for the specified send-as alias.
  def get(userId: String, sendAsEmail: String, id: String): SmimeInfo = js.native
  
  // Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
  def insert(resource: SmimeInfo, userId: String, sendAsEmail: String): SmimeInfo = js.native
  
  // Lists S/MIME configs for the specified send-as alias.
  def list(userId: String, sendAsEmail: String): ListSmimeInfoResponse = js.native
  
  // Deletes the specified S/MIME config for the specified send-as alias.
  def remove(userId: String, sendAsEmail: String, id: String): Unit = js.native
  
  // Sets the default S/MIME config for the specified send-as alias.
  def setDefault(userId: String, sendAsEmail: String, id: String): Unit = js.native
}
object SmimeInfoCollection {
  
  @scala.inline
  def apply(
    get: (String, String, String) => SmimeInfo,
    insert: (SmimeInfo, String, String) => SmimeInfo,
    list: (String, String) => ListSmimeInfoResponse,
    remove: (String, String, String) => Unit,
    setDefault: (String, String, String) => Unit
  ): SmimeInfoCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), insert = js.Any.fromFunction3(insert), list = js.Any.fromFunction2(list), remove = js.Any.fromFunction3(remove), setDefault = js.Any.fromFunction3(setDefault))
    __obj.asInstanceOf[SmimeInfoCollection]
  }
  
  @scala.inline
  implicit class SmimeInfoCollectionOps[Self <: SmimeInfoCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, String, String) => SmimeInfo): Self = this.set("get", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsert(value: (SmimeInfo, String, String) => SmimeInfo): Self = this.set("insert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setList(value: (String, String) => ListSmimeInfoResponse): Self = this.set("list", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (String, String, String) => Unit): Self = this.set("remove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetDefault(value: (String, String, String) => Unit): Self = this.set("setDefault", js.Any.fromFunction3(value))
  }
}
