package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiCodersBytesMod.DynamicBytesCoder
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersStringMod {
  
  @JSImport("ethers/types/abi/coders/string", "StringCoder")
  @js.native
  open class StringCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, _value: String): Double = js.native
    def encode(writer: Writer, _value: Typed): Double = js.native
  }
}
