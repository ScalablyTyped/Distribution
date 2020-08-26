package typings.extjs.Ext.app

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IController extends IObservable {
  /** [Method] Registers one or more references
    * @param refs Object/Object[]
    */
  var addRef: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Method] Adds listeners to components selected via Ext ComponentQuery
    * @param selectors String/Object If a String, the second argument is used as the listeners, otherwise an object of selectors -> listeners is assumed
    * @param listeners Object Config for listeners.
    */
  var control: js.UndefOr[
    js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the base Ext app Application for this controller
    * @returns Ext.app.Application the application
    */
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns instance of a Controller with the given id
    * @param id String
    * @returns Ext.app.Controller controller instance or undefined.
    */
  var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Returns a Model class with the given name
    * @param name String
    * @returns Ext.data.Model a model class.
    */
  var getModel: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IModel]] = js.native
  /** [Method] Returns instance of a Store with the given name
    * @param name String
    * @returns Ext.data.Store a store instance.
    */
  var getStore: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IStore]] = js.native
  /** [Method] Returns a View class with the given name
    * @param name String
    * @returns Ext.Base a view class.
    */
  var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IBase]] = js.native
  /** [Method] Returns true if a reference is registered
    * @param ref Object
    * @returns Boolean
    */
  var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] A template method that is called when your application boots
    * @param application Ext.app.Application
    */
  var init: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Adds listeners to different event sources also called event domains
    * @param to Object Config object containing domains, selectors and listeners.
    */
  var listen: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/String[]) */
  var models: js.UndefOr[js.Any] = js.native
  /** [Method] A template method like init but called after the viewport is created
    * @param application Ext.app.Application
    */
  var onLaunch: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Config Option] (Object[]) */
  var refs: js.UndefOr[Array] = js.native
  /** [Config Option] (String/String[]) */
  var stores: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/String[]) */
  var views: js.UndefOr[js.Any] = js.native
}

object IController {
  @scala.inline
  def apply(): IController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IController]
  }
  @scala.inline
  implicit class IControllerOps[Self <: IController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRef(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = this.set("addRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddRef: Self = this.set("addRef", js.undefined)
    @scala.inline
    def setApplication(value: IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setControl(value: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Unit): Self = this.set("control", js.Any.fromFunction2(value))
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setGetApplication(value: () => IApplication): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApplication: Self = this.set("getApplication", js.undefined)
    @scala.inline
    def setGetController(value: /* id */ js.UndefOr[String] => IController): Self = this.set("getController", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setGetModel(value: /* name */ js.UndefOr[String] => IModel): Self = this.set("getModel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    @scala.inline
    def setGetStore(value: /* name */ js.UndefOr[String] => IStore): Self = this.set("getStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetView(value: /* name */ js.UndefOr[String] => IBase): Self = this.set("getView", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetView: Self = this.set("getView", js.undefined)
    @scala.inline
    def setHasRef(value: /* ref */ js.UndefOr[js.Any] => Boolean): Self = this.set("hasRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasRef: Self = this.set("hasRef", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInit(value: /* application */ js.UndefOr[IApplication] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setListen(value: /* to */ js.UndefOr[js.Any] => Unit): Self = this.set("listen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteListen: Self = this.set("listen", js.undefined)
    @scala.inline
    def setModels(value: js.Any): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setOnLaunch(value: /* application */ js.UndefOr[IApplication] => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    @scala.inline
    def setRefs(value: Array): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    @scala.inline
    def setStores(value: js.Any): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

