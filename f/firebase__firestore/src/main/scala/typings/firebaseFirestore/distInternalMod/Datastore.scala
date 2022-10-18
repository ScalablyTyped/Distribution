package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datastore and its related methods are a wrapper around the external Google
  * Cloud Datastore grpc API, which provides an interface that is more convenient
  * for the rest of the client SDK architecture to consume.
  */
trait Datastore extends StObject {
  
  def terminate(): Unit
}
object Datastore {
  
  inline def apply(terminate: () => Unit): Datastore = {
    val __obj = js.Dynamic.literal(terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Datastore]
  }
  
  extension [Self <: Datastore](x: Self) {
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
