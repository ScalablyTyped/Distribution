package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.componentProviderMod.IndexedDbComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockIndexedDbComponentProvider")
@js.native
class MockIndexedDbComponentProvider () extends IndexedDbComponentProvider {
  @JSName("persistence")
  var persistence_MockIndexedDbComponentProvider: MockIndexedDbPersistence = js.native
}

