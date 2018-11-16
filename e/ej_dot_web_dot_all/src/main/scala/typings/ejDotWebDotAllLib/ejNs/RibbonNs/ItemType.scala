package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

@JSGlobal("ej.Ribbon.ItemType")
@js.native
object ItemType extends js.Object {
  ///To render the button for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ItemType
  
  ///To render the tab for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Tab
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ItemType
  
  val Button: Button with java.lang.String = js.native
  val Tab: Tab with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.ItemType with java.lang.String] = js.native
}

