package typings.ethereumjsVm.interpreterMod

import typings.ethereumjsVm.opFnsMod.OpHandler
import typings.ethereumjsVm.opcodesMod.Opcode
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interpreter extends js.Object {
  
  var _eei: typings.ethereumjsVm.eeiMod.default = js.native
  
  def _getValidJumpDests(code: Buffer): js.Array[Double] = js.native
  
  var _runState: RunState = js.native
  
  def _runStepHook(): js.Promise[Unit] = js.native
  
  var _state: typings.ethereumjsVm.promisifiedMod.default = js.native
  
  var _vm: js.Any = js.native
  
  /**
    * Get the handler function for an opcode.
    */
  def getOpHandler(opInfo: Opcode): OpHandler = js.native
  
  /**
    * Get info for an opcode from VM's list of opcodes.
    */
  def lookupOpInfo(op: Double): Opcode = js.native
  def lookupOpInfo(op: Double, full: Boolean): Opcode = js.native
  
  def run(code: Buffer): js.Promise[InterpreterResult] = js.native
  def run(code: Buffer, opts: InterpreterOpts): js.Promise[InterpreterResult] = js.native
  
  /**
    * Executes the opcode to which the program counter is pointing,
    * reducing it's base gas cost, and increments the program counter.
    */
  def runStep(): js.Promise[Unit] = js.native
}
