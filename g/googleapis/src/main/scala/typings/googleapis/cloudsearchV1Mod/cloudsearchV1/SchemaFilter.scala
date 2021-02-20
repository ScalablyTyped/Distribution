package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic way of expressing filters in a query, which supports two
  * approaches: &lt;br/&gt;&lt;br/&gt; **1. Setting a ValueFilter.** The name
  * must match an operator_name defined in the schema for your data source.
  * &lt;br/&gt; **2. Setting a CompositeFilter.** The filters are evaluated
  * using the logical operator. The top-level operators can only be either an
  * AND or a NOT. AND can appear only at the top-most level. OR can appear only
  * under a top-level AND.
  */
@js.native
trait SchemaFilter extends StObject {
  
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  
  var valueFilter: js.UndefOr[SchemaValueFilter] = js.native
}
object SchemaFilter {
  
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  @scala.inline
  implicit class SchemaFilterMutableBuilder[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeFilter(value: SchemaCompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    @scala.inline
    def setValueFilter(value: SchemaValueFilter): Self = StObject.set(x, "valueFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFilterUndefined: Self = StObject.set(x, "valueFilter", js.undefined)
  }
}
