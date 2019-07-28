package typings.fineDashUploader.libCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteOptions extends js.Object {
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[String] = js.undefined
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
}

object PasteOptions {
  @scala.inline
  def apply(defaultName: String = null, targetElement: HTMLElement = null): PasteOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[PasteOptions]
  }
}

