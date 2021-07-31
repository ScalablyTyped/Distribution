package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupStartJob
  extends StObject
     with Generic {
  
  var id: String
}
object RollupStartJob {
  
  @scala.inline
  def apply(id: String): RollupStartJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStartJob]
  }
  
  @scala.inline
  implicit class RollupStartJobMutableBuilder[Self <: RollupStartJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
