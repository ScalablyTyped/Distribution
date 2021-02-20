package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrPauseAutoFollowPattern extends Generic {
  
  var name: String = js.native
}
object CcrPauseAutoFollowPattern {
  
  @scala.inline
  def apply(name: String): CcrPauseAutoFollowPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPauseAutoFollowPattern]
  }
  
  @scala.inline
  implicit class CcrPauseAutoFollowPatternMutableBuilder[Self <: CcrPauseAutoFollowPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
