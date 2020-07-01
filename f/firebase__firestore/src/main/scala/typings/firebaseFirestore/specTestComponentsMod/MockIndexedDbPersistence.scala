package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.specTestRunnerMod.PersistenceAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockIndexedDbPersistence")
@js.native
class MockIndexedDbPersistence () extends IndexedDbPersistence {
  var injectFailures: js.Array[PersistenceAction] = js.native
}

