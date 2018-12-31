package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadow extends IBase {
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Direct alignment when values are already available
  		* @param left Number The target element left position
  		* @param top Number The target element top position
  		* @param width Number The target element width
  		* @param height Number The target element height
  		*/
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[scala.Double], 
      /* top */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the opacity of the shadow
  		* @param opacity Number The opacity
  		*/
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Adjust the z index of this shadow
  		* @param zindex Number The new z-index
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Displays the shadow under the target element
  		* @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
  		*/
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

