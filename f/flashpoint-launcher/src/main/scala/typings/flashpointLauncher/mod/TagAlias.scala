package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagAlias extends StObject {
  
  /** ID of the tag alias (unique identifier) */
  var id: Double
  
  /** The name this alias represents */
  var name: String
  
  /** Tag this alias belongs to (either ID or Tag will exist) */
  var tag: js.UndefOr[Tag] = js.undefined
  
  /** Tag this alias belongs to (either ID or Tag will exist) */
  var tagId: js.UndefOr[Double] = js.undefined
}
object TagAlias {
  
  inline def apply(id: Double, name: String): TagAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagAlias]
  }
  
  extension [Self <: TagAlias](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagId(value: Double): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
