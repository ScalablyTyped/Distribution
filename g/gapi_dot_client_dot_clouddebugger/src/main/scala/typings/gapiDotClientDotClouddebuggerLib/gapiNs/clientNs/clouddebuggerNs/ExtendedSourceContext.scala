package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedSourceContext extends js.Object {
  /** Any source context. */
  var context: js.UndefOr[SourceContext] = js.undefined
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object ExtendedSourceContext {
  @scala.inline
  def apply(context: SourceContext = null, labels: stdLib.Record[java.lang.String, java.lang.String] = null): ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[ExtendedSourceContext]
  }
}

