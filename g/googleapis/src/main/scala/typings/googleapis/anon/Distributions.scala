package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distributions extends StObject {
  
  var category: js.UndefOr[String] = js.native
  
  var distributions: js.UndefOr[js.Array[Max]] = js.native
  
  var median: js.UndefOr[Double] = js.native
}
object Distributions {
  
  @scala.inline
  def apply(): Distributions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distributions]
  }
  
  @scala.inline
  implicit class DistributionsMutableBuilder[Self <: Distributions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDistributions(value: js.Array[Max]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: Max*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    @scala.inline
    def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
  }
}
