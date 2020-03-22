package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelatedContentAccess extends js.Object

@JSImport("evernote", "Types.RelatedContentAccess")
@js.native
object RelatedContentAccess extends js.Object {
  @js.native
  sealed trait DIRECT_LINK_ACCESS_OK extends RelatedContentAccess
  
  @js.native
  sealed trait DIRECT_LINK_EMBEDDED_VIEW extends RelatedContentAccess
  
  @js.native
  sealed trait DIRECT_LINK_LOGIN_REQUIRED extends RelatedContentAccess
  
  @js.native
  sealed trait NOT_ACCESSIBLE extends RelatedContentAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentAccess with Double] = js.native
  /* 1 */ @js.native
  object DIRECT_LINK_ACCESS_OK extends TopLevel[DIRECT_LINK_ACCESS_OK with Double]
  
  /* 3 */ @js.native
  object DIRECT_LINK_EMBEDDED_VIEW extends TopLevel[DIRECT_LINK_EMBEDDED_VIEW with Double]
  
  /* 2 */ @js.native
  object DIRECT_LINK_LOGIN_REQUIRED extends TopLevel[DIRECT_LINK_LOGIN_REQUIRED with Double]
  
  /* 0 */ @js.native
  object NOT_ACCESSIBLE extends TopLevel[NOT_ACCESSIBLE with Double]
  
}

