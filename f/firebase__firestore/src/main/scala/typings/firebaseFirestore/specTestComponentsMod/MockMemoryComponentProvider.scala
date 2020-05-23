package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.componentProviderMod.MemoryComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockMemoryComponentProvider")
@js.native
class MockMemoryComponentProvider protected () extends MemoryComponentProvider {
  def this(gcEnabled: Boolean) = this()
  val gcEnabled: js.Any = js.native
  @JSName("persistence")
  var persistence_MockMemoryComponentProvider: MockMemoryPersistence = js.native
}

