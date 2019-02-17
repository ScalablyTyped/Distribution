package typings
package estreeDashWalkerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object estreeDashWalkerMod {
  type WalkerListener = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ Node, 
    /* parent */ js.UndefOr[Node], 
    /* prop */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
