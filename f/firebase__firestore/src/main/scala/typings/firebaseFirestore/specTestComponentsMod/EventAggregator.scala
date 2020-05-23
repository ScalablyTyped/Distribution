package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.eventManagerMod.Observer
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "EventAggregator")
@js.native
class EventAggregator protected () extends Observer[ViewSnapshot] {
  def this(query: Query, pushEvent: js.Function1[/* e */ QueryEvent, Unit]) = this()
  var pushEvent: js.Any = js.native
  var query: js.Any = js.native
}

