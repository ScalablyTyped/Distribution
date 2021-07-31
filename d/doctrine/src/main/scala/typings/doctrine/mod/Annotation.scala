package typings.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a parsed jsdoc comment.
  */
trait Annotation extends StObject {
  
  /** The overall description of the thing being documented. */
  var description: String
  
  var tags: js.Array[Tag]
}
object Annotation {
  
  @scala.inline
  def apply(description: String, tags: js.Array[Tag]): Annotation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
