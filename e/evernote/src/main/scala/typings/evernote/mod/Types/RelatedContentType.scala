package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelatedContentType extends js.Object
@JSImport("evernote", "Types.RelatedContentType")
@js.native
object RelatedContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentType with Double] = js.native
  
  @js.native
  sealed trait NEWS_ARTICLE extends RelatedContentType
  /* 1 */ @js.native
  object NEWS_ARTICLE extends TopLevel[NEWS_ARTICLE with Double]
  
  @js.native
  sealed trait PROFILE_ORGANIZATION extends RelatedContentType
  /* 3 */ @js.native
  object PROFILE_ORGANIZATION extends TopLevel[PROFILE_ORGANIZATION with Double]
  
  @js.native
  sealed trait PROFILE_PERSON extends RelatedContentType
  /* 2 */ @js.native
  object PROFILE_PERSON extends TopLevel[PROFILE_PERSON with Double]
  
  @js.native
  sealed trait REFERENCE_MATERIAL extends RelatedContentType
  /* 4 */ @js.native
  object REFERENCE_MATERIAL extends TopLevel[REFERENCE_MATERIAL with Double]
}
