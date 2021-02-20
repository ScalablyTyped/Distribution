package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrUnfollow extends Generic {
  
  var index: String = js.native
}
object CcrUnfollow {
  
  @scala.inline
  def apply(index: String): CcrUnfollow = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrUnfollow]
  }
  
  @scala.inline
  implicit class CcrUnfollowMutableBuilder[Self <: CcrUnfollow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
