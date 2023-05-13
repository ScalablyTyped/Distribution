package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

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
  */ trait Rr_
  extends StObject
     with br {
  
  def _apply(t: Any): Any
  
  def _getOperator(): and_ | or_
  
  def _getQueryConstraints(): Any
  
  def _parse(t: Any): Any
  
  var _queryConstraints: Any
  
  var `type`: Any
}
object Rr_ {
  
  inline def apply(
    _apply: Any => Any,
    _getOperator: () => and_ | or_,
    _getQueryConstraints: () => Any,
    _parse: Any => Any,
    _queryConstraints: Any,
    `type`: Any
  ): Rr_ = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _getOperator = js.Any.fromFunction0(_getOperator), _getQueryConstraints = js.Any.fromFunction0(_getQueryConstraints), _parse = js.Any.fromFunction1(_parse), _queryConstraints = _queryConstraints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rr_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rr_] (val x: Self) extends AnyVal {
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Any): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_getOperator(value: () => and_ | or_): Self = StObject.set(x, "_getOperator", js.Any.fromFunction0(value))
    
    inline def set_getQueryConstraints(value: () => Any): Self = StObject.set(x, "_getQueryConstraints", js.Any.fromFunction0(value))
    
    inline def set_parse(value: Any => Any): Self = StObject.set(x, "_parse", js.Any.fromFunction1(value))
    
    inline def set_queryConstraints(value: Any): Self = StObject.set(x, "_queryConstraints", value.asInstanceOf[js.Any])
  }
}
