package typings.elementResizeDetector

import typings.elementResizeDetector.elementResizeDetectorStrings.`object`
import typings.elementResizeDetector.elementResizeDetectorStrings.scroll
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("element-resize-detector", JSImport.Namespace)
  @js.native
  def apply(): Erd = js.native
  @JSImport("element-resize-detector", JSImport.Namespace)
  @js.native
  def apply(options: ErdmOptions): Erd = js.native
  
  @js.native
  trait Erd extends StObject {
    
    def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
    
    def removeAllListeners(element: HTMLElement): Unit = js.native
    
    def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
    
    def uninstall(element: HTMLElement): Unit = js.native
  }
  object Erd {
    
    @scala.inline
    def apply(
      listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
      removeAllListeners: HTMLElement => Unit,
      removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
      uninstall: HTMLElement => Unit
    ): Erd = {
      val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2(listenTo), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), uninstall = js.Any.fromFunction1(uninstall))
      __obj.asInstanceOf[Erd]
    }
    
    @scala.inline
    implicit class ErdMutableBuilder[Self <: Erd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListenTo(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = StObject.set(x, "listenTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAllListeners(value: HTMLElement => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUninstall(value: HTMLElement => Unit): Self = StObject.set(x, "uninstall", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ErdmOptions extends StObject {
    
    /**
      * Determines if listeners should be called when they are getting added.
      * If true, the listener is guaranteed to be called when it has been added.
      * If false, the listener will not be guarenteed to be called when
      * it has been added (does not prevent it from being called).
      *
      * @default true
      */
    var callOnAdd: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true, the the system will report debug messages as default
      * for the listenTo method.
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * A custom id handler that is responsible for generating,
      * setting and retrieving id's for elements.
      * If not provided, a default id handler will be used.
      */
    var idHandler: js.UndefOr[IdHandlerProps] = js.native
    
    /**
      * A custom reporter that handles reporting logs, warnings and errors.
      * If not provided, a default id handler will be used.
      * If set to false, then nothing will be reported.
      */
    var reporter: js.UndefOr[ReporterProps] = js.native
    
    var strategy: js.UndefOr[scroll | `object`] = js.native
  }
  object ErdmOptions {
    
    @scala.inline
    def apply(): ErdmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErdmOptions]
    }
    
    @scala.inline
    implicit class ErdmOptionsMutableBuilder[Self <: ErdmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallOnAdd(value: Boolean): Self = StObject.set(x, "callOnAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallOnAddUndefined: Self = StObject.set(x, "callOnAdd", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setIdHandler(value: IdHandlerProps): Self = StObject.set(x, "idHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdHandlerUndefined: Self = StObject.set(x, "idHandler", js.undefined)
      
      @scala.inline
      def setReporter(value: ReporterProps): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setStrategy(value: scroll | `object`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  @js.native
  trait IdHandlerProps extends StObject {
    
    def get(element: HTMLElement, readonly: Boolean): String = js.native
    
    def set(element: HTMLElement): String = js.native
  }
  object IdHandlerProps {
    
    @scala.inline
    def apply(get: (HTMLElement, Boolean) => String, set: HTMLElement => String): IdHandlerProps = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[IdHandlerProps]
    }
    
    @scala.inline
    implicit class IdHandlerPropsMutableBuilder[Self <: IdHandlerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: (HTMLElement, Boolean) => String): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(value: HTMLElement => String): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReporterProps extends StObject {
    
    def error(text: String): Unit = js.native
    
    def log(idOrText: String, textOrId: String): Unit = js.native
    def log(idOrText: String, textOrId: String, element: HTMLElement): Unit = js.native
    
    def warn(text: String): Unit = js.native
    def warn(text: String, element: HTMLElement): Unit = js.native
  }
}
