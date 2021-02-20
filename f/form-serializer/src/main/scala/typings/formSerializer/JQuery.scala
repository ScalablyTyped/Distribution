package typings.formSerializer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): String = js.native
  
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object = js.native
}
object JQuery {
  
  @scala.inline
  def apply(serializeJSON: () => String, serializeObject: () => js.Object): JQuery = {
    val __obj = js.Dynamic.literal(serializeJSON = js.Any.fromFunction0(serializeJSON), serializeObject = js.Any.fromFunction0(serializeObject))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeJSON(value: () => String): Self = StObject.set(x, "serializeJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerializeObject(value: () => js.Object): Self = StObject.set(x, "serializeObject", js.Any.fromFunction0(value))
  }
}
