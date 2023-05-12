package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersAddressMod {
  
  @JSImport("ethers/types/abi/coders/address", "AddressCoder")
  @js.native
  open class AddressCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, _value: String): Double = js.native
    def encode(writer: Writer, _value: Typed): Double = js.native
  }
}
