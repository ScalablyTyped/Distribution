package typings
package freedomLib.freedomNs.ConsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def debug(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def error(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def info(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def log(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
  def warn(source: java.lang.String, message: java.lang.String): js.Promise[scala.Unit]
}

