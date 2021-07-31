package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrivilegeLevel extends StObject
@JSImport("evernote", "Types.PrivilegeLevel")
@js.native
object PrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivilegeLevel & Double] = js.native
  
  @js.native
  sealed trait ADMIN
    extends StObject
       with PrivilegeLevel
  /* 9 */ val ADMIN: typings.evernote.mod.Types.PrivilegeLevel.ADMIN & Double = js.native
  
  @js.native
  sealed trait MANAGER
    extends StObject
       with PrivilegeLevel
  /* 7 */ val MANAGER: typings.evernote.mod.Types.PrivilegeLevel.MANAGER & Double = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with PrivilegeLevel
  /* 1 */ val NORMAL: typings.evernote.mod.Types.PrivilegeLevel.NORMAL & Double = js.native
  
  @js.native
  sealed trait PREMIUM
    extends StObject
       with PrivilegeLevel
  /* 3 */ val PREMIUM: typings.evernote.mod.Types.PrivilegeLevel.PREMIUM & Double = js.native
  
  @js.native
  sealed trait SUPPORT
    extends StObject
       with PrivilegeLevel
  /* 8 */ val SUPPORT: typings.evernote.mod.Types.PrivilegeLevel.SUPPORT & Double = js.native
  
  @js.native
  sealed trait VIP
    extends StObject
       with PrivilegeLevel
  /* 5 */ val VIP: typings.evernote.mod.Types.PrivilegeLevel.VIP & Double = js.native
}
