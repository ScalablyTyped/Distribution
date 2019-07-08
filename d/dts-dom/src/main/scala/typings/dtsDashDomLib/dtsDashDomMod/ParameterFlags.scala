package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterFlags extends js.Object

@JSImport("dts-dom", "ParameterFlags")
@js.native
object ParameterFlags extends js.Object {
  @js.native
  sealed trait None
    extends dtsDashDomLib.dtsDashDomMod.ParameterFlags
  
  @js.native
  sealed trait Optional
    extends dtsDashDomLib.dtsDashDomMod.ParameterFlags
  
  @js.native
  sealed trait Rest
    extends dtsDashDomLib.dtsDashDomMod.ParameterFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Optional: Optional with scala.Double = js.native
  /* 2 */ val Rest: Rest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dtsDashDomLib.dtsDashDomMod.ParameterFlags with scala.Double] = js.native
}

