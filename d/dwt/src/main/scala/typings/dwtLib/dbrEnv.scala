package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dbrEnv extends js.Object {
  var bAutoConnectService: scala.Boolean
  var logLevel: scala.Double
  var productKey: java.lang.String
  var resourcesPath: java.lang.String
  def onAutoConnectServiceError(status: js.Any): scala.Unit
  def onAutoConnectServiceSuccess(): scala.Unit
}

