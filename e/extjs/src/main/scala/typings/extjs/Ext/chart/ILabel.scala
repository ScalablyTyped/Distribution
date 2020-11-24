package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.draw.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabel extends IBase {
  
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  
  /** [Method] Called each time a new label is created
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element created (i.e the first created label, second created label, etc).
    * @param display String The label.display type. May be false if the label is hidden
    * @returns Ext.draw.Sprite The created sprite that will draw the label.
    */
  var onCreateLabel: js.UndefOr[
    js.Function4[
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      ISprite
    ]
  ] = js.native
  
  /** [Method] Called for updating the position of the label
    * @param label Ext.draw.Sprite The sprite that draws the label.
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
    * @param display String The label.display type. May be false if the label is hidden
    * @param animate Boolean A boolean value to set or unset animations for the labels.
    * @param index Number The series index.
    */
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      /* label */ js.UndefOr[ISprite], 
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      /* animate */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}
object ILabel {
  
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnCreateLabel(
      value: (/* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String]) => ISprite
    ): Self = this.set("onCreateLabel", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnCreateLabel: Self = this.set("onCreateLabel", js.undefined)
    
    @scala.inline
    def setOnPlaceLabel(
      value: (/* label */ js.UndefOr[ISprite], /* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onPlaceLabel", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteOnPlaceLabel: Self = this.set("onPlaceLabel", js.undefined)
  }
}
