package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Population criteria group
  */
trait MeasureGroup
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Summary description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier
    */
  var identifier: Identifier
  
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Population criteria
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  
  /**
    * Stratifier criteria for the measure
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.undefined
}
object MeasureGroup {
  
  inline def apply(identifier: Identifier): MeasureGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroup]
  }
  
  extension [Self <: MeasureGroup](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureGroupPopulation*): Self = StObject.set(x, "population", js.Array(value :_*))
    
    inline def setStratifier(value: js.Array[MeasureGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value :_*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
