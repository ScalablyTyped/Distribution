package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.electronNotarize.mod.NotarizePasswordCredentials
  - typings.electronNotarize.mod.NotarizeApiKeyCredentials
*/
trait NotarizeCredentials extends js.Object
object NotarizeCredentials {
  
  @scala.inline
  def NotarizePasswordCredentials(appleId: String, appleIdPassword: String): NotarizeCredentials = {
    val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeCredentials]
  }
  
  @scala.inline
  def NotarizeApiKeyCredentials(appleApiIssuer: String, appleApiKey: String): NotarizeCredentials = {
    val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeCredentials]
  }
}
