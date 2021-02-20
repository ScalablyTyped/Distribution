package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectClassNamesFromSubtreeResponse extends StObject {
  
  /**
    * Class name list.
    */
  var classNames: js.Array[String] = js.native
}
object CollectClassNamesFromSubtreeResponse {
  
  @scala.inline
  def apply(classNames: js.Array[String]): CollectClassNamesFromSubtreeResponse = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesFromSubtreeResponse]
  }
  
  @scala.inline
  implicit class CollectClassNamesFromSubtreeResponseMutableBuilder[Self <: CollectClassNamesFromSubtreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value :_*))
  }
}
