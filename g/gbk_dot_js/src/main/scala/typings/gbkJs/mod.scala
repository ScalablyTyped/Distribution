package typings.gbkJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gbk.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object URI {
    
    @JSImport("gbk.js", "URI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeURI(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeURI")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeURI(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def decode(bytes: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
