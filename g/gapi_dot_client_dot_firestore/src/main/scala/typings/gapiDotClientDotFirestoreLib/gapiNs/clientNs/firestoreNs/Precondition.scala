package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precondition extends js.Object {
  /**
    * When set to `true`, the target document must exist.
    * When set to `false`, the target document must not exist.
    */
  var exists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

