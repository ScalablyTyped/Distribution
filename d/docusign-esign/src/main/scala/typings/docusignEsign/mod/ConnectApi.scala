package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "ConnectApi")
@js.native
open class ConnectApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createConfiguration(accountId: String): js.Promise[ConnectCustomConfiguration] = js.native
  def createConfiguration(accountId: String, optsOrCallback: Any): js.Promise[ConnectCustomConfiguration] = js.native
  def createConfiguration(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectCustomConfiguration] = js.native
  def createConfiguration(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectCustomConfiguration] = js.native
  def createConfiguration(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectCustomConfiguration] = js.native
  def createConfiguration(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectCustomConfiguration] = js.native
  
  def deleteConfiguration(accountId: String, connectId: String): js.Promise[Unit] = js.native
  def deleteConfiguration(accountId: String, connectId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteConfiguration(
    accountId: String,
    connectId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteEventFailureLog(accountId: String, failureId: String): js.Promise[Unit] = js.native
  def deleteEventFailureLog(accountId: String, failureId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteEventFailureLog(
    accountId: String,
    failureId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteEventLog(accountId: String, logId: String): js.Promise[Unit] = js.native
  def deleteEventLog(accountId: String, logId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteEventLog(
    accountId: String,
    logId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteEventLogs(accountId: String): js.Promise[Unit] = js.native
  def deleteEventLogs(accountId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteEventLogs(
    accountId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteMobileNotifiers(accountId: String): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def deleteMobileNotifiers(accountId: String, optsOrCallback: Any): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def deleteMobileNotifiers(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def deleteMobileNotifiers(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def deleteMobileNotifiers(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def deleteMobileNotifiers(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[MobileNotifierConfigurationInformation] = js.native
  
  def getConfiguration(accountId: String, connectId: String): js.Promise[ConnectConfigResults] = js.native
  def getConfiguration(accountId: String, connectId: String, callback: js.Function0[Unit]): js.Promise[ConnectConfigResults] = js.native
  def getConfiguration(
    accountId: String,
    connectId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectConfigResults] = js.native
  
  def getEventLog(accountId: String, logId: String): js.Promise[ConnectLog] = js.native
  def getEventLog(accountId: String, logId: String, optsOrCallback: Any): js.Promise[ConnectLog] = js.native
  def getEventLog(accountId: String, logId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectLog] = js.native
  def getEventLog(
    accountId: String,
    logId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLog] = js.native
  def getEventLog(accountId: String, logId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectLog] = js.native
  def getEventLog(
    accountId: String,
    logId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLog] = js.native
  
  def listConfigurations(accountId: String): js.Promise[ConnectConfigResults] = js.native
  def listConfigurations(accountId: String, callback: js.Function0[Unit]): js.Promise[ConnectConfigResults] = js.native
  def listConfigurations(
    accountId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectConfigResults] = js.native
  
  def listEventFailureLogs(accountId: String): js.Promise[ConnectLogs] = js.native
  def listEventFailureLogs(accountId: String, optsOrCallback: Any): js.Promise[ConnectLogs] = js.native
  def listEventFailureLogs(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectLogs] = js.native
  def listEventFailureLogs(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLogs] = js.native
  def listEventFailureLogs(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectLogs] = js.native
  def listEventFailureLogs(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLogs] = js.native
  
  def listEventLogs(accountId: String): js.Promise[ConnectLogs] = js.native
  def listEventLogs(accountId: String, optsOrCallback: Any): js.Promise[ConnectLogs] = js.native
  def listEventLogs(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectLogs] = js.native
  def listEventLogs(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLogs] = js.native
  def listEventLogs(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectLogs] = js.native
  def listEventLogs(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectLogs] = js.native
  
  def listMobileNotifiers(accountId: String): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def listMobileNotifiers(accountId: String, callback: js.Function0[Unit]): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def listMobileNotifiers(
    accountId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[MobileNotifierConfigurationInformation] = js.native
  
  def listTests(accountId: String, connectId: String): js.Promise[ResourceInformation] = js.native
  def listTests(accountId: String, connectId: String, callback: js.Function0[Unit]): js.Promise[ResourceInformation] = js.native
  def listTests(
    accountId: String,
    connectId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ResourceInformation] = js.native
  
  def listUsers(accountId: String, connectId: String): js.Promise[IntegratedUserInfoList] = js.native
  def listUsers(accountId: String, connectId: String, optsOrCallback: Any): js.Promise[IntegratedUserInfoList] = js.native
  def listUsers(accountId: String, connectId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[IntegratedUserInfoList] = js.native
  def listUsers(
    accountId: String,
    connectId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[IntegratedUserInfoList] = js.native
  def listUsers(accountId: String, connectId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[IntegratedUserInfoList] = js.native
  def listUsers(
    accountId: String,
    connectId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[IntegratedUserInfoList] = js.native
  
  def retryEventForEnvelope(accountId: String, envelopeId: String): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelope(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelope(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectFailureResults] = js.native
  
  def retryEventForEnvelopes(accountId: String): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelopes(accountId: String, optsOrCallback: Any): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelopes(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelopes(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelopes(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectFailureResults] = js.native
  def retryEventForEnvelopes(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectFailureResults] = js.native
  
  def updateConfiguration(accountId: String): js.Promise[ConnectCustomConfiguration] = js.native
  def updateConfiguration(accountId: String, optsOrCallback: Any): js.Promise[ConnectCustomConfiguration] = js.native
  def updateConfiguration(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ConnectCustomConfiguration] = js.native
  def updateConfiguration(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectCustomConfiguration] = js.native
  def updateConfiguration(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConnectCustomConfiguration] = js.native
  def updateConfiguration(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConnectCustomConfiguration] = js.native
  
  def updateMobileNotifiers(accountId: String): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def updateMobileNotifiers(accountId: String, optsOrCallback: Any): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def updateMobileNotifiers(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def updateMobileNotifiers(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def updateMobileNotifiers(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[MobileNotifierConfigurationInformation] = js.native
  def updateMobileNotifiers(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[MobileNotifierConfigurationInformation] = js.native
}
