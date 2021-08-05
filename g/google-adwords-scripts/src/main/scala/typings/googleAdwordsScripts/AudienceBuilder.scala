package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudienceBuilder[Audience]
  extends StObject
     with DisplayBuilder[AudienceBuilder[Audience]] {
  
  def withAudience(userList: UserList): AudienceBuilder[Audience]
  
  def withAudienceId(audienceId: Double): AudienceBuilder[Audience]
  
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience]
}
object AudienceBuilder {
  
  inline def apply[Audience](
    build: () => AdWordsOperation[AudienceBuilder[Audience]],
    exclude: () => AdWordsOperation[AudienceBuilder[Audience]],
    withAudience: UserList => AudienceBuilder[Audience],
    withAudienceId: Double => AudienceBuilder[Audience],
    withAudienceType: AudienceType => AudienceBuilder[Audience],
    withCpc: Double => AudienceBuilder[Audience],
    withCpm: Double => AudienceBuilder[Audience]
  ): AudienceBuilder[Audience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withAudienceType = js.Any.fromFunction1(withAudienceType), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[AudienceBuilder[Audience]]
  }
  
  extension [Self <: AudienceBuilder[?], Audience](x: Self & AudienceBuilder[Audience]) {
    
    inline def setWithAudience(value: UserList => AudienceBuilder[Audience]): Self = StObject.set(x, "withAudience", js.Any.fromFunction1(value))
    
    inline def setWithAudienceId(value: Double => AudienceBuilder[Audience]): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithAudienceType(value: AudienceType => AudienceBuilder[Audience]): Self = StObject.set(x, "withAudienceType", js.Any.fromFunction1(value))
  }
}
