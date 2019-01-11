package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /**
    * If set, controls the return value for server timestamps that have not yet
    * been set to their final value.
    *
    * By specifying 'estimate', pending server timestamps return an estimate
    * based on the local clock. This estimate will differ from the final value
    * and cause these values to change once the server result becomes available.
    *
    * By specifying 'previous', pending timestamps will be ignored and return
    * their previous value instead.
    *
    * If omitted or set to 'none', `null` will be returned by default until the
    * server value becomes available.
    */
  val serverTimestamps: js.UndefOr[
    atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesLibStrings.estimate | atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesLibStrings.previous | atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesLibStrings.none
  ] = js.undefined
}

