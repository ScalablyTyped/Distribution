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

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => scala.Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    openReportClick: /* e */ OpenReportClickEventArgs => scala.Unit = null,
    reportModified: /* e */ ReportModifiedEventArgs => scala.Unit = null,
    reportOpened: /* e */ ReportOpenedEventArgs => scala.Unit = null,
    reportPath: java.lang.String = null,
    reportSaved: /* e */ ReportSavedEventArgs => scala.Unit = null,
    reportServerUrl: java.lang.String = null,
    saveReportClick: /* e */ SaveReportClickEventArgs => scala.Unit = null,
    serviceAuthorizationToken: java.lang.String = null,
    serviceUrl: java.lang.String = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => scala.Unit = null,
    toolbarRendering: /* e */ ToolbarRenderingEventArgs => scala.Unit = null,
    toolbarSettings: ToolbarSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (openReportClick != null) __obj.updateDynamic("openReportClick")(js.Any.fromFunction1(openReportClick))
    if (reportModified != null) __obj.updateDynamic("reportModified")(js.Any.fromFunction1(reportModified))
    if (reportOpened != null) __obj.updateDynamic("reportOpened")(js.Any.fromFunction1(reportOpened))
    if (reportPath != null) __obj.updateDynamic("reportPath")(reportPath)
    if (reportSaved != null) __obj.updateDynamic("reportSaved")(js.Any.fromFunction1(reportSaved))
    if (reportServerUrl != null) __obj.updateDynamic("reportServerUrl")(reportServerUrl)
    if (saveReportClick != null) __obj.updateDynamic("saveReportClick")(js.Any.fromFunction1(saveReportClick))
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken)
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl)
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (toolbarRendering != null) __obj.updateDynamic("toolbarRendering")(js.Any.fromFunction1(toolbarRendering))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    __obj.asInstanceOf[Model]
  }
}

