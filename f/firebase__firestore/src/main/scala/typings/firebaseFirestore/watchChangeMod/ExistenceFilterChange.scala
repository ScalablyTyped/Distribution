package typings.firebaseFirestore.watchChangeMod

import typings.firebaseFirestore.existenceFilterMod.ExistenceFilter
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/watch_change", "ExistenceFilterChange")
@js.native
class ExistenceFilterChange protected () extends WatchChange {
  def this(targetId: TargetId, existenceFilter: ExistenceFilter) = this()
  var existenceFilter: ExistenceFilter = js.native
  var targetId: TargetId = js.native
}

