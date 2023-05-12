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
  
  /**
    * Encodes `val` into an encoding so that the order matches the IEEE 754
    * floating-point comparison results with the following exceptions:
    *   -0.0 < 0.0
    *   all non-NaN < NaN
    *   NaN = NaN
    */ @JSName("$e")
  def $e(t: Any): js.typedarray.Uint8Array
  
  def Be(t: Any): Unit
  
  def Ce(t: Any): Unit
  
  def De(): Unit
  
  def Fe(t: Any): Unit
  
  /** Makes a copy of the encoded bytes in this buffer.  */ def Ge(): js.typedarray.Uint8Array
  
  def Ke(t: Any): Unit
  
  /**
    * Writes the "infinity" byte sequence that sorts after all other byte
    * sequences written in ascending order.
    */ def Le(): Unit
  
  /** Writes utf8 bytes into this byte sequence, descending */ def Me(t: Any): Unit
  
  def Ne(): Unit
  
  def Oe(t: Any): Unit
  
  /** Writes a single byte ascending to the buffer. */ def Se(t: Any): Unit
  
  /**
    * Writes the "infinity" byte sequence that sorts before all other byte
    * sequences written in descending order.
    */ def Ue(): Unit
  
  def Ve(t: Any): Unit
  
  var buffer: js.typedarray.Uint8Array
  
  /** Writes utf8 bytes into this byte sequence, ascending. */ def ke(t: Any): Unit
  
  var position: Double
  
  def qe(t: Any): Unit
  
  /**
    * Resets the buffer such that it is the same as when it was newly
    * constructed.
    */ def reset(): Unit
  
  def seed(t: Any): Unit
  
  /** Writes a single byte descending to the buffer.  */ def xe(t: Any): Unit
}
object Dr {
  
  inline def apply(
    $e: Any => js.typedarray.Uint8Array,
    Be: Any => Unit,
    Ce: Any => Unit,
    De: () => Unit,
    Fe: Any => Unit,
    Ge: () => js.typedarray.Uint8Array,
    Ke: Any => Unit,
    Le: () => Unit,
    Me: Any => Unit,
    Ne: () => Unit,
    Oe: Any => Unit,
    Se: Any => Unit,
    Ue: () => Unit,
    Ve: Any => Unit,
    buffer: js.typedarray.Uint8Array,
    ke: Any => Unit,
    position: Double,
    qe: Any => Unit,
    reset: () => Unit,
    seed: Any => Unit,
    xe: Any => Unit
  ): Dr = {
    val __obj = js.Dynamic.literal($e = js.Any.fromFunction1($e), Be = js.Any.fromFunction1(Be), Ce = js.Any.fromFunction1(Ce), De = js.Any.fromFunction0(De), Fe = js.Any.fromFunction1(Fe), Ge = js.Any.fromFunction0(Ge), Ke = js.Any.fromFunction1(Ke), Le = js.Any.fromFunction0(Le), Me = js.Any.fromFunction1(Me), Ne = js.Any.fromFunction0(Ne), Oe = js.Any.fromFunction1(Oe), Se = js.Any.fromFunction1(Se), Ue = js.Any.fromFunction0(Ue), Ve = js.Any.fromFunction1(Ve), buffer = buffer.asInstanceOf[js.Any], ke = js.Any.fromFunction1(ke), position = position.asInstanceOf[js.Any], qe = js.Any.fromFunction1(qe), reset = js.Any.fromFunction0(reset), seed = js.Any.fromFunction1(seed), xe = js.Any.fromFunction1(xe))
    __obj.asInstanceOf[Dr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dr] (val x: Self) extends AnyVal {
    
    inline def set$e(value: Any => js.typedarray.Uint8Array): Self = StObject.set(x, "$e", js.Any.fromFunction1(value))
    
    inline def setBe(value: Any => Unit): Self = StObject.set(x, "Be", js.Any.fromFunction1(value))
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setCe(value: Any => Unit): Self = StObject.set(x, "Ce", js.Any.fromFunction1(value))
    
    inline def setDe(value: () => Unit): Self = StObject.set(x, "De", js.Any.fromFunction0(value))
    
    inline def setFe(value: Any => Unit): Self = StObject.set(x, "Fe", js.Any.fromFunction1(value))
    
    inline def setGe(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "Ge", js.Any.fromFunction0(value))
    
    inline def setKe(value: Any => Unit): Self = StObject.set(x, "Ke", js.Any.fromFunction1(value))
    
    inline def setLe(value: () => Unit): Self = StObject.set(x, "Le", js.Any.fromFunction0(value))
    
    inline def setMe(value: Any => Unit): Self = StObject.set(x, "Me", js.Any.fromFunction1(value))
    
    inline def setNe(value: () => Unit): Self = StObject.set(x, "Ne", js.Any.fromFunction0(value))
    
    inline def setOe(value: Any => Unit): Self = StObject.set(x, "Oe", js.Any.fromFunction1(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setQe(value: Any => Unit): Self = StObject.set(x, "qe", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSe(value: Any => Unit): Self = StObject.set(x, "Se", js.Any.fromFunction1(value))
    
    inline def setSeed(value: Any => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
    
    inline def setUe(value: () => Unit): Self = StObject.set(x, "Ue", js.Any.fromFunction0(value))
    
    inline def setVe(value: Any => Unit): Self = StObject.set(x, "Ve", js.Any.fromFunction1(value))
    
    inline def setXe(value: Any => Unit): Self = StObject.set(x, "xe", js.Any.fromFunction1(value))
  }
}
