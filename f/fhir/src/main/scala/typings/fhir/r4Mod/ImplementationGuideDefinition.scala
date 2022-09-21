package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDefinition
  extends StObject
     with BackboneElement {
  
  /**
    * Groupings are arbitrary sub-divisions of content. Typically, they are used to help build Table of Contents automatically.
    */
  var grouping: js.UndefOr[js.Array[ImplementationGuideDefinitionGrouping]] = js.undefined
  
  /**
    * Pages automatically become sections if they have sub-pages. By convention, the home page is called index.html.
    */
  var page: js.UndefOr[ImplementationGuideDefinitionPage] = js.undefined
  
  /**
    * Defines how IG is built by tools.
    */
  var parameter: js.UndefOr[js.Array[ImplementationGuideDefinitionParameter]] = js.undefined
  
  /**
    * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
    */
  var resource: js.Array[ImplementationGuideDefinitionResource]
  
  /**
    * A template for building resources.
    */
  var template: js.UndefOr[js.Array[ImplementationGuideDefinitionTemplate]] = js.undefined
}
object ImplementationGuideDefinition {
  
  inline def apply(resource: js.Array[ImplementationGuideDefinitionResource]): ImplementationGuideDefinition = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinition]
  }
  
  extension [Self <: ImplementationGuideDefinition](x: Self) {
    
    inline def setGrouping(value: js.Array[ImplementationGuideDefinitionGrouping]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setGroupingVarargs(value: ImplementationGuideDefinitionGrouping*): Self = StObject.set(x, "grouping", js.Array(value*))
    
    inline def setPage(value: ImplementationGuideDefinitionPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setParameter(value: js.Array[ImplementationGuideDefinitionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: ImplementationGuideDefinitionParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setResource(value: js.Array[ImplementationGuideDefinitionResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: ImplementationGuideDefinitionResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setTemplate(value: js.Array[ImplementationGuideDefinitionTemplate]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateVarargs(value: ImplementationGuideDefinitionTemplate*): Self = StObject.set(x, "template", js.Array(value*))
  }
}
