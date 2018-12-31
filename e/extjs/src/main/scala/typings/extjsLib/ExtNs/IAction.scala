package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IBase {
  /** [Method] Disables all components configured by this Action  */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Executes the specified function once for each Component currently tied to this Action
  		* @param fn Function The function to execute for each component
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Enables all components configured by this Action  */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Executes this Action manually using the handler function specified in the original config object or the handler funct
  		* @param args Object... Variable number of arguments passed to the handler function
  		*/
  var execute: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /** [Method] Gets the icon CSS class currently used by all components configured by this Action  */
  var getIconCls: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the text currently displayed by all components configured by this Action  */
  var getText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Hides all components configured by this Action  */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns true if the components using this Action are currently disabled else returns false  */
  var isDisabled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if the components configured by this Action are currently hidden else returns false  */
  var isHidden: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the disabled state of all components configured by this Action
  		* @param disabled Boolean True to disable the component, false to enable it
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the function that will be called by each Component using this action when its primary event is triggered
  		* @param fn Function The function that will be invoked by the action's components. The function will be called with no arguments.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component firing the event.
  		*/
  var setHandler: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the hidden state of all components configured by this Action
  		* @param hidden Boolean True to hide the component, false to show it.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the icon CSS class for all components configured by this Action
  		* @param cls String The CSS class supplying the icon image
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the text to be displayed by all components configured by this Action
  		* @param text String The text to display
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Shows all components configured by this Action  */
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

