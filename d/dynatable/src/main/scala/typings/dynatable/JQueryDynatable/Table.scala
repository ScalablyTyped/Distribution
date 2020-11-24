package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends js.Object {
  
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
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBodyRowSelector(value: String): Self = this.set("bodyRowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyRowSelector: Self = this.set("bodyRowSelector", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDefaultColumnIdStyle(value: String): Self = this.set("defaultColumnIdStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumnIdStyle: Self = this.set("defaultColumnIdStyle", js.undefined)
    
    @scala.inline
    def setHeadRowClass(value: String): Self = this.set("headRowClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadRowClass: Self = this.set("headRowClass", js.undefined)
    
    @scala.inline
    def setHeadRowSelector(value: String): Self = this.set("headRowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadRowSelector: Self = this.set("headRowSelector", js.undefined)
  }
}
