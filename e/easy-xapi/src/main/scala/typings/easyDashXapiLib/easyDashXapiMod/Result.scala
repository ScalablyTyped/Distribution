package typings
package easyDashXapiLib.easyDashXapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Result extends js.Object {
  var app: expressLib.expressMod.eNs.Application
  var express: js.Any
  var log: bunyanLib.bunyanMod.namespaced
  var server: nodeLib.httpMod.Server
  def listen(): scala.Unit
}

