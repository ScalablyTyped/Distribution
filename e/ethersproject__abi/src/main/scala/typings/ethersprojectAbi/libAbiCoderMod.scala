package typings.ethersprojectAbi

import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Reader
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Result
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Writer
import typings.ethersprojectAbi.libFragmentsMod.ParamType
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbiCoderMod {
  
  @JSImport("@ethersproject/abi/lib/abi-coder", "AbiCoder")
  @js.native
  open class AbiCoder () extends StObject {
    def this(coerceFunc: CoerceFunc) = this()
    
    def _getCoder(param: ParamType): Coder = js.native
    
    def _getReader(data: js.typedarray.Uint8Array): Reader = js.native
    def _getReader(data: js.typedarray.Uint8Array, allowLoose: Boolean): Reader = js.native
    
    def _getWordSize(): Double = js.native
    
    def _getWriter(): Writer = js.native
    
    def coerceFunc(`type`: String, value: Any): Any = js.native
    
    def decode(types: js.Array[String | ParamType], data: BytesLike): Result = js.native
    def decode(types: js.Array[String | ParamType], data: BytesLike, loose: Boolean): Result = js.native
    
    def encode(types: js.Array[String | ParamType], values: js.Array[Any]): String = js.native
    
    def getDefaultValue(types: js.Array[String | ParamType]): Result = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/abi-coder", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: AbiCoder = js.native
  
  type CoerceFunc = js.Function2[/* type */ String, /* value */ Any, Any]
}
