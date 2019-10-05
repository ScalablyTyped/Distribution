package typings.gapiDotClientDotCloudtrace.gapi.client.cloudtrace

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudtrace.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: Anon_Accesstoken): Request[Span]
}

object SpansResource {
  @scala.inline
  def apply(create: Anon_Accesstoken => Request[Span]): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SpansResource]
  }
}

