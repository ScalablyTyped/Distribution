package typings.echarts.echarts.EChartOption.Legend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageIcons extends js.Object {
  
  /**
    * The icons of page buttons when legend.orient is 'horizontal'.
    * It should be an array, [previous page button, next page button], ['M0,0L12,-10L12,10z', 'M0,0L-12,-10L-12,10z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.horizontal
    */
  var horizontal: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The icons of page buttons when legend.orient is 'vertical'.
    * It should be an array, [previous page button, next page button], ['M0,0L20,0L10,-20z', 'M0,0L20,0L10,20z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.vertical
    */
  var vertical: js.UndefOr[js.Array[String]] = js.native
}
object PageIcons {
  
  @scala.inline
  def apply(): PageIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIcons]
  }
  
  @scala.inline
  implicit class PageIconsOps[Self <: PageIcons] (val x: Self) extends AnyVal {
    
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
    def setHorizontalVarargs(value: String*): Self = this.set("horizontal", js.Array(value :_*))
    
    @scala.inline
    def setHorizontal(value: js.Array[String]): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setVerticalVarargs(value: String*): Self = this.set("vertical", js.Array(value :_*))
    
    @scala.inline
    def setVertical(value: js.Array[String]): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
