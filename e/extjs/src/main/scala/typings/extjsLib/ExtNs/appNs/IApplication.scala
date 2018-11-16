package typings
package extjsLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var appProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCreateViewport: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var controllers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var enableQuickTips: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  @JSName("getApplication")
  var getApplication_IApplication: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns instance of a Controller with the given id
  		* @param name Object
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], IController]] = js.undefined
  /** [Method] Called automatically when the page has completely loaded
  		* @param profile String The detected application profile
  		* @returns Boolean By default, the Application will dispatch to the configured startup controller and action immediately after running the launch function. Return false to prevent this behavior.
  		*/
  var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]) */
  var namespaces: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var paths: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
}

