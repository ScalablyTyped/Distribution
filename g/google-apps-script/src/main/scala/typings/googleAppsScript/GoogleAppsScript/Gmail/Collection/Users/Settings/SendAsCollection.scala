package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs.SmimeInfoCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSendAsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAsCollection extends js.Object {
  
  var SmimeInfo: js.UndefOr[SmimeInfoCollection] = js.native
  
  // Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, userId: String): typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  
  // Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
  def get(userId: String, sendAsEmail: String): typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  
  // Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
  def list(userId: String): ListSendAsResponse = js.native
  
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority. This method supports patch semantics.
  def patch(
    resource: typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  
  // Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, sendAsEmail: String): Unit = js.native
  
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
  def update(
    resource: typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  
  // Sends a verification email to the specified send-as alias address. The verification status must be pending.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def verify(userId: String, sendAsEmail: String): Unit = js.native
}
object SendAsCollection {
  
  @scala.inline
  def apply(
    create: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    get: (String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    list: String => ListSendAsResponse,
    patch: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    remove: (String, String) => Unit,
    update: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    verify: (String, String) => Unit
  ): SendAsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[SendAsCollection]
  }
  
  @scala.inline
  implicit class SendAsCollectionOps[Self <: SendAsCollection] (val x: Self) extends AnyVal {
    
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
    def setCreate(
      value: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: (String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: String => ListSendAsResponse): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(
      value: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = this.set("patch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(
      value: (typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = this.set("update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVerify(value: (String, String) => Unit): Self = this.set("verify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSmimeInfo(value: SmimeInfoCollection): Self = this.set("SmimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmimeInfo: Self = this.set("SmimeInfo", js.undefined)
  }
}
