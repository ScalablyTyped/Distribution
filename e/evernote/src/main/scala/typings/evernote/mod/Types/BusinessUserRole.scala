package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BusinessUserRole extends js.Object

@JSImport("evernote", "Types.BusinessUserRole")
@js.native
object BusinessUserRole extends js.Object {
  @js.native
  sealed trait ADMIN extends BusinessUserRole
  
  @js.native
  sealed trait NORMAL extends BusinessUserRole
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BusinessUserRole with Double] = js.native
  /* 1 */ @js.native
  object ADMIN extends TopLevel[ADMIN with Double]
  
  /* 2 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
}

