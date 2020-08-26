package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurface extends IObservable {
  /** [Method] Adds a Sprite to the surface
    * @param args Ext.draw.Sprite[]/Ext.draw.Sprite... One or more Sprite objects or configs.
    * @returns Ext.draw.Sprite[]/Ext.draw.Sprite The sprites added.
    */
  var add: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds one or more CSS classes to the element
    * @param sprite Object The sprite to add the class to.
    * @param className String/String[] The CSS class to add, or an array of classes
    */
  var addCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Adds a gradient definition to the Surface
    * @param gradient Object A gradient config.
    */
  var addGradient: js.UndefOr[js.Function1[/* gradient */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroys the surface  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a new group or an existent group associated with the current surface
    * @param id String The unique identifier of the group.
    * @returns Object The Ext.draw.CompositeSprite.
    */
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  /** [Method] Retrieves the id of this component  */
  var getId: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[Array] = js.native
  /** [Method] Removes a given sprite from the surface optionally destroying the sprite in the process
    * @param sprite Ext.draw.Sprite
    * @param destroySprite Boolean
    */
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Removes all sprites from the surface optionally destroying the sprites in the process
    * @param destroySprites Boolean Whether to destroy all sprites when removing them.
    */
  var removeAll: js.UndefOr[js.Function1[/* destroySprites */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Removes one or more CSS classes from the element
    * @param sprite Object The sprite to remove the class from.
    * @param className String/String[] The CSS class to remove, or an array of classes
    */
  var removeCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the size of the surface
    * @param w Number The new width of the canvas.
    * @param h Number The new height of the canvas.
    */
  var setSize: js.UndefOr[js.Function2[/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets CSS style attributes to an element
    * @param sprite Object The sprite to add, or an array of classes to
    * @param styles Object An Object with CSS styles.
    */
  var setStyle: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Changes the text in the sprite element
    * @param sprite Object The Sprite to change the text.
    * @param text String The new text to be set.
    */
  var setText: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
}

object ISurface {
  @scala.inline
  def apply(): ISurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISurface]
  }
  @scala.inline
  implicit class ISurfaceOps[Self <: ISurface] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = this.set("addCls", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    @scala.inline
    def setAddGradient(value: /* gradient */ js.UndefOr[js.Any] => Unit): Self = this.set("addGradient", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddGradient: Self = this.set("addGradient", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetGroup(value: /* id */ js.UndefOr[String] => _): Self = this.set("getGroup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetGroup: Self = this.set("getGroup", js.undefined)
    @scala.inline
    def setGetId(value: () => Unit): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItems(value: Array): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAll(value: /* destroySprites */ js.UndefOr[Boolean] => Unit): Self = this.set("removeAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setRemoveCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = this.set("removeCls", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    @scala.inline
    def setSetSize(value: (/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double]) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSetStyle(value: (/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    @scala.inline
    def setSetText(value: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[String]) => Unit): Self = this.set("setText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

