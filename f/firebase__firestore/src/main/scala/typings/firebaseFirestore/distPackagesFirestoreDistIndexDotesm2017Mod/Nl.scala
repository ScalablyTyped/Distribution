package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryLimitConstraint` is used to limit the number of documents returned by
  * a Firestore query.
  * `QueryLimitConstraint`s are created by invoking {@link limit} or
  * {@link limitToLast} and can then be passed to {@link (query:1)} to create a new
  * query instance that also contains this `QueryLimitConstraint`.
  */ trait Nl
  extends StObject
     with Al {
  
  def _apply(t: Any): dh
  
  var _limit: Any
  
  var _limitType: Any
  
  var `type`: Any
}
object Nl {
  
  inline def apply(_apply: Any => dh, _limit: Any, _limitType: Any, `type`: Any): Nl = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _limit = _limit.asInstanceOf[js.Any], _limitType = _limitType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nl] (val x: Self) extends AnyVal {
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => dh): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_limit(value: Any): Self = StObject.set(x, "_limit", value.asInstanceOf[js.Any])
    
    inline def set_limitType(value: Any): Self = StObject.set(x, "_limitType", value.asInstanceOf[js.Any])
  }
}
