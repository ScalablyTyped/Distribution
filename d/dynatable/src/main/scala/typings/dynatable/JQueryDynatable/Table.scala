package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  /**
    * Selector used by dynatable in order to find the table body rows
    *
    * @default 'tbody tr'
    */
  var bodyRowSelector: js.UndefOr[String] = js.native
  
  /** Generated internally by the plugin, will be reset by the DomColumns at init */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  
  /**
    * By default, dynatable converts headings to JSON attribute names using:
    *
    * @enum('camelCase', 'trimDash', 'dashed', 'underscore', 'lowercase')
    * @default 'camelCase'
    * @see http://www.dynatable.com/#converting-attribute-names
    *
    * @example
    * // Given the html `<th>Favorite Music</th>` column header
    * // `camelCase` would translate it to id `favoriteMusic`
    * // `trimDash` would translate it to id `Favorite-Music`
    * // `dashed` would translate it to id `favorite-music`
    * // `underscore` would translate it to id `favorite_music`
    * // `lowercase` would translate it to id `favorite music`
    */
  var defaultColumnIdStyle: js.UndefOr[String] = js.native
  
  /**
    * Optional classname that can be added by dynatable to the header cells
    *
    * @default null
    */
  var headRowClass: js.UndefOr[String] = js.native
  
  /**
    * Selector used by dynatable in order to find the table header row
    *
    * @default 'thead tr'
    */
  var headRowSelector: js.UndefOr[String] = js.native
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyRowSelector(value: String): Self = StObject.set(x, "bodyRowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyRowSelectorUndefined: Self = StObject.set(x, "bodyRowSelector", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDefaultColumnIdStyle(value: String): Self = StObject.set(x, "defaultColumnIdStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumnIdStyleUndefined: Self = StObject.set(x, "defaultColumnIdStyle", js.undefined)
    
    @scala.inline
    def setHeadRowClass(value: String): Self = StObject.set(x, "headRowClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadRowClassUndefined: Self = StObject.set(x, "headRowClass", js.undefined)
    
    @scala.inline
    def setHeadRowSelector(value: String): Self = StObject.set(x, "headRowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadRowSelectorUndefined: Self = StObject.set(x, "headRowSelector", js.undefined)
  }
}
