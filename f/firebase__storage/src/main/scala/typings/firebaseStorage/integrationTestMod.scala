package typings.firebaseStorage

import typings.firebaseStorageTypes.mod.FirebaseStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/test/integration/integration.test", JSImport.Namespace)
@js.native
object integrationTestMod extends js.Object {
  
  val API_KEY: js.Any = js.native
  
  val PROJECT_ID: js.Any = js.native
  
  val STORAGE_BUCKET: js.Any = js.native
  
  def withTestInstance(fn: js.Function1[/* storage */ FirebaseStorage, Unit | js.Promise[Unit]]): js.Promise[Unit] = js.native
}
