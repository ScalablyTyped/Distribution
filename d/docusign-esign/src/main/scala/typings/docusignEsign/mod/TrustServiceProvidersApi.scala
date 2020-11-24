package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "TrustServiceProvidersApi")
@js.native
class TrustServiceProvidersApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def getSealProviders(accountId: String): js.Promise[AccountSeals] = js.native
  def getSealProviders(accountId: String, callback: js.Function0[Unit]): js.Promise[AccountSeals] = js.native
}
