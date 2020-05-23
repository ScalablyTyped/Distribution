package typings.ejWebAll.ej.Ribbon

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
  
}

