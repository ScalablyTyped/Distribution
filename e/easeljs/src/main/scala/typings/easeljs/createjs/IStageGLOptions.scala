package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStageGLOptions extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.undefined
  var autoPurge: js.UndefOr[Double] = js.undefined
  var premultiply: js.UndefOr[Boolean] = js.undefined
  var preserveBuffer: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object IStageGLOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    autoPurge: js.UndefOr[Double] = js.undefined,
    premultiply: js.UndefOr[Boolean] = js.undefined,
    preserveBuffer: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPurge)) __obj.updateDynamic("autoPurge")(autoPurge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premultiply)) __obj.updateDynamic("premultiply")(premultiply.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveBuffer)) __obj.updateDynamic("preserveBuffer")(preserveBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStageGLOptions]
  }
}

