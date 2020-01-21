package typings.firebaseFirestore.databaseMod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicCollectionReference")
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

