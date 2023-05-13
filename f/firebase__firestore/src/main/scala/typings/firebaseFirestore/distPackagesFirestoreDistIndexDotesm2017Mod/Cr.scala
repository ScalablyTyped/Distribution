package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cr extends StObject {
  
  def Ae(t: Any): Unit
  
  def Ie(t: Any): Unit
  
  def ge(): Unit
  
  var je: Any
  
  def pe(t: Any): Unit
}
object Cr {
  
  inline def apply(Ae: Any => Unit, Ie: Any => Unit, ge: () => Unit, je: Any, pe: Any => Unit): Cr = {
    val __obj = js.Dynamic.literal(Ae = js.Any.fromFunction1(Ae), Ie = js.Any.fromFunction1(Ie), ge = js.Any.fromFunction0(ge), je = je.asInstanceOf[js.Any], pe = js.Any.fromFunction1(pe))
    __obj.asInstanceOf[Cr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cr] (val x: Self) extends AnyVal {
    
    inline def setAe(value: Any => Unit): Self = StObject.set(x, "Ae", js.Any.fromFunction1(value))
    
    inline def setGe(value: () => Unit): Self = StObject.set(x, "ge", js.Any.fromFunction0(value))
    
    inline def setIe(value: Any => Unit): Self = StObject.set(x, "Ie", js.Any.fromFunction1(value))
    
    inline def setJe(value: Any): Self = StObject.set(x, "je", value.asInstanceOf[js.Any])
    
    inline def setPe(value: Any => Unit): Self = StObject.set(x, "pe", js.Any.fromFunction1(value))
  }
}
