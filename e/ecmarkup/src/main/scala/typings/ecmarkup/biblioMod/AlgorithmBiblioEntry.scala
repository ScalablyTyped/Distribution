package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  
  @JSName("aoid")
  var aoid_AlgorithmBiblioEntry: String = js.native
  
  @JSName("type")
  var type_AlgorithmBiblioEntry: op = js.native
}
object AlgorithmBiblioEntry {
  
  @scala.inline
  def apply(aoid: String, referencingIds: js.Array[String], `type`: op): AlgorithmBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmBiblioEntry]
  }
  
  @scala.inline
  implicit class AlgorithmBiblioEntryOps[Self <: AlgorithmBiblioEntry] (val x: Self) extends AnyVal {
    
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
    def setType(value: op): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
