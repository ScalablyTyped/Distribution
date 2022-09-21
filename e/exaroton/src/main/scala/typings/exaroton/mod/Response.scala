package typings.exaroton.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exaroton", "Response")
@js.native
open class Response protected () extends StObject {
  /**
    * Request constructor
    *
    * @param request
    */
  def this(request: Request) = this()
  
  /**
    * (raw/parsed) response body
    */
  var body: js.Object | String = js.native
  
  /**
    * Get the data from the response
    */
  def getData(): js.Object | Null = js.native
  
  var request: Request = js.native
  
  def setBody(body: String): Unit = js.native
  /**
    * Set the body to this.body and maybe parse content
    *
    * @param body
    */
  def setBody(body: js.Object): Unit = js.native
}
