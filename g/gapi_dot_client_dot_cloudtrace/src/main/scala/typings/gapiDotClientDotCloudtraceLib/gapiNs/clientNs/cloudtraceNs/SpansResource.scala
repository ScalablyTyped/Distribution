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
    create: gapiDotClientDotCloudtraceLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Span]
  ): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SpansResource]
  }
}

