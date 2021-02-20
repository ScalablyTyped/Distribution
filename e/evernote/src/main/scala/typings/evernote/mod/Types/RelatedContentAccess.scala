package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelatedContentAccess extends StObject
@JSImport("evernote", "Types.RelatedContentAccess")
@js.native
object RelatedContentAccess extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentAccess with Double] = js.native
  
  @js.native
  sealed trait DIRECT_LINK_ACCESS_OK extends RelatedContentAccess
  /* 1 */ val DIRECT_LINK_ACCESS_OK: typings.evernote.mod.Types.RelatedContentAccess.DIRECT_LINK_ACCESS_OK with Double = js.native
  
  @js.native
  sealed trait DIRECT_LINK_EMBEDDED_VIEW extends RelatedContentAccess
  /* 3 */ val DIRECT_LINK_EMBEDDED_VIEW: typings.evernote.mod.Types.RelatedContentAccess.DIRECT_LINK_EMBEDDED_VIEW with Double = js.native
  
  @js.native
  sealed trait DIRECT_LINK_LOGIN_REQUIRED extends RelatedContentAccess
  /* 2 */ val DIRECT_LINK_LOGIN_REQUIRED: typings.evernote.mod.Types.RelatedContentAccess.DIRECT_LINK_LOGIN_REQUIRED with Double = js.native
  
  @js.native
  sealed trait NOT_ACCESSIBLE extends RelatedContentAccess
  /* 0 */ val NOT_ACCESSIBLE: typings.evernote.mod.Types.RelatedContentAccess.NOT_ACCESSIBLE with Double = js.native
}
