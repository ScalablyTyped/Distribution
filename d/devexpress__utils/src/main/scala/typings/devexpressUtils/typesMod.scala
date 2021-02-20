package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CmpFunc[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type EqualFunc[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  @js.native
  trait ICloneable[T] extends StObject
  
  @js.native
  trait IDisposable extends StObject {
    
    def dispose(): js.Any = js.native
  }
  object IDisposable {
    
    @scala.inline
    def apply(dispose: () => js.Any): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[IDisposable]
    }
    
    @scala.inline
    implicit class IDisposableMutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => js.Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IEquatable[T] extends StObject
  
  @js.native
  trait ISupportConverting[T] extends StObject {
    
    def applyConverter(converter: SimpleConverter[T]): this.type = js.native
  }
  object ISupportConverting {
    
    @scala.inline
    def apply[T](applyConverter: SimpleConverter[T] => ISupportConverting[T]): ISupportConverting[T] = {
      val __obj = js.Dynamic.literal(applyConverter = js.Any.fromFunction1(applyConverter))
      __obj.asInstanceOf[ISupportConverting[T]]
    }
    
    @scala.inline
    implicit class ISupportConvertingMutableBuilder[Self <: ISupportConverting[_], T] (val x: Self with ISupportConverting[T]) extends AnyVal {
      
      @scala.inline
      def setApplyConverter(value: SimpleConverter[T] => ISupportConverting[T]): Self = StObject.set(x, "applyConverter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ISupportCopyFrom[T] extends StObject {
    
    def copyFrom(obj: T): Unit = js.native
  }
  object ISupportCopyFrom {
    
    @scala.inline
    def apply[T](copyFrom: T => Unit): ISupportCopyFrom[T] = {
      val __obj = js.Dynamic.literal(copyFrom = js.Any.fromFunction1(copyFrom))
      __obj.asInstanceOf[ISupportCopyFrom[T]]
    }
    
    @scala.inline
    implicit class ISupportCopyFromMutableBuilder[Self <: ISupportCopyFrom[_], T] (val x: Self with ISupportCopyFrom[T]) extends AnyVal {
      
      @scala.inline
      def setCopyFrom(value: T => Unit): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    }
  }
  
  type SimpleConverter[T] = js.Function1[/* value */ T, T]
}
