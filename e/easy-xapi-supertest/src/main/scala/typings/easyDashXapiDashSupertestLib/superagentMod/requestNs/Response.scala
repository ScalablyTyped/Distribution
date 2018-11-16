package typings
package easyDashXapiDashSupertestLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends easyDashXapiDashSupertestLib.NodeJSNs.ReadableStream {
  var accepted: scala.Boolean = js.native
  var badRequest: scala.Boolean = js.native
  var body: js.Any = js.native
  var charset: java.lang.String = js.native
  var clientError: scala.Boolean = js.native
  var error: nodeLib.Error = js.native
  var files: js.Any = js.native
  var forbidden: scala.Boolean = js.native
  var header: js.Any = js.native
  var info: scala.Boolean = js.native
  var noContent: scala.Boolean = js.native
  var notAcceptable: scala.Boolean = js.native
  var notFound: scala.Boolean = js.native
  var ok: scala.Boolean = js.native
  var redirect: scala.Boolean = js.native
  var serverError: scala.Boolean = js.native
  var status: scala.Double = js.native
  var statusType: scala.Double = js.native
  var text: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var unauthorized: scala.Boolean = js.native
  def get(header: java.lang.String): java.lang.String = js.native
}

