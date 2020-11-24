package typings.expressBoom.mod.global.Express

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * headers - an object containing any HTTP headers where each key is a header name and
    * value is the header content. (Limited value type to string
    * https://github.com/hapijs/boom/issues/151 )
    */
  var headers: StringDictionary[String] = js.native
  
  /**
    * payload - the formatted object used as the response payload (stringified).
    * Can be directly manipulated but any changes will be lost if reformat() is called.
    * Any content allowed and by default includes the following content:
    */
  var payload: Payload = js.native
  
  /** statusCode - the HTTP status code (typically 4xx or 5xx). */
  var statusCode: Double = js.native
}
object Output {
  
  @scala.inline
  def apply(headers: StringDictionary[String], payload: Payload, statusCode: Double): Output = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
