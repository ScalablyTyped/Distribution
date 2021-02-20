package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrivilegeLevel extends StObject
@JSImport("evernote", "Types.PrivilegeLevel")
@js.native
object PrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait ADMIN extends PrivilegeLevel
  /* 9 */ val ADMIN: typings.evernote.mod.Types.PrivilegeLevel.ADMIN with Double = js.native
  
  @js.native
  sealed trait MANAGER extends PrivilegeLevel
  /* 7 */ val MANAGER: typings.evernote.mod.Types.PrivilegeLevel.MANAGER with Double = js.native
  
  @js.native
  sealed trait NORMAL extends PrivilegeLevel
  /* 1 */ val NORMAL: typings.evernote.mod.Types.PrivilegeLevel.NORMAL with Double = js.native
  
  @js.native
  sealed trait PREMIUM extends PrivilegeLevel
  /* 3 */ val PREMIUM: typings.evernote.mod.Types.PrivilegeLevel.PREMIUM with Double = js.native
  
  @js.native
  sealed trait SUPPORT extends PrivilegeLevel
  /* 8 */ val SUPPORT: typings.evernote.mod.Types.PrivilegeLevel.SUPPORT with Double = js.native
  
  @js.native
  sealed trait VIP extends PrivilegeLevel
  /* 5 */ val VIP: typings.evernote.mod.Types.PrivilegeLevel.VIP with Double = js.native
}
