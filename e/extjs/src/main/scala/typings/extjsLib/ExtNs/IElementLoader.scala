package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IElementLoader
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Aborts the active load request */
  var abort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Method] Destroys the loader  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var failure: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the target of this loader
  		* @returns Ext.Component The target or null if none exists.
  		*/
  var getTarget: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Checks whether the loader is automatically refreshing
  		* @returns Boolean True if the loader is automatically refreshing
  		*/
  var isAutoRefreshing: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isLoader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Loads new data from the server
  		* @param options Object The options for the request. They can be any configuration option that can be specified for the class, with the exception of the target option. Note that any options passed to the method will override any class defaults.
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/String) */
  var loadMask: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var scripts: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets an Ext Element as the target of this loader
  		* @param target String/HTMLElement/Ext.Element The element or its ID.
  		*/
  var setTarget: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Automatically refreshes the content over a specified period
  		* @param interval Number The interval to refresh in ms.
  		* @param options Object The options to pass to the load method. See load
  		*/
  var startAutoRefresh: js.UndefOr[
    js.Function2[
      /* interval */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Clears any auto refresh  */
  var stopAutoRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var success: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

