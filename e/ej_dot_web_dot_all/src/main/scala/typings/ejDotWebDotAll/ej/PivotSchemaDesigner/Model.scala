package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotSchemaDesigner to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Specifies the CSS class to PivotSchemaDesigner to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Triggers when we start dragging any field from PivotSchemaDesigner.
    */
  var dragMove: js.UndefOr[js.Function1[/* e */ DragMoveEventArgs, Unit]] = js.undefined
  /** Allows the user to enable/disable drag and drop operations within the PivotTable Field List.
    * @Default {true}
    */
  var enableDragDrop: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to view PivotTable Field List from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** For ASP.NET and MVC Wrapper, PivotSchemaDesigner will be initialized and rendered empty initially. Once the connected pivot control widget is rendered completely,
    * PivotSchemaDesigner will just be populated with data source by setting this property to â€œtrueâ€.
    * @Default {false}
    */
  var enableWrapper: js.UndefOr[Boolean] = js.undefined
  /** Sets the height for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Sets the layout for PivotSchemaDesigner.
    * @Default {ej.PivotSchemaDesigner.Layouts.Excel}
    */
  var layout: js.UndefOr[Layouts | String] = js.undefined
  /** Triggers when PivotSchemaDesigner loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the visibility of OLAP elements in PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {null}
    */
  var olap: js.UndefOr[Olap] = js.undefined
  /** Sets the Pivot control bound with this PivotSchemaDesigner.
    * @Default {null}
    */
  var pivotControl: js.UndefOr[js.Any] = js.undefined
  /** Allows the user to set custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethods: js.UndefOr[js.Any] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.undefined
  /** Sets the width for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Unit = null,
    cssClass: String = null,
    customObject: js.Any = null,
    dragMove: /* e */ DragMoveEventArgs => Unit = null,
    enableDragDrop: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableWrapper: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    layout: Layouts | String = null,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    olap: Olap = null,
    pivotControl: js.Any = null,
    serviceMethods: js.Any = null,
    url: String = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(afterServiceInvoke))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(beforeServiceInvoke))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (dragMove != null) __obj.updateDynamic("dragMove")(js.Any.fromFunction1(dragMove))
    if (!js.isUndefined(enableDragDrop)) __obj.updateDynamic("enableDragDrop")(enableDragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWrapper)) __obj.updateDynamic("enableWrapper")(enableWrapper.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (olap != null) __obj.updateDynamic("olap")(olap.asInstanceOf[js.Any])
    if (pivotControl != null) __obj.updateDynamic("pivotControl")(pivotControl.asInstanceOf[js.Any])
    if (serviceMethods != null) __obj.updateDynamic("serviceMethods")(serviceMethods.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

