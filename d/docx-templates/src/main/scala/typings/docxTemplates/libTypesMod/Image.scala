package typings.docxTemplates.libTypesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var data: Buffer | js.typedarray.ArrayBuffer | String
  
  var `extension`: ImageExtension
}
object Image {
  
  inline def apply(data: Buffer | js.typedarray.ArrayBuffer | String, `extension`: ImageExtension): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setData(value: Buffer | js.typedarray.ArrayBuffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: ImageExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
