package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofroutingHeader extends StObject {
  
  def fromParams(params: StringDictionary[String | Double | Boolean]): String
}
object TypeofroutingHeader {
  
  inline def apply(fromParams: StringDictionary[String | Double | Boolean] => String): TypeofroutingHeader = {
    val __obj = js.Dynamic.literal(fromParams = js.Any.fromFunction1(fromParams))
    __obj.asInstanceOf[TypeofroutingHeader]
  }
  
  extension [Self <: TypeofroutingHeader](x: Self) {
    
    inline def setFromParams(value: StringDictionary[String | Double | Boolean] => String): Self = StObject.set(x, "fromParams", js.Any.fromFunction1(value))
  }
}
