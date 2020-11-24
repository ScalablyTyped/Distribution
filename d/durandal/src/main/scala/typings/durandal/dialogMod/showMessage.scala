package typings.durandal.dialogMod

import typings.durandal.DialogButton
import typings.durandal.DurandalPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plugins/dialog", "showMessage")
@js.native
object showMessage extends js.Object {
  
  def apply(message: String): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(message: String, title: js.UndefOr[scala.Nothing], options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(message: String, title: String): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(message: String, title: String, options: js.UndefOr[scala.Nothing], autoclose: Boolean): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def apply(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = js.native
  def apply(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
}
