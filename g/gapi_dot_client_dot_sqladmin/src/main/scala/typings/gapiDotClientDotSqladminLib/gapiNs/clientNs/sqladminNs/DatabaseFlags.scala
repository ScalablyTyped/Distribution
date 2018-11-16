package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatabaseFlags extends js.Object {
  /**
               * The name of the flag. These flags are passed at instance startup, so include both MySQL server options and MySQL system variables. Flags should be
               * specified with underscores, not hyphens. For more information, see Configuring MySQL Flags in the Google Cloud SQL documentation, as well as the
               * official MySQL documentation for server options and system variables.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the flag. Booleans should be set to on for true and off for false. This field must be omitted if the flag doesn't take a value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

