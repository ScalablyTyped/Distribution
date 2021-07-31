package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelatedContentType extends StObject
@JSImport("evernote", "Types.RelatedContentType")
@js.native
object RelatedContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelatedContentType & Double] = js.native
  
  @js.native
  sealed trait NEWS_ARTICLE
    extends StObject
       with RelatedContentType
  /* 1 */ val NEWS_ARTICLE: typings.evernote.mod.Types.RelatedContentType.NEWS_ARTICLE & Double = js.native
  
  @js.native
  sealed trait PROFILE_ORGANIZATION
    extends StObject
       with RelatedContentType
  /* 3 */ val PROFILE_ORGANIZATION: typings.evernote.mod.Types.RelatedContentType.PROFILE_ORGANIZATION & Double = js.native
  
  @js.native
  sealed trait PROFILE_PERSON
    extends StObject
       with RelatedContentType
  /* 2 */ val PROFILE_PERSON: typings.evernote.mod.Types.RelatedContentType.PROFILE_PERSON & Double = js.native
  
  @js.native
  sealed trait REFERENCE_MATERIAL
    extends StObject
       with RelatedContentType
  /* 4 */ val REFERENCE_MATERIAL: typings.evernote.mod.Types.RelatedContentType.REFERENCE_MATERIAL & Double = js.native
}
