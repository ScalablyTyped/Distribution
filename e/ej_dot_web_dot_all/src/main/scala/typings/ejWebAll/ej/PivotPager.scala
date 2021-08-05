package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotPager
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** This function initializes the page counts and page numbers for the PivotPager.
    * @returns {void}
    */
  def initPagerProperties(): Unit = js.native
  
  @JSName("model")
  var model_PivotPager: Model = js.native
}
object PivotPager {
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("ej.PivotPager.Mode")
  @js.native
  object Mode extends StObject {
    
    ///To set both categorical and series pager for paging.
    @js.native
    sealed trait Both
      extends StObject
         with Mode
    
    ///To set only categorical pager for paging.
    @js.native
    sealed trait Categorical
      extends StObject
         with Mode
    
    ///To set only series pager for paging.
    @js.native
    sealed trait Series
      extends StObject
         with Mode
  }
  
  trait Model extends StObject {
    
    /** Contains the current page number in categorical axis.
      * @Default {1}
      */
    var categoricalCurrentPage: js.UndefOr[Double] = js.undefined
    
    /** Contains the total page count in categorical axis.
      * @Default {1}
      */
    var categoricalPageCount: js.UndefOr[Double] = js.undefined
    
    /** Allows the user to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the pager mode (Only Categorical Pager/Only Series Pager/Both) for the PivotPager.
      * @Default {ej.PivotPager.Mode.Both}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** Contains the current page number in series axis.
      * @Default {1}
      */
    var seriesCurrentPage: js.UndefOr[Double] = js.undefined
    
    /** Contains the total page count in series axis.
      * @Default {1}
      */
    var seriesPageCount: js.UndefOr[Double] = js.undefined
    
    /** Contains the ID of the target element for which paging needs to be done.
      * @Default {â€œâ€}
      */
    var targetControlID: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.PivotPager.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotPager.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.PivotPager.Model](x: Self) {
      
      inline def setCategoricalCurrentPage(value: Double): Self = StObject.set(x, "categoricalCurrentPage", value.asInstanceOf[js.Any])
      
      inline def setCategoricalCurrentPageUndefined: Self = StObject.set(x, "categoricalCurrentPage", js.undefined)
      
      inline def setCategoricalPageCount(value: Double): Self = StObject.set(x, "categoricalPageCount", value.asInstanceOf[js.Any])
      
      inline def setCategoricalPageCountUndefined: Self = StObject.set(x, "categoricalPageCount", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSeriesCurrentPage(value: Double): Self = StObject.set(x, "seriesCurrentPage", value.asInstanceOf[js.Any])
      
      inline def setSeriesCurrentPageUndefined: Self = StObject.set(x, "seriesCurrentPage", js.undefined)
      
      inline def setSeriesPageCount(value: Double): Self = StObject.set(x, "seriesPageCount", value.asInstanceOf[js.Any])
      
      inline def setSeriesPageCountUndefined: Self = StObject.set(x, "seriesPageCount", js.undefined)
      
      inline def setTargetControlID(value: String): Self = StObject.set(x, "targetControlID", value.asInstanceOf[js.Any])
      
      inline def setTargetControlIDUndefined: Self = StObject.set(x, "targetControlID", js.undefined)
    }
  }
}
