package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.API
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.CloseButton
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.Escape
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.MouseOut
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.OuterMouseClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapPopupControlCloseReason extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapPopupControlCloseReason")
@js.native
object BootstrapPopupControlCloseReason extends js.Object {
  @js.native
  sealed trait API extends BootstrapPopupControlCloseReason
  
  @js.native
  sealed trait CloseButton extends BootstrapPopupControlCloseReason
  
  @js.native
  sealed trait Escape extends BootstrapPopupControlCloseReason
  
  @js.native
  sealed trait MouseOut extends BootstrapPopupControlCloseReason
  
  @js.native
  sealed trait OuterMouseClick extends BootstrapPopupControlCloseReason
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapPopupControlCloseReason with String] = js.native
  /* "API" */ @js.native
  object API extends TopLevel[API with String]
  
  /* "CloseButton" */ @js.native
  object CloseButton extends TopLevel[CloseButton with String]
  
  /* "Escape" */ @js.native
  object Escape extends TopLevel[Escape with String]
  
  /* "MouseOut" */ @js.native
  object MouseOut extends TopLevel[MouseOut with String]
  
  /* "OuterMouseClick" */ @js.native
  object OuterMouseClick extends TopLevel[OuterMouseClick with String]
  
}

