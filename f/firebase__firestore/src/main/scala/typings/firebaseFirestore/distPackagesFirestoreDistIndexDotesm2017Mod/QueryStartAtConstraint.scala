package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryStartAtConstraint` is used to exclude documents from the start of a
  * result set returned by a Firestore query.
  * `QueryStartAtConstraint`s are created by invoking {@link (startAt:1)} or
  * {@link (startAfter:1)} and can then be passed to {@link (query:1)} to create a
  * new query instance that also contains this `QueryStartAtConstraint`.
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryStartAtConstraint")
@js.native
open class QueryStartAtConstraint protected ()
  extends StObject
     with l {
  /**
    * @internal
    */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): dh = js.native
  
  /* CompleteClass */
  var _docOrFields: Any = js.native
  
  /* CompleteClass */
  var _inclusive: Any = js.native
  
  /* CompleteClass */
  var `type`: Any = js.native
}
object QueryStartAtConstraint {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryStartAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any, n: Any): l = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[l]
}
