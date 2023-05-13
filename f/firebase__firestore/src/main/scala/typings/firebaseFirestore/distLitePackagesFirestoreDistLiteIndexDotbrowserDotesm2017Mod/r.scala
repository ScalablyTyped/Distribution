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
  */ trait r
  extends StObject
     with br {
  
  def _apply(t: Any): Fn
  
  var _direction: Any
  
  var _field: Any
  
  /** The type of this query constraint */
  var `type`: String
}
object r {
  
  inline def apply(_apply: Any => Fn, _direction: Any, _field: Any, `type`: String): r = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _direction = _direction.asInstanceOf[js.Any], _field = _field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[r]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: r] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Fn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_direction(value: Any): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_field(value: Any): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
  }
}
