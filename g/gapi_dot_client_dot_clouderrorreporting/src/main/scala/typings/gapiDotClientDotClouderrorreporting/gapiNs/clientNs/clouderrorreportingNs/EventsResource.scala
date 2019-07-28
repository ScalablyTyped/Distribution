package typings.gapiDotClientDotClouderrorreporting.gapiNs.clientNs.clouderrorreportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClouderrorreporting.Anon_Accesstoken
import typings.gapiDotClientDotClouderrorreporting.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: Anon_Accesstoken): Request[ListEventsResponse]
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
  def report(request: Anon_AccesstokenAlt): Request[js.Object]
}

object EventsResource {
  @scala.inline
  def apply(
    list: Anon_Accesstoken => Request[ListEventsResponse],
    report: Anon_AccesstokenAlt => Request[js.Object]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), report = js.Any.fromFunction1(report))
  
    __obj.asInstanceOf[EventsResource]
  }
}

