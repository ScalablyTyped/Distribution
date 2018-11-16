package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbsoluteLayout
  extends extjsLib.ExtNs.layoutNs.containerNs.IAnchor {
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method is called when a child item changes in some way
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  @JSName("onContentChange")
  var onContentChange_IAbsoluteLayout: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

