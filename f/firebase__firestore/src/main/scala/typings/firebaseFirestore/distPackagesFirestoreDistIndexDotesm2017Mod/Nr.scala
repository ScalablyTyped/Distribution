package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements `DirectionalIndexByteEncoder` using `OrderedCodeWriter` for the
  * actual encoding.
  */ trait Nr extends StObject {
  
  def He(t: Any): Cr | xr
  
  def Qe(): js.typedarray.Uint8Array
  
  var We: xr
  
  var je: Dr
  
  def reset(): Unit
  
  def seed(t: Any): Unit
  
  var ze: Cr
}
object Nr {
  
  inline def apply(
    He: Any => Cr | xr,
    Qe: () => js.typedarray.Uint8Array,
    We: xr,
    je: Dr,
    reset: () => Unit,
    seed: Any => Unit,
    ze: Cr
  ): Nr = {
    val __obj = js.Dynamic.literal(He = js.Any.fromFunction1(He), Qe = js.Any.fromFunction0(Qe), We = We.asInstanceOf[js.Any], je = je.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), seed = js.Any.fromFunction1(seed), ze = ze.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nr] (val x: Self) extends AnyVal {
    
    inline def setHe(value: Any => Cr | xr): Self = StObject.set(x, "He", js.Any.fromFunction1(value))
    
    inline def setJe(value: Dr): Self = StObject.set(x, "je", value.asInstanceOf[js.Any])
    
    inline def setQe(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "Qe", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSeed(value: Any => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
    
    inline def setWe(value: xr): Self = StObject.set(x, "We", value.asInstanceOf[js.Any])
    
    inline def setZe(value: Cr): Self = StObject.set(x, "ze", value.asInstanceOf[js.Any])
  }
}
