package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesExpansion
  extends StObject
     with BackboneElement {
  
  var _hierarchical: js.UndefOr[Element] = js.undefined
  
  var _incomplete: js.UndefOr[Element] = js.undefined
  
  var _paging: js.UndefOr[Element] = js.undefined
  
  var _textFilter: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the server can return nested value sets.
    */
  var hierarchical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow request for incomplete expansions?
    */
  var incomplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the server supports paging on expansion.
    */
  var paging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Supported expansion parameter.
    */
  var parameter: js.UndefOr[js.Array[TerminologyCapabilitiesExpansionParameter]] = js.undefined
  
  /**
    * This documentation should cover things like case sensitivity,  use of punctuation if not ignored, what wild cards are supported (if any), whether text is starts with or contains, and whether word order matters.
    */
  var textFilter: js.UndefOr[String] = js.undefined
}
object TerminologyCapabilitiesExpansion {
  
  inline def apply(): TerminologyCapabilitiesExpansion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyCapabilitiesExpansion]
  }
  
  extension [Self <: TerminologyCapabilitiesExpansion](x: Self) {
    
    inline def setHierarchical(value: Boolean): Self = StObject.set(x, "hierarchical", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalUndefined: Self = StObject.set(x, "hierarchical", js.undefined)
    
    inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
    
    inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setParameter(value: js.Array[TerminologyCapabilitiesExpansionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: TerminologyCapabilitiesExpansionParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setTextFilter(value: String): Self = StObject.set(x, "textFilter", value.asInstanceOf[js.Any])
    
    inline def setTextFilterUndefined: Self = StObject.set(x, "textFilter", js.undefined)
    
    inline def set_hierarchical(value: Element): Self = StObject.set(x, "_hierarchical", value.asInstanceOf[js.Any])
    
    inline def set_hierarchicalUndefined: Self = StObject.set(x, "_hierarchical", js.undefined)
    
    inline def set_incomplete(value: Element): Self = StObject.set(x, "_incomplete", value.asInstanceOf[js.Any])
    
    inline def set_incompleteUndefined: Self = StObject.set(x, "_incomplete", js.undefined)
    
    inline def set_paging(value: Element): Self = StObject.set(x, "_paging", value.asInstanceOf[js.Any])
    
    inline def set_pagingUndefined: Self = StObject.set(x, "_paging", js.undefined)
    
    inline def set_textFilter(value: Element): Self = StObject.set(x, "_textFilter", value.asInstanceOf[js.Any])
    
    inline def set_textFilterUndefined: Self = StObject.set(x, "_textFilter", js.undefined)
  }
}
