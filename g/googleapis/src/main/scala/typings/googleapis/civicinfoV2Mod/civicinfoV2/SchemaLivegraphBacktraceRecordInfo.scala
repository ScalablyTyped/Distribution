package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLivegraphBacktraceRecordInfo extends StObject {
  
  var dataSourcePublishMsec: js.UndefOr[String] = js.undefined
  
  var expId: js.UndefOr[String] = js.undefined
  
  var expInfo: js.UndefOr[SchemaLivegraphBacktraceRecordInfoExpInfo] = js.undefined
  
  var isRecon: js.UndefOr[Boolean] = js.undefined
  
  var isWlmThrottled: js.UndefOr[Boolean] = js.undefined
  
  var numberOfTriples: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[String] = js.undefined
  
  var process: js.UndefOr[String] = js.undefined
  
  var proxyReceiveMsec: js.UndefOr[String] = js.undefined
  
  var proxySentMsec: js.UndefOr[String] = js.undefined
  
  var recordId: js.UndefOr[String] = js.undefined
  
  var shouldMonitorLatency: js.UndefOr[Boolean] = js.undefined
  
  var subscriberReceiveMsec: js.UndefOr[String] = js.undefined
  
  var topicBuildFinishMsec: js.UndefOr[String] = js.undefined
  
  var topicBuildStartMsec: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object SchemaLivegraphBacktraceRecordInfo {
  
  inline def apply(): SchemaLivegraphBacktraceRecordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfo]
  }
  
  extension [Self <: SchemaLivegraphBacktraceRecordInfo](x: Self) {
    
    inline def setDataSourcePublishMsec(value: String): Self = StObject.set(x, "dataSourcePublishMsec", value.asInstanceOf[js.Any])
    
    inline def setDataSourcePublishMsecUndefined: Self = StObject.set(x, "dataSourcePublishMsec", js.undefined)
    
    inline def setExpId(value: String): Self = StObject.set(x, "expId", value.asInstanceOf[js.Any])
    
    inline def setExpIdUndefined: Self = StObject.set(x, "expId", js.undefined)
    
    inline def setExpInfo(value: SchemaLivegraphBacktraceRecordInfoExpInfo): Self = StObject.set(x, "expInfo", value.asInstanceOf[js.Any])
    
    inline def setExpInfoUndefined: Self = StObject.set(x, "expInfo", js.undefined)
    
    inline def setIsRecon(value: Boolean): Self = StObject.set(x, "isRecon", value.asInstanceOf[js.Any])
    
    inline def setIsReconUndefined: Self = StObject.set(x, "isRecon", js.undefined)
    
    inline def setIsWlmThrottled(value: Boolean): Self = StObject.set(x, "isWlmThrottled", value.asInstanceOf[js.Any])
    
    inline def setIsWlmThrottledUndefined: Self = StObject.set(x, "isWlmThrottled", js.undefined)
    
    inline def setNumberOfTriples(value: String): Self = StObject.set(x, "numberOfTriples", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTriplesUndefined: Self = StObject.set(x, "numberOfTriples", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setProxyReceiveMsec(value: String): Self = StObject.set(x, "proxyReceiveMsec", value.asInstanceOf[js.Any])
    
    inline def setProxyReceiveMsecUndefined: Self = StObject.set(x, "proxyReceiveMsec", js.undefined)
    
    inline def setProxySentMsec(value: String): Self = StObject.set(x, "proxySentMsec", value.asInstanceOf[js.Any])
    
    inline def setProxySentMsecUndefined: Self = StObject.set(x, "proxySentMsec", js.undefined)
    
    inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    inline def setRecordIdUndefined: Self = StObject.set(x, "recordId", js.undefined)
    
    inline def setShouldMonitorLatency(value: Boolean): Self = StObject.set(x, "shouldMonitorLatency", value.asInstanceOf[js.Any])
    
    inline def setShouldMonitorLatencyUndefined: Self = StObject.set(x, "shouldMonitorLatency", js.undefined)
    
    inline def setSubscriberReceiveMsec(value: String): Self = StObject.set(x, "subscriberReceiveMsec", value.asInstanceOf[js.Any])
    
    inline def setSubscriberReceiveMsecUndefined: Self = StObject.set(x, "subscriberReceiveMsec", js.undefined)
    
    inline def setTopicBuildFinishMsec(value: String): Self = StObject.set(x, "topicBuildFinishMsec", value.asInstanceOf[js.Any])
    
    inline def setTopicBuildFinishMsecUndefined: Self = StObject.set(x, "topicBuildFinishMsec", js.undefined)
    
    inline def setTopicBuildStartMsec(value: String): Self = StObject.set(x, "topicBuildStartMsec", value.asInstanceOf[js.Any])
    
    inline def setTopicBuildStartMsecUndefined: Self = StObject.set(x, "topicBuildStartMsec", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
