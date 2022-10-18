package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bh
  extends StObject
     with Oh {
  
  def _apply(t: Any): Zc
  
  var ma: Any
  
  var pa: Any
  
  var `type`: String
}
object Bh {
  
  inline def apply(_apply: Any => Zc, ma: Any, pa: Any, `type`: String): Bh = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), ma = ma.asInstanceOf[js.Any], pa = pa.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bh]
  }
  
  extension [Self <: Bh](x: Self) {
    
    inline def setMa(value: Any): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
    
    inline def setPa(value: Any): Self = StObject.set(x, "pa", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Zc): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
