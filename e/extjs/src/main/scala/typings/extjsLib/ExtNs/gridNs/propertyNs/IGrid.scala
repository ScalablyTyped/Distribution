package typings
package extjsLib.ExtNs.gridNs.propertyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGrid
  extends extjsLib.ExtNs.gridNs.IPanel {
  /** [Config Option] (Object) */
  var customEditors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var customRenderers: js.UndefOr[js.Any] = js.undefined
  /** [Method] Gets the source data object containing the property data
  		* @returns Object The data object.
  		*/
  var getSource: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var inferTypes: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var nameColumnWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var nameField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var propertyNames: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes a property from the grid
  		* @param prop String The name of the property to remove.
  		*/
  var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of a property
  		* @param prop String The name of the property to set.
  		* @param value Object The value to test.
  		* @param create Boolean true to create the property if it doesn't already exist.
  		*/
  var setProperty: js.UndefOr[
    js.Function3[
      /* prop */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* create */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the source data object containing the property data
  		* @param source Object The data object.
  		* @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
  		*/
  var setSource: js.UndefOr[
    js.Function2[/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var source: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var sourceConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

