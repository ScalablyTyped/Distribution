package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cr extends StObject {
  
  def Ee(t: Any): Unit
  
  var Qe: Any
  
  def me(): Unit
  
  def pe(t: Any): Unit
  
  def ye(t: Any): Unit
}
object Cr {
  
  inline def apply(Ee: Any => Unit, Qe: Any, me: () => Unit, pe: Any => Unit, ye: Any => Unit): Cr = {
    val __obj = js.Dynamic.literal(Ee = js.Any.fromFunction1(Ee), Qe = Qe.asInstanceOf[js.Any], me = js.Any.fromFunction0(me), pe = js.Any.fromFunction1(pe), ye = js.Any.fromFunction1(ye))
    __obj.asInstanceOf[Cr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cr] (val x: Self) extends AnyVal {
    
    inline def setEe(value: Any => Unit): Self = StObject.set(x, "Ee", js.Any.fromFunction1(value))
    
    inline def setMe(value: () => Unit): Self = StObject.set(x, "me", js.Any.fromFunction0(value))
    
    inline def setPe(value: Any => Unit): Self = StObject.set(x, "pe", js.Any.fromFunction1(value))
    
    inline def setQe(value: Any): Self = StObject.set(x, "Qe", value.asInstanceOf[js.Any])
    
    inline def setYe(value: Any => Unit): Self = StObject.set(x, "ye", js.Any.fromFunction1(value))
  }
}
