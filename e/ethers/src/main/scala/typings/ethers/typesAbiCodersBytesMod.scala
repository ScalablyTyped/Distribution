package typings.ethers

import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersBytesMod {
  
  @JSImport("ethers/types/abi/coders/bytes", "BytesCoder")
  @js.native
  open class BytesCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
  }
  
  @JSImport("ethers/types/abi/coders/bytes", "DynamicBytesCoder")
  @js.native
  open class DynamicBytesCoder protected () extends Coder {
    def this(`type`: String, localName: String) = this()
  }
}
