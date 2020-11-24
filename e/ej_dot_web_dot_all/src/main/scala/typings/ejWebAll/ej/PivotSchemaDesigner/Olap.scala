package typings.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Olap extends js.Object {
  
  /** Allows the user to view the KPI elements in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {false}
    */
  var showKPI: js.UndefOr[Boolean] = js.native
  
  /** Allows the user to view the named sets in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {false}
    */
  var showNamedSets: js.UndefOr[Boolean] = js.native
}
object Olap {
  
  @scala.inline
  def apply(): Olap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Olap]
  }
  
  @scala.inline
  implicit class OlapOps[Self <: Olap] (val x: Self) extends AnyVal {
    
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
    def setShowKPI(value: Boolean): Self = this.set("showKPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowKPI: Self = this.set("showKPI", js.undefined)
    
    @scala.inline
    def setShowNamedSets(value: Boolean): Self = this.set("showNamedSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNamedSets: Self = this.set("showNamedSets", js.undefined)
  }
}
