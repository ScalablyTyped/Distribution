package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.ListenResponse
import typings.firebaseFirestore.firestoreSrcRemoteWatchChangeMod.WatchChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreTestUtilSpecTestHelpersMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/util/spec_test_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeWatchChange(watchChange: WatchChange): ListenResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWatchChange")(watchChange.asInstanceOf[js.Any]).asInstanceOf[ListenResponse]
}
