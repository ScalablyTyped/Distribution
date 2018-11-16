package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeaderType extends js.Object

@JSGlobal("TabLeaderType")
@js.native
object TabLeaderType extends js.Object {
  @js.native
  sealed trait Dots
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait EqualSign
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait Hyphens
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait MiddleDots
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait None
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait ThickLine
    extends devexpressDashWebLib.TabLeaderType
  
  @js.native
  sealed trait Underline
    extends devexpressDashWebLib.TabLeaderType
  
  /* 1 */ val Dots: Dots with scala.Double = js.native
  /* 6 */ val EqualSign: EqualSign with scala.Double = js.native
  /* 3 */ val Hyphens: Hyphens with scala.Double = js.native
  /* 2 */ val MiddleDots: MiddleDots with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 5 */ val ThickLine: ThickLine with scala.Double = js.native
  /* 4 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TabLeaderType with scala.Double] = js.native
}

