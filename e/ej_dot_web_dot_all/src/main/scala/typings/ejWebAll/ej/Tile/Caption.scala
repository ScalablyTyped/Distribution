package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Caption extends js.Object {
  
  /** It is used to align the text of a tile.
    * @Default {normal}
    */
  var alignment: js.UndefOr[CaptionAlignment | String] = js.native
  
  /** Specifies whether the tile text to be shown or hidden.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** sets the icon instead of text.
    * @Default {null}
    */
  var icon: js.UndefOr[String] = js.native
  
  /** It is used to specify the caption position like Inner top,  inner bottom and outer.
    * @Default {Innerbottom}
    */
  var position: js.UndefOr[CaptionPosition | String] = js.native
  
  /** Changes the text of a tile.
    * @Default {Text}
    */
  var text: js.UndefOr[String] = js.native
}
object Caption {
  
  @scala.inline
  def apply(): Caption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Caption]
  }
  
  @scala.inline
  implicit class CaptionOps[Self <: Caption] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: CaptionAlignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setPosition(value: CaptionPosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
