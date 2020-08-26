package typings.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotSchemaDesigner to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Specifies the CSS class to PivotSchemaDesigner to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Triggers when we start dragging any field from PivotSchemaDesigner.
    */
  var dragMove: js.UndefOr[js.Function1[/* e */ DragMoveEventArgs, Unit]] = js.native
  /** Allows the user to enable/disable drag and drop operations within the PivotTable Field List.
    * @Default {true}
    */
  var enableDragDrop: js.UndefOr[Boolean] = js.native
  /** Allows the user to view PivotTable Field List from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** For ASP.NET and MVC Wrapper, PivotSchemaDesigner will be initialized and rendered empty initially. Once the connected pivot control widget is rendered completely,
    * PivotSchemaDesigner will just be populated with data source by setting this property to â€œtrueâ€.
    * @Default {false}
    */
  var enableWrapper: js.UndefOr[Boolean] = js.native
  /** Sets the height for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String] = js.native
  /** Sets the layout for PivotSchemaDesigner.
    * @Default {ej.PivotSchemaDesigner.Layouts.Excel}
    */
  var layout: js.UndefOr[Layouts | String] = js.native
  /** Triggers when PivotSchemaDesigner loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the visibility of OLAP elements in PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {null}
    */
  var olap: js.UndefOr[Olap] = js.native
  /** Sets the Pivot control bound with this PivotSchemaDesigner.
    * @Default {null}
    */
  var pivotControl: js.UndefOr[js.Any] = js.native
  /** Allows the user to set custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethods: js.UndefOr[js.Any] = js.native
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
  /** Sets the width for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String] = js.native
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
    def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = this.set("afterServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterServiceInvoke: Self = this.set("afterServiceInvoke", js.undefined)
    @scala.inline
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    @scala.inline
    def setDragMove(value: /* e */ DragMoveEventArgs => Unit): Self = this.set("dragMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragMove: Self = this.set("dragMove", js.undefined)
    @scala.inline
    def setEnableDragDrop(value: Boolean): Self = this.set("enableDragDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDragDrop: Self = this.set("enableDragDrop", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableWrapper(value: Boolean): Self = this.set("enableWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWrapper: Self = this.set("enableWrapper", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLayout(value: Layouts | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOlap(value: Olap): Self = this.set("olap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOlap: Self = this.set("olap", js.undefined)
    @scala.inline
    def setPivotControl(value: js.Any): Self = this.set("pivotControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotControl: Self = this.set("pivotControl", js.undefined)
    @scala.inline
    def setServiceMethods(value: js.Any): Self = this.set("serviceMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceMethods: Self = this.set("serviceMethods", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

