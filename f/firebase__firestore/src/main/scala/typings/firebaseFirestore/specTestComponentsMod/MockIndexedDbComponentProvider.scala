package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.componentProviderMod.IndexedDbComponentProvider
import typings.firebaseFirestore.testPlatformMod.FakeDocument
import typings.firebaseFirestore.utilTypesMod.WindowLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockIndexedDbComponentProvider")
@js.native
class MockIndexedDbComponentProvider protected () extends IndexedDbComponentProvider {
  def this(window: WindowLike, document: FakeDocument) = this()
  val document: js.Any = js.native
  @JSName("persistence")
  var persistence_MockIndexedDbComponentProvider: MockIndexedDbPersistence = js.native
  val window: js.Any = js.native
}

