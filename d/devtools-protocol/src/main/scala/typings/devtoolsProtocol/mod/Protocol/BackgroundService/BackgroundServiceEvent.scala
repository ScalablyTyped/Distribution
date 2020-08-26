package typings.devtoolsProtocol.mod.Protocol.BackgroundService

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.RegistrationID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundServiceEvent extends js.Object {
  /**
    * A list of event-specific information.
    */
  var eventMetadata: js.Array[EventMetadata] = js.native
  /**
    * A description of the event.
    */
  var eventName: String = js.native
  /**
    * An identifier that groups related events together.
    */
  var instanceId: String = js.native
  /**
    * The origin this event belongs to.
    */
  var origin: String = js.native
  /**
    * The Background Service this event belongs to.
    */
  var service: ServiceName = js.native
  /**
    * The Service Worker ID that initiated the event.
    */
  var serviceWorkerRegistrationId: RegistrationID = js.native
  /**
    * Timestamp of the event (in seconds).
    */
  var timestamp: TimeSinceEpoch = js.native
}

object BackgroundServiceEvent {
  @scala.inline
  def apply(
    eventMetadata: js.Array[EventMetadata],
    eventName: String,
    instanceId: String,
    origin: String,
    service: ServiceName,
    serviceWorkerRegistrationId: RegistrationID,
    timestamp: TimeSinceEpoch
  ): BackgroundServiceEvent = {
    val __obj = js.Dynamic.literal(eventMetadata = eventMetadata.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], serviceWorkerRegistrationId = serviceWorkerRegistrationId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundServiceEvent]
  }
  @scala.inline
  implicit class BackgroundServiceEventOps[Self <: BackgroundServiceEvent] (val x: Self) extends AnyVal {
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
    def setEventMetadataVarargs(value: EventMetadata*): Self = this.set("eventMetadata", js.Array(value :_*))
    @scala.inline
    def setEventMetadata(value: js.Array[EventMetadata]): Self = this.set("eventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: ServiceName): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorkerRegistrationId(value: RegistrationID): Self = this.set("serviceWorkerRegistrationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

