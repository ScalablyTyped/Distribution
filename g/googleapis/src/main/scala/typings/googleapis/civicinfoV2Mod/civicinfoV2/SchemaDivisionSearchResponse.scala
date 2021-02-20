package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a division search query.
  */
@js.native
trait SchemaDivisionSearchResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#divisionSearchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[js.Array[SchemaDivisionSearchResult]] = js.native
}
object SchemaDivisionSearchResponse {
  
  @scala.inline
  def apply(): SchemaDivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResponse]
  }
  
  @scala.inline
  implicit class SchemaDivisionSearchResponseMutableBuilder[Self <: SchemaDivisionSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaDivisionSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaDivisionSearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
