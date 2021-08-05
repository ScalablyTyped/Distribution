package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations extends StObject {
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
}
object Annotations {
  
  inline def apply(): Annotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations]
  }
  
  extension [Self <: Annotations](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
