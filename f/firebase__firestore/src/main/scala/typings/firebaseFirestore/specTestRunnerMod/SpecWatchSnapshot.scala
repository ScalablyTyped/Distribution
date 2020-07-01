package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWatchSnapshot extends js.Object {
  var resumeToken: js.UndefOr[String] = js.undefined
  var targetIds: js.Array[TargetId]
  var version: TestSnapshotVersion
}

object SpecWatchSnapshot {
  @scala.inline
  def apply(targetIds: js.Array[TargetId], version: TestSnapshotVersion, resumeToken: String = null): SpecWatchSnapshot = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchSnapshot]
  }
}

