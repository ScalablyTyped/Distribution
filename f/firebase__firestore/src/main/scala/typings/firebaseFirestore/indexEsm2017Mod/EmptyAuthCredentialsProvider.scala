package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CredentialsProvider that always yields an empty token.
  * @internal
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_EmptyAuthCredentialsProvider")
@js.native
open class EmptyAuthCredentialsProvider ()
  extends StObject
     with q {
  
  /* CompleteClass */
  override def getToken(): js.Promise[Null] = js.native
  
  /* CompleteClass */
  override def invalidateToken(): Unit = js.native
  
  /* CompleteClass */
  override def shutdown(): Unit = js.native
  
  /* CompleteClass */
  override def start(t: Any, e: Any): Unit = js.native
}
