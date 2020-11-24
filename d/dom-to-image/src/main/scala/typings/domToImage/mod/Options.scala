package typings.domToImage.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var cacheBust: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var imagePlaceholder: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setCacheBust(value: Boolean): Self = this.set("cacheBust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheBust: Self = this.set("cacheBust", js.undefined)
    
    @scala.inline
    def setFilter(value: /* node */ Node => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImagePlaceholder(value: String): Self = this.set("imagePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePlaceholder: Self = this.set("imagePlaceholder", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
