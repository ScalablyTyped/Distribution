package typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreOrderByMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcMod.QueryOrderByConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    _field: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ) = this()
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    _field: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
}
