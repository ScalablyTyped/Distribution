package typings.firebaseStorage

import typings.firebaseStorageTypes.mod.FirebaseStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationTestMod {
  
  @JSImport("@firebase/storage/dist/test/integration/integration.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/test/integration/integration.test", "API_KEY")
  @js.native
  val API_KEY: js.Any = js.native
  
  @JSImport("@firebase/storage/dist/test/integration/integration.test", "PROJECT_ID")
  @js.native
  val PROJECT_ID: js.Any = js.native
  
  @JSImport("@firebase/storage/dist/test/integration/integration.test", "STORAGE_BUCKET")
  @js.native
  val STORAGE_BUCKET: js.Any = js.native
  
  inline def withTestInstance(fn: js.Function1[/* storage */ FirebaseStorage, Unit | js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestInstance")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
