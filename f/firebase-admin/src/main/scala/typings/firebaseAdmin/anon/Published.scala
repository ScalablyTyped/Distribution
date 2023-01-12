package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Published extends StObject {
  
  var published: js.UndefOr[Boolean] = js.undefined
}
object Published {
  
  inline def apply(): Published = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Published]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Published] (val x: Self) extends AnyVal {
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
  }
}
