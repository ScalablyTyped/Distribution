package typings.estreeWalker

import typings.estreeWalker.anon.Enter
import typings.estreeWalker.anon.Leave
import typings.estreeWalker.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncWalk(ast: typings.estree.mod.BaseNode, hasEnterLeave: Enter): js.Promise[typings.estree.mod.BaseNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncWalk")(ast.asInstanceOf[js.Any], hasEnterLeave.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.estree.mod.BaseNode]]
  
  inline def walk(ast: typings.estree.mod.BaseNode, hasEnterLeave: Leave): typings.estree.mod.BaseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], hasEnterLeave.asInstanceOf[js.Any])).asInstanceOf[typings.estree.mod.BaseNode]
  
  type AsyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typings.estree.mod.BaseNode, 
    /* parent */ typings.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    js.Promise[Unit]
  ]
  
  type BaseNode = typings.estree.mod.BaseNode
  
  type SyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typings.estree.mod.BaseNode, 
    /* parent */ typings.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    Unit
  ]
}
