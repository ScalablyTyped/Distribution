package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Matching methods grouped by class loader.
  */
trait EnumerateMethodsMatchGroup extends StObject {
  
  /**
    * One or more matching classes that have one or more methods matching
    * the given query.
    */
  var classes: Array[EnumerateMethodsMatchClass]
  
  /**
    * Class loader, or `null` for the bootstrap class loader.
    *
    * Typically passed to `ClassFactory.get()` to interact with classes of
    * interest.
    */
  var loader: typings.fridaGum.anon.Wrapper | Null
}
object EnumerateMethodsMatchGroup {
  
  inline def apply(classes: Array[EnumerateMethodsMatchClass]): EnumerateMethodsMatchGroup = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], loader = null)
    __obj.asInstanceOf[EnumerateMethodsMatchGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumerateMethodsMatchGroup] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: Array[EnumerateMethodsMatchClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: typings.fridaGum.anon.Wrapper): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderNull: Self = StObject.set(x, "loader", null)
  }
}
