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
  */ trait Or_
  extends StObject
     with vr {
  
  def _apply(t: Any): Nn
  
  var _docOrFields: Any
  
  var _inclusive: Any
  
  var `type`: Any
}
object Or_ {
  
  inline def apply(_apply: Any => Nn, _docOrFields: Any, _inclusive: Any, `type`: Any): Or_ = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _docOrFields = _docOrFields.asInstanceOf[js.Any], _inclusive = _inclusive.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Or_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Or_] (val x: Self) extends AnyVal {
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Nn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_docOrFields(value: Any): Self = StObject.set(x, "_docOrFields", value.asInstanceOf[js.Any])
    
    inline def set_inclusive(value: Any): Self = StObject.set(x, "_inclusive", value.asInstanceOf[js.Any])
  }
}
