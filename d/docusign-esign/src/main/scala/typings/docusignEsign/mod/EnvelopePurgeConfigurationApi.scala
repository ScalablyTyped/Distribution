package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EnvelopePurgeConfigurationApi")
@js.native
open class EnvelopePurgeConfigurationApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def getEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def getEnvelopePurgeConfiguration(accountId: String, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  def getEnvelopePurgeConfiguration(
    accountId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopePurgeConfiguration] = js.native
  
  def updateEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: Any): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopePurgeConfiguration] = js.native
}
