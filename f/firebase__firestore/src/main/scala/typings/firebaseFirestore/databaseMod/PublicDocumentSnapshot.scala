package typings.firebaseFirestore.databaseMod

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.TopLevel
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicDocumentSnapshot")
@js.native
object PublicDocumentSnapshot
  extends TopLevel[
      Instantiable6[
        /* _firestore */ Firestore, 
        /* _key */ DocumentKey, 
        /* _document */ Document | Null, 
        /* _fromCache */ Boolean, 
        /* _hasPendingWrites */ Boolean, 
        js.UndefOr[
          FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
        ], 
        DocumentSnapshot[js.Object]
      ]
    ]

