package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Searchterm
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var search_term: js.UndefOr[String] = js.undefined
}
object Searchterm {
  
  inline def apply(): Searchterm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchterm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Searchterm] (val x: Self) extends AnyVal {
    
    inline def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
    
    inline def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
  }
}
