package typings
package gapiDotClientDotFirebaseremoteconfigLib.gapiNs.clientNs.firebaseremoteconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RemoteConfigCondition extends js.Object {
  /** Required. */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Required.
               * A non empty and unique name of this condition.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional.
               * The display (tag) color of this condition. This serves as part of a tag
               * (in the future, we may add tag text as well as tag color, but that is not
               * yet implemented in the UI).
               * This value has no affect on the semantics of the delivered config and it
               * is ignored by the backend, except for passing it through write/read
               * requests.
               * Not having this value or having the "CONDITION_DISPLAY_COLOR_UNSPECIFIED"
               * value (0) have the same meaning:  Let the UI choose any valid color when
               * displaying the condition.
               */
  var tagColor: js.UndefOr[java.lang.String] = js.undefined
}

