package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersBooleanMod {
  
  @JSImport("ethers/types/abi/coders/boolean", "BooleanCoder")
  @js.native
  open class BooleanCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, _value: Boolean): Double = js.native
    def encode(writer: Writer, _value: Typed): Double = js.native
  }
}
