package typings.fnvLite

import typings.fnvLite.fnvLiteStrings.base36
import typings.fnvLite.fnvLiteStrings.base64
import typings.fnvLite.fnvLiteStrings.base64Url
import typings.fnvLite.fnvLiteStrings.hex
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fnv-lite", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FNV
  @JSImport("fnv-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def base36(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base36")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def base64(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def base64Url(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Url")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def hex(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait FNV extends StObject {
    
    def digest(): js.Array[Double] = js.native
    def digest(`type`: hex | base36 | base64 | base64Url): String = js.native
    
    def update(input: Input): this.type = js.native
  }
  
  type Input = String | ArrayLike[Double]
}
