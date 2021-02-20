package typings.domurl

import typings.domurl.mod.domurl.QueryString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domurl", JSImport.Namespace)
  @js.native
  class ^[T] () extends Url[T] {
    def this(url: String) = this()
  }
  
  @js.native
  trait Url[T] extends StObject {
    
    def clearQuery(): Url[js.Object] = js.native
    
    def decode(s: String): String = js.native
    
    def encode(s: String): String = js.native
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var href: String = js.native
    
    def isAbsolute(): Boolean = js.native
    
    def isEmptyQuery(): Boolean = js.native
    
    var pass: String = js.native
    
    var path: String = js.native
    
    def paths(): js.Array[String] = js.native
    def paths(paths: js.Array[String]): js.Array[String] = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var query: QueryString[T] = js.native
    
    def queryLength(): Double = js.native
    
    var user: String = js.native
  }
  
  object domurl {
    
    type QueryString[T] = T
  }
}
