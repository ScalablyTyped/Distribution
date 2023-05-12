package typings.fastQuerystring

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-querystring", JSImport.Default)
  @js.native
  val default: FastQueryString = js.native
  
  @JSImport("fast-querystring", "fqs")
  @js.native
  val fqs: FastQueryString = js.native
  
  inline def parse(value: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def stringify(value: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait FastQueryString extends StObject {
    
    def parse(value: String): Record[String, Any]
    
    def stringify(value: Record[String, Any]): String
  }
  object FastQueryString {
    
    inline def apply(parse: String => Record[String, Any], stringify: Record[String, Any] => String): FastQueryString = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[FastQueryString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastQueryString] (val x: Self) extends AnyVal {
      
      inline def setParse(value: String => Record[String, Any]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: Record[String, Any] => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}
