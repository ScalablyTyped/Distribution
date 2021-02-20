package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Reader
import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbi.abstractCoderMod.Writer
import typings.ethersprojectAbi.fragmentsMod.ParamType
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abiCoderMod {
  
  @JSImport("@ethersproject/abi/lib/abi-coder", "AbiCoder")
  @js.native
  class AbiCoder () extends StObject {
    def this(coerceFunc: CoerceFunc) = this()
    
    def _getCoder(param: ParamType): Coder = js.native
    
    def _getReader(data: Uint8Array): Reader = js.native
    
    def _getWordSize(): Double = js.native
    
    def _getWriter(): Writer = js.native
    
    def coerceFunc(`type`: String, value: js.Any): js.Any = js.native
    
    def decode(types: js.Array[String | ParamType], data: BytesLike): Result = js.native
    
    def encode(types: js.Array[String | ParamType], values: js.Array[_]): String = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/abi-coder", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: AbiCoder = js.native
  
  type CoerceFunc = js.Function2[/* type */ String, /* value */ js.Any, js.Any]
}
