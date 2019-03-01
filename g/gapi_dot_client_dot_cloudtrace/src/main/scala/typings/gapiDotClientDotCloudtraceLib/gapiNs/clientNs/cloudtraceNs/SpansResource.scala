package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: gapiDotClientDotCloudtraceLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Span]
}

object SpansResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudtraceLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Span]
    ]
  ): SpansResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[SpansResource]
  }
}

