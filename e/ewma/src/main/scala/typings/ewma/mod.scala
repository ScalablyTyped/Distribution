package typings.ewma

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ewma", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EwmaClass {
    def this(halfLifeMs: Double, initialValue: Double) = this()
    def this(halfLifeMs: Double, initialValue: Double, clock: ClockLike) = this()
    
    /* CompleteClass */
    override def insert(x: Double): Unit = js.native
    
    /* CompleteClass */
    override def reset(x: Double): Unit = js.native
    
    /* CompleteClass */
    override def value(): Double = js.native
  }
  @JSImport("ewma", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EwmaInstance = js.native
  
  trait ClockLike extends StObject {
    
    def now(): Double
  }
  object ClockLike {
    
    inline def apply(now: () => Double): ClockLike = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[ClockLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClockLike] (val x: Self) extends AnyVal {
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
  
  trait EwmaClass extends StObject {
    
    def insert(x: Double): Unit
    
    def reset(x: Double): Unit
    
    def value(): Double
  }
  object EwmaClass {
    
    inline def apply(insert: Double => Unit, reset: Double => Unit, value: () => Double): EwmaClass = {
      val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), reset = js.Any.fromFunction1(reset), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[EwmaClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EwmaClass] (val x: Self) extends AnyVal {
      
      inline def setInsert(value: Double => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setReset(value: Double => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setValue(value: () => Double): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait EwmaInstance
    extends StObject
       with Instantiable2[/* halfLifeMs */ Double, /* initialValue */ Double, EwmaClass]
       with Instantiable3[/* halfLifeMs */ Double, /* initialValue */ Double, /* clock */ ClockLike, EwmaClass] {
    
    def apply(halfLifeMs: Double, initialValue: Double): EwmaClass = js.native
    def apply(halfLifeMs: Double, initialValue: Double, clock: ClockLike): EwmaClass = js.native
  }
  
  type _To = js.Object & EwmaInstance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & EwmaInstance = ^
}
