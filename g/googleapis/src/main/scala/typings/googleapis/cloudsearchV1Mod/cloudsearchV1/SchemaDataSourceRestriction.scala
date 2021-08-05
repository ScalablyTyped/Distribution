package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Restriction on Datasource.
  */
trait SchemaDataSourceRestriction extends StObject {
  
  /**
    * Filter options restricting the results. If multiple filters are present,
    * they are grouped by object type before joining. Filters with the same
    * object type are joined conjunctively, then the resulting expressions are
    * joined disjunctively.  The maximum number of elements is 20.
    */
  var filterOptions: js.UndefOr[js.Array[SchemaFilterOptions]] = js.undefined
  
  /**
    * The source of restriction.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaDataSourceRestriction {
  
  inline def apply(): SchemaDataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRestriction]
  }
  
  extension [Self <: SchemaDataSourceRestriction](x: Self) {
    
    inline def setFilterOptions(value: js.Array[SchemaFilterOptions]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    inline def setFilterOptionsVarargs(value: SchemaFilterOptions*): Self = StObject.set(x, "filterOptions", js.Array(value :_*))
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
