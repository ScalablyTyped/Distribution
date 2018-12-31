package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** This event will be triggered before AJAX loads.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when AJAX result is failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when AJAX result is succeeded.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when the Report Designer widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when the Report Designer widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the locale for report designer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** This event will be triggered while clicking open menu items.
    */
  var openReportClick: js.UndefOr[js.Function1[/* e */ OpenReportClickEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when the report is modified.
    */
  var reportModified: js.UndefOr[js.Function1[/* e */ ReportModifiedEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered when the report is opened.
    */
  var reportOpened: js.UndefOr[js.Function1[/* e */ ReportOpenedEventArgs, scala.Unit]] = js.undefined
  /** Gets or Sets the report path of server.
    * @Default {null}
    */
  var reportPath: js.UndefOr[java.lang.String] = js.undefined
  /** This event will be triggered when the report is saved.
    */
  var reportSaved: js.UndefOr[js.Function1[/* e */ ReportSavedEventArgs, scala.Unit]] = js.undefined
  /** Gets or Sets the reports server URL.
    * @Default {null}
    */
  var reportServerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** This event will be triggered when the save menu items are clicked.
    */
  var saveReportClick: js.UndefOr[js.Function1[/* e */ SaveReportClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the serviceAuthorizationToken to access the Report Server API services.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or Sets the URL of the  WebAPI service; it will be used for processing the report.
    * @Default {null}
    */
  var serviceUrl: js.UndefOr[java.lang.String] = js.undefined
  /** This event will be triggered while clicking the toolbar items.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered on rendering the Report Designer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
}

