package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SponsoredGroupRole extends js.Object

@JSImport("evernote", "Types.SponsoredGroupRole")
@js.native
object SponsoredGroupRole extends js.Object {
  @js.native
  sealed trait GROUP_ADMIN extends SponsoredGroupRole
  
  @js.native
  sealed trait GROUP_MEMBER extends SponsoredGroupRole
  
  @js.native
  sealed trait GROUP_OWNER extends SponsoredGroupRole
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SponsoredGroupRole with Double] = js.native
  /* 2 */ @js.native
  object GROUP_ADMIN extends TopLevel[GROUP_ADMIN with Double]
  
  /* 1 */ @js.native
  object GROUP_MEMBER extends TopLevel[GROUP_MEMBER with Double]
  
  /* 3 */ @js.native
  object GROUP_OWNER extends TopLevel[GROUP_OWNER with Double]
  
}

