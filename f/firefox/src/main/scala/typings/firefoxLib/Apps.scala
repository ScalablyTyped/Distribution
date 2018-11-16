package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apps extends js.Object {
  def checkInstalled(url: java.lang.String): DOMRequest[App] = js.native
  def getInstalled(): DOMRequest[js.Array[App]] = js.native
  def getSelf(): DOMRequest[App] = js.native
  def install(url: java.lang.String): DOMRequest[App] = js.native
  def install(url: java.lang.String, receipts: js.Array[_]): DOMRequest[App] = js.native
}

