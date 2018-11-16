package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ThumbarButton extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/thumbar-button
  var click: js.Function
  /**
       * Control specific states and behaviors of the button. By default, it is
       * ['enabled'].
       */
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * The icon showing in thumbnail toolbar.
       */
  var icon: NativeImage
  /**
       * The text of the button's tooltip.
       */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

