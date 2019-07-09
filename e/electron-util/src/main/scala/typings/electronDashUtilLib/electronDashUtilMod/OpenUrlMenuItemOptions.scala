package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof electron.Electron.MenuItemConstructorOptions ]: electron.Electron.MenuItemConstructorOptions[P]} */ trait OpenUrlMenuItemOptions extends js.Object {
  /**
  	URL to be opened when the menu item is clicked.
  	*/
  val url: java.lang.String
}

object OpenUrlMenuItemOptions {
  @scala.inline
  def apply(url: java.lang.String): OpenUrlMenuItemOptions = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[OpenUrlMenuItemOptions]
  }
}

