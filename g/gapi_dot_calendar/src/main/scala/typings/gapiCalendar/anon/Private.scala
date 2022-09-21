package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Private extends StObject {
  
  var `private`: StringDictionary[String]
  
  var shared: StringDictionary[String]
}
object Private {
  
  inline def apply(`private`: StringDictionary[String], shared: StringDictionary[String]): Private = {
    val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
  
  extension [Self <: Private](x: Self) {
    
    inline def setPrivate(value: StringDictionary[String]): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setShared(value: StringDictionary[String]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
  }
}
