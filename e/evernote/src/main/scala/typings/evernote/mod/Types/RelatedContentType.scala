package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelatedContentType extends StObject
@JSImport("evernote", "Types.RelatedContentType")
@js.native
object RelatedContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentType with Double] = js.native
  
  @js.native
  sealed trait NEWS_ARTICLE extends RelatedContentType
  /* 1 */ val NEWS_ARTICLE: typings.evernote.mod.Types.RelatedContentType.NEWS_ARTICLE with Double = js.native
  
  @js.native
  sealed trait PROFILE_ORGANIZATION extends RelatedContentType
  /* 3 */ val PROFILE_ORGANIZATION: typings.evernote.mod.Types.RelatedContentType.PROFILE_ORGANIZATION with Double = js.native
  
  @js.native
  sealed trait PROFILE_PERSON extends RelatedContentType
  /* 2 */ val PROFILE_PERSON: typings.evernote.mod.Types.RelatedContentType.PROFILE_PERSON with Double = js.native
  
  @js.native
  sealed trait REFERENCE_MATERIAL extends RelatedContentType
  /* 4 */ val REFERENCE_MATERIAL: typings.evernote.mod.Types.RelatedContentType.REFERENCE_MATERIAL with Double = js.native
}
