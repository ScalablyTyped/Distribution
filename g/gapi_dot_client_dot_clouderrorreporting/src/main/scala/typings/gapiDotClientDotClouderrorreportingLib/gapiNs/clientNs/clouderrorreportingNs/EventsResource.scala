package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: gapiDotClientDotClouderrorreportingLib.Anon_ProjectNameAccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListEventsResponse]
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
  def report(request: gapiDotClientDotClouderrorreportingLib.Anon_ProjectNameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

