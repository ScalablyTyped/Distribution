package typings
package durandalLib.dialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/dialog", JSImport.Namespace)
@js.native
object dialogModMembers extends js.Object {
  var MessageBox: Box = js.native
  var currentZIndex: scala.Double = js.native
  def addContext(name: java.lang.String, modalContext: DialogContext): scala.Unit = js.native
  def close(obj: js.Any, results: js.Any*): scala.Unit = js.native
  def getContext(): DialogContext = js.native
  def getContext(name: java.lang.String): DialogContext = js.native
  def getDialog(obj: js.Any): Dialog = js.native
  def getNextZIndex(): scala.Double = js.native
  def install(config: js.Object): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def show(obj: js.Any): durandalLib.DurandalPromise[_] = js.native
  def show(obj: js.Any, activationData: js.Any): durandalLib.DurandalPromise[_] = js.native
  def show(obj: js.Any, activationData: js.Any, context: java.lang.String): durandalLib.DurandalPromise[_] = js.native
  def showMessage(message: java.lang.String): durandalLib.DurandalPromise[java.lang.String] = js.native
  def showMessage(message: java.lang.String, title: java.lang.String): durandalLib.DurandalPromise[java.lang.String] = js.native
  def showMessage(
    message: java.lang.String,
    title: java.lang.String,
    options: js.Array[durandalLib.DialogButton | java.lang.String]
  ): durandalLib.DurandalPromise[java.lang.String] = js.native
  def showMessage(
    message: java.lang.String,
    title: java.lang.String,
    options: js.Array[durandalLib.DialogButton | java.lang.String],
    autoclose: scala.Boolean
  ): durandalLib.DurandalPromise[java.lang.String] = js.native
  def showMessage(
    message: java.lang.String,
    title: java.lang.String,
    options: js.Array[durandalLib.DialogButton | java.lang.String],
    autoclose: scala.Boolean,
    settings: js.Object
  ): durandalLib.DurandalPromise[java.lang.String] = js.native
}

