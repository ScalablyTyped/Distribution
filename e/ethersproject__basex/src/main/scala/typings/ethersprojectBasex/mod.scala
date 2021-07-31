package typings.ethersprojectBasex

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/basex", "Base32")
  @js.native
  val Base32: BaseX = js.native
  
  @JSImport("@ethersproject/basex", "Base58")
  @js.native
  val Base58: BaseX = js.native
  
  @JSImport("@ethersproject/basex", "BaseX")
  @js.native
  class BaseX protected () extends StObject {
    def this(alphabet: String) = this()
    
    var _alphabetMap: StringDictionary[Double] = js.native
    
    var _leader: String = js.native
    
    val alphabet: String = js.native
    
    val base: Double = js.native
    
    def decode(value: String): Uint8Array = js.native
    
    def encode(value: BytesLike): String = js.native
  }
}
