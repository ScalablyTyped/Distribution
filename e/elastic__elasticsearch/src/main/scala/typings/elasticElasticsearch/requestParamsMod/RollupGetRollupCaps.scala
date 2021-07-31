package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupCaps
  extends StObject
     with Generic {
  
  var id: js.UndefOr[String] = js.undefined
}
object RollupGetRollupCaps {
  
  @scala.inline
  def apply(): RollupGetRollupCaps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGetRollupCaps]
  }
  
  @scala.inline
  implicit class RollupGetRollupCapsMutableBuilder[Self <: RollupGetRollupCaps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
