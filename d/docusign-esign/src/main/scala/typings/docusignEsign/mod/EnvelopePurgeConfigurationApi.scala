package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EnvelopePurgeConfigurationApi")
@js.native
class EnvelopePurgeConfigurationApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def getEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def getEnvelopePurgeConfiguration(accountId: String, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  
  def updateEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: js.Any): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
}
