package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  
  def getTargetingSetting(): String = js.native
  
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit = js.native
}
object AdGroupTargeting {
  
  @scala.inline
  def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: () => AdWordsSelector[SearchAdGroupAudience],
    exculdedAudiences: () => AdWordsSelector[SearchAdGroupExcludedAudience],
    getTargetingSetting: () => String,
    newUserListBuilder: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Unit
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences), getTargetingSetting = js.Any.fromFunction0(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting))
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
  
  @scala.inline
  implicit class AdGroupTargetingMutableBuilder[Self <: AdGroupTargeting[_, _], SearchAdGroupAudience, SearchAdGroupExcludedAudience] (val x: Self with (AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience])) extends AnyVal {
    
    @scala.inline
    def setGetTargetingSetting(value: () => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserListBuilder(value: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self = StObject.set(x, "newUserListBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2(value))
  }
}
