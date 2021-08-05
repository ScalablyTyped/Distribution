package typings.ebml.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBMLDefaultableTagSchema
  extends StObject
     with EBMLTagSchemaBase {
  
  var default: js.UndefOr[js.Any] = js.undefined
}
object EBMLDefaultableTagSchema {
  
  inline def apply(description: String, level: Double, name: String, `type`: TagType): EBMLDefaultableTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLDefaultableTagSchema]
  }
  
  extension [Self <: EBMLDefaultableTagSchema](x: Self) {
    
    inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
