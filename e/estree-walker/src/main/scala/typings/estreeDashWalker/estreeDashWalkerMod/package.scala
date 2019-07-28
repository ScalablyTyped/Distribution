package typings.estreeDashWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object estreeDashWalkerMod {
  type WalkerListener = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ Node, 
    /* parent */ js.UndefOr[Node], 
    /* prop */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    Unit
  ]
}
