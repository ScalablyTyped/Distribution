package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrResumeAutoFollowPattern
  extends StObject
     with Generic {
  
  var name: String
}
object CcrResumeAutoFollowPattern {
  
  @scala.inline
  def apply(name: String): CcrResumeAutoFollowPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrResumeAutoFollowPattern]
  }
  
  @scala.inline
  implicit class CcrResumeAutoFollowPatternMutableBuilder[Self <: CcrResumeAutoFollowPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
