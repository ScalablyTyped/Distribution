package typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcRemoteExistenceUnderscoreFilterMod.ExistenceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/watch_change", "ExistenceFilterChange")
@js.native
class ExistenceFilterChange protected () extends WatchChange {
  def this(targetId: TargetId, existenceFilter: ExistenceFilter) = this()
  var existenceFilter: ExistenceFilter = js.native
  var targetId: TargetId = js.native
}

