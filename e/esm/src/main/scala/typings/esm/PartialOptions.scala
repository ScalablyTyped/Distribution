package typings.esm

import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<esm.esm.Options.Options> */
trait PartialOptions extends js.Object {
  var await: js.UndefOr[Boolean] = js.undefined
  var cjs: js.UndefOr[Boolean | PartialEsm] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  var mode: js.UndefOr[auto | all | strict] = js.undefined
  var wasm: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    await: js.UndefOr[Boolean] = js.undefined,
    cjs: Boolean | PartialEsm = null,
    force: js.UndefOr[Boolean] = js.undefined,
    mainFields: js.Array[String] = null,
    mode: auto | all | strict = null,
    wasm: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(await)) __obj.updateDynamic("await")(await.asInstanceOf[js.Any])
    if (cjs != null) __obj.updateDynamic("cjs")(cjs.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(wasm)) __obj.updateDynamic("wasm")(wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

