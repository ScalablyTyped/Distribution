package typings.ebml.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLBinaryTagSchema
  extends StObject
     with EBMLTagSchemaBase {
  
  var bytesize: js.UndefOr[Double] = js.undefined
}
object EBMLBinaryTagSchema {
  
  inline def apply(description: String, level: Double, name: String, `type`: TagType): EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLBinaryTagSchema]
  }
  
  extension [Self <: EBMLBinaryTagSchema](x: Self) {
    
    inline def setBytesize(value: Double): Self = StObject.set(x, "bytesize", value.asInstanceOf[js.Any])
    
    inline def setBytesizeUndefined: Self = StObject.set(x, "bytesize", js.undefined)
  }
}
