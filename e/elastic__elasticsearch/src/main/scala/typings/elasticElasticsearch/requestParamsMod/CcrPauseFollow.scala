package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrPauseFollow extends Generic {
  
  var index: String = js.native
}
object CcrPauseFollow {
  
  @scala.inline
  def apply(index: String): CcrPauseFollow = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPauseFollow]
  }
  
  @scala.inline
  implicit class CcrPauseFollowMutableBuilder[Self <: CcrPauseFollow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
