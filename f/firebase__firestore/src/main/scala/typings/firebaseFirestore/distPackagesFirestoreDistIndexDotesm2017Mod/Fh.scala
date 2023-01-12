package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fh
  extends StObject
     with Oh {
  
  def _apply(t: Any): Zc
  
  var ga: Any
  
  var ma: Any
  
  var `type`: String
  
  var ya: Any
}
object Fh {
  
  inline def apply(_apply: Any => Zc, ga: Any, ma: Any, `type`: String, ya: Any): Fh = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), ga = ga.asInstanceOf[js.Any], ma = ma.asInstanceOf[js.Any], ya = ya.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fh] (val x: Self) extends AnyVal {
    
    inline def setGa(value: Any): Self = StObject.set(x, "ga", value.asInstanceOf[js.Any])
    
    inline def setMa(value: Any): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setYa(value: Any): Self = StObject.set(x, "ya", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Zc): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
