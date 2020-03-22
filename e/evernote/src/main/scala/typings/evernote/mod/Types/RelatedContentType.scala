package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelatedContentType extends js.Object

@JSImport("evernote", "Types.RelatedContentType")
@js.native
object RelatedContentType extends js.Object {
  @js.native
  sealed trait NEWS_ARTICLE extends RelatedContentType
  
  @js.native
  sealed trait PROFILE_ORGANIZATION extends RelatedContentType
  
  @js.native
  sealed trait PROFILE_PERSON extends RelatedContentType
  
  @js.native
  sealed trait REFERENCE_MATERIAL extends RelatedContentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentType with Double] = js.native
  /* 1 */ @js.native
  object NEWS_ARTICLE extends TopLevel[NEWS_ARTICLE with Double]
  
  /* 3 */ @js.native
  object PROFILE_ORGANIZATION extends TopLevel[PROFILE_ORGANIZATION with Double]
  
  /* 2 */ @js.native
  object PROFILE_PERSON extends TopLevel[PROFILE_PERSON with Double]
  
  /* 4 */ @js.native
  object REFERENCE_MATERIAL extends TopLevel[REFERENCE_MATERIAL with Double]
  
}

