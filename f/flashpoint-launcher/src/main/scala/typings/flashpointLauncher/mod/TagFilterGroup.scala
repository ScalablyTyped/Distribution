package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilterGroup extends StObject {
  
  /** Tag categories to filter */
  var categories: TagFilter
  
  /** Filters to auto apply when this is applied */
  var childFilters: js.Array[String]
  
  var description: String
  
  /** Enabled */
  var enabled: Boolean
  
  /** Are these tags considered Extreme? */
  var extreme: Boolean
  
  var name: String
  
  /** Tags to filter */
  var tags: TagFilter
}
object TagFilterGroup {
  
  inline def apply(
    categories: TagFilter,
    childFilters: js.Array[String],
    description: String,
    enabled: Boolean,
    extreme: Boolean,
    name: String,
    tags: TagFilter
  ): TagFilterGroup = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], childFilters = childFilters.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], extreme = extreme.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagFilterGroup] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: TagFilter): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setChildFilters(value: js.Array[String]): Self = StObject.set(x, "childFilters", value.asInstanceOf[js.Any])
    
    inline def setChildFiltersVarargs(value: String*): Self = StObject.set(x, "childFilters", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExtreme(value: Boolean): Self = StObject.set(x, "extreme", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagFilter): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
