package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrivilegeLevel extends js.Object
@JSImport("evernote", "Types.PrivilegeLevel")
@js.native
object PrivilegeLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait ADMIN extends PrivilegeLevel
  /* 9 */ @js.native
  object ADMIN extends TopLevel[ADMIN with Double]
  
  @js.native
  sealed trait MANAGER extends PrivilegeLevel
  /* 7 */ @js.native
  object MANAGER extends TopLevel[MANAGER with Double]
  
  @js.native
  sealed trait NORMAL extends PrivilegeLevel
  /* 1 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  @js.native
  sealed trait PREMIUM extends PrivilegeLevel
  /* 3 */ @js.native
  object PREMIUM extends TopLevel[PREMIUM with Double]
  
  @js.native
  sealed trait SUPPORT extends PrivilegeLevel
  /* 8 */ @js.native
  object SUPPORT extends TopLevel[SUPPORT with Double]
  
  @js.native
  sealed trait VIP extends PrivilegeLevel
  /* 5 */ @js.native
  object VIP extends TopLevel[VIP with Double]
}
