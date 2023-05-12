package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements `DirectionalIndexByteEncoder` using `OrderedCodeWriter` for the
  * actual encoding.
  */ trait Nr extends StObject {
  
  def Ge(): js.typedarray.Uint8Array
  
  var Qe: Dr
  
  def We(t: Any): Cr | xr
  
  var je: Cr
  
  def reset(): Unit
  
  def seed(t: Any): Unit
  
  var ze: xr
}
object Nr {
  
  inline def apply(
    Ge: () => js.typedarray.Uint8Array,
    Qe: Dr,
    We: Any => Cr | xr,
    je: Cr,
    reset: () => Unit,
    seed: Any => Unit,
    ze: xr
  ): Nr = {
    val __obj = js.Dynamic.literal(Ge = js.Any.fromFunction0(Ge), Qe = Qe.asInstanceOf[js.Any], We = js.Any.fromFunction1(We), je = je.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), seed = js.Any.fromFunction1(seed), ze = ze.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nr] (val x: Self) extends AnyVal {
    
    inline def setGe(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "Ge", js.Any.fromFunction0(value))
    
    inline def setJe(value: Cr): Self = StObject.set(x, "je", value.asInstanceOf[js.Any])
    
    inline def setQe(value: Dr): Self = StObject.set(x, "Qe", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSeed(value: Any => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
    
    inline def setWe(value: Any => Cr | xr): Self = StObject.set(x, "We", js.Any.fromFunction1(value))
    
    inline def setZe(value: xr): Self = StObject.set(x, "ze", value.asInstanceOf[js.Any])
  }
}
