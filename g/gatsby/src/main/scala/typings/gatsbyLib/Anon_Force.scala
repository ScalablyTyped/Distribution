package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: scala.Boolean
  var fromPath: java.lang.String
  var isPermanent: scala.Boolean
  var redirectInBrowser: scala.Boolean
  var statusCode: scala.Double
  var toPath: java.lang.String
}

object Anon_Force {
  @scala.inline
  def apply(
    force: scala.Boolean,
    fromPath: java.lang.String,
    isPermanent: scala.Boolean,
    redirectInBrowser: scala.Boolean,
    statusCode: scala.Double,
    toPath: java.lang.String
  ): Anon_Force = {
    val __obj = js.Dynamic.literal(force = force, fromPath = fromPath, isPermanent = isPermanent, redirectInBrowser = redirectInBrowser, statusCode = statusCode, toPath = toPath)
  
    __obj.asInstanceOf[Anon_Force]
  }
}

