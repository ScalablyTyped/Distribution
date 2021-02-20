package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeParamNames extends StObject {
  
  var parentId: js.UndefOr[String] = js.native
}
object TreeParamNames {
  
  @scala.inline
  def apply(): TreeParamNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeParamNames]
  }
  
  @scala.inline
  implicit class TreeParamNamesMutableBuilder[Self <: TreeParamNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
  }
}
