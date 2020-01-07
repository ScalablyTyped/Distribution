package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A report of an event in a worker&#39;s lifecycle. The proto contains one
  * event, because the worker is expected to asynchronously send each message
  * immediately after the event. Due to this asynchrony, messages may arrive
  * out of order (or missing), and it is up to the consumer to interpret. The
  * timestamp of the event is in the enclosing WorkerMessage proto.
  */
@js.native
trait Schema$WorkerLifecycleEvent extends js.Object {
  /**
    * The start time of this container. All events will report this so that
    * events can be grouped together across container/VM restarts.
    */
  var containerStartTime: js.UndefOr[String] = js.native
  /**
    * The event being reported.
    */
  var event: js.UndefOr[String] = js.native
  /**
    * Other stats that can accompany an event. E.g. {
    * &quot;downloaded_bytes&quot; : &quot;123456&quot; }
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$WorkerLifecycleEvent {
  @scala.inline
  def apply(containerStartTime: String = null, event: String = null, metadata: StringDictionary[String] = null): Schema$WorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    if (containerStartTime != null) __obj.updateDynamic("containerStartTime")(containerStartTime.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerLifecycleEvent]
  }
}

