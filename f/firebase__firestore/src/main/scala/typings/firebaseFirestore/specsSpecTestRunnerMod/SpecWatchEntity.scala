package typings.firebaseFirestore.specsSpecTestRunnerMod

import typings.firebaseFirestore.coreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWatchEntity extends js.Object {
  /** [<key>, <version>, <value>] */
  var doc: js.UndefOr[SpecDocument] = js.undefined
  /** [<key>, <version>, <value>][] */
  var docs: js.UndefOr[js.Array[SpecDocument]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /** [<target-id>, ...] */
  var removedTargets: js.UndefOr[js.Array[TargetId]] = js.undefined
  /** [<target-id>, ...] */
  var targets: js.UndefOr[js.Array[TargetId]] = js.undefined
}

object SpecWatchEntity {
  @scala.inline
  def apply(
    doc: SpecDocument = null,
    docs: js.Array[SpecDocument] = null,
    key: String = null,
    removedTargets: js.Array[TargetId] = null,
    targets: js.Array[TargetId] = null
  ): SpecWatchEntity = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (removedTargets != null) __obj.updateDynamic("removedTargets")(removedTargets.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchEntity]
  }
}

