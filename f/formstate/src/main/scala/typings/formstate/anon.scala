package typings.formstate

import typings.formstate.formStateLazyMod.ValidatableArray
import typings.formstate.formStateMod.ValidatableMapOrArray
import typings.formstate.formstateBooleans.`false`
import typings.formstate.formstateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HasError extends StObject {
    
    var hasError: `true` = js.native
  }
  object HasError {
    
    @scala.inline
    def apply(hasError: `true`): HasError = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasError]
    }
    
    @scala.inline
    implicit class HasErrorMutableBuilder[Self <: HasError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasError(value: `true`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HasErrorValue[TValue /* <: ValidatableMapOrArray */] extends StObject {
    
    var hasError: `false` = js.native
    
    var value: TValue = js.native
  }
  object HasErrorValue {
    
    @scala.inline
    def apply[TValue /* <: ValidatableMapOrArray */](hasError: `false`, value: TValue): HasErrorValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasErrorValue[TValue]]
    }
    
    @scala.inline
    implicit class HasErrorValueMutableBuilder[Self <: HasErrorValue[_], TValue /* <: ValidatableMapOrArray */] (val x: Self with HasErrorValue[TValue]) extends AnyVal {
      
      @scala.inline
      def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewValue[TValue] extends StObject {
    
    var newValue: TValue = js.native
    
    var oldValue: TValue = js.native
  }
  object NewValue {
    
    @scala.inline
    def apply[TValue](newValue: TValue, oldValue: TValue): NewValue[TValue] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue[TValue]]
    }
    
    @scala.inline
    implicit class NewValueMutableBuilder[Self <: NewValue[_], TValue] (val x: Self with NewValue[TValue]) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: TValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: TValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnReinit extends StObject {
    
    @JSName("on$Reinit")
    def on$Reinit(): Unit = js.native
    
    @JSName("on$ValidationPass")
    def on$ValidationPass(): Unit = js.native
  }
  object OnReinit {
    
    @scala.inline
    def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): OnReinit = {
      val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
      __obj.asInstanceOf[OnReinit]
    }
    
    @scala.inline
    implicit class OnReinitMutableBuilder[Self <: OnReinit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn$Reinit(value: () => Unit): Self = StObject.set(x, "on$Reinit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn$ValidationPass(value: () => Unit): Self = StObject.set(x, "on$ValidationPass", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Value[TValue] extends StObject {
    
    var hasError: `false` = js.native
    
    var value: TValue = js.native
  }
  object Value {
    
    @scala.inline
    def apply[TValue](hasError: `false`, value: TValue): Value[TValue] = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TValue]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[_], TValue] (val x: Self with Value[TValue]) extends AnyVal {
      
      @scala.inline
      def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueTValue[TValue /* <: ValidatableArray */] extends StObject {
    
    var hasError: `false` = js.native
    
    var value: TValue = js.native
  }
  object ValueTValue {
    
    @scala.inline
    def apply[TValue /* <: ValidatableArray */](hasError: `false`, value: TValue): ValueTValue[TValue] = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTValue[TValue]]
    }
    
    @scala.inline
    implicit class ValueTValueMutableBuilder[Self <: ValueTValue[_], TValue /* <: ValidatableArray */] (val x: Self with ValueTValue[TValue]) extends AnyVal {
      
      @scala.inline
      def setHasError(value: `false`): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
