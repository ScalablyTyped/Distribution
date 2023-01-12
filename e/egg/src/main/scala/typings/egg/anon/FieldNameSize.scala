package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldNameSize extends StObject {
  
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  
  var fieldSize: js.UndefOr[Double] = js.undefined
  
  var fields: js.UndefOr[Double] = js.undefined
  
  var fileSize: js.UndefOr[Double] = js.undefined
  
  var files: js.UndefOr[Double] = js.undefined
  
  var headerPairs: js.UndefOr[Double] = js.undefined
  
  var parts: js.UndefOr[Double] = js.undefined
}
object FieldNameSize {
  
  inline def apply(): FieldNameSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldNameSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
    
    inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
    
    inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
    
    inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
    
    inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
    
    inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
    
    inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
    
    inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
  }
}
