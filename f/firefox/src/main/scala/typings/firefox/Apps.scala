package typings.firefox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apps extends js.Object {
  def checkInstalled(url: String): DOMRequest[App] = js.native
  def getInstalled(): DOMRequest[js.Array[App]] = js.native
  def getSelf(): DOMRequest[App] = js.native
  def install(url: String): DOMRequest[App] = js.native
  def install(url: String, receipts: js.Array[_]): DOMRequest[App] = js.native
}

