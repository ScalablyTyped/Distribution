package typings
package extjsLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IController
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Registers one or more references
  		* @param refs Object/Object[]
  		*/
  var addRef: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Method] Adds listeners to components selected via Ext ComponentQuery
  		* @param selectors String/Object If a String, the second argument is used as the listeners, otherwise an object of selectors -> listeners is assumed
  		* @param listeners Object Config for listeners.
  		*/
  var control: js.UndefOr[
    js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns instance of a Controller with the given id
  		* @param id String
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Returns a Model class with the given name
  		* @param name String
  		* @returns Ext.data.Model a model class.
  		*/
  var getModel: js.UndefOr[
    js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.dataNs.IModel]
  ] = js.undefined
  /** [Method] Returns instance of a Store with the given name
  		* @param name String
  		* @returns Ext.data.Store a store instance.
  		*/
  var getStore: js.UndefOr[
    js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.dataNs.IStore]
  ] = js.undefined
  /** [Method] Returns a View class with the given name
  		* @param name String
  		* @returns Ext.Base a view class.
  		*/
  var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.IBase]] = js.undefined
  /** [Method] Returns true if a reference is registered
  		* @param ref Object
  		* @returns Boolean
  		*/
  var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] A template method that is called when your application boots
  		* @param application Ext.app.Application
  		*/
  var init: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Method] Adds listeners to different event sources also called event domains
  		* @param to Object Config object containing domains, selectors and listeners.
  		*/
  var listen: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/String[]) */
  var models: js.UndefOr[js.Any] = js.undefined
  /** [Method] A template method like init but called after the viewport is created
  		* @param application Ext.app.Application
  		*/
  var onLaunch: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var refs: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String/String[]) */
  var stores: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]) */
  var views: js.UndefOr[js.Any] = js.undefined
}

