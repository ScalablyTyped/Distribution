package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@ethersproject/abi/lib/coders/number", "NumberCoder")
  @js.native
  class NumberCoder protected () extends Coder {
    def this(size: Double, signed: Boolean, localName: String) = this()
    
    def encode(writer: Writer, value: BigNumberish): Double = js.native
    
    val signed: Boolean = js.native
    
    val size: Double = js.native
  }
}
