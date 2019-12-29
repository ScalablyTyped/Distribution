package typings.ejDotWebDotAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationTabType with Double] = js.native
  /* 1 */ @js.native
  object Backstage extends TopLevel[Backstage with Double]
  
  /* 0 */ @js.native
  object Menu extends TopLevel[Menu with Double]
  
}

