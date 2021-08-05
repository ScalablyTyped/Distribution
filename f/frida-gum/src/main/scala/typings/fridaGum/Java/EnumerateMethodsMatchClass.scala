package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class matching query which has one or more matching methods.
  */
trait EnumerateMethodsMatchClass extends StObject {
  
  /**
    * One or more matching method names, each followed by signature when
    * the `s` modifier is used.
    */
  var methods: Array[String]
  
  /**
    * Class name that matched the given query.
    */
  var name: String
}
object EnumerateMethodsMatchClass {
  
  inline def apply(methods: Array[String], name: String): EnumerateMethodsMatchClass = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchClass]
  }
  
  extension [Self <: EnumerateMethodsMatchClass](x: Self) {
    
    inline def setMethods(value: Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
