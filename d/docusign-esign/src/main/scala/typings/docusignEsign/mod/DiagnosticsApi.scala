package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "DiagnosticsApi")
@js.native
open class DiagnosticsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def deleteRequestLogs(): js.Promise[Unit] = js.native
  def deleteRequestLogs(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteRequestLogs(callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]): js.Promise[Unit] = js.native
  
  def getRequestLog(requestLogId: String): js.Promise[js.Object] = js.native
  def getRequestLog(requestLogId: String, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  def getRequestLog(
    requestLogId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[js.Object] = js.native
  
  def getRequestLogSettings(): js.Promise[DiagnosticsSettingsInformation] = js.native
  def getRequestLogSettings(callback: js.Function0[Unit]): js.Promise[DiagnosticsSettingsInformation] = js.native
  def getRequestLogSettings(callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]): js.Promise[DiagnosticsSettingsInformation] = js.native
  
  def getResources(): js.Promise[ResourceInformation] = js.native
  def getResources(callback: js.Function0[Unit]): js.Promise[ResourceInformation] = js.native
  def getResources(callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]): js.Promise[ResourceInformation] = js.native
  
  def getService(): js.Promise[ServiceInformation] = js.native
  def getService(callback: js.Function0[Unit]): js.Promise[ServiceInformation] = js.native
  def getService(callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]): js.Promise[ServiceInformation] = js.native
  
  def listRequestLogs(): js.Promise[ApiRequestLogsResult] = js.native
  def listRequestLogs(optsOrCallback: Any): js.Promise[ApiRequestLogsResult] = js.native
  def listRequestLogs(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ApiRequestLogsResult] = js.native
  def listRequestLogs(
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ApiRequestLogsResult] = js.native
  def listRequestLogs(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ApiRequestLogsResult] = js.native
  def listRequestLogs(
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ApiRequestLogsResult] = js.native
  
  def updateRequestLogSettings(): js.Promise[DiagnosticsSettingsInformation] = js.native
  def updateRequestLogSettings(optsOrCallback: Any): js.Promise[DiagnosticsSettingsInformation] = js.native
  def updateRequestLogSettings(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[DiagnosticsSettingsInformation] = js.native
  def updateRequestLogSettings(
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DiagnosticsSettingsInformation] = js.native
  def updateRequestLogSettings(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DiagnosticsSettingsInformation] = js.native
  def updateRequestLogSettings(
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DiagnosticsSettingsInformation] = js.native
}
