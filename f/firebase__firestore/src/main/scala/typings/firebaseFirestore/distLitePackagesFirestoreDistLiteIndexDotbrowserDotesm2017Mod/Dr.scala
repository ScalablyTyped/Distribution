package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryLimitConstraint` is used to limit the number of documents returned by
  * a Firestore query.
  * `QueryLimitConstraint`s are created by invoking {@link limit} or
  * {@link limitToLast} and can then be passed to {@link (query:1)} to create a new
  * query instance that also contains this `QueryLimitConstraint`.
  */ trait Dr
  extends StObject
     with vr {
  
  def _apply(t: Any): Nn
  
  var _limit: Any
  
  var _limitType: Any
  
  var `type`: Any
}
object Dr {
  
  inline def apply(_apply: Any => Nn, _limit: Any, _limitType: Any, `type`: Any): Dr = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _limit = _limit.asInstanceOf[js.Any], _limitType = _limitType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dr] (val x: Self) extends AnyVal {
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Nn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_limit(value: Any): Self = StObject.set(x, "_limit", value.asInstanceOf[js.Any])
    
    inline def set_limitType(value: Any): Self = StObject.set(x, "_limitType", value.asInstanceOf[js.Any])
  }
}
