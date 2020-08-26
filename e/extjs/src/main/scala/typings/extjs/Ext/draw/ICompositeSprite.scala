package typings.extjs.Ext.draw

import typings.extjs.Ext.IElement
import typings.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ @js.native
trait ICompositeSprite extends IMixedCollection {
  /** [Method] Adds class to all sprites
    * @param cls String CSS class name
    */
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Performs custom animation on this object
    * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
    * @returns Object this
    */
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.native
  /** [Method] Destroys this CompositeSprite  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the group bounding box
    * @returns Object an object with x, y, width, and height properties.
    */
  var getBBox: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Hides all sprites
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.CompositeSprite this
    */
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Object
    * @param key Object
    * @param o Object
    * @returns Object The item inserted or an array of items inserted.
    */
  @JSName("insert")
  var insert_ICompositeSprite: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Force redraw of all sprites  */
  var redraw: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes class from all sprites
    * @param cls String CSS class name
    */
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Iterates through all sprites calling setAttributes on each one
    * @param attrs Object Attributes to be changed on the sprite.
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.CompositeSprite this
    */
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Sets style for all sprites
    * @param style String CSS Style definition.
    */
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Shows all sprites
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.CompositeSprite this
    */
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
}

object ICompositeSprite {
  @scala.inline
  def apply(): ICompositeSprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeSprite]
  }
  @scala.inline
  implicit class ICompositeSpriteOps[Self <: ICompositeSprite] (val x: Self) extends AnyVal {
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
    def setAddCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("addCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    @scala.inline
    def setAnimateFunction1(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("animate", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimate(value: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetActiveAnimation(value: () => _): Self = this.set("getActiveAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveAnimation: Self = this.set("getActiveAnimation", js.undefined)
    @scala.inline
    def setGetBBox(value: () => _): Self = this.set("getBBox", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    @scala.inline
    def setHasActiveFx(value: () => _): Self = this.set("hasActiveFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasActiveFx: Self = this.set("hasActiveFx", js.undefined)
    @scala.inline
    def setHide(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[js.Any], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _
    ): Self = this.set("insert", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setRedraw(value: () => Unit): Self = this.set("redraw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    @scala.inline
    def setRemoveCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("removeCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    @scala.inline
    def setSequenceFx(value: () => _): Self = this.set("sequenceFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSequenceFx: Self = this.set("sequenceFx", js.undefined)
    @scala.inline
    def setSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ICompositeSprite): Self = this.set("setAttributes", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttributes: Self = this.set("setAttributes", js.undefined)
    @scala.inline
    def setSetStyle(value: /* style */ js.UndefOr[String] => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    @scala.inline
    def setShow(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStopAnimation(value: () => IElement): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopAnimation: Self = this.set("stopAnimation", js.undefined)
    @scala.inline
    def setStopFx(value: () => IElement): Self = this.set("stopFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopFx: Self = this.set("stopFx", js.undefined)
    @scala.inline
    def setSyncFx(value: () => _): Self = this.set("syncFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSyncFx: Self = this.set("syncFx", js.undefined)
  }
  
}

