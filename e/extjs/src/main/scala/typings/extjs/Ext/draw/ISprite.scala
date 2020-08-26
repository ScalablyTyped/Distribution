package typings.extjs.Ext.draw

import typings.extjs.Ext.IElement
import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ @js.native
trait ISprite extends IObservable {
  /** [Method] Adds one or more CSS classes to the element
    * @param className String/String[] The CSS class to add, or an array of classes
    * @returns Ext.draw.Sprite this
    */
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Performs custom animation on this object
    * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
    * @returns Object this
    */
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.native
  /** [Property] (Ext.dd.DragSource) */
  var dd: js.UndefOr[IDragSource] = js.native
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var fill: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var font: js.UndefOr[String] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Retrieves the bounding box of the sprite
    * @returns Object bbox
    */
  var getBBox: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/String[]) */
  var group: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Method] Hides the sprite
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.Sprite this
    */
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[Double] = js.native
  /** [Method] Redraws the sprite
    * @returns Ext.draw.Sprite this
    */
  var redraw: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Removes the sprite
    * @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
    */
  var remove: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Removes one or more CSS classes from the element
    * @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
    * @returns Ext.draw.Sprite this
    */
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Change the attributes of the sprite
    * @param attrs Object attributes to be changed on the sprite.
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.Sprite this
    */
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
    * @param property String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property, or null if an object was passed.
    * @returns Ext.draw.Sprite this
    */
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.native
  /** [Method] Shows the sprite
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.Sprite this
    */
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Config Option] (String) */
  var stroke: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[Double] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object ISprite {
  @scala.inline
  def apply(): ISprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISprite]
  }
  @scala.inline
  implicit class ISpriteOps[Self <: ISprite] (val x: Self) extends AnyVal {
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
    def setAddCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = this.set("addCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    @scala.inline
    def setAnimateFunction1(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("animate", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimate(value: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDd(value: IDragSource): Self = this.set("dd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGetActiveAnimation(value: () => _): Self = this.set("getActiveAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveAnimation: Self = this.set("getActiveAnimation", js.undefined)
    @scala.inline
    def setGetBBox(value: () => _): Self = this.set("getBBox", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHasActiveFx(value: () => _): Self = this.set("hasActiveFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasActiveFx: Self = this.set("hasActiveFx", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHide(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setIsSprite(value: Boolean): Self = this.set("isSprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSprite: Self = this.set("isSprite", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusX: Self = this.set("radiusX", js.undefined)
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusY: Self = this.set("radiusY", js.undefined)
    @scala.inline
    def setRedraw(value: () => ISprite): Self = this.set("redraw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    @scala.inline
    def setRemove(value: () => Boolean): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = this.set("removeCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    @scala.inline
    def setSequenceFx(value: () => _): Self = this.set("sequenceFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSequenceFx: Self = this.set("sequenceFx", js.undefined)
    @scala.inline
    def setSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ISprite): Self = this.set("setAttributes", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttributes: Self = this.set("setAttributes", js.undefined)
    @scala.inline
    def setSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => ISprite): Self = this.set("setStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    @scala.inline
    def setShow(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStopAnimation(value: () => IElement): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopAnimation: Self = this.set("stopAnimation", js.undefined)
    @scala.inline
    def setStopFx(value: () => IElement): Self = this.set("stopFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopFx: Self = this.set("stopFx", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokewidth(value: Double): Self = this.set("strokewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokewidth: Self = this.set("strokewidth", js.undefined)
    @scala.inline
    def setSyncFx(value: () => _): Self = this.set("syncFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSyncFx: Self = this.set("syncFx", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
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

