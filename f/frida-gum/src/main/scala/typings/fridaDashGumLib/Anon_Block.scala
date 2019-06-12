package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  /**
    * Whether to generate an event whenever a basic block is executed.
    *
    * Useful to record a coarse execution trace.
    */
  var block: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to generate events for CALL/BLR instructions.
    */
  var call: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to generate an event whenever a basic block is compiled.
    *
    * Useful for coverage.
    */
  var compile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to generate events for all instructions.
    *
    * Not recommended as it's potentially a lot of data.
    */
  var exec: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to generate events for RET instructions.
    */
  var ret: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    block: js.UndefOr[scala.Boolean] = js.undefined,
    call: js.UndefOr[scala.Boolean] = js.undefined,
    compile: js.UndefOr[scala.Boolean] = js.undefined,
    exec: js.UndefOr[scala.Boolean] = js.undefined,
    ret: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Block = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call)
    if (!js.isUndefined(compile)) __obj.updateDynamic("compile")(compile)
    if (!js.isUndefined(exec)) __obj.updateDynamic("exec")(exec)
    if (!js.isUndefined(ret)) __obj.updateDynamic("ret")(ret)
    __obj.asInstanceOf[Anon_Block]
  }
}

