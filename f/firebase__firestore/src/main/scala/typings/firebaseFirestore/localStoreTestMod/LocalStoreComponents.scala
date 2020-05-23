package typings.firebaseFirestore.localStoreTestMod

import typings.firebaseFirestore.countingQueryEngineMod.CountingQueryEngine
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.persistenceMod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStoreComponents extends js.Object {
  var localStore: LocalStore
  var persistence: Persistence
  var queryEngine: CountingQueryEngine
}

object LocalStoreComponents {
  @scala.inline
  def apply(localStore: LocalStore, persistence: Persistence, queryEngine: CountingQueryEngine): LocalStoreComponents = {
    val __obj = js.Dynamic.literal(localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], queryEngine = queryEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStoreComponents]
  }
}

