package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCourseMaterialSet extends StObject {
  
  /**
    * Materials attached to this set.
    */
  var materials: js.UndefOr[js.Array[SchemaCourseMaterial]] = js.undefined
  
  /**
    * Title for this set.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaCourseMaterialSet {
  
  inline def apply(): SchemaCourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterialSet]
  }
  
  extension [Self <: SchemaCourseMaterialSet](x: Self) {
    
    inline def setMaterials(value: js.Array[SchemaCourseMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: SchemaCourseMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
