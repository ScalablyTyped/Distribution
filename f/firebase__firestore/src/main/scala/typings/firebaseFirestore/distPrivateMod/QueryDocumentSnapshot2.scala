package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryDocumentSnapshot` contains data read from a document in your
  * Firestore database as part of a query. The document is guaranteed to exist
  * and its data can be extracted with `.data()` or `.get(<field>)` to get a
  * specific field.
  *
  * A `QueryDocumentSnapshot` offers the same API surface as a
  * `DocumentSnapshot`. Since query results contain only existing documents, the
  * `exists` property will always be true and `data()` will never return
  * 'undefined'.
  */
@js.native
trait QueryDocumentSnapshot2[T]
  extends StObject
     with DocumentSnapshot2[T]
