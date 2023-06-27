package typings.estreeUtilAttachComments

import typings.estree.mod.BaseNode
import typings.estree.mod.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-attach-comments/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachComments[Tree /* <: BaseNode */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def attachComments[Tree /* <: BaseNode */](tree: Tree, comments: js.Array[EstreeComment]): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(tree.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  type EstreeComment = Comment
  
  type EstreeNode = BaseNode
  
  trait Fields extends StObject {
    
    var leading: Boolean
    
    var trailing: Boolean
  }
  object Fields {
    
    inline def apply(leading: Boolean, trailing: Boolean): Fields = {
      val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    /**
      * Comments.
      */
    var comments: js.Array[EstreeComment]
    
    /**
      * Index of comment.
      */
    var index: Double
  }
  object State {
    
    inline def apply(comments: js.Array[EstreeComment], index: Double): State = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setComments(value: js.Array[EstreeComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: EstreeComment*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
