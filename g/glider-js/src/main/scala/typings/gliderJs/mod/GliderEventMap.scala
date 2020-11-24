package typings.gliderJs.mod

import typings.gliderJs.anon.Scroll
import typings.gliderJs.anon.Slide
import typings.gliderJs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GliderEventMap extends js.Object {
  
  /**
    * Called whenever an item is added to Glider.js
    */
  var `glider-add`: Scroll = js.native
  
  /**
    * Called whenever a Glider.js paging animation is complete
    */
  var `glider-animated`: Type = js.native
  
  /**
    * Called whenever a Glider.js is destroyed
    */
  var `glider-destroy`: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Called after Glider.js is first initialized
    */
  var `glider-loaded`: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Called whenever Glider.js refreshes its elements or settings
    */
  var `glider-refresh`: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Called whenever a Glider.js animation is complete
    */
  var `glider-remove`: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Called whenever a slide is hidden. Passed an object containing the slide index
    */
  var `glider-slide-hidden`: Slide = js.native
  
  /**
    * Called whenever a slide is shown. Passed an object containing the slide index
    */
  var `glider-slide-visible`: Slide = js.native
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
  
  @scala.inline
  implicit class GliderEventMapOps[Self <: GliderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setGlider-add`(value: Scroll): Self = this.set("glider-add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlider-animated`(value: Type): Self = this.set("glider-animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlider-slide-hidden`(value: Slide): Self = this.set("glider-slide-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlider-slide-visible`(value: Slide): Self = this.set("glider-slide-visible", value.asInstanceOf[js.Any])
  }
}
