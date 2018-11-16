package typings
package easyDashXapiDashSupertestLib.expressMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRoute extends js.Object {
  var path: java.lang.String
  var stack: js.Any
  def all(handler: RequestHandler*): IRoute
  def delete(handler: RequestHandler*): IRoute
  def get(handler: RequestHandler*): IRoute
  def options(handler: RequestHandler*): IRoute
  def patch(handler: RequestHandler*): IRoute
  def post(handler: RequestHandler*): IRoute
  def put(handler: RequestHandler*): IRoute
}

