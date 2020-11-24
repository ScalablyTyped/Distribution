package typings.devexpressUtils.keyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierKey extends js.Object
@JSImport("@devexpress/utils/lib/utils/key", "ModifierKey")
@js.native
object ModifierKey extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierKey with Double] = js.native
  
  @js.native
  sealed trait Alt extends ModifierKey
  /* 1048576 */ @js.native
  object Alt extends TopLevel[Alt with Double]
  
  @js.native
  sealed trait Ctrl extends ModifierKey
  /* 65536 */ @js.native
  object Ctrl extends TopLevel[Ctrl with Double]
  
  @js.native
  sealed trait Meta extends ModifierKey
  /* 16777216 */ @js.native
  object Meta extends TopLevel[Meta with Double]
  
  @js.native
  sealed trait None extends ModifierKey
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Shift extends ModifierKey
  /* 262144 */ @js.native
  object Shift extends TopLevel[Shift with Double]
}
