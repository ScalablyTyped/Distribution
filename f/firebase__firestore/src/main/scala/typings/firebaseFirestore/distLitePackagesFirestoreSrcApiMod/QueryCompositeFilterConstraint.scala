package typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFilterConstraint
import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api", "QueryCompositeFilterConstraint")
@js.native
open class QueryCompositeFilterConstraint protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiFilterMod.QueryCompositeFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: or_ | and_,
    _queryConstraints: js.Array[QueryFilterConstraint]
  ) = this()
}
/* static members */
object QueryCompositeFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api", "QueryCompositeFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(`type`: or_ | and_, _queryConstraints: js.Array[QueryFilterConstraint]): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _queryConstraints.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
}
