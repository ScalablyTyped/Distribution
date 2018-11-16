package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextRule extends js.Object {
  /** A list of full type names of provided contexts. */
  var provided: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of full type names of requested contexts. */
  var requested: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Selects the methods to which this rule applies.
               *
               * Refer to selector for syntax details.
               */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

