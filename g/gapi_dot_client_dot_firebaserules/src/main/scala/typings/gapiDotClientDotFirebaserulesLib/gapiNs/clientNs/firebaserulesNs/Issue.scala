package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /** Short error description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The severity of the issue. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** Position of the issue in the `Source`. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.undefined
}

object Issue {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    severity: java.lang.String = null,
    sourcePosition: SourcePosition = null
  ): Issue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (sourcePosition != null) __obj.updateDynamic("sourcePosition")(sourcePosition)
    __obj.asInstanceOf[Issue]
  }
}

