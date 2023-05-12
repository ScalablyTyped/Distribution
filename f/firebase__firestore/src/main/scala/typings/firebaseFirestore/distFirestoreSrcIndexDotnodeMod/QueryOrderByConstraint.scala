package typings.firebaseFirestore.distFirestoreSrcIndexDotnodeMod

import typings.firebaseFirestore.distFirestoreSrcCoreOrderByMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/index.node", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends typings.firebaseFirestore.distFirestoreSrcApiMod.QueryOrderByConstraint {
  /**
    * @internal
    */
  /* protected */ def this(_field: typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath, _direction: Direction) = this()
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/firestore/src/index.node", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(_field: typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath, _direction: Direction): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
}
