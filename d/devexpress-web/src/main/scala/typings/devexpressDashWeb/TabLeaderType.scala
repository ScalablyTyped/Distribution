package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeaderType extends js.Object

@JSGlobal("TabLeaderType")
@js.native
object TabLeaderType extends js.Object {
  @js.native
  sealed trait Dots extends TabLeaderType
  
  @js.native
  sealed trait EqualSign extends TabLeaderType
  
  @js.native
  sealed trait Hyphens extends TabLeaderType
  
  @js.native
  sealed trait MiddleDots extends TabLeaderType
  
  @js.native
  sealed trait None extends TabLeaderType
  
  @js.native
  sealed trait ThickLine extends TabLeaderType
  
  @js.native
  sealed trait Underline extends TabLeaderType
  
  /* 1 */ val Dots: typings.devexpressDashWeb.TabLeaderType.Dots with Double = js.native
  /* 6 */ val EqualSign: typings.devexpressDashWeb.TabLeaderType.EqualSign with Double = js.native
  /* 3 */ val Hyphens: typings.devexpressDashWeb.TabLeaderType.Hyphens with Double = js.native
  /* 2 */ val MiddleDots: typings.devexpressDashWeb.TabLeaderType.MiddleDots with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.TabLeaderType.None with Double = js.native
  /* 5 */ val ThickLine: typings.devexpressDashWeb.TabLeaderType.ThickLine with Double = js.native
  /* 4 */ val Underline: typings.devexpressDashWeb.TabLeaderType.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabLeaderType with Double] = js.native
}

