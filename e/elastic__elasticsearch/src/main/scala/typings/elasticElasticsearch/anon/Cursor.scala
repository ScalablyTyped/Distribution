package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  var cursor: String
}
object Cursor {
  
  inline def apply(cursor: String): Cursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
  }
}
