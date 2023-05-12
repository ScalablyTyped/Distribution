package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersFixedBytesMod {
  
  @JSImport("ethers/types/abi/coders/fixed-bytes", "FixedBytesCoder")
  @js.native
  open class FixedBytesCoder protected () extends Coder {
    def this(size: Double, localName: String) = this()
    
    def encode(writer: Writer, _value: Typed): Double = js.native
    
    val size: Double = js.native
  }
}
