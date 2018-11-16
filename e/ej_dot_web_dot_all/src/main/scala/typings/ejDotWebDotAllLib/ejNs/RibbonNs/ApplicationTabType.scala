package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationTabType extends js.Object

@JSGlobal("ej.Ribbon.ApplicationTabType")
@js.native
object ApplicationTabType extends js.Object {
  ///applicationTab display as backstage
  @js.native
  sealed trait Backstage
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ApplicationTabType
  
  ///applicationTab display as menu
  @js.native
  sealed trait Menu
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ApplicationTabType
  
  val Backstage: Backstage with java.lang.String = js.native
  val Menu: Menu with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.ApplicationTabType with java.lang.String] = js.native
}

