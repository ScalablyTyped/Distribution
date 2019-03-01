package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteOptions extends js.Object {
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object PasteOptions {
  @scala.inline
  def apply(defaultName: java.lang.String = null, targetElement: stdLib.HTMLElement = null): PasteOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[PasteOptions]
  }
}

