package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItem
  extends extjsLib.ExtNs.IComponent {
  /** [Method] Disable the component  */
  @JSName("disable")
  var disable_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Enable the component */
  @JSName("enable")
  var enable_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Try to focus this component
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IItem: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[java.lang.String] = js.undefined
}

