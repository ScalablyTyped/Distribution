package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip
  extends extjsLib.ExtNs.tipNs.ITip {
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[Array] = js.undefined
  /** [Method] Binds this ToolTip to the specified element
  		* @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
  		*/
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

