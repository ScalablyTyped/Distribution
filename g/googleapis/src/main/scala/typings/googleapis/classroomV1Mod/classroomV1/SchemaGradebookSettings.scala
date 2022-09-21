package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGradebookSettings extends StObject {
  
  /**
    * Indicates how the overall grade is calculated.
    */
  var calculationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates who can see the overall grade..
    */
  var displaySetting: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Grade categories that are available for coursework in the course.
    */
  var gradeCategories: js.UndefOr[js.Array[SchemaGradeCategory]] = js.undefined
}
object SchemaGradebookSettings {
  
  inline def apply(): SchemaGradebookSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradebookSettings]
  }
  
  extension [Self <: SchemaGradebookSettings](x: Self) {
    
    inline def setCalculationType(value: String): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setCalculationTypeNull: Self = StObject.set(x, "calculationType", null)
    
    inline def setCalculationTypeUndefined: Self = StObject.set(x, "calculationType", js.undefined)
    
    inline def setDisplaySetting(value: String): Self = StObject.set(x, "displaySetting", value.asInstanceOf[js.Any])
    
    inline def setDisplaySettingNull: Self = StObject.set(x, "displaySetting", null)
    
    inline def setDisplaySettingUndefined: Self = StObject.set(x, "displaySetting", js.undefined)
    
    inline def setGradeCategories(value: js.Array[SchemaGradeCategory]): Self = StObject.set(x, "gradeCategories", value.asInstanceOf[js.Any])
    
    inline def setGradeCategoriesUndefined: Self = StObject.set(x, "gradeCategories", js.undefined)
    
    inline def setGradeCategoriesVarargs(value: SchemaGradeCategory*): Self = StObject.set(x, "gradeCategories", js.Array(value*))
  }
}
