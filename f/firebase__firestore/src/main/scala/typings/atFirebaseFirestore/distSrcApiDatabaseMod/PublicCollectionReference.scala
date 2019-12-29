package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
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
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any]
        ], 
        CollectionReference[js.Object]
      ]
    ]

