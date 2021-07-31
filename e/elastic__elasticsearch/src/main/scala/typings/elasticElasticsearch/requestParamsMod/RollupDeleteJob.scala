package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupDeleteJob
  extends StObject
     with Generic {
  
  var id: String
}
object RollupDeleteJob {
  
  @scala.inline
  def apply(id: String): RollupDeleteJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupDeleteJob]
  }
  
  @scala.inline
  implicit class RollupDeleteJobMutableBuilder[Self <: RollupDeleteJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
