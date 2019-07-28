package typings.dtsDashDom.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextFlags extends js.Object

@JSImport("dts-dom", "ContextFlags")
@js.native
object ContextFlags extends js.Object {
  @js.native
  sealed trait InAmbientNamespace extends ContextFlags
  
  @js.native
  sealed trait Module extends ContextFlags
  
  @js.native
  sealed trait None extends ContextFlags
  
  /* 2 */ val InAmbientNamespace: typings.dtsDashDom.dtsDashDomMod.ContextFlags.InAmbientNamespace with Double = js.native
  /* 1 */ val Module: typings.dtsDashDom.dtsDashDomMod.ContextFlags.Module with Double = js.native
  /* 0 */ val None: typings.dtsDashDom.dtsDashDomMod.ContextFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextFlags with Double] = js.native
}

