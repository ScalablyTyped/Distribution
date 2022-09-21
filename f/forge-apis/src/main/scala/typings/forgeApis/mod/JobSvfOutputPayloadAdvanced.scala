package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSvfOutputPayloadAdvanced extends StObject {
  
  var autodeskMaterialProperties: Boolean
  
  var basicMaterialProperties: Boolean
  
  var buildingStoreys: String
  
  var conversionMethod: js.UndefOr[String] = js.undefined
  
  var generateMasterViews: Boolean
  
  var hiddenObjects: Boolean
  
  var materialMode: String
  
  var openingElements: String
  
  var spaces: String
  
  var timelinerProperties: Boolean
}
object JobSvfOutputPayloadAdvanced {
  
  inline def apply(
    autodeskMaterialProperties: Boolean,
    basicMaterialProperties: Boolean,
    buildingStoreys: String,
    generateMasterViews: Boolean,
    hiddenObjects: Boolean,
    materialMode: String,
    openingElements: String,
    spaces: String,
    timelinerProperties: Boolean
  ): JobSvfOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal(autodeskMaterialProperties = autodeskMaterialProperties.asInstanceOf[js.Any], basicMaterialProperties = basicMaterialProperties.asInstanceOf[js.Any], buildingStoreys = buildingStoreys.asInstanceOf[js.Any], generateMasterViews = generateMasterViews.asInstanceOf[js.Any], hiddenObjects = hiddenObjects.asInstanceOf[js.Any], materialMode = materialMode.asInstanceOf[js.Any], openingElements = openingElements.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], timelinerProperties = timelinerProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSvfOutputPayloadAdvanced]
  }
  
  extension [Self <: JobSvfOutputPayloadAdvanced](x: Self) {
    
    inline def setAutodeskMaterialProperties(value: Boolean): Self = StObject.set(x, "autodeskMaterialProperties", value.asInstanceOf[js.Any])
    
    inline def setBasicMaterialProperties(value: Boolean): Self = StObject.set(x, "basicMaterialProperties", value.asInstanceOf[js.Any])
    
    inline def setBuildingStoreys(value: String): Self = StObject.set(x, "buildingStoreys", value.asInstanceOf[js.Any])
    
    inline def setConversionMethod(value: String): Self = StObject.set(x, "conversionMethod", value.asInstanceOf[js.Any])
    
    inline def setConversionMethodUndefined: Self = StObject.set(x, "conversionMethod", js.undefined)
    
    inline def setGenerateMasterViews(value: Boolean): Self = StObject.set(x, "generateMasterViews", value.asInstanceOf[js.Any])
    
    inline def setHiddenObjects(value: Boolean): Self = StObject.set(x, "hiddenObjects", value.asInstanceOf[js.Any])
    
    inline def setMaterialMode(value: String): Self = StObject.set(x, "materialMode", value.asInstanceOf[js.Any])
    
    inline def setOpeningElements(value: String): Self = StObject.set(x, "openingElements", value.asInstanceOf[js.Any])
    
    inline def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setTimelinerProperties(value: Boolean): Self = StObject.set(x, "timelinerProperties", value.asInstanceOf[js.Any])
  }
}
