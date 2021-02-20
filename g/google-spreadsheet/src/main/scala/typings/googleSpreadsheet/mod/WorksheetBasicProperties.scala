package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetBasicProperties extends StObject {
  
  /**
    * @description
    * additional properties of the worksheet if this sheet is a grid
    */
  var gridProperties: js.UndefOr[WorksheetGridProperties] = js.native
  
  // #region BASIC PROPERTIES
  /* separates basic (editable) properties as they are used as inputs to various methods
    * non-basic properties should be added to the extending interface below
    */
  /**
    * @description
    * first row values
    * - used in row-based interactions
    * - defines the dynamic properties of the Worksheet's GoogleSpreadsheetRows
    */
  var headerValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @description
    * true if the worksheet is hidden in the UI, false if it's visible
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * @description
    * tab index in the worksheet doc (based on rightToLeft property)
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * @description
    * true if the worksheet is an RTL sheet instead of an LTR sheet
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * @description
    * the color of the worksheet tab
    */
  var tabColor: js.UndefOr[Color] = js.native
  
  /**
    * @description
    * name of the worksheet tab
    */
  var title: js.UndefOr[String] = js.native
}
object WorksheetBasicProperties {
  
  @scala.inline
  def apply(): WorksheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetBasicProperties]
  }
  
  @scala.inline
  implicit class WorksheetBasicPropertiesMutableBuilder[Self <: WorksheetBasicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridProperties(value: WorksheetGridProperties): Self = StObject.set(x, "gridProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPropertiesUndefined: Self = StObject.set(x, "gridProperties", js.undefined)
    
    @scala.inline
    def setHeaderValues(value: js.Array[String]): Self = StObject.set(x, "headerValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValuesUndefined: Self = StObject.set(x, "headerValues", js.undefined)
    
    @scala.inline
    def setHeaderValuesVarargs(value: String*): Self = StObject.set(x, "headerValues", js.Array(value :_*))
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
    
    @scala.inline
    def setTabColor(value: Color): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
