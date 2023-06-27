package typings.estreeUtilAttachComments

import typings.estree.mod.BaseNode
import typings.estreeUtilAttachComments.libMod.EstreeComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-util-attach-comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachComments[Tree /* <: BaseNode */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def attachComments[Tree /* <: BaseNode */](tree: Tree, comments: js.Array[EstreeComment]): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(tree.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[Tree]
}
