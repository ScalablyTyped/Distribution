package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

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
  */ trait Cl
  extends StObject
     with Al {
  
  def _apply(t: Any): dh
  
  var _direction: Any
  
  var _field: Any
  
  /** The type of this query constraint */
  var `type`: String
}
object Cl {
  
  inline def apply(_apply: Any => dh, _direction: Any, _field: Any, `type`: String): Cl = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _direction = _direction.asInstanceOf[js.Any], _field = _field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cl] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => dh): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_direction(value: Any): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_field(value: Any): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
  }
}
