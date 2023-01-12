package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /** Aliases / Names of the tag */
  var aliases: js.Array[TagAlias]
  
  /** Category this tag is a part of (either ID or TagCategory will exist) */
  var category: js.UndefOr[TagCategory] = js.undefined
  
  /** Category this tag is a part of (either ID or TagCategory will exist) */
  var categoryId: js.UndefOr[Double] = js.undefined
  
  /** Number of games this tag belongs to */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Date when this tag was last modified */
  var dateModified: String
  
  /** Description of the tag */
  var description: js.UndefOr[String] = js.undefined
  
  /** Games which are marked with this Tag */
  var gamesUsing: js.UndefOr[js.Array[Game]] = js.undefined
  
  /** ID of the tag (unique identifier) */
  var id: js.UndefOr[Double] = js.undefined
  
  /** Primary Alias */
  var primaryAlias: TagAlias
  
  /** ID of Primary Alias */
  var primaryAliasId: Double
}
object Tag {
  
  inline def apply(aliases: js.Array[TagAlias], dateModified: String, primaryAlias: TagAlias, primaryAliasId: Double): Tag = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], dateModified = dateModified.asInstanceOf[js.Any], primaryAlias = primaryAlias.asInstanceOf[js.Any], primaryAliasId = primaryAliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[TagAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: TagAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setCategory(value: TagCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryId(value: Double): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDateModified(value: String): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGamesUsing(value: js.Array[Game]): Self = StObject.set(x, "gamesUsing", value.asInstanceOf[js.Any])
    
    inline def setGamesUsingUndefined: Self = StObject.set(x, "gamesUsing", js.undefined)
    
    inline def setGamesUsingVarargs(value: Game*): Self = StObject.set(x, "gamesUsing", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPrimaryAlias(value: TagAlias): Self = StObject.set(x, "primaryAlias", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAliasId(value: Double): Self = StObject.set(x, "primaryAliasId", value.asInstanceOf[js.Any])
  }
}
