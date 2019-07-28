package typings.ejDotWebDotAll.ejNs.RibbonNs

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
  sealed trait Backstage extends ApplicationTabType
  
  ///applicationTab display as menu
  @js.native
  sealed trait Menu extends ApplicationTabType
  
  /* 1 */ val Backstage: typings.ejDotWebDotAll.ejNs.RibbonNs.ApplicationTabType.Backstage with Double = js.native
  /* 0 */ val Menu: typings.ejDotWebDotAll.ejNs.RibbonNs.ApplicationTabType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationTabType with Double] = js.native
}

