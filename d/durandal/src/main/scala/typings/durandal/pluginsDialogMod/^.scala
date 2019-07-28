package typings.durandal.pluginsDialogMod

import typings.durandal.DialogButton
import typings.durandal.DurandalPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/dialog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MessageBox: Box = js.native
  var currentZIndex: Double = js.native
  def addContext(name: String, modalContext: DialogContext): Unit = js.native
  def close(obj: js.Any, results: js.Any*): Unit = js.native
  def getContext(): DialogContext = js.native
  def getContext(name: String): DialogContext = js.native
  def getDialog(obj: js.Any): Dialog = js.native
  def getNextZIndex(): Double = js.native
  def install(config: js.Object): Unit = js.native
  def isOpen(): Boolean = js.native
  def show(obj: js.Any): DurandalPromise[_] = js.native
  def show(obj: js.Any, activationData: js.Any): DurandalPromise[_] = js.native
  def show(obj: js.Any, activationData: js.Any, context: String): DurandalPromise[_] = js.native
  def showMessage(message: String): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
}

