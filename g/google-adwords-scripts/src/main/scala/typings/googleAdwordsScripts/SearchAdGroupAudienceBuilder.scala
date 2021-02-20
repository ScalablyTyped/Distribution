package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience] extends AdWordsBuilder[SearchAdGroupAudience] {
  
  def exclude(): AdWordsOperation[SearchAdGroupAudience] = js.native
  
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  
  def withAudienceId(audienceId: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  
  def withBidModifier(modifier: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
}
object SearchAdGroupAudienceBuilder {
  
  @scala.inline
  def apply[SearchAdGroupAudience](
    build: () => AdWordsOperation[SearchAdGroupAudience],
    exclude: () => AdWordsOperation[SearchAdGroupAudience],
    withAudience: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withAudienceId: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withBidModifier: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
  
  @scala.inline
  implicit class SearchAdGroupAudienceBuilderMutableBuilder[Self <: SearchAdGroupAudienceBuilder[_], SearchAdGroupAudience] (val x: Self with SearchAdGroupAudienceBuilder[SearchAdGroupAudience]) extends AnyVal {
    
    @scala.inline
    def setExclude(value: () => AdWordsOperation[SearchAdGroupAudience]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithAudience(value: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithAudienceId(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithBidModifier(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
