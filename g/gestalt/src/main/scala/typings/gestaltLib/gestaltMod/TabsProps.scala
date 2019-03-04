package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeTabIndex: scala.Double
  var tabs: js.Array[gestaltLib.Anon_Href]
  def onChange(args: gestaltLib.Anon_ActiveTabIndex): scala.Unit
}

object TabsProps {
  @scala.inline
  def apply(
    activeTabIndex: scala.Double,
    onChange: js.Function1[gestaltLib.Anon_ActiveTabIndex, scala.Unit],
    tabs: js.Array[gestaltLib.Anon_Href]
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex, onChange = onChange, tabs = tabs)
  
    __obj.asInstanceOf[TabsProps]
  }
}

