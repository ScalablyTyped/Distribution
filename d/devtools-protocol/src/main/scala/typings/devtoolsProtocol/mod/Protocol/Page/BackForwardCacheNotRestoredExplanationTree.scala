package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackForwardCacheNotRestoredExplanationTree extends StObject {
  
  /**
    * Array of children frame
    */
  var children: js.Array[BackForwardCacheNotRestoredExplanationTree]
  
  /**
    * Not restored reasons of each frame
    */
  var explanations: js.Array[BackForwardCacheNotRestoredExplanation]
  
  /**
    * URL of each frame
    */
  var url: String
}
object BackForwardCacheNotRestoredExplanationTree {
  
  inline def apply(
    children: js.Array[BackForwardCacheNotRestoredExplanationTree],
    explanations: js.Array[BackForwardCacheNotRestoredExplanation],
    url: String
  ): BackForwardCacheNotRestoredExplanationTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], explanations = explanations.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackForwardCacheNotRestoredExplanationTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackForwardCacheNotRestoredExplanationTree] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[BackForwardCacheNotRestoredExplanationTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: BackForwardCacheNotRestoredExplanationTree*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExplanations(value: js.Array[BackForwardCacheNotRestoredExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsVarargs(value: BackForwardCacheNotRestoredExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
