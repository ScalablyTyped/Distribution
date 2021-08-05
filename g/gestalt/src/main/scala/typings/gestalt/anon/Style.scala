package typings.gestalt.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var __style: StringDictionary[js.UndefOr[String | Double]]
}
object Style {
  
  inline def apply(__style: StringDictionary[js.UndefOr[String | Double]]): Style = {
    val __obj = js.Dynamic.literal(__style = __style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def set__style(value: StringDictionary[js.UndefOr[String | Double]]): Self = StObject.set(x, "__style", value.asInstanceOf[js.Any])
  }
}
