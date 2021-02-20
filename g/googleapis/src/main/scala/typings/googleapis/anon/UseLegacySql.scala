package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseLegacySql extends StObject {
  
  var useLegacySql: js.UndefOr[Boolean] = js.native
}
object UseLegacySql {
  
  @scala.inline
  def apply(): UseLegacySql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseLegacySql]
  }
  
  @scala.inline
  implicit class UseLegacySqlMutableBuilder[Self <: UseLegacySql] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
  }
}
