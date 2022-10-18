package typings.ethersprojectAbi

import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodersBytesMod {
  
  @JSImport("@ethersproject/abi/lib/coders/bytes", "BytesCoder")
  @js.native
  open class BytesCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
  }
  
  @JSImport("@ethersproject/abi/lib/coders/bytes", "DynamicBytesCoder")
  @js.native
  open class DynamicBytesCoder protected () extends Coder {
    def this(`type`: String, localName: String) = this()
  }
}
