package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialurl extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var initial_url: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[StringDictionary[Distributions]] = js.native
  
  var overall_category: js.UndefOr[String] = js.native
}
object Initialurl {
  
  @scala.inline
  def apply(): Initialurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialurl]
  }
  
  @scala.inline
  implicit class InitialurlMutableBuilder[Self <: Initialurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Distributions]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
  }
}
