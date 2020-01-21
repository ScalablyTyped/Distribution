package typings.estreeWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WalkerListener = js.ThisFunction4[
    /* this */ typings.estreeWalker.mod.WalkerContext, 
    /* node */ typings.estreeWalker.mod.Node, 
    /* parent */ js.UndefOr[typings.estreeWalker.mod.Node], 
    /* prop */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
