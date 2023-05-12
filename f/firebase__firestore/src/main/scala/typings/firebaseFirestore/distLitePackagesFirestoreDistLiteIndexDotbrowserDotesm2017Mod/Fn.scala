package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `CollectionReference` object can be used for adding documents, getting
  * document references, and querying for documents (using {@link (query:1)}).
  */ @js.native
trait Fn
  extends StObject
     with Nn {
  
  var _path: Any = js.native
  
  /** The collection's identifier. */ def id: Any = js.native
  
  /**
    * A reference to the containing `DocumentReference` if this is a
    * subcollection. If this isn't a subcollection, the reference is null.
    */ def parent: Dn | Null = js.native
  
  /**
    * A string representing the path of the referenced collection (relative
    * to the root of the database).
    */ def path: Any = js.native
}
