package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryOrderByConstraint` is used to sort the set of documents returned by a
  * Firestore query. `QueryOrderByConstraint`s are created by invoking
  * {@link orderBy} and can then be passed to {@link (query:1)} to create a new query
  * instance that also contains this `QueryOrderByConstraint`.
  *
  * Note: Documents that do not contain the orderBy field will not be present in
  * the query result.
  */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends StObject
     with r {
  /**
    * @internal
    */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): Fn = js.native
  
  /* CompleteClass */
  var _direction: Any = js.native
  
  /* CompleteClass */
  var _field: Any = js.native
  
  /** The type of this query constraint */
  /* CompleteClass */
  var `type`: String = js.native
}
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any): r = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[r]
}
