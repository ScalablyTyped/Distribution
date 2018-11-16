package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IText
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_IText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableKeyFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyEvents: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enforceMaxLength: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
  		* @returns String The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var grow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var growAppend: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var growMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var growMin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (RegExp) */
  var maskRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var maxLengthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var minLengthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private */
  @JSName("postBlur")
  var postBlur_IText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
  		* @param value String The unprocessed string value
  		* @returns String The processed string value
  		*/
  @JSName("processRawValue")
  var processRawValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (String) */
  var regexText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects text in this field
  		* @param start Number The index where the selection should start
  		* @param end Number The index where the selection should end (defaults to the text length)
  		*/
  var selectText: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[scala.Double], /* end */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (RegExp) */
  var stripCharsRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (Boolean) */
  var validateBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var validator: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var vtype: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var vtypeText: js.UndefOr[java.lang.String] = js.undefined
}

