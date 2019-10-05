package typings.durandal.pluginsDialogMod

import typings.durandal.DialogButton
import typings.durandal.DurandalPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/dialog", "showMessage")
@js.native
object showMessage extends js.Object {
  def apply(message: String): DurandalPromise[String] = js.native
  def apply(message: String, title: String): DurandalPromise[String] = js.native
  def apply(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def apply(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
}

