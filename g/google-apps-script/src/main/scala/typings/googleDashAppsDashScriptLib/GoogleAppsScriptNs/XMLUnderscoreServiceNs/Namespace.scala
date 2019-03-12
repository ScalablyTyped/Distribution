package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  def getPrefix(): java.lang.String
  def getURI(): java.lang.String
}

object Namespace {
  @scala.inline
  def apply(getPrefix: () => java.lang.String, getURI: () => java.lang.String): Namespace = {
    val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
  
    __obj.asInstanceOf[Namespace]
  }
}

