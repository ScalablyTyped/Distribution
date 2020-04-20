package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouderrorreporting.AnonAccesstoken
import typings.gapiClientClouderrorreporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: AnonAccesstoken): Request_[ListEventsResponse]
  /**
    * Report an individual error event.
    *
    * This endpoint accepts <strong>either</strong> an OAuth token,
    * <strong>or</strong> an
    * <a href="https://support.google.com/cloud/answer/6158862">API key</a>
    * for authentication. To use an API key, append it to the URL as the value of
    * a `key` parameter. For example:
    * <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
    */
  def report(request: AnonAlt): Request_[js.Object]
}

object EventsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => Request_[ListEventsResponse], report: AnonAlt => Request_[js.Object]): EventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[EventsResource]
  }
}

