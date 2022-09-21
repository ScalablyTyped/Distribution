package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QuerySnapshot` contains zero or more `DocumentSnapshot` objects
  * representing the results of a query. The documents can be accessed as an
  * array via the `docs` property or enumerated using the `forEach` method. The
  * number of documents can be determined via the `empty` and `size`
  * properties.
  */ @js.native
trait er extends StObject {
  
  var _docs: Any = js.native
  
  /** An array of all the documents in the `QuerySnapshot`. */ def docs: js.Array[Any] = js.native
  
  /** True if there are no documents in the `QuerySnapshot`. */ def empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the `QuerySnapshot`.
    *
    * @param callback - A callback to be called with a `QueryDocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg - The `this` binding for the callback.
    */ def forEach(t: Any, e: Any): Unit = js.native
  
  var query: Any = js.native
  
  /** The number of documents in the `QuerySnapshot`. */ def size: Double = js.native
}
