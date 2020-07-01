package typings.gliderJs.mod

import typings.gliderJs.anon.Scroll
import typings.gliderJs.anon.Slide
import typings.gliderJs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GliderEventMap extends js.Object {
  /**
    * Called whenever an item is added to Glider.js
    */
  var `glider-add`: Scroll
  /**
    * Called whenever a Glider.js paging animation is complete
    */
  var `glider-animated`: Type
  /**
    * Called whenever a Glider.js is destroyed
    */
  var `glider-destroy`: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Called after Glider.js is first initialized
    */
  var `glider-loaded`: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Called whenever Glider.js refreshes its elements or settings
    */
  var `glider-refresh`: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Called whenever a Glider.js animation is complete
    */
  var `glider-remove`: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Called whenever a slide is hidden. Passed an object containing the slide index
    */
  var `glider-slide-hidden`: Slide
  /**
    * Called whenever a slide is shown. Passed an object containing the slide index
    */
  var `glider-slide-visible`: Slide
}

object GliderEventMap {
  @scala.inline
  def apply(
    `glider-add`: Scroll,
    `glider-animated`: Type,
    `glider-slide-hidden`: Slide,
    `glider-slide-visible`: Slide
  ): GliderEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glider-add")(`glider-add`.asInstanceOf[js.Any])
    __obj.updateDynamic("glider-animated")(`glider-animated`.asInstanceOf[js.Any])
    __obj.updateDynamic("glider-slide-hidden")(`glider-slide-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("glider-slide-visible")(`glider-slide-visible`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GliderEventMap]
  }
}

