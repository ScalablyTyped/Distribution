package typings.fnvLite

import typings.fnvLite.fnvLiteStrings.base36
import typings.fnvLite.fnvLiteStrings.base64
import typings.fnvLite.fnvLiteStrings.base64Url
import typings.fnvLite.fnvLiteStrings.hex
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fnv-lite", JSImport.Namespace)
  @js.native
  class ^ () extends FNV
  
  /* static member */
  @JSImport("fnv-lite", "base36")
  @js.native
  def base36(input: Input): String = js.native
  
  /* static member */
  @JSImport("fnv-lite", "base64")
  @js.native
  def base64(input: Input): String = js.native
  
  /* static member */
  @JSImport("fnv-lite", "base64Url")
  @js.native
  def base64Url(input: Input): String = js.native
  
  /* static member */
  @JSImport("fnv-lite", "hex")
  @js.native
  def hex(input: Input): String = js.native
  
  @js.native
  trait FNV extends StObject {
    
    def digest(): js.Array[Double] = js.native
    @JSName("digest")
    def digest_base36(`type`: base36): String = js.native
    @JSName("digest")
    def digest_base64(`type`: base64): String = js.native
    @JSName("digest")
    def digest_base64Url(`type`: base64Url): String = js.native
    @JSName("digest")
    def digest_hex(`type`: hex): String = js.native
    
    def update(input: Input): this.type = js.native
  }
  
  type Input = String | ArrayLike[Double]
}
