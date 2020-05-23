package typings.fridaGum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  /**
    * Whether to generate an event whenever a basic block is executed.
    *
    * Useful to record a coarse execution trace.
    */
  var block: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for CALL/BLR instructions.
    */
  var call: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate an event whenever a basic block is compiled.
    *
    * Useful for coverage.
    */
  var compile: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for all instructions.
    *
    * Not recommended as it's potentially a lot of data.
    */
  var exec: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for RET instructions.
    */
  var ret: js.UndefOr[Boolean] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    call: js.UndefOr[Boolean] = js.undefined,
    compile: js.UndefOr[Boolean] = js.undefined,
    exec: js.UndefOr[Boolean] = js.undefined,
    ret: js.UndefOr[Boolean] = js.undefined
  ): Block = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compile)) __obj.updateDynamic("compile")(compile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exec)) __obj.updateDynamic("exec")(exec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ret)) __obj.updateDynamic("ret")(ret.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

