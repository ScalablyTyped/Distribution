package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobs
  extends StObject
     with Generic {
  
  var id: js.UndefOr[String] = js.undefined
}
object RollupGetJobs {
  
  @scala.inline
  def apply(): RollupGetJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGetJobs]
  }
  
  @scala.inline
  implicit class RollupGetJobsMutableBuilder[Self <: RollupGetJobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
