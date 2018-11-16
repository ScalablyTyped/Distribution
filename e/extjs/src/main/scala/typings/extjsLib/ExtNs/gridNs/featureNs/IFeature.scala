package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFeature
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Disables the feature  */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Enables the feature  */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var eventPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var eventSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Abstract method to be overriden when a feature should add additional arguments to its event signature
  		* @param eventName Object
  		* @param view Object
  		* @param featureTarget Object
  		* @param e Object
  		*/
  var getFireEventArgs: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      /* featureTarget */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.grid.Panel) */
  var grid: js.UndefOr[extjsLib.ExtNs.gridNs.IPanel] = js.undefined
  /** [Property] (Boolean) */
  var hasFeatureEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.view.Table) */
  var view: js.UndefOr[extjsLib.ExtNs.viewNs.ITable] = js.undefined
}

