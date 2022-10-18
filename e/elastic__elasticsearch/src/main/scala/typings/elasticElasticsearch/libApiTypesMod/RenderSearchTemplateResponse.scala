package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSearchTemplateResponse extends StObject {
  
  var template_output: Record[String, Any]
}
object RenderSearchTemplateResponse {
  
  inline def apply(template_output: Record[String, Any]): RenderSearchTemplateResponse = {
    val __obj = js.Dynamic.literal(template_output = template_output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSearchTemplateResponse]
  }
  
  extension [Self <: RenderSearchTemplateResponse](x: Self) {
    
    inline def setTemplate_output(value: Record[String, Any]): Self = StObject.set(x, "template_output", value.asInstanceOf[js.Any])
  }
}
