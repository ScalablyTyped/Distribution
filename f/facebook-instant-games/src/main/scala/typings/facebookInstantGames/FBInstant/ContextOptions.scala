package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextOptions extends StObject {
  
  /**
    * The set of filters to apply to the context suggestions.
    */
  var filters: js.UndefOr[js.Array[ContextFilter]] = js.undefined
  
  /**
    * The maximum number of participants that a suggested context should ideally have.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[Double] = js.undefined
}
object ContextOptions {
  
  @scala.inline
  def apply(): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOptions]
  }
  
  @scala.inline
  implicit class ContextOptionsMutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[ContextFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ContextFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
