package typings.estreeWalker

import typings.estree.mod.BaseNode
import typings.estreeWalker.asyncMod.AsyncWalker
import typings.estreeWalker.syncMod.SyncWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncWalk(ast: BaseNode, walker: AsyncWalker): js.Promise[BaseNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncWalk")(ast.asInstanceOf[js.Any], walker.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BaseNode]]
  
  inline def walk(ast: BaseNode, walker: SyncWalker): BaseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], walker.asInstanceOf[js.Any])).asInstanceOf[BaseNode]
}
