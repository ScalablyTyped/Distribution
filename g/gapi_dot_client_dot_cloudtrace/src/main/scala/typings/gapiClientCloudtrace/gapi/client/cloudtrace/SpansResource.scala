package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudtrace.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: Accesstoken): Request[Span]
}

object SpansResource {
  @scala.inline
  def apply(create: Accesstoken => Request[Span]): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[SpansResource]
  }
}

