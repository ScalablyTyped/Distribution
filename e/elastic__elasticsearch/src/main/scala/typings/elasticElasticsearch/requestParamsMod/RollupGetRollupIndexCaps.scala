package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupGetRollupIndexCaps extends Generic {
  
  var index: String = js.native
}
object RollupGetRollupIndexCaps {
  
  @scala.inline
  def apply(index: String): RollupGetRollupIndexCaps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCaps]
  }
  
  @scala.inline
  implicit class RollupGetRollupIndexCapsMutableBuilder[Self <: RollupGetRollupIndexCaps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
