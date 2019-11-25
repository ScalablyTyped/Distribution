package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressBar extends IComponent {
  /** [Config Option] (Boolean/Object) */
  @JSName("animate")
  var animate_IProgressBar: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IProgressBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the progress bar is currently in a wait operation
  		* @returns Boolean True if waiting, else false
  		*/
  var isWaiting: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IProgressBar: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the progress bar value to 0 and text to empty string
  		* @param hide Boolean True to hide the progress bar.
  		* @returns Ext.ProgressBar this
  		*/
  var reset: js.UndefOr[js.Function1[/* hide */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var textEl: js.UndefOr[js.Any] = js.undefined
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
  ] = js.undefined
  /** [Method] Updates the progress bar text
  		* @param text String The string to display in the progress text element
  		* @returns Ext.ProgressBar this
  		*/
  var updateText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.undefined
  /** [Method] Initiates an auto updating progress bar
  		* @param config Object Configuration options
  		* @returns Ext.ProgressBar this
  		*/
  @JSName("wait")
  var wait_FIProgressBar: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
}

object IProgressBar {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    animate: js.Any = null,
    initRenderData: () => _ = null,
    isWaiting: () => Boolean = null,
    onRender: () => Unit = null,
    reset: /* hide */ js.UndefOr[Boolean] => IProgressBar = null,
    text: java.lang.String = null,
    textEl: js.Any = null,
    updateProgress: (/* value */ js.UndefOr[Double], /* text */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => IProgressBar = null,
    updateText: /* text */ js.UndefOr[java.lang.String] => IProgressBar = null,
    value: Int | Double = null,
    wait: /* config */ js.UndefOr[js.Any] => IProgressBar = null
  ): IProgressBar = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (initRenderData != null) __obj.updateDynamic("initRenderData")(js.Any.fromFunction0(initRenderData))
    if (isWaiting != null) __obj.updateDynamic("isWaiting")(js.Any.fromFunction0(isWaiting))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEl != null) __obj.updateDynamic("textEl")(textEl.asInstanceOf[js.Any])
    if (updateProgress != null) __obj.updateDynamic("updateProgress")(js.Any.fromFunction3(updateProgress))
    if (updateText != null) __obj.updateDynamic("updateText")(js.Any.fromFunction1(updateText))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(js.Any.fromFunction1(wait))
    __obj.asInstanceOf[IProgressBar]
  }
}

