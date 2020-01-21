package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/tabs.html#javascript-reference
@js.native
trait Tabs extends js.Object {
  def destroy(): Unit = js.native
  def selectTab(element: String): Unit = js.native
  def selectTab(element: JQuery): Unit = js.native
}

