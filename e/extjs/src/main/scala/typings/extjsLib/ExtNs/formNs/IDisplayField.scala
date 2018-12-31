package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayField
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns String value The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var htmlEncode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
}

