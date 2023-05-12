package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexed extends StObject {
  
  var indexed: Boolean
}
object Indexed {
  
  inline def apply(indexed: Boolean): Indexed = {
    val __obj = js.Dynamic.literal(indexed = indexed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indexed] (val x: Self) extends AnyVal {
    
    inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
  }
}
