package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesBubbleOptions extends js.Object {
  
  /** Used for setting the maximum radius of the bubble
    * @Default {3}
    */
  var maxRadius: js.UndefOr[Double] = js.native
  
  /** Used for the setting the minimum radius of the bubble
    * @Default {1}
    */
  var minRadius: js.UndefOr[Double] = js.native
  
  /** Used for the calculation of the bubble radius based on the mode selected
    * @Default {minMax .See RadiusMode}
    */
  var radiusMode: js.UndefOr[RadiusMode | String] = js.native
}
object SeriesBubbleOptions {
  
  @scala.inline
  def apply(): SeriesBubbleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBubbleOptions]
  }
  
  @scala.inline
  implicit class SeriesBubbleOptionsOps[Self <: SeriesBubbleOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxRadius(value: Double): Self = this.set("maxRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRadius: Self = this.set("maxRadius", js.undefined)
    
    @scala.inline
    def setMinRadius(value: Double): Self = this.set("minRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRadius: Self = this.set("minRadius", js.undefined)
    
    @scala.inline
    def setRadiusMode(value: RadiusMode | String): Self = this.set("radiusMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusMode: Self = this.set("radiusMode", js.undefined)
  }
}
