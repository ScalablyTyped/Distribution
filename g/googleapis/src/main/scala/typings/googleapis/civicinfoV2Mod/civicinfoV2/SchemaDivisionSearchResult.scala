package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a political geographic division that matches the requested
  * query.
  */
trait SchemaDivisionSearchResult extends StObject {
  
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for
    * example, those that refer to other political divisions whose boundaries
    * are defined to be coterminous with this one. For example,
    * ocd-division/country:us/state:wy will include an alias of
    * ocd-division/country:us/state:wy/cd:1, since Wyoming has only one
    * Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The unique Open Civic Data identifier for this division.
    */
  var ocdId: js.UndefOr[String] = js.undefined
}
object SchemaDivisionSearchResult {
  
  @scala.inline
  def apply(): SchemaDivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResult]
  }
  
  @scala.inline
  implicit class SchemaDivisionSearchResultMutableBuilder[Self <: SchemaDivisionSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOcdId(value: String): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
  }
}
