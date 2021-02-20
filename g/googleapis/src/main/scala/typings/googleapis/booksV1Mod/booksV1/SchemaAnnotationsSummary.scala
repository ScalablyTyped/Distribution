package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.LayerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAnnotationsSummary extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[js.Array[LayerId]] = js.native
}
object SchemaAnnotationsSummary {
  
  @scala.inline
  def apply(): SchemaAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationsSummary]
  }
  
  @scala.inline
  implicit class SchemaAnnotationsSummaryMutableBuilder[Self <: SchemaAnnotationsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[LayerId]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: LayerId*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
