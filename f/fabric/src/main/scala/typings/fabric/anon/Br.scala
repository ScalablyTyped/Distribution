package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Br extends js.Object {
  var bl: js.UndefOr[Boolean] = js.undefined
  var br: js.UndefOr[Boolean] = js.undefined
  var mb: js.UndefOr[Boolean] = js.undefined
  var ml: js.UndefOr[Boolean] = js.undefined
  var mr: js.UndefOr[Boolean] = js.undefined
  var mt: js.UndefOr[Boolean] = js.undefined
  var mtr: js.UndefOr[Boolean] = js.undefined
  var tl: js.UndefOr[Boolean] = js.undefined
  var tr: js.UndefOr[Boolean] = js.undefined
}

object Br {
  @scala.inline
  def apply(
    bl: js.UndefOr[Boolean] = js.undefined,
    br: js.UndefOr[Boolean] = js.undefined,
    mb: js.UndefOr[Boolean] = js.undefined,
    ml: js.UndefOr[Boolean] = js.undefined,
    mr: js.UndefOr[Boolean] = js.undefined,
    mt: js.UndefOr[Boolean] = js.undefined,
    mtr: js.UndefOr[Boolean] = js.undefined,
    tl: js.UndefOr[Boolean] = js.undefined,
    tr: js.UndefOr[Boolean] = js.undefined
  ): Br = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bl)) __obj.updateDynamic("bl")(bl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(br)) __obj.updateDynamic("br")(br.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mb)) __obj.updateDynamic("mb")(mb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mr)) __obj.updateDynamic("mr")(mr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mt)) __obj.updateDynamic("mt")(mt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mtr)) __obj.updateDynamic("mtr")(mtr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tl)) __obj.updateDynamic("tl")(tl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tr)) __obj.updateDynamic("tr")(tr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Br]
  }
}

