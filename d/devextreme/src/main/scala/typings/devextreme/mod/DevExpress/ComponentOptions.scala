package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.Element
import typings.devextreme.anon.FullName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions[T] extends StObject {
  
  /**
    * [descr:Component.Options.onDisposing]
    */
  var onDisposing: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.Component[T], js.Any]] = js.undefined
  
  /**
    * [descr:Component.Options.onInitialized]
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ Element[T], js.Any]] = js.undefined
  
  /**
    * [descr:Component.Options.onOptionChanged]
    */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ FullName[T], js.Any]] = js.undefined
}
object ComponentOptions {
  
  @scala.inline
  def apply[T](): ComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[T]]
  }
  
  @scala.inline
  implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[?], T] (val x: Self & ComponentOptions[T]) extends AnyVal {
    
    @scala.inline
    def setOnDisposing(value: /* e */ typings.devextreme.anon.Component[T] => js.Any): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: /* e */ Element[T] => js.Any): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    @scala.inline
    def setOnOptionChanged(value: /* e */ FullName[T] => js.Any): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
  }
}
