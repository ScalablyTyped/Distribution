package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.`catch`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`with`
import typings.devtoolsProtocol.devtoolsProtocolStrings.block
import typings.devtoolsProtocol.devtoolsProtocolStrings.closure
import typings.devtoolsProtocol.devtoolsProtocolStrings.eval
import typings.devtoolsProtocol.devtoolsProtocolStrings.global
import typings.devtoolsProtocol.devtoolsProtocolStrings.local
import typings.devtoolsProtocol.devtoolsProtocolStrings.module
import typings.devtoolsProtocol.devtoolsProtocolStrings.script_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.global
  - typings.devtoolsProtocol.devtoolsProtocolStrings.local
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`with`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.closure
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`catch`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.block
  - typings.devtoolsProtocol.devtoolsProtocolStrings.script_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.eval
  - typings.devtoolsProtocol.devtoolsProtocolStrings.module
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
*/
trait ScopeType extends js.Object
object ScopeType {
  
  @scala.inline
  def Block: block = "block".asInstanceOf[block]
  
  @scala.inline
  def Catch: `catch` = "catch".asInstanceOf[`catch`]
  
  @scala.inline
  def Closure: closure = "closure".asInstanceOf[closure]
  
  @scala.inline
  def Eval: eval = "eval".asInstanceOf[eval]
  
  @scala.inline
  def Global: global = "global".asInstanceOf[global]
  
  @scala.inline
  def Local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def Module: module = "module".asInstanceOf[module]
  
  @scala.inline
  def Script: script_ = "script".asInstanceOf[script_]
  
  @scala.inline
  def WasmExpressionStack: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  @scala.inline
  def With: `with` = "with".asInstanceOf[`with`]
}
