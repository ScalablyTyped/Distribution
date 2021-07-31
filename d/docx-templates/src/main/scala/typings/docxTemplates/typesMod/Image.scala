package typings.docxTemplates.typesMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var data: Buffer | ArrayBuffer | String
  
  var `extension`: ImageExtension
}
object Image {
  
  @scala.inline
  def apply(data: Buffer | ArrayBuffer | String, `extension`: ImageExtension): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer | ArrayBuffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: ImageExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
