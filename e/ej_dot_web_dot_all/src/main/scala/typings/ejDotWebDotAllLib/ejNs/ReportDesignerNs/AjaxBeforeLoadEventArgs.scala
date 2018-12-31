package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Action type of AJAX call back.
    */
  var actionType: js.UndefOr[java.lang.String] = js.undefined
  /** To pass the custom data while AJAX post back.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** AJAX headers, we can pass any custom header through this property.
    */
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  /** Token of report designer.
    */
  var reportDesignerToken: js.UndefOr[java.lang.String] = js.undefined
  /** Token of ReportingService.
    */
  var serviceAuthorizationToken: js.UndefOr[java.lang.String] = js.undefined
}

