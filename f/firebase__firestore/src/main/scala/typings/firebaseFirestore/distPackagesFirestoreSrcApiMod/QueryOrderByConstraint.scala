package typings.firebaseFirestore.distPackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreOrderByMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src/api", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiFilterMod.QueryOrderByConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    _field: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ) = this()
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    _field: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
}
