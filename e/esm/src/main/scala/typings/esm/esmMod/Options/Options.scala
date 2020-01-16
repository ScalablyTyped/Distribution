package typings.esm.esmMod.Options

import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var await: Boolean
  var cjs: Boolean | Partial[Esm]
  var force: Boolean
  var mainFields: js.Array[String]
  var mode: auto | all | strict
  var wasm: Boolean
}

object Options {
  @scala.inline
  def apply(
    await: Boolean,
    cjs: Boolean | Partial[Esm],
    force: Boolean,
    mainFields: js.Array[String],
    mode: auto | all | strict,
    wasm: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], cjs = cjs.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

