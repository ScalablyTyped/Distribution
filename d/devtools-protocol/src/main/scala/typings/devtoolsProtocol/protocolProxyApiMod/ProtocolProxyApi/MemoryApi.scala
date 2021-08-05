package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Memory.GetAllTimeSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetBrowserSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetDOMCountersResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.SetPressureNotificationsSuppressedRequest
import typings.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import typings.devtoolsProtocol.mod.Protocol.Memory.StartSamplingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryApi extends StObject {
  
  /**
    * Simulate OomIntervention by purging V8 memory.
    */
  def forciblyPurgeJavaScriptMemory(): js.Promise[Unit]
  
  /**
    * Retrieve native memory allocations profile
    * collected since renderer process startup.
    */
  def getAllTimeSamplingProfile(): js.Promise[GetAllTimeSamplingProfileResponse]
  
  /**
    * Retrieve native memory allocations profile
    * collected since browser process startup.
    */
  def getBrowserSamplingProfile(): js.Promise[GetBrowserSamplingProfileResponse]
  
  def getDOMCounters(): js.Promise[GetDOMCountersResponse]
  
  /**
    * Retrieve native memory allocations profile collected since last
    * `startSampling` call.
    */
  def getSamplingProfile(): js.Promise[GetSamplingProfileResponse]
  
  def prepareForLeakDetection(): js.Promise[Unit]
  
  /**
    * Enable/disable suppressing memory pressure notifications in all processes.
    */
  def setPressureNotificationsSuppressed(params: SetPressureNotificationsSuppressedRequest): js.Promise[Unit]
  
  /**
    * Simulate a memory pressure notification in all processes.
    */
  def simulatePressureNotification(params: SimulatePressureNotificationRequest): js.Promise[Unit]
  
  /**
    * Start collecting native memory profile.
    */
  def startSampling(params: StartSamplingRequest): js.Promise[Unit]
  
  /**
    * Stop collecting native memory profile.
    */
  def stopSampling(): js.Promise[Unit]
}
object MemoryApi {
  
  inline def apply(
    forciblyPurgeJavaScriptMemory: () => js.Promise[Unit],
    getAllTimeSamplingProfile: () => js.Promise[GetAllTimeSamplingProfileResponse],
    getBrowserSamplingProfile: () => js.Promise[GetBrowserSamplingProfileResponse],
    getDOMCounters: () => js.Promise[GetDOMCountersResponse],
    getSamplingProfile: () => js.Promise[GetSamplingProfileResponse],
    prepareForLeakDetection: () => js.Promise[Unit],
    setPressureNotificationsSuppressed: SetPressureNotificationsSuppressedRequest => js.Promise[Unit],
    simulatePressureNotification: SimulatePressureNotificationRequest => js.Promise[Unit],
    startSampling: StartSamplingRequest => js.Promise[Unit],
    stopSampling: () => js.Promise[Unit]
  ): MemoryApi = {
    val __obj = js.Dynamic.literal(forciblyPurgeJavaScriptMemory = js.Any.fromFunction0(forciblyPurgeJavaScriptMemory), getAllTimeSamplingProfile = js.Any.fromFunction0(getAllTimeSamplingProfile), getBrowserSamplingProfile = js.Any.fromFunction0(getBrowserSamplingProfile), getDOMCounters = js.Any.fromFunction0(getDOMCounters), getSamplingProfile = js.Any.fromFunction0(getSamplingProfile), prepareForLeakDetection = js.Any.fromFunction0(prepareForLeakDetection), setPressureNotificationsSuppressed = js.Any.fromFunction1(setPressureNotificationsSuppressed), simulatePressureNotification = js.Any.fromFunction1(simulatePressureNotification), startSampling = js.Any.fromFunction1(startSampling), stopSampling = js.Any.fromFunction0(stopSampling))
    __obj.asInstanceOf[MemoryApi]
  }
  
  extension [Self <: MemoryApi](x: Self) {
    
    inline def setForciblyPurgeJavaScriptMemory(value: () => js.Promise[Unit]): Self = StObject.set(x, "forciblyPurgeJavaScriptMemory", js.Any.fromFunction0(value))
    
    inline def setGetAllTimeSamplingProfile(value: () => js.Promise[GetAllTimeSamplingProfileResponse]): Self = StObject.set(x, "getAllTimeSamplingProfile", js.Any.fromFunction0(value))
    
    inline def setGetBrowserSamplingProfile(value: () => js.Promise[GetBrowserSamplingProfileResponse]): Self = StObject.set(x, "getBrowserSamplingProfile", js.Any.fromFunction0(value))
    
    inline def setGetDOMCounters(value: () => js.Promise[GetDOMCountersResponse]): Self = StObject.set(x, "getDOMCounters", js.Any.fromFunction0(value))
    
    inline def setGetSamplingProfile(value: () => js.Promise[GetSamplingProfileResponse]): Self = StObject.set(x, "getSamplingProfile", js.Any.fromFunction0(value))
    
    inline def setPrepareForLeakDetection(value: () => js.Promise[Unit]): Self = StObject.set(x, "prepareForLeakDetection", js.Any.fromFunction0(value))
    
    inline def setSetPressureNotificationsSuppressed(value: SetPressureNotificationsSuppressedRequest => js.Promise[Unit]): Self = StObject.set(x, "setPressureNotificationsSuppressed", js.Any.fromFunction1(value))
    
    inline def setSimulatePressureNotification(value: SimulatePressureNotificationRequest => js.Promise[Unit]): Self = StObject.set(x, "simulatePressureNotification", js.Any.fromFunction1(value))
    
    inline def setStartSampling(value: StartSamplingRequest => js.Promise[Unit]): Self = StObject.set(x, "startSampling", js.Any.fromFunction1(value))
    
    inline def setStopSampling(value: () => js.Promise[Unit]): Self = StObject.set(x, "stopSampling", js.Any.fromFunction0(value))
  }
}
