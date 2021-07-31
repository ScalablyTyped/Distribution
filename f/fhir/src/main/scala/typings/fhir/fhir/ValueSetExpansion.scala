package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used when the value set is "expanded"
  */
trait ValueSetExpansion
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.undefined
  
  /**
    * Codes in the value set
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  
  /**
    * Uniquely identifies this expansion
    */
  var identifier: uri
  
  /**
    * Offset at which this resource starts
    */
  var offset: js.UndefOr[integer] = js.undefined
  
  /**
    * Parameter that controlled the expansion process
    */
  var parameter: js.UndefOr[js.Array[ValueSetExpansionParameter]] = js.undefined
  
  /**
    * Time ValueSet expansion happened
    */
  var timestamp: dateTime
  
  /**
    * Total number of codes in the expansion
    */
  var total: js.UndefOr[integer] = js.undefined
}
object ValueSetExpansion {
  
  @scala.inline
  def apply(identifier: uri, timestamp: dateTime): ValueSetExpansion = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansion]
  }
  
  @scala.inline
  implicit class ValueSetExpansionMutableBuilder[Self <: ValueSetExpansion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: js.Array[ValueSetExpansionContains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setContainsVarargs(value: ValueSetExpansionContains*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: uri): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setParameter(value: js.Array[ValueSetExpansionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: ValueSetExpansionParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: dateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def set_identifier(value: Element): Self = StObject.set(x, "_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_identifierUndefined: Self = StObject.set(x, "_identifier", js.undefined)
    
    @scala.inline
    def set_offset(value: Element): Self = StObject.set(x, "_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_offsetUndefined: Self = StObject.set(x, "_offset", js.undefined)
    
    @scala.inline
    def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
    
    @scala.inline
    def set_total(value: Element): Self = StObject.set(x, "_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_totalUndefined: Self = StObject.set(x, "_total", js.undefined)
  }
}
