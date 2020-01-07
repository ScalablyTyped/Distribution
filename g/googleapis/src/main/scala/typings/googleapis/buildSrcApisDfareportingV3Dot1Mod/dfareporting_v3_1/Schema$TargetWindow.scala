package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target Window.
  */
@js.native
trait Schema$TargetWindow extends js.Object {
  /**
    * User-entered value.
    */
  var customHtml: js.UndefOr[String] = js.native
  /**
    * Type of browser window for which the backup image of the flash creative
    * can be displayed.
    */
  var targetWindowOption: js.UndefOr[String] = js.native
}

object Schema$TargetWindow {
  @scala.inline
  def apply(customHtml: String = null, targetWindowOption: String = null): Schema$TargetWindow = {
    val __obj = js.Dynamic.literal()
    if (customHtml != null) __obj.updateDynamic("customHtml")(customHtml.asInstanceOf[js.Any])
    if (targetWindowOption != null) __obj.updateDynamic("targetWindowOption")(targetWindowOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetWindow]
  }
}

