package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthHeaderValueForFirstParty extends StObject {
  
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null
}
object GetAuthHeaderValueForFirstParty {
  
  inline def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => String | Null): GetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal(getAuthHeaderValueForFirstParty = js.Any.fromFunction1(getAuthHeaderValueForFirstParty))
    __obj.asInstanceOf[GetAuthHeaderValueForFirstParty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAuthHeaderValueForFirstParty] (val x: Self) extends AnyVal {
    
    inline def setGetAuthHeaderValueForFirstParty(value: js.Array[StringDictionary[String]] => String | Null): Self = StObject.set(x, "getAuthHeaderValueForFirstParty", js.Any.fromFunction1(value))
  }
}
