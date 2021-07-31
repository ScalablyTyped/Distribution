package typings.expectPuppeteer

import org.scalablytyped.runtime.StringDictionary
import typings.expectPuppeteer.expectPuppeteerStrings.left
import typings.expectPuppeteer.expectPuppeteerStrings.middle
import typings.expectPuppeteer.expectPuppeteerStrings.right
import typings.puppeteer.mod.Dialog
import typings.puppeteer.mod.ElementHandle
import typings.puppeteer.mod.Page
import typings.std.Element
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(instance: ElementHandle[Element]): ExpectPuppeteer = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[ExpectPuppeteer]
  @scala.inline
  def apply(instance: Page): ExpectPuppeteer = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[ExpectPuppeteer]
  
  @JSImport("expect-puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDefaultOptions(): ExpectDefaultOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ExpectDefaultOptions]
  
  @scala.inline
  def setDefaultOptions(options: ExpectDefaultOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Default options that apply to all expectations and can be set globally
    */
  trait ExpectDefaultOptions extends StObject {
    
    /**
      * An interval at which the pageFunction is executed. Defaults to "raf".
      */
    var polling: js.UndefOr[ExpectPolling] = js.undefined
    
    /**
      * Maximum time to wait for in milliseconds. Defaults to 500.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExpectDefaultOptions {
    
    @scala.inline
    def apply(): ExpectDefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectDefaultOptions]
    }
    
    @scala.inline
    implicit class ExpectDefaultOptionsMutableBuilder[Self <: ExpectDefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolling(value: ExpectPolling): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * Interval at which pageFunctions may be executed.
    */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.expectPuppeteer.expectPuppeteerStrings.mutation
    - typings.expectPuppeteer.expectPuppeteerStrings.raf
  */
  type ExpectPolling = _ExpectPolling | Double
  
  @js.native
  trait ExpectPuppeteer extends StObject {
    
    // These must all match the ExpectPuppeteer interface above.
    // We can't extend from it directly because some method names conflict in type-incompatible ways.
    def toClick(selector: String): js.Promise[Unit] = js.native
    def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    
    def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
    
    def toFill(selector: String, value: String): js.Promise[Unit] = js.native
    def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toMatch(selector: String): js.Promise[Unit] = js.native
    def toMatch(selector: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toMatchElement(selector: String): js.Promise[Unit] = js.native
    def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    
    def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
    def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
    def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  }
  
  /**
    * Configures how to poll for an element.
    */
  trait ExpectTimingActions
    extends StObject
       with ExpectDefaultOptions {
    
    /**
      * delay to pass to the puppeteer element.type API
      */
    var delay: js.UndefOr[Double] = js.undefined
  }
  object ExpectTimingActions {
    
    @scala.inline
    def apply(): ExpectTimingActions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectTimingActions]
    }
    
    @scala.inline
    implicit class ExpectTimingActionsMutableBuilder[Self <: ExpectTimingActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait ExpectToClickOptions
    extends StObject
       with ExpectTimingActions {
    
    /**
      * Defaults to left.
      */
    var button: js.UndefOr[left | right | middle] = js.undefined
    
    /**
      * defaults to 1. See UIEvent.detail.
      */
    var clickCount: js.UndefOr[Double] = js.undefined
    
    /**
      * A text or a RegExp to match in element textContent.
      */
    var text: js.UndefOr[String | RegExp] = js.undefined
    
    /**
      * wait for element to be present in DOM and to be visible, i.e. to not have display: none or visibility: hidden CSS properties. Defaults to false.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ExpectToClickOptions {
    
    @scala.inline
    def apply(): ExpectToClickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectToClickOptions]
    }
    
    @scala.inline
    implicit class ExpectToClickOptionsMutableBuilder[Self <: ExpectToClickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: left | right | middle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      @scala.inline
      def setText(value: String | RegExp): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait _ExpectPolling extends StObject
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        // These must all match the ExpectPuppeteer interface above.
        // We can't extend from it directly because some method names conflict in type-incompatible ways.
        def toClick(selector: String): js.Promise[Unit] = js.native
        def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
        
        def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
        
        def toFill(selector: String, value: String): js.Promise[Unit] = js.native
        def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toFillForm(selector: String, value: StringDictionary[js.Any]): js.Promise[Unit] = js.native
        def toFillForm(selector: String, value: StringDictionary[js.Any], options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toMatch(matcher: String): js.Promise[Unit] = js.native
        def toMatch(matcher: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toMatch(matcher: RegExp): js.Promise[Unit] = js.native
        def toMatch(matcher: RegExp, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toMatchElement(selector: String): js.Promise[ElementHandle[Element]] = js.native
        def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[ElementHandle[Element]] = js.native
        
        def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
        def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
        def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
      }
    }
  }
}
