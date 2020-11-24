package typings.estreeWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object syncMod {
  
  type WalkerHandler = js.ThisFunction4[
    /* this */ typings.estreeWalker.walkerMod.WalkerContext, 
    /* node */ typings.estree.mod.BaseNode, 
    /* parent */ typings.estree.mod.BaseNode, 
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
