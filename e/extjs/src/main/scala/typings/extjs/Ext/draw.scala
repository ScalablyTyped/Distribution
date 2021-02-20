package typings.extjs.Ext

import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.util.IRegion
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draw {
  
  @js.native
  trait Color extends StObject
  
  @js.native
  trait Draw extends StObject
  
  @js.native
  trait IColor extends IBase {
    
    /** [Method] Get the blue component of the color in the range 0 255
      * @returns Number
      */
    var getBlue: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Return a new color that is darker than this color
      * @param factor Number Darker factor (0..1), default to 0.2
      * @returns Object Ext.draw.Color
      */
    var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
    
    /** [Method] Returns the gray value 0 to 255 of the color
      * @returns Number
      */
    var getGrayscale: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Get the green component of the color in the range 0 255
      * @returns Number
      */
    var getGreen: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Get the equivalent HSL components of the color
      * @returns Number[]
      */
    var getHSL: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Return a new color that is lighter than this color
      * @param factor Number Lighter factor (0..1), default to 0.2
      * @returns Object Ext.draw.Color
      */
    var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
    
    /** [Method] Get the RGB values
      * @returns Number[]
      */
    var getRGB: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Get the red component of the color in the range 0 255
      * @returns Number
      */
    var getRed: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Config Option] (Number) */
    var lightnessFactor: js.UndefOr[Double] = js.native
    
    /** [Method] Return the color in the hex format i e
      * @returns String
      */
    @JSName("toString")
    var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.native
  }
  object IColor {
    
    @scala.inline
    def apply(): IColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColor]
    }
    
    @scala.inline
    implicit class IColorMutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBlue(value: () => Double): Self = StObject.set(x, "getBlue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBlueUndefined: Self = StObject.set(x, "getBlue", js.undefined)
      
      @scala.inline
      def setGetDarker(value: /* factor */ js.UndefOr[Double] => _): Self = StObject.set(x, "getDarker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDarkerUndefined: Self = StObject.set(x, "getDarker", js.undefined)
      
      @scala.inline
      def setGetGrayscale(value: () => Double): Self = StObject.set(x, "getGrayscale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGrayscaleUndefined: Self = StObject.set(x, "getGrayscale", js.undefined)
      
      @scala.inline
      def setGetGreen(value: () => Double): Self = StObject.set(x, "getGreen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGreenUndefined: Self = StObject.set(x, "getGreen", js.undefined)
      
      @scala.inline
      def setGetHSL(value: () => Array): Self = StObject.set(x, "getHSL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHSLUndefined: Self = StObject.set(x, "getHSL", js.undefined)
      
      @scala.inline
      def setGetLighter(value: /* factor */ js.UndefOr[Double] => _): Self = StObject.set(x, "getLighter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLighterUndefined: Self = StObject.set(x, "getLighter", js.undefined)
      
      @scala.inline
      def setGetRGB(value: () => Array): Self = StObject.set(x, "getRGB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRGBUndefined: Self = StObject.set(x, "getRGB", js.undefined)
      
      @scala.inline
      def setGetRed(value: () => Double): Self = StObject.set(x, "getRed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRedUndefined: Self = StObject.set(x, "getRed", js.undefined)
      
      @scala.inline
      def setLightnessFactor(value: Double): Self = StObject.set(x, "lightnessFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightnessFactorUndefined: Self = StObject.set(x, "lightnessFactor", js.undefined)
      
      @scala.inline
      def setToString_(value: () => java.lang.String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
  
  @js.native
  trait IComponent
    extends typings.extjs.Ext.IComponent {
    
    /** [Config Option] (Boolean) */
    var autoSize: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String[]) */
    var enginePriority: js.UndefOr[Array] = js.native
    
    /** [Config Option] (Object[]) */
    var gradients: js.UndefOr[Array] = js.native
    
    /** [Config Option] (Ext.draw.Sprite[]) */
    var items: js.UndefOr[Array] = js.native
    
    /** [Property] (Ext.draw.Surface) */
    var surface: js.UndefOr[ISurface] = js.native
    
    /** [Config Option] (Boolean) */
    var viewBox: js.UndefOr[Boolean] = js.native
  }
  object IComponent {
    
    @scala.inline
    def apply(): typings.extjs.Ext.draw.IComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.draw.IComponent]
    }
    
    @scala.inline
    implicit class IComponentMutableBuilder[Self <: typings.extjs.Ext.draw.IComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setEnginePriority(value: Array): Self = StObject.set(x, "enginePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginePriorityUndefined: Self = StObject.set(x, "enginePriority", js.undefined)
      
      @scala.inline
      def setGradients(value: Array): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      @scala.inline
      def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setSurface(value: ISurface): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
      
      @scala.inline
      def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ @js.native
  trait ICompositeSprite extends IMixedCollection {
    
    /** [Method] Adds class to all sprites
      * @param cls String CSS class name
      */
    var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
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
    var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
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
    var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[java.lang.String], Unit]] = js.native
    
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
    implicit class ICompositeSpriteMutableBuilder[Self <: ICompositeSprite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setAnimate(value: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateFunction1(value: /* config */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetActiveAnimation(value: () => _): Self = StObject.set(x, "getActiveAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
      
      @scala.inline
      def setGetBBox(value: () => _): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
      
      @scala.inline
      def setHasActiveFx(value: () => _): Self = StObject.set(x, "hasActiveFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
      
      @scala.inline
      def setHide(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setInsert(
        value: (/* index */ js.UndefOr[js.Any], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      @scala.inline
      def setRemoveCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setSequenceFx(value: () => _): Self = StObject.set(x, "sequenceFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
      
      @scala.inline
      def setSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ICompositeSprite): Self = StObject.set(x, "setAttributes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
      
      @scala.inline
      def setSetStyle(value: /* style */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setShow(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStopAnimation(value: () => IElement): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
      
      @scala.inline
      def setStopFx(value: () => IElement): Self = StObject.set(x, "stopFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
      
      @scala.inline
      def setSyncFx(value: () => _): Self = StObject.set(x, "syncFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
    }
  }
  
  type IDraw = IBase
  
  type IMatrix = IBase
  
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
    var fill: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var font: js.UndefOr[java.lang.String] = js.native
    
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
    var path: js.UndefOr[java.lang.String] = js.native
    
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
        js.Function2[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Shows the sprite
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.Sprite this
      */
    var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
    
    /** [Config Option] (String) */
    var src: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
      * @returns Ext.Element The Element
      */
    var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
    
    /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
      * @returns Ext.Element The Element
      */
    var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
    
    /** [Config Option] (String) */
    var stroke: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var strokewidth: js.UndefOr[Double] = js.native
    
    /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
      * @returns Object this
      */
    var syncFx: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[java.lang.String] = js.native
    
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
    implicit class ISpriteMutableBuilder[Self <: ISprite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setAnimate(value: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateFunction1(value: /* config */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setDd(value: IDragSource): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFill(value: java.lang.String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: java.lang.String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setGetActiveAnimation(value: () => _): Self = StObject.set(x, "getActiveAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
      
      @scala.inline
      def setGetBBox(value: () => _): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
      
      @scala.inline
      def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setHasActiveFx(value: () => _): Self = StObject.set(x, "hasActiveFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHide(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setIsSprite(value: Boolean): Self = StObject.set(x, "isSprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSpriteUndefined: Self = StObject.set(x, "isSprite", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
      
      @scala.inline
      def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
      
      @scala.inline
      def setRedraw(value: () => ISprite): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      @scala.inline
      def setRemove(value: () => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSequenceFx(value: () => _): Self = StObject.set(x, "sequenceFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
      
      @scala.inline
      def setSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ISprite): Self = StObject.set(x, "setAttributes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => ISprite): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setShow(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStopAnimation(value: () => IElement): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
      
      @scala.inline
      def setStopFx(value: () => IElement): Self = StObject.set(x, "stopFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
      
      @scala.inline
      def setStroke(value: java.lang.String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokewidth(value: Double): Self = StObject.set(x, "strokewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokewidthUndefined: Self = StObject.set(x, "strokewidth", js.undefined)
      
      @scala.inline
      def setSyncFx(value: () => _): Self = StObject.set(x, "syncFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
      
      @scala.inline
      def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ISpriteDD extends IDragSource {
    
    /** [Method] Returns a reference to the actual element to drag
      * @param e Object
      * @returns HTMLElement the html element
      */
    @JSName("getDragEl")
    var getDragEl_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
    
    /** [Method] Abstract method called during the onMouseMove event while dragging an object
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th  */
    @JSName("setDragElPos")
    var setDragElPos_ISpriteDD: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ISpriteDD {
    
    @scala.inline
    def apply(): ISpriteDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpriteDD]
    }
    
    @scala.inline
    implicit class ISpriteDDMutableBuilder[Self <: ISpriteDD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDragEl(value: /* e */ js.UndefOr[js.Any] => HTMLElement): Self = StObject.set(x, "getDragEl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDragElUndefined: Self = StObject.set(x, "getDragEl", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setSetDragElPos(value: () => Unit): Self = StObject.set(x, "setDragElPos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDragElPosUndefined: Self = StObject.set(x, "setDragElPos", js.undefined)
    }
  }
  
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
    var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.native
    
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
        js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[java.lang.String], Unit]
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
    implicit class ISurfaceMutableBuilder[Self <: ISurface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: /* args */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "addCls", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setAddGradient(value: /* gradient */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addGradient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddGradientUndefined: Self = StObject.set(x, "addGradient", js.undefined)
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetGroup(value: /* id */ js.UndefOr[java.lang.String] => _): Self = StObject.set(x, "getGroup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      @scala.inline
      def setGetId(value: () => Unit): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAll(value: /* destroySprites */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      @scala.inline
      def setRemoveCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeCls", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSetSize(value: (/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setSetText(value: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[java.lang.String]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IText
    extends typings.extjs.Ext.draw.IComponent {
    
    /** [Config Option] (Number) */
    var degrees: js.UndefOr[Double] = js.native
    
    /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
      * @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
      */
    var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Updates this item s text
      * @param t String The text to display (html not accepted).
      */
    var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var styleSelector: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.native
  }
  object IText {
    
    @scala.inline
    def apply(): IText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IText]
    }
    
    @scala.inline
    implicit class ITextMutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
      
      @scala.inline
      def setSetAngle(value: /* degrees */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setAngle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAngleUndefined: Self = StObject.set(x, "setAngle", js.undefined)
      
      @scala.inline
      def setSetText(value: /* t */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      @scala.inline
      def setStyleSelector(value: java.lang.String): Self = StObject.set(x, "styleSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSelectorUndefined: Self = StObject.set(x, "styleSelector", js.undefined)
      
      @scala.inline
      def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Surface extends StObject
  
  object engine {
    
    type IImageExporter = IBase
    
    @js.native
    trait ISvg extends ISurface {
      
      /** [Method] Insert or move a given sprite s element to the correct place in the DOM list for its zIndex
        * @param sprite Ext.draw.Sprite
        */
      var applyZIndex: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
      
      /** [Method] Get the region for the surface s canvas area
        * @returns Ext.util.Region
        */
      var getRegion: js.UndefOr[js.Function0[IRegion]] = js.native
      
      /** [Method] Checks if the specified CSS class exists on this element s DOM node
        * @param sprite Ext.draw.Sprite The sprite to look into.
        * @param className String The CSS class to check for
        * @returns Boolean True if the class exists, else false
        */
      var hasCls: js.UndefOr[
            js.Function2[
              /* sprite */ js.UndefOr[ISprite], 
              /* className */ js.UndefOr[java.lang.String], 
              Boolean
            ]
          ] = js.native
      
      /** [Method] Sets the size of the surface
        * @param width Object
        * @param height Object
        */
      @JSName("setSize")
      var setSize_ISvg: js.UndefOr[
            js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], Unit]
          ] = js.native
      
      /** [Method] Changes the text in the sprite element
        * @param sprite Object
        * @param textString Object
        */
      @JSName("setText")
      var setText_ISvg: js.UndefOr[
            js.Function2[/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any], Unit]
          ] = js.native
    }
    object ISvg {
      
      @scala.inline
      def apply(): ISvg = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISvg]
      }
      
      @scala.inline
      implicit class ISvgMutableBuilder[Self <: ISvg] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApplyZIndex(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "applyZIndex", js.Any.fromFunction1(value))
        
        @scala.inline
        def setApplyZIndexUndefined: Self = StObject.set(x, "applyZIndex", js.undefined)
        
        @scala.inline
        def setGetRegion(value: () => IRegion): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
        
        @scala.inline
        def setHasCls(value: (/* sprite */ js.UndefOr[ISprite], /* className */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
        
        @scala.inline
        def setSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        @scala.inline
        def setSetText(value: (/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      }
    }
    
    type ISvgExporter = IBase
    
    @js.native
    trait IVml extends ISurface {
      
      /** [Method] Sets the size of the surface
        * @param width Object
        * @param height Object
        */
      @JSName("setSize")
      var setSize_IVml: js.UndefOr[
            js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], Unit]
          ] = js.native
      
      /** [Method] Changes the text in the sprite element
        * @param sprite Object
        * @param text Object
        */
      @JSName("setText")
      var setText_IVml: js.UndefOr[
            js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[js.Any], Unit]
          ] = js.native
    }
    object IVml {
      
      @scala.inline
      def apply(): IVml = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IVml]
      }
      
      @scala.inline
      implicit class IVmlMutableBuilder[Self <: IVml] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        @scala.inline
        def setSetText(value: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      }
    }
    
    @js.native
    trait ImageExporter extends StObject
    
    @js.native
    trait SvgExporter extends StObject
  }
}
