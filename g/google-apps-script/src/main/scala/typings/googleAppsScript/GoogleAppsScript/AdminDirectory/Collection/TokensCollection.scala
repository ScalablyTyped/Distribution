package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Token
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Tokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokensCollection extends js.Object {
  
  // Get information about an access token issued by a user.
  def get(userKey: String, clientId: String): Token = js.native
  
  // Returns the set of tokens specified user has issued to 3rd party applications.
  def list(userKey: String): Tokens = js.native
  
  // Delete all access tokens issued by a user for an application.
  def remove(userKey: String, clientId: String): Unit = js.native
}
object TokensCollection {
  
  @scala.inline
  def apply(get: (String, String) => Token, list: String => Tokens, remove: (String, String) => Unit): TokensCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[TokensCollection]
  }
  
  @scala.inline
  implicit class TokensCollectionOps[Self <: TokensCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, String) => Token): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: String => Tokens): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
}
