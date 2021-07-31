package typings.devexpressUtils.keyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierKey extends StObject
@JSImport("@devexpress/utils/lib/utils/key", "ModifierKey")
@js.native
object ModifierKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierKey & Double] = js.native
  
  @js.native
  sealed trait Alt
    extends StObject
       with ModifierKey
  /* 1048576 */ val Alt: typings.devexpressUtils.keyMod.ModifierKey.Alt & Double = js.native
  
  @js.native
  sealed trait Ctrl
    extends StObject
       with ModifierKey
  /* 65536 */ val Ctrl: typings.devexpressUtils.keyMod.ModifierKey.Ctrl & Double = js.native
  
  @js.native
  sealed trait Meta
    extends StObject
       with ModifierKey
  /* 16777216 */ val Meta: typings.devexpressUtils.keyMod.ModifierKey.Meta & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModifierKey
  /* 0 */ val None: typings.devexpressUtils.keyMod.ModifierKey.None & Double = js.native
  
  @js.native
  sealed trait Shift
    extends StObject
       with ModifierKey
  /* 262144 */ val Shift: typings.devexpressUtils.keyMod.ModifierKey.Shift & Double = js.native
}
