package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Private extends StObject {
  
  var `private`: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var shared: js.UndefOr[StringDictionary[String]] = js.undefined
}
object Private {
  
  inline def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  
  extension [Self <: Private](x: Self) {
    
    inline def setPrivate(value: StringDictionary[String]): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setShared(value: StringDictionary[String]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
