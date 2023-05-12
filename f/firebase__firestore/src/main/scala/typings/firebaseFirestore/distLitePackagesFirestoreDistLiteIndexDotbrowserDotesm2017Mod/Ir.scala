package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryFieldFilterConstraint` is used to narrow the set of documents returned by
  * a Firestore query by filtering on one or more document fields.
  * `QueryFieldFilterConstraint`s are created by invoking {@link where} and can then
  * be passed to {@link (query:1)} to create a new query instance that also contains
  * this `QueryFieldFilterConstraint`.
  */ trait Ir
  extends StObject
     with vr {
  
  def _apply(t: Any): Nn
  
  var _field: Any
  
  var _op: Any
  
  def _parse(t: Any): Jt | ee | ue
  
  var _value: Any
  
  /** The type of this query constraint */
  var `type`: String
}
object Ir {
  
  inline def apply(_apply: Any => Nn, _field: Any, _op: Any, _parse: Any => Jt | ee | ue, _value: Any, `type`: String): Ir = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _field = _field.asInstanceOf[js.Any], _op = _op.asInstanceOf[js.Any], _parse = js.Any.fromFunction1(_parse), _value = _value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ir] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Nn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_field(value: Any): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
    
    inline def set_op(value: Any): Self = StObject.set(x, "_op", value.asInstanceOf[js.Any])
    
    inline def set_parse(value: Any => Jt | ee | ue): Self = StObject.set(x, "_parse", js.Any.fromFunction1(value))
    
    inline def set_value(value: Any): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
  }
}
