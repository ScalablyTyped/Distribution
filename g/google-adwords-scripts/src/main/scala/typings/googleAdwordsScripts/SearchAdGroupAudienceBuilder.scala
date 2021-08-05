package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  extends StObject
     with AdWordsBuilder[SearchAdGroupAudience] {
  
  def exclude(): AdWordsOperation[SearchAdGroupAudience]
  
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  
  def withAudienceId(audienceId: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  
  def withBidModifier(modifier: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
}
object SearchAdGroupAudienceBuilder {
  
  inline def apply[SearchAdGroupAudience](
    build: () => AdWordsOperation[SearchAdGroupAudience],
    exclude: () => AdWordsOperation[SearchAdGroupAudience],
    withAudience: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withAudienceId: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withBidModifier: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
  
  extension [Self <: SearchAdGroupAudienceBuilder[?], SearchAdGroupAudience](x: Self & SearchAdGroupAudienceBuilder[SearchAdGroupAudience]) {
    
    inline def setExclude(value: () => AdWordsOperation[SearchAdGroupAudience]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAudience(value: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithBidModifier(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "withBidModifier", js.Any.fromFunction1(value))
  }
}
