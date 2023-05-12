package typings.emailjsMimeCodec

import typings.emailjsMimeCodec.emailjsMimeCodecBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: Record[String, String]
    
    var value: String | `false`
  }
  object Params {
    
    inline def apply(params: Record[String, String], value: String | `false`): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Record[String, String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
