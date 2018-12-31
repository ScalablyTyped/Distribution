package typings
package easyDashXapiLib.easyDashXapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var log: easyDashXapiLib.Anon_Level
  var name: java.lang.String
  var port: scala.Double
  var root: java.lang.String
  var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  def mount(app: expressLib.expressMod.eNs.Application): scala.Unit
}

