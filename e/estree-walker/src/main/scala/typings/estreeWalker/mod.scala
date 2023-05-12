package typings.estreeWalker

import typings.estreeWalker.anon.Enter
import typings.estreeWalker.anon.Leave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncWalk(ast: Node, param1: Leave): js.Promise[Node | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncWalk")(ast.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node | Null]]
  
  inline def walk(ast: Node, param1: Enter): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  type AsyncHandler = typings.estreeWalker.typesAsyncMod.AsyncHandler
  
  type Node = typings.estree.mod.Node
  
  type SyncHandler = typings.estreeWalker.typesSyncMod.SyncHandler
}
