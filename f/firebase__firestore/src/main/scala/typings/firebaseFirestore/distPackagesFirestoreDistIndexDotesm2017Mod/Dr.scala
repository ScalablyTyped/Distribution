package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OrderedCodeWriter is a minimal-allocation implementation of the writing
  * behavior defined by the backend.
  *
  * The code is ported from its Java counterpart.
  */ trait Dr extends StObject {
  
  /** Writes utf8 bytes into this byte sequence, descending */ @JSName("$e")
  def $e(t: Any): Unit
  
  def Be(t: Any): Unit
  
  def Ce(): Unit
  
  /** Writes a single byte ascending to the buffer. */ def De(t: Any): Unit
  
  /**
    * Encodes `val` into an encoding so that the order matches the IEEE 754
    * floating-point comparison results with the following exceptions:
    *   -0.0 < 0.0
    *   all non-NaN < NaN
    *   NaN = NaN
    */ def Fe(t: Any): js.typedarray.Uint8Array
  
  def Ge(t: Any): Unit
  
  /**
    * Writes the "infinity" byte sequence that sorts before all other byte
    * sequences written in descending order.
    */ def Ke(): Unit
  
  def Le(t: Any): Unit
  
  /** Writes utf8 bytes into this byte sequence, ascending. */ def Me(t: Any): Unit
  
  /** Writes a single byte descending to the buffer.  */ def Ne(t: Any): Unit
  
  def Oe(t: Any): Unit
  
  /** Makes a copy of the encoded bytes in this buffer.  */ def Qe(): js.typedarray.Uint8Array
  
  def Se(t: Any): Unit
  
  def Ue(t: Any): Unit
  
  var buffer: js.typedarray.Uint8Array
  
  def ke(): Unit
  
  var position: Double
  
  /**
    * Writes the "infinity" byte sequence that sorts after all other byte
    * sequences written in ascending order.
    */ def qe(): Unit
  
  /**
    * Resets the buffer such that it is the same as when it was newly
    * constructed.
    */ def reset(): Unit
  
  def seed(t: Any): Unit
  
  def xe(t: Any): Unit
}
object Dr {
  
  inline def apply(
    $e: Any => Unit,
    Be: Any => Unit,
    Ce: () => Unit,
    De: Any => Unit,
    Fe: Any => js.typedarray.Uint8Array,
    Ge: Any => Unit,
    Ke: () => Unit,
    Le: Any => Unit,
    Me: Any => Unit,
    Ne: Any => Unit,
    Oe: Any => Unit,
    Qe: () => js.typedarray.Uint8Array,
    Se: Any => Unit,
    Ue: Any => Unit,
    buffer: js.typedarray.Uint8Array,
    ke: () => Unit,
    position: Double,
    qe: () => Unit,
    reset: () => Unit,
    seed: Any => Unit,
    xe: Any => Unit
  ): Dr = {
    val __obj = js.Dynamic.literal($e = js.Any.fromFunction1($e), Be = js.Any.fromFunction1(Be), Ce = js.Any.fromFunction0(Ce), De = js.Any.fromFunction1(De), Fe = js.Any.fromFunction1(Fe), Ge = js.Any.fromFunction1(Ge), Ke = js.Any.fromFunction0(Ke), Le = js.Any.fromFunction1(Le), Me = js.Any.fromFunction1(Me), Ne = js.Any.fromFunction1(Ne), Oe = js.Any.fromFunction1(Oe), Qe = js.Any.fromFunction0(Qe), Se = js.Any.fromFunction1(Se), Ue = js.Any.fromFunction1(Ue), buffer = buffer.asInstanceOf[js.Any], ke = js.Any.fromFunction0(ke), position = position.asInstanceOf[js.Any], qe = js.Any.fromFunction0(qe), reset = js.Any.fromFunction0(reset), seed = js.Any.fromFunction1(seed), xe = js.Any.fromFunction1(xe))
    __obj.asInstanceOf[Dr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dr] (val x: Self) extends AnyVal {
    
    inline def set$e(value: Any => Unit): Self = StObject.set(x, "$e", js.Any.fromFunction1(value))
    
    inline def setBe(value: Any => Unit): Self = StObject.set(x, "Be", js.Any.fromFunction1(value))
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setCe(value: () => Unit): Self = StObject.set(x, "Ce", js.Any.fromFunction0(value))
    
    inline def setDe(value: Any => Unit): Self = StObject.set(x, "De", js.Any.fromFunction1(value))
    
    inline def setFe(value: Any => js.typedarray.Uint8Array): Self = StObject.set(x, "Fe", js.Any.fromFunction1(value))
    
    inline def setGe(value: Any => Unit): Self = StObject.set(x, "Ge", js.Any.fromFunction1(value))
    
    inline def setKe(value: () => Unit): Self = StObject.set(x, "Ke", js.Any.fromFunction0(value))
    
    inline def setLe(value: Any => Unit): Self = StObject.set(x, "Le", js.Any.fromFunction1(value))
    
    inline def setMe(value: Any => Unit): Self = StObject.set(x, "Me", js.Any.fromFunction1(value))
    
    inline def setNe(value: Any => Unit): Self = StObject.set(x, "Ne", js.Any.fromFunction1(value))
    
    inline def setOe(value: Any => Unit): Self = StObject.set(x, "Oe", js.Any.fromFunction1(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setQe(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "Qe", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSe(value: Any => Unit): Self = StObject.set(x, "Se", js.Any.fromFunction1(value))
    
    inline def setSeed(value: Any => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
    
    inline def setUe(value: Any => Unit): Self = StObject.set(x, "Ue", js.Any.fromFunction1(value))
    
    inline def setXe(value: Any => Unit): Self = StObject.set(x, "xe", js.Any.fromFunction1(value))
  }
}
