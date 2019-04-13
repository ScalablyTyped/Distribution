package typings
package easyDashXDashHeadersLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express extends Application {
  var application: js.Any = js.native
  /**
    * Expose mime.
    */
  var mime: java.lang.String = js.native
  var request: Request = js.native
  var response: Response = js.native
  /**
    * Framework version.
    */
  var version: java.lang.String = js.native
  def apply(): Application = js.native
  /**
    * Create an express application.
    */
  def createApplication(): Application = js.native
  def createServer(): Application = js.native
}

