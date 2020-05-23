package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapFormLayoutItem extends js.Object {
  val formLayout: BootstrapFormLayout | Null
  val instance: js.Any
  val name: String
  val parent: BootstrapFormLayoutItem | Null
  def getCaption(): String
  def getItemByName(name: String): BootstrapFormLayoutItem | Null
  def getVisible(): Boolean
  def setCaption(caption: String): Unit
  def setVisible(value: Boolean): Unit
}

object BootstrapFormLayoutItem {
  @scala.inline
  def apply(
    getCaption: () => String,
    getItemByName: String => BootstrapFormLayoutItem | Null,
    getVisible: () => Boolean,
    instance: js.Any,
    name: String,
    setCaption: String => Unit,
    setVisible: Boolean => Unit,
    formLayout: BootstrapFormLayout = null,
    parent: BootstrapFormLayoutItem = null
  ): BootstrapFormLayoutItem = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getItemByName = js.Any.fromFunction1(getItemByName), getVisible = js.Any.fromFunction0(getVisible), instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCaption = js.Any.fromFunction1(setCaption), setVisible = js.Any.fromFunction1(setVisible), formLayout = formLayout.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapFormLayoutItem]
  }
}

