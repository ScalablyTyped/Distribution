package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IProgressBarOps[Self <: IProgressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setInitRenderData(value: () => _): Self = this.set("initRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitRenderData: Self = this.set("initRenderData", js.undefined)
    @scala.inline
    def setIsWaiting(value: () => Boolean): Self = this.set("isWaiting", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsWaiting: Self = this.set("isWaiting", js.undefined)
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setReset(value: /* hide */ js.UndefOr[Boolean] => IProgressBar): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextEl(value: js.Any): Self = this.set("textEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEl: Self = this.set("textEl", js.undefined)
    @scala.inline
    def setUpdateProgress(
      value: (/* value */ js.UndefOr[Double], /* text */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => IProgressBar
    ): Self = this.set("updateProgress", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdateProgress: Self = this.set("updateProgress", js.undefined)
    @scala.inline
    def setUpdateText(value: /* text */ js.UndefOr[java.lang.String] => IProgressBar): Self = this.set("updateText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateText: Self = this.set("updateText", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWait(value: /* config */ js.UndefOr[js.Any] => IProgressBar): Self = this.set("wait", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

