package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrResumeAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object CcrResumeAutoFollowPatternRequest {
  
  inline def apply(name: Name): CcrResumeAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrResumeAutoFollowPatternRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrResumeAutoFollowPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
