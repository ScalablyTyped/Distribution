package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
  
  /* "API" */ val API: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.API with String = js.native
  /* "CloseButton" */ val CloseButton: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.CloseButton with String = js.native
  /* "Escape" */ val Escape: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.Escape with String = js.native
  /* "MouseOut" */ val MouseOut: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.MouseOut with String = js.native
  /* "OuterMouseClick" */ val OuterMouseClick: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapPopupControlCloseReason.OuterMouseClick with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapPopupControlCloseReason with String] = js.native
}

