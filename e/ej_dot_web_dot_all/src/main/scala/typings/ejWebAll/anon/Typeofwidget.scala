package typings.ejWebAll.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwidget extends js.Object {
  val autoInit: Boolean = js.native
  val registeredInstances: js.Array[_] = js.native
  val registeredWidgets: js.Array[_] = js.native
  def destroyAll(elements: Element): Unit = js.native
  def init(element: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

object Typeofwidget {
  @scala.inline
  def apply(
    autoInit: Boolean,
    destroyAll: Element => Unit,
    init: Element => Unit,
    register: (String, String, js.Any) => Unit,
    registerInstance: (Element, String, String, js.Any) => Unit,
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  @scala.inline
  implicit class TypeofwidgetOps[Self <: Typeofwidget] (val x: Self) extends AnyVal {
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
    def setAutoInit(value: Boolean): Self = this.set("autoInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroyAll(value: Element => Unit): Self = this.set("destroyAll", js.Any.fromFunction1(value))
    @scala.inline
    def setInit(value: Element => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setRegister(value: (String, String, js.Any) => Unit): Self = this.set("register", js.Any.fromFunction3(value))
    @scala.inline
    def setRegisterInstance(value: (Element, String, String, js.Any) => Unit): Self = this.set("registerInstance", js.Any.fromFunction4(value))
    @scala.inline
    def setRegisteredInstancesVarargs(value: js.Any*): Self = this.set("registeredInstances", js.Array(value :_*))
    @scala.inline
    def setRegisteredInstances(value: js.Array[_]): Self = this.set("registeredInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredWidgetsVarargs(value: js.Any*): Self = this.set("registeredWidgets", js.Array(value :_*))
    @scala.inline
    def setRegisteredWidgets(value: js.Array[_]): Self = this.set("registeredWidgets", value.asInstanceOf[js.Any])
  }
  
}

