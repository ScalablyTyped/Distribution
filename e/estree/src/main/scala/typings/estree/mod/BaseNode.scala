package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode
  extends StObject
     with BaseNodeWithoutComments {
  
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.undefined
}
object BaseNode {
  
  inline def apply(`type`: String): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value :_*))
    
    inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value :_*))
  }
}
