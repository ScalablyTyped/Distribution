package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SponsoredGroupRole extends StObject
@JSImport("evernote", "Types.SponsoredGroupRole")
@js.native
object SponsoredGroupRole extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SponsoredGroupRole & Double] = js.native
  
  @js.native
  sealed trait GROUP_ADMIN
    extends StObject
       with SponsoredGroupRole
  /* 2 */ val GROUP_ADMIN: typings.evernote.mod.Types.SponsoredGroupRole.GROUP_ADMIN & Double = js.native
  
  @js.native
  sealed trait GROUP_MEMBER
    extends StObject
       with SponsoredGroupRole
  /* 1 */ val GROUP_MEMBER: typings.evernote.mod.Types.SponsoredGroupRole.GROUP_MEMBER & Double = js.native
  
  @js.native
  sealed trait GROUP_OWNER
    extends StObject
       with SponsoredGroupRole
  /* 3 */ val GROUP_OWNER: typings.evernote.mod.Types.SponsoredGroupRole.GROUP_OWNER & Double = js.native
}
