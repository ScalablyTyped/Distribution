package typings.ejWebAll.ej.Print

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Append the custom HTML after the selected content.
    * @Default {null}
    */
  var append: js.UndefOr[String] = js.native
  /** Event triggers before the document page or an element in it gets printed.
    */
  var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, Unit]] = js.native
  /** Prepend a docType to the document frame.
    * @Default {&lt;!doctype html&gt;}
    */
  var docType: js.UndefOr[String] = js.native
  /** A selector that specifies a particular element to be excluded from printing.
    * @Default {null}
    */
  var excludeSelector: js.UndefOr[String] = js.native
  /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
    * @Default {null}
    */
  var externalStyles: js.UndefOr[String] = js.native
  /** Specifies whether the global styles can be applied to the element to be printed.
    * @Default {true}
    */
  var globalStyles: js.UndefOr[Boolean] = js.native
  /** Sets the height of the print window.
    * @Default {454}
    */
  var height: js.UndefOr[Double] = js.native
  /** Prepends the custom HTML before the selected content.
    * @Default {null}
    */
  var prepend: js.UndefOr[String] = js.native
  /** Allows printing the content in a new window.
    * @Default {false}
    */
  var printInNewWindow: js.UndefOr[Boolean] = js.native
  /** Sets the period of time to wait before printing the content.
    * @Default {1000}
    */
  var timeOutPeriod: js.UndefOr[Double] = js.native
  /** Sets the title of the print document.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
  /** Defines the width of the print window.
    * @Default {1024}
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: String): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setBeforeStart(value: /* e */ BeforeStartEventArgs => Unit): Self = this.set("beforeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeStart: Self = this.set("beforeStart", js.undefined)
    @scala.inline
    def setDocType(value: String): Self = this.set("docType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    @scala.inline
    def setExcludeSelector(value: String): Self = this.set("excludeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeSelector: Self = this.set("excludeSelector", js.undefined)
    @scala.inline
    def setExternalStyles(value: String): Self = this.set("externalStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalStyles: Self = this.set("externalStyles", js.undefined)
    @scala.inline
    def setGlobalStyles(value: Boolean): Self = this.set("globalStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalStyles: Self = this.set("globalStyles", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPrepend(value: String): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setPrintInNewWindow(value: Boolean): Self = this.set("printInNewWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintInNewWindow: Self = this.set("printInNewWindow", js.undefined)
    @scala.inline
    def setTimeOutPeriod(value: Double): Self = this.set("timeOutPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOutPeriod: Self = this.set("timeOutPeriod", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

