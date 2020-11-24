package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.clause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClauseBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  
  @JSName("aoid")
  var aoid_ClauseBiblioEntry: String = js.native
  
  @JSName("id")
  var id_ClauseBiblioEntry: String = js.native
  
  @JSName("number")
  var number_ClauseBiblioEntry: String | Double = js.native
  
  var titleHTML: String = js.native
  
  @JSName("title")
  var title_ClauseBiblioEntry: String = js.native
  
  @JSName("type")
  var type_ClauseBiblioEntry: clause = js.native
}
object ClauseBiblioEntry {
  
  @scala.inline
  def apply(
    aoid: String,
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    title: String,
    titleHTML: String,
    `type`: clause
  ): ClauseBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClauseBiblioEntry]
  }
  
  @scala.inline
  implicit class ClauseBiblioEntryOps[Self <: ClauseBiblioEntry] (val x: Self) extends AnyVal {
    
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
    def setAoid(value: String): Self = this.set("aoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String | Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHTML(value: String): Self = this.set("titleHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: clause): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
