package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SponsoredGroupRole extends js.Object
@JSImport("evernote", "Types.SponsoredGroupRole")
@js.native
object SponsoredGroupRole extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SponsoredGroupRole with Double] = js.native
  
  @js.native
  sealed trait GROUP_ADMIN extends SponsoredGroupRole
  /* 2 */ @js.native
  object GROUP_ADMIN extends TopLevel[GROUP_ADMIN with Double]
  
  @js.native
  sealed trait GROUP_MEMBER extends SponsoredGroupRole
  /* 1 */ @js.native
  object GROUP_MEMBER extends TopLevel[GROUP_MEMBER with Double]
  
  @js.native
  sealed trait GROUP_OWNER extends SponsoredGroupRole
  /* 3 */ @js.native
  object GROUP_OWNER extends TopLevel[GROUP_OWNER with Double]
}
