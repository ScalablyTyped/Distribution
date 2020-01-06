package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicQuerySnapshot")
@js.native
object PublicQuerySnapshot
  extends TopLevel[
      Instantiable4[
        /* _firestore */ Firestore, 
        /* _originalQuery */ typings.atFirebaseFirestore.distSrcCoreQueryMod.Query, 
        /* _snapshot */ ViewSnapshot, 
        js.UndefOr[
          FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
        ], 
        QuerySnapshot[js.Object]
      ]
    ]

