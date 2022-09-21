package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryAnnotationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID for the annotation to delete.
    */
  var annotationId: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryAnnotationsDelete {
  
  inline def apply(): ParamsResourceMylibraryAnnotationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsDelete]
  }
  
  extension [Self <: ParamsResourceMylibraryAnnotationsDelete](x: Self) {
    
    inline def setAnnotationId(value: String): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
