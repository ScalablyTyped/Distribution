package typings.firebaseFirestore.apiDatabaseMod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.firebaseFirestore.modelPathMod.ResourcePath
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicCollectionReference")
@js.native
object PublicCollectionReference
  extends TopLevel[
      Instantiable3[
        /* _path */ ResourcePath, 
        /* firestore */ Firestore, 
        js.UndefOr[
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
        ], 
        CollectionReference[js.Object]
      ]
    ]

