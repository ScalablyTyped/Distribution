package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedSourceContext extends js.Object {
  /** Any source context. */
  var context: js.UndefOr[SourceContext] = js.undefined
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
}

object ExtendedSourceContext {
  @scala.inline
  def apply(context: SourceContext = null, labels: Record[String, String] = null): ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedSourceContext]
  }
}

