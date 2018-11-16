package typings
package evaporateLib.evaporateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaporate extends js.Object {
  var supported: scala.Boolean = js.native
  def add(config: evaporateLib.evaporateMod.EvaporateNs.AddConfig): stdLib.Promise[java.lang.String] = js.native
  def add(
    config: evaporateLib.evaporateMod.EvaporateNs.AddConfig,
    options: evaporateLib.evaporateMod.EvaporateNs.AddOverrideOptions
  ): stdLib.Promise[java.lang.String] = js.native
  def cancel(): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def cancel(file_key: java.lang.String): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: java.lang.String): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def pause(file_key: java.lang.String, options: js.Object): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def resume(file_key: java.lang.String): stdLib.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
}

