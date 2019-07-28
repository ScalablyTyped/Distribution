package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.estimate
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.none
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.previous
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
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(serverTimestamps: estimate | previous | none = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (serverTimestamps != null) __obj.updateDynamic("serverTimestamps")(serverTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

