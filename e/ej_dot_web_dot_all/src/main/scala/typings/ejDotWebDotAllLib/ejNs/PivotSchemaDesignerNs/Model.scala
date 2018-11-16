package typings
package ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
               */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotSchemaDesigner to service methods.
               */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the CSS class to PivotSchemaDesigner to achieve custom theme.
               * @Default {â€œâ€}
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Object utilized to pass additional information between client-end and service-end.
               * @Default {{}}
               */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Triggers when we start dragging any field from PivotSchemaDesigner.
               */
  var dragMove: js.UndefOr[js.Function1[/* e */ DragMoveEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to enable/disable drag and drop operations within the PivotTable Field List.
               * @Default {true}
               */
  var enableDragDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to view PivotTable Field List from right to left.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** For ASP.NET and MVC Wrapper, PivotSchemaDesigner will be initialized and rendered empty initially. Once the connected pivot control widget is rendered completely,
               * PivotSchemaDesigner will just be populated with data source by setting this property to â€œtrueâ€.
               * @Default {false}
               */
  var enableWrapper: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the height for PivotSchemaDesigner.
               * @Default {â€œâ€}
               */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the layout for PivotSchemaDesigner.
               * @Default {ej.PivotSchemaDesigner.Layouts.Excel}
               */
  var layout: js.UndefOr[Layouts | java.lang.String] = js.undefined
  /** Triggers when PivotSchemaDesigner loading is initiated.
               */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
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
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the width for PivotSchemaDesigner.
               * @Default {â€œâ€}
               */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

