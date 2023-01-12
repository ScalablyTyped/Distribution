package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var anchor: String | js.RegExp
  
  var comment: String
  
  var newSrc: String
  
  var offset: Double
  
  var src: String
  
  var tag: String
}
object Anchor {
  
  inline def apply(
    anchor: String | js.RegExp,
    comment: String,
    newSrc: String,
    offset: Double,
    src: String,
    tag: String
  ): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], newSrc = newSrc.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: String | js.RegExp): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setNewSrc(value: String): Self = StObject.set(x, "newSrc", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
