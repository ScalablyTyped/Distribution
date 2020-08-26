package typings.extjs.Ext.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var appProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var autoCreateViewport: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]) */
  var controllers: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var enableQuickTips: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the base Ext app Application for this controller
    * @returns Ext.app.Application the application
    */
  @JSName("getApplication")
  var getApplication_IApplication: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns instance of a Controller with the given id
    * @param name Object
    * @returns Ext.app.Controller controller instance or undefined.
    */
  @JSName("getController")
  var getController_IApplication: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], IController]] = js.native
  /** [Method] Called automatically when the page has completely loaded
    * @param profile String The detected application profile
    * @returns Boolean By default, the Application will dispatch to the configured startup controller and action immediately after running the launch function. Return false to prevent this behavior.
    */
  var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[String], Boolean]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]) */
  var namespaces: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var paths: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
}

object IApplication {
  @scala.inline
  def apply(): IApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IApplication]
  }
  @scala.inline
  implicit class IApplicationOps[Self <: IApplication] (val x: Self) extends AnyVal {
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
    def setAppFolder(value: String): Self = this.set("appFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppFolder: Self = this.set("appFolder", js.undefined)
    @scala.inline
    def setAppProperty(value: String): Self = this.set("appProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppProperty: Self = this.set("appProperty", js.undefined)
    @scala.inline
    def setAutoCreateViewport(value: Boolean): Self = this.set("autoCreateViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreateViewport: Self = this.set("autoCreateViewport", js.undefined)
    @scala.inline
    def setControllers(value: js.Any): Self = this.set("controllers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllers: Self = this.set("controllers", js.undefined)
    @scala.inline
    def setEnableQuickTips(value: Boolean): Self = this.set("enableQuickTips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableQuickTips: Self = this.set("enableQuickTips", js.undefined)
    @scala.inline
    def setGetApplication(value: () => IApplication): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApplication: Self = this.set("getApplication", js.undefined)
    @scala.inline
    def setGetController(value: /* name */ js.UndefOr[js.Any] => IController): Self = this.set("getController", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setLaunch(value: /* profile */ js.UndefOr[String] => Boolean): Self = this.set("launch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLaunch: Self = this.set("launch", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespaces(value: js.Any): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
    @scala.inline
    def setPaths(value: js.Any): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

