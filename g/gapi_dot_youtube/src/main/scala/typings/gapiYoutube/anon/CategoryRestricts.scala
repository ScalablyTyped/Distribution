package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryRestricts extends StObject {
  
  /**
    * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
    */
  var categoryRestricts: js.Array[String]
  
  /**
    * The keyword tag suggested for the video.
    */
  var tag: String
}
object CategoryRestricts {
  
  inline def apply(categoryRestricts: js.Array[String], tag: String): CategoryRestricts = {
    val __obj = js.Dynamic.literal(categoryRestricts = categoryRestricts.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryRestricts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryRestricts] (val x: Self) extends AnyVal {
    
    inline def setCategoryRestricts(value: js.Array[String]): Self = StObject.set(x, "categoryRestricts", value.asInstanceOf[js.Any])
    
    inline def setCategoryRestrictsVarargs(value: String*): Self = StObject.set(x, "categoryRestricts", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
