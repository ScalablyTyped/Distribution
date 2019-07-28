package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nest extends js.Object {
  def Burn(menu: js.Any, `type`: js.Any): Unit
  def Feather(menu: js.Any, `type`: js.Any): Unit
}

object Nest {
  @scala.inline
  def apply(Burn: (js.Any, js.Any) => Unit, Feather: (js.Any, js.Any) => Unit): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2(Burn), Feather = js.Any.fromFunction2(Feather))
  
    __obj.asInstanceOf[Nest]
  }
}

