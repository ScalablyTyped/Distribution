package typings.ebml.mod

import typings.ebml.ebmlStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLStringValueTagSchema extends EBMLDefaultableTagSchema {
  
  @JSName("type")
  var type_EBMLStringValueTagSchema: s = js.native
}
object EBMLStringValueTagSchema {
  
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: s): EBMLStringValueTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLStringValueTagSchema]
  }
  
  @scala.inline
  implicit class EBMLStringValueTagSchemaMutableBuilder[Self <: EBMLStringValueTagSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: s): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
