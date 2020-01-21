package typings.evaporate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaporate extends js.Object {
  var supported: Boolean = js.native
  def add(config: AddConfig): js.Promise[String] = js.native
  def add(config: AddConfig, options: AddOverrideOptions): js.Promise[String] = js.native
  def cancel(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def cancel(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: String, options: js.Object): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
}

