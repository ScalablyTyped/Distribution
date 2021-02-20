package typings.ebml.mod

import typings.ebml.ebmlStrings.f
import typings.ebml.ebmlStrings.i
import typings.ebml.ebmlStrings.u
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLNumericTagSchema extends EBMLDefaultableTagSchema {
  
  var br: js.UndefOr[
    String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
  ] = js.native
  
  var range: String = js.native
  
  @JSName("type")
  var type_EBMLNumericTagSchema: u | i | f = js.native
}
object EBMLNumericTagSchema {
  
  @scala.inline
  def apply(description: String, level: Double, name: String, range: String, `type`: u | i | f): EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLNumericTagSchema]
  }
  
  @scala.inline
  implicit class EBMLNumericTagSchemaMutableBuilder[Self <: EBMLNumericTagSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBr(
      value: String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
    ): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: u | i | f): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
