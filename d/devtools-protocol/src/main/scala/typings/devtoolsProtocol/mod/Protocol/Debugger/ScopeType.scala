package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.`catch`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`with`
import typings.devtoolsProtocol.devtoolsProtocolStrings.block
import typings.devtoolsProtocol.devtoolsProtocolStrings.closure
import typings.devtoolsProtocol.devtoolsProtocolStrings.eval
import typings.devtoolsProtocol.devtoolsProtocolStrings.global
import typings.devtoolsProtocol.devtoolsProtocolStrings.local_
import typings.devtoolsProtocol.devtoolsProtocolStrings.module
import typings.devtoolsProtocol.devtoolsProtocolStrings.script_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.global
  - typings.devtoolsProtocol.devtoolsProtocolStrings.local_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`with`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.closure
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`catch`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.block
  - typings.devtoolsProtocol.devtoolsProtocolStrings.script_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.eval
  - typings.devtoolsProtocol.devtoolsProtocolStrings.module
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
*/
trait ScopeType extends StObject
object ScopeType {
  
  inline def Block: block = "block".asInstanceOf[block]
  
  inline def Catch: `catch` = "catch".asInstanceOf[`catch`]
  
  inline def Closure: closure = "closure".asInstanceOf[closure]
  
  inline def Eval: eval = "eval".asInstanceOf[eval]
  
  inline def Global: global = "global".asInstanceOf[global]
  
  inline def Local: local_ = "local".asInstanceOf[local_]
  
  inline def Module: module = "module".asInstanceOf[module]
  
  inline def Script: script_ = "script".asInstanceOf[script_]
  
  inline def WasmExpressionStack: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  inline def With: `with` = "with".asInstanceOf[`with`]
}
