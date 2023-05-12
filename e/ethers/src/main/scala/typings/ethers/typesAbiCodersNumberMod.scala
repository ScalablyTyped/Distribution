package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersNumberMod {
  
  @JSImport("ethers/types/abi/coders/number", "NumberCoder")
  @js.native
  open class NumberCoder protected () extends Coder {
    def this(size: Double, signed: Boolean, localName: String) = this()
    
    def encode(writer: Writer, _value: Typed): Double = js.native
    
    val signed: Boolean = js.native
    
    val size: Double = js.native
  }
}
