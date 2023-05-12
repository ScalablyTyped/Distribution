package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryCompositeFilterConstraint` is used to narrow the set of documents
  * returned by a Firestore query by performing the logical OR or AND of multiple
  * {@link QueryFieldFilterConstraint}s or {@link QueryCompositeFilterConstraint}s.
  * `QueryCompositeFilterConstraint`s are created by invoking {@link or} or
  * {@link and} and can then be passed to {@link (query:1)} to create a new query
  * instance that also contains the `QueryCompositeFilterConstraint`.
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryCompositeFilterConstraint")
@js.native
open class QueryCompositeFilterConstraint protected ()
  extends StObject
     with bl {
  /**
    * @internal
    */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): Any = js.native
  
  /* CompleteClass */
  override def _getOperator(): and_ | or_ = js.native
  
  /* CompleteClass */
  override def _getQueryConstraints(): Any = js.native
  
  /* CompleteClass */
  override def _parse(t: Any): Any = js.native
  
  /* CompleteClass */
  var _queryConstraints: Any = js.native
  
  /* CompleteClass */
  var `type`: Any = js.native
}
object QueryCompositeFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryCompositeFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any): bl = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[bl]
}
