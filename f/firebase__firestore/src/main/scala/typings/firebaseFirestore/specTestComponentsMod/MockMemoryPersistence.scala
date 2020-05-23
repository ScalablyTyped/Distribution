package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.memoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.specTestRunnerMod.SpecDatabaseFailures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockMemoryPersistence")
@js.native
class MockMemoryPersistence () extends MemoryPersistence {
  var injectFailures: js.UndefOr[SpecDatabaseFailures] = js.native
}

