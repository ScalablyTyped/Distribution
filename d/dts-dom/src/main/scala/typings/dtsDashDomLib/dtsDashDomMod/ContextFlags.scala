package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextFlags extends js.Object

@JSImport("dts-dom", "ContextFlags")
@js.native
object ContextFlags extends js.Object {
  @js.native
  sealed trait InAmbientNamespace
    extends dtsDashDomLib.dtsDashDomMod.ContextFlags
  
  @js.native
  sealed trait Module
    extends dtsDashDomLib.dtsDashDomMod.ContextFlags
  
  @js.native
  sealed trait None
    extends dtsDashDomLib.dtsDashDomMod.ContextFlags
  
  /* 2 */ val InAmbientNamespace: InAmbientNamespace with scala.Double = js.native
  /* 1 */ val Module: Module with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dtsDashDomLib.dtsDashDomMod.ContextFlags with scala.Double] = js.native
}

