package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Matching methods grouped by class loader.
  */
@js.native
trait EnumerateMethodsMatchGroup extends StObject {
  
  /**
    * One or more matching classes that have one or more methods matching
    * the given query.
    */
  var classes: Array[EnumerateMethodsMatchClass] = js.native
  
  /**
    * Class loader, or `null` for the bootstrap class loader.
    *
    * Typically passed to `ClassFactory.get()` to interact with classes of
    * interest.
    */
  var loader: typings.fridaGum.anon.Wrapper | Null = js.native
}
object EnumerateMethodsMatchGroup {
  
  @scala.inline
  def apply(classes: Array[EnumerateMethodsMatchClass]): EnumerateMethodsMatchGroup = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchGroup]
  }
  
  @scala.inline
  implicit class EnumerateMethodsMatchGroupMutableBuilder[Self <: EnumerateMethodsMatchGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: Array[EnumerateMethodsMatchClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: typings.fridaGum.anon.Wrapper): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderNull: Self = StObject.set(x, "loader", null)
  }
}
