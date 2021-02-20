package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetFilters extends Generic {
  
  var filter_id: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object MlGetFilters {
  
  @scala.inline
  def apply(): MlGetFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetFilters]
  }
  
  @scala.inline
  implicit class MlGetFiltersMutableBuilder[Self <: MlGetFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_idUndefined: Self = StObject.set(x, "filter_id", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
