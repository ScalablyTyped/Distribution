package typings.extjs.Ext.slider

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITip
  extends typings.extjs.Ext.tip.ITip {
  
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  
  /** [Method] Used to create the text that appears in the Tip s body
    * @param thumb Ext.slider.Thumb The Thumb that the Tip is attached to
    * @returns String The text to display in the tip
    */
  var getText: js.UndefOr[js.Function1[/* thumb */ js.UndefOr[IThumb], String]] = js.native
  
  /** [Config Option] (Array) */
  var offsets: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
}
object ITip {
  
  @scala.inline
  def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  
  @scala.inline
  implicit class ITipOps[Self <: ITip] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setGetText(value: /* thumb */ js.UndefOr[IThumb] => String): Self = this.set("getText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetText: Self = this.set("getText", js.undefined)
    
    @scala.inline
    def setOffsets(value: Array): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsets: Self = this.set("offsets", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
