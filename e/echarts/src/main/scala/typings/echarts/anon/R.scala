package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R extends js.Object {
  
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.height
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Specify border radius of the rectangular here.
    * Generally, `r` should be `[topLeftRadius, topRightRadius,
    * BottomRightRadius, bottomLeftRadius]`, where each
    * item is a number.
    *
    * Abbreviation is enabled, for example:
    *
    * + `r`: `1` means `[1, 1, 1, 1]`
    * + `r`: `[1]` means `[1, 1, 1, 1]`
    * + `r`: `[1, 2]` means `[1, 2, 1, 2]`
    * + `r`: `[1, 2, 3]` means `[1, 2, 3, 2]`
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.r
    */
  var r: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.width
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.x
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.y
    */
  var y: js.UndefOr[Double] = js.native
}
object R {
  
  @scala.inline
  def apply(): R = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit class ROps[Self <: R] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setRVarargs(value: js.Any*): Self = this.set("r", js.Array(value :_*))
    
    @scala.inline
    def setR(value: js.Array[_]): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
