package typings.dtsDashDom.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterFlags extends js.Object

@JSImport("dts-dom", "ParameterFlags")
@js.native
object ParameterFlags extends js.Object {
  @js.native
  sealed trait None extends ParameterFlags
  
  @js.native
  sealed trait Optional extends ParameterFlags
  
  @js.native
  sealed trait Rest extends ParameterFlags
  
  /* 0 */ val None: typings.dtsDashDom.dtsDashDomMod.ParameterFlags.None with Double = js.native
  /* 1 */ val Optional: typings.dtsDashDom.dtsDashDomMod.ParameterFlags.Optional with Double = js.native
  /* 2 */ val Rest: typings.dtsDashDom.dtsDashDomMod.ParameterFlags.Rest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterFlags with Double] = js.native
}

