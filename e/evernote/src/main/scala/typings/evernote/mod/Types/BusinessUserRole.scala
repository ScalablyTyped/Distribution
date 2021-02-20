package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusinessUserRole extends StObject
@JSImport("evernote", "Types.BusinessUserRole")
@js.native
object BusinessUserRole extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessUserRole with Double] = js.native
  
  @js.native
  sealed trait ADMIN extends BusinessUserRole
  /* 1 */ val ADMIN: typings.evernote.mod.Types.BusinessUserRole.ADMIN with Double = js.native
  
  @js.native
  sealed trait NORMAL extends BusinessUserRole
  /* 2 */ val NORMAL: typings.evernote.mod.Types.BusinessUserRole.NORMAL with Double = js.native
}
