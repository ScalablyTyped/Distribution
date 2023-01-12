package typings.formstate

import typings.formstate.formstateBooleans.`false`
import typings.formstate.formstateBooleans.`true`
import typings.formstate.libCoreFormStateLazyMod.ValidatableArray
import typings.formstate.libCoreFormStateMod.ValidatableMapOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HasError extends StObject {
    
    var hasError: `true`
  }
  object HasError {
    
    inline def apply(): HasError = {
      val __obj = js.Dynamic.literal(hasError = true)
      __obj.asInstanceOf[HasError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasError] (val x: Self) extends AnyVal {
      
      inline def setHasError(value: `true`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasErrorValue[TValue /* <: ValidatableMapOrArray */] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object HasErrorValue {
    
    inline def apply[TValue /* <: ValidatableMapOrArray */](value: TValue): HasErrorValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasErrorValue[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasErrorValue[?], TValue /* <: ValidatableMapOrArray */] (val x: Self & HasErrorValue[TValue]) extends AnyVal {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValue[TValue] extends StObject {
    
    var newValue: TValue
    
    var oldValue: TValue
  }
  object NewValue {
    
    inline def apply[TValue](newValue: TValue, oldValue: TValue): NewValue[TValue] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewValue[?], TValue] (val x: Self & NewValue[TValue]) extends AnyVal {
      
      inline def setNewValue(value: TValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: TValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnReinit extends StObject {
    
    @JSName("on$Reinit")
    def on$Reinit(): Unit
    
    @JSName("on$ValidationPass")
    def on$ValidationPass(): Unit
  }
  object OnReinit {
    
    inline def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): OnReinit = {
      val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
      __obj.asInstanceOf[OnReinit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnReinit] (val x: Self) extends AnyVal {
      
      inline def setOn$Reinit(value: () => Unit): Self = StObject.set(x, "on$Reinit", js.Any.fromFunction0(value))
      
      inline def setOn$ValidationPass(value: () => Unit): Self = StObject.set(x, "on$ValidationPass", js.Any.fromFunction0(value))
    }
  }
  
  trait Value[TValue] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object Value {
    
    inline def apply[TValue](value: TValue): Value[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], TValue] (val x: Self & Value[TValue]) extends AnyVal {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueTValue[TValue /* <: ValidatableArray */] extends StObject {
    
    var hasError: `false`
    
    var value: TValue
  }
  object ValueTValue {
    
    inline def apply[TValue /* <: ValidatableArray */](value: TValue): ValueTValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTValue[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueTValue[?], TValue /* <: ValidatableArray */] (val x: Self & ValueTValue[TValue]) extends AnyVal {
      
      inline def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
