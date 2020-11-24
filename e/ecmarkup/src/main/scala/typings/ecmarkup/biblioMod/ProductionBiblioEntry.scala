package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  
  @JSName("name")
  var name_ProductionBiblioEntry: String = js.native
  
  @JSName("type")
  var type_ProductionBiblioEntry: production = js.native
}
object ProductionBiblioEntry {
  
  @scala.inline
  def apply(name: String, referencingIds: js.Array[String], `type`: production): ProductionBiblioEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionBiblioEntry]
  }
  
  @scala.inline
  implicit class ProductionBiblioEntryOps[Self <: ProductionBiblioEntry] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: production): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
