package typings.electronProgressbar

import typings.electron.Electron.App
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electronProgressbar.electronProgressbarStrings.aborted
import typings.electronProgressbar.electronProgressbarStrings.completed
import typings.electronProgressbar.electronProgressbarStrings.progress
import typings.electronProgressbar.electronProgressbarStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-progressbar", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ProgressBar {
    def this(options: ProgressBarOptions) = this()
    def this(options: ProgressBarOptions, electronApp: App) = this()
  }
  
  @js.native
  trait ProgressBar extends StObject {
    
    def close(): Unit = js.native
    
    var detail: String = js.native
    
    def getOptions(): ProgressBarOptions = js.native
    
    def isCompleted(): Boolean = js.native
    
    def isInProgress(): Boolean = js.native
    
    @JSName("on")
    def on_aborted(eventName: aborted, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_completed(eventName: completed, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(eventName: progress, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def setCompleted(): Unit = js.native
    
    var text: String = js.native
    
    var value: Double = js.native
  }
  
  trait ProgressBarOptions extends StObject {
    
    var abortOnError: js.UndefOr[Boolean] = js.undefined
    
    var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
    
    var closeOnComplete: js.UndefOr[Boolean] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[Double] = js.undefined
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleOptions] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ProgressBarOptions {
    
    inline def apply(): ProgressBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarOptions]
    }
    
    extension [Self <: ProgressBarOptions](x: Self) {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      inline def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindowUndefined: Self = StObject.set(x, "browserWindow", js.undefined)
      
      inline def setCloseOnComplete(value: Boolean): Self = StObject.set(x, "closeOnComplete", value.asInstanceOf[js.Any])
      
      inline def setCloseOnCompleteUndefined: Self = StObject.set(x, "closeOnComplete", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setStyle(value: StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait StyleOptions extends StObject {
    
    var bar: js.UndefOr[js.Object] = js.undefined
    
    var detail: js.UndefOr[js.Object] = js.undefined
    
    var text: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[js.Object] = js.undefined
  }
  object StyleOptions {
    
    inline def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    extension [Self <: StyleOptions](x: Self) {
      
      inline def setBar(value: js.Object): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      inline def setDetail(value: js.Object): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setText(value: js.Object): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
