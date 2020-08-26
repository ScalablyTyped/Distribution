package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Memory.GetAllTimeSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetBrowserSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetDOMCountersResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.GetSamplingProfileResponse
import typings.devtoolsProtocol.mod.Protocol.Memory.SetPressureNotificationsSuppressedRequest
import typings.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import typings.devtoolsProtocol.mod.Protocol.Memory.StartSamplingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryApi extends js.Object {
  /**
    * Simulate OomIntervention by purging V8 memory.
    */
  def forciblyPurgeJavaScriptMemory(): js.Promise[Unit] = js.native
  /**
    * Retrieve native memory allocations profile
    * collected since renderer process startup.
    */
  def getAllTimeSamplingProfile(): js.Promise[GetAllTimeSamplingProfileResponse] = js.native
  /**
    * Retrieve native memory allocations profile
    * collected since browser process startup.
    */
  def getBrowserSamplingProfile(): js.Promise[GetBrowserSamplingProfileResponse] = js.native
  def getDOMCounters(): js.Promise[GetDOMCountersResponse] = js.native
  /**
    * Retrieve native memory allocations profile collected since last
    * `startSampling` call.
    */
  def getSamplingProfile(): js.Promise[GetSamplingProfileResponse] = js.native
  def prepareForLeakDetection(): js.Promise[Unit] = js.native
  /**
    * Enable/disable suppressing memory pressure notifications in all processes.
    */
  def setPressureNotificationsSuppressed(params: SetPressureNotificationsSuppressedRequest): js.Promise[Unit] = js.native
  /**
    * Simulate a memory pressure notification in all processes.
    */
  def simulatePressureNotification(params: SimulatePressureNotificationRequest): js.Promise[Unit] = js.native
  /**
    * Start collecting native memory profile.
    */
  def startSampling(params: StartSamplingRequest): js.Promise[Unit] = js.native
  /**
    * Stop collecting native memory profile.
    */
  def stopSampling(): js.Promise[Unit] = js.native
}

object MemoryApi {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class MemoryApiOps[Self <: MemoryApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForciblyPurgeJavaScriptMemory(value: () => js.Promise[Unit]): Self = this.set("forciblyPurgeJavaScriptMemory", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllTimeSamplingProfile(value: () => js.Promise[GetAllTimeSamplingProfileResponse]): Self = this.set("getAllTimeSamplingProfile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBrowserSamplingProfile(value: () => js.Promise[GetBrowserSamplingProfileResponse]): Self = this.set("getBrowserSamplingProfile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDOMCounters(value: () => js.Promise[GetDOMCountersResponse]): Self = this.set("getDOMCounters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSamplingProfile(value: () => js.Promise[GetSamplingProfileResponse]): Self = this.set("getSamplingProfile", js.Any.fromFunction0(value))
    @scala.inline
    def setPrepareForLeakDetection(value: () => js.Promise[Unit]): Self = this.set("prepareForLeakDetection", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPressureNotificationsSuppressed(value: SetPressureNotificationsSuppressedRequest => js.Promise[Unit]): Self = this.set("setPressureNotificationsSuppressed", js.Any.fromFunction1(value))
    @scala.inline
    def setSimulatePressureNotification(value: SimulatePressureNotificationRequest => js.Promise[Unit]): Self = this.set("simulatePressureNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setStartSampling(value: StartSamplingRequest => js.Promise[Unit]): Self = this.set("startSampling", js.Any.fromFunction1(value))
    @scala.inline
    def setStopSampling(value: () => js.Promise[Unit]): Self = this.set("stopSampling", js.Any.fromFunction0(value))
  }
  
}

