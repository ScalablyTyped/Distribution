package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var Name: String
  
  var Options: StringDictionary[String]
}
object Options {
  
  inline def apply(Name: String, Options: StringDictionary[String]): Options = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
