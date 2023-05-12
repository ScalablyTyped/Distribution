package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotrnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "QueryStartAtConstraint")
@js.native
open class QueryStartAtConstraint protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.QueryStartAtConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: typings.firebaseFirestore.firebaseFirestoreStrings.startAt | typings.firebaseFirestore.firebaseFirestoreStrings.startAfter,
    _docOrFields: js.Array[
        Any | typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
      ],
    _inclusive: Boolean
  ) = this()
}
/* static members */
object QueryStartAtConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "QueryStartAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.startAt | typings.firebaseFirestore.firebaseFirestoreStrings.startAfter,
    _docOrFields: js.Array[
      Any | typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
    ],
    _inclusive: Boolean
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
}
