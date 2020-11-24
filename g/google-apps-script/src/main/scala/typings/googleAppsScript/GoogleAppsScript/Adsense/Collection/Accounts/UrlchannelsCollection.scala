package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.UrlChannels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsCollection extends js.Object {
  
  // List all URL channels in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String): UrlChannels = js.native
  // List all URL channels in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String, optionalArgs: js.Object): UrlChannels = js.native
}
