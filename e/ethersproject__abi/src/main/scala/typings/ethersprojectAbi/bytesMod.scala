package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bytesMod {
  
  @JSImport("@ethersproject/abi/lib/coders/bytes", "BytesCoder")
  @js.native
  class BytesCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
  }
  
  @JSImport("@ethersproject/abi/lib/coders/bytes", "DynamicBytesCoder")
  @js.native
  class DynamicBytesCoder protected () extends Coder {
    def this(`type`: String, localName: String) = this()
  }
}
