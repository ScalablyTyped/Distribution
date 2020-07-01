package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWriteAck extends js.Object {
  /**
    * Whether we should keep the write in our internal queue. This should only
    * be set to 'true' if the client ignores the write (e.g. a secondary client
    * which ignores write acknowledgments).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
  /** The version the backend uses to ack the write. */
  var version: TestSnapshotVersion
}

object SpecWriteAck {
  @scala.inline
  def apply(version: TestSnapshotVersion, keepInQueue: js.UndefOr[Boolean] = js.undefined): SpecWriteAck = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInQueue)) __obj.updateDynamic("keepInQueue")(keepInQueue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteAck]
  }
}

