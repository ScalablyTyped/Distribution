package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressBar extends IComponent {
  
  /** [Config Option] (Boolean/Object) */
  @JSName("animate")
  var animate_IProgressBar: js.UndefOr[js.Any] = js.native
  
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  @JSName("initRenderData")
  var initRenderData_IProgressBar: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns true if the progress bar is currently in a wait operation
    * @returns Boolean True if waiting, else false
    */
  var isWaiting: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IProgressBar: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Resets the progress bar value to 0 and text to empty string
    * @param hide Boolean True to hide the progress bar.
    * @returns Ext.ProgressBar this
    */
  var reset: js.UndefOr[js.Function1[/* hide */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var textEl: js.UndefOr[js.Any] = js.native
  
  /** [Method] Updates the progress bar value and optionally its text
    * @param value Number A floating point value between 0 and 1 (e.g., .5)
    * @param text String The string to display in the progress text element
    * @param animate Boolean Whether to animate the transition of the progress bar. If this value is not specified, the default for the class is used
    * @returns Ext.ProgressBar this
    */
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Double], 
      /* text */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Updates the progress bar text
    * @param text String The string to display in the progress text element
    * @returns Ext.ProgressBar this
    */
  var updateText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.native
  
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.native
  
  /** [Method] Initiates an auto updating progress bar
    * @param config Object Configuration options
    * @returns Ext.ProgressBar this
    */
  @JSName("wait")
  var wait_FIProgressBar: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
}
object IProgressBar {
  
  @scala.inline
  def apply(): IProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBar]
  }
  
  @scala.inline
  implicit class IProgressBarMutableBuilder[Self <: IProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setInitRenderData(value: () => _): Self = StObject.set(x, "initRenderData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    @scala.inline
    def setIsWaiting(value: () => Boolean): Self = StObject.set(x, "isWaiting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWaitingUndefined: Self = StObject.set(x, "isWaiting", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setReset(value: /* hide */ js.UndefOr[Boolean] => IProgressBar): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEl(value: js.Any): Self = StObject.set(x, "textEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextElUndefined: Self = StObject.set(x, "textEl", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUpdateProgress(
      value: (/* value */ js.UndefOr[Double], /* text */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => IProgressBar
    ): Self = StObject.set(x, "updateProgress", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateProgressUndefined: Self = StObject.set(x, "updateProgress", js.undefined)
    
    @scala.inline
    def setUpdateText(value: /* text */ js.UndefOr[java.lang.String] => IProgressBar): Self = StObject.set(x, "updateText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTextUndefined: Self = StObject.set(x, "updateText", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWait_(value: /* config */ js.UndefOr[js.Any] => IProgressBar): Self = StObject.set(x, "wait", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
