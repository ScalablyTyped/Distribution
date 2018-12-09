package typings
package evaporateLib.evaporateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaporate extends js.Object {
  var supported: scala.Boolean = js.native
  def add(config: evaporateLib.evaporateMod.EvaporateNs.AddConfig): js.Promise[java.lang.String] = js.native
  def add(
    config: evaporateLib.evaporateMod.EvaporateNs.AddConfig,
    options: evaporateLib.evaporateMod.EvaporateNs.AddOverrideOptions
  ): js.Promise[java.lang.String] = js.native
  def cancel(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def cancel(file_key: java.lang.String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: java.lang.String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: java.lang.String, options: js.Object): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(file_key: java.lang.String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
}

