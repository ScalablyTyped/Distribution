package typings.ebml.mod

import typings.ebml.ebmlStrings.f
import typings.ebml.ebmlStrings.i
import typings.ebml.ebmlStrings.s
import typings.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ebml.mod.EBMLTagSchemaBase
  - typings.ebml.mod.EBMLNumericTagSchema
  - typings.ebml.mod.EBMLStringValueTagSchema
  - typings.ebml.mod.EBMLBinaryTagSchema
*/
trait EBMLTagSchema extends js.Object
object EBMLTagSchema {
  
  @scala.inline
  def EBMLTagSchemaBase(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLNumericTagSchema(description: String, level: Double, name: String, range: String, `type`: u | i | f): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLStringValueTagSchema(description: String, level: Double, name: String, `type`: s): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLBinaryTagSchema(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
}
