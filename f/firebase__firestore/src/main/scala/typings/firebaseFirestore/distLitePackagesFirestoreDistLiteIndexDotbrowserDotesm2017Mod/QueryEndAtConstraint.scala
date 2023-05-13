package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryEndAtConstraint` is used to exclude documents from the end of a
  * result set returned by a Firestore query.
  * `QueryEndAtConstraint`s are created by invoking {@link (endAt:1)} or
  * {@link (endBefore:1)} and can then be passed to {@link (query:1)} to create a new
  * query instance that also contains this `QueryEndAtConstraint`.
  */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryEndAtConstraint")
@js.native
open class QueryEndAtConstraint protected ()
  extends StObject
     with kr {
  /**
    * @internal
    */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): Fn = js.native
  
  /* CompleteClass */
  var _docOrFields: Any = js.native
  
  /* CompleteClass */
  var _inclusive: Any = js.native
  
  /* CompleteClass */
  var `type`: Any = js.native
}
object QueryEndAtConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryEndAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any, n: Any): kr = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[kr]
}
