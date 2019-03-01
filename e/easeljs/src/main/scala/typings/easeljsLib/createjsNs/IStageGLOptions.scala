package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStageGLOptions extends js.Object {
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  var autoPurge: js.UndefOr[scala.Double] = js.undefined
  var premultiply: js.UndefOr[scala.Boolean] = js.undefined
  var preserveBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
}

object IStageGLOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    autoPurge: scala.Int | scala.Double = null,
    premultiply: js.UndefOr[scala.Boolean] = js.undefined,
    preserveBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
  ): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (autoPurge != null) __obj.updateDynamic("autoPurge")(autoPurge.asInstanceOf[js.Any])
    if (!js.isUndefined(premultiply)) __obj.updateDynamic("premultiply")(premultiply)
    if (!js.isUndefined(preserveBuffer)) __obj.updateDynamic("preserveBuffer")(preserveBuffer)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[IStageGLOptions]
  }
}

