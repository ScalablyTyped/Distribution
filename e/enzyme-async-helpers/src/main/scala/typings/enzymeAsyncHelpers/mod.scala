package typings.enzymeAsyncHelpers

import typings.enzyme.mod.EnzymeSelector
import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-async-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def waitForElement(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    elementSelector: EnzymeSelector
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(wrapper.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForElement(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    elementSelector: EnzymeSelector,
    config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(wrapper.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitForProps(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForProps")(wrapper.asInstanceOf[js.Any], propsValidationFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForProps(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForProps")(wrapper.asInstanceOf[js.Any], propsValidationFn.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitForState(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForState")(wrapper.asInstanceOf[js.Any], stateValidationFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForState(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForState")(wrapper.asInstanceOf[js.Any], stateValidationFn.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Config extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    // Default: true, logs the wrapper's rendered structure when the wait times out. An attempt to help out in finding what's wrong.
    var logStructureOnSuccess: js.UndefOr[Boolean] = js.undefined
    
    var logStructureOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    // Default: 50, how often to check for validity
    var timeout: js.UndefOr[Double] = js.undefined
    
    // Default: 2000 (2 seconds), how long to wait before timing out
    var timeoutMessage: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLogStructureOnSuccess(value: Boolean): Self = StObject.set(x, "logStructureOnSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStructureOnSuccessUndefined: Self = StObject.set(x, "logStructureOnSuccess", js.undefined)
      
      @scala.inline
      def setLogStructureOnTimeout(value: Boolean): Self = StObject.set(x, "logStructureOnTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStructureOnTimeoutUndefined: Self = StObject.set(x, "logStructureOnTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMessage(value: String): Self = StObject.set(x, "timeoutMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMessageUndefined: Self = StObject.set(x, "timeoutMessage", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
