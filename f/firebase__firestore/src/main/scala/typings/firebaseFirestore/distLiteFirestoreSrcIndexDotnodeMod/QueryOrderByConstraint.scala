package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotnodeMod

import typings.firebaseFirestore.distLiteFirestoreSrcCoreOrderByMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.QueryOrderByConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    _field: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ) = this()
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    _field: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath,
    _direction: Direction
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
}
