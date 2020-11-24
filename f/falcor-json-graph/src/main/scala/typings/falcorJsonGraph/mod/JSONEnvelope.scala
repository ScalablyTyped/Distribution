package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An envelope that wraps a JSON object.
  **/
@js.native
trait JSONEnvelope[T] extends js.Object {
  
  var json: T = js.native
}
object JSONEnvelope {
  
  @scala.inline
  def apply[T](json: T): JSONEnvelope[T] = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEnvelope[T]]
  }
  
  @scala.inline
  implicit class JSONEnvelopeOps[Self <: JSONEnvelope[_], T] (val x: Self with JSONEnvelope[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJson(value: T): Self = this.set("json", value.asInstanceOf[js.Any])
  }
}
