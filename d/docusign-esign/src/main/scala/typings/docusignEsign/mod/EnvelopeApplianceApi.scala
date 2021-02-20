package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EnvelopeApplianceApi")
@js.native
class EnvelopeApplianceApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def getApplianceInfo(accountId: String, envelopeId: String): js.Promise[DisplayApplianceInfo] = js.native
  def getApplianceInfo(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[DisplayApplianceInfo] = js.native
}
