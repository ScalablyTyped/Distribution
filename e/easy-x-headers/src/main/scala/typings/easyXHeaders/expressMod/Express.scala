package typings.easyXHeaders.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Express extends Application {
  
  def apply(): Application = js.native
  
  var application: js.Any = js.native
  
  /**
    * Create an express application.
    */
  def createApplication(): Application = js.native
  
  def createServer(): Application = js.native
  
  /**
    * Expose mime.
    */
  var mime: String = js.native
  
  var request: Request = js.native
  
  var response: Response = js.native
  
  /**
    * Framework version.
    */
  var version: String = js.native
}
