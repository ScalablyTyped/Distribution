package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scopes extends StObject {
  
  var scopes: js.UndefOr[StringDictionary[`4`]] = js.native
}
object Scopes {
  
  @scala.inline
  def apply(): Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scopes]
  }
  
  @scala.inline
  implicit class ScopesMutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopes(value: StringDictionary[`4`]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
  }
}
