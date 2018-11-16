package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstractSummary extends IFeature {
  /** [Config Option] (String) */
  var remoteRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var showSummaryRow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Toggle whether or not to show the summary row
  		* @param visible Boolean True to show the summary row
  		*/
  var toggleSummaryRow: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

