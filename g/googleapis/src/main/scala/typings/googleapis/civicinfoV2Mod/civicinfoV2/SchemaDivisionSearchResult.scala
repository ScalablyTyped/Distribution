package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDivisionSearchResult extends StObject {
  
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for example, those that refer to other political divisions whose boundaries are defined to be coterminous with this one. For example, ocd-division/country:us/state:wy will include an alias of ocd-division/country:us/state:wy/cd:1, since Wyoming has only one Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique Open Civic Data identifier for this division
    */
  var ocdId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDivisionSearchResult {
  
  inline def apply(): SchemaDivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResult]
  }
  
  extension [Self <: SchemaDivisionSearchResult](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOcdId(value: String): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    inline def setOcdIdNull: Self = StObject.set(x, "ocdId", null)
    
    inline def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
  }
}
