package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractPlugin extends IBase {
  /** [Method] Creates clone of the plugin
  		* @param overrideCfg Object Additional config for the derived plugin.
  		*/
  var clonePlugin: js.UndefOr[js.Function1[/* overrideCfg */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] The destroy method is invoked by the owning Component at the time the Component is being destroyed  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] The base implementation just sets the plugin s disabled flag to true Plugin subclasses which need more complex proce  */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] The base implementation just sets the plugin s disabled flag to false Plugin subclasses which need more complex proc  */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the component to which this plugin is attached
  		* @returns Ext.Component Owner component.
  		*/
  var getCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param client Ext.Component The client Component which owns this plugin.
  		*/
  var init: js.UndefOr[js.Function1[/* client */ js.UndefOr[IComponent], scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isPlugin: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var pluginId: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the component to which this plugin is attached
  		* @param cmp Ext.Component Owner component.
  		*/
  var setCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], scala.Unit]] = js.undefined
}

