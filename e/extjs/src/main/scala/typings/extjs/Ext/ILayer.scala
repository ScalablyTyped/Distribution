package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILayer
  extends StObject
     with IElement {
  
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var dh: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] overridden Element method
    * @param x Object
    * @param y Object
    * @param width Object
    * @param height Object
    * @param animate Object
    * @param duration Object
    * @param callback Object
    * @param easing Object
    * @returns Ext.dom.Element this
    */
  @JSName("setBounds")
  var setBounds_ILayer: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] overridden Element method
    * @param h Object
    * @param animate Object
    * @param duration Object
    * @param callback Object
    * @param easing Object
    * @returns Ext.dom.Element this
    */
  @JSName("setHeight")
  var setHeight_ILayer: js.UndefOr[
    js.Function5[
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
    * @param left Object
    * @param top Object
    * @returns Ext.dom.Element this
    */
  @JSName("setLeftTop")
  var setLeftTop_ILayer: js.UndefOr[
    js.Function2[
      /* left */ js.UndefOr[js.Any], 
      /* top */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] overridden Element method
    * @param left Object
    * @returns Ext.dom.Element this
    */
  @JSName("setLeft")
  var setLeft_ILayer: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], typings.extjs.Ext.dom.IElement]] = js.undefined
  
  /** [Method] overridden Element method
    * @param w Object
    * @param h Object
    * @param animate Object
    * @param duration Object
    * @param callback Object
    * @param easing Object
    * @returns Ext.dom.Element this
    */
  @JSName("setSize")
  var setSize_ILayer: js.UndefOr[
    js.Function6[
      /* w */ js.UndefOr[js.Any], 
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Sets the element s top position directly using CSS style instead of setY
    * @param top Object
    * @returns Ext.dom.Element this
    */
  @JSName("setTop")
  var setTop_ILayer: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], typings.extjs.Ext.dom.IElement]] = js.undefined
  
  /** [Method] overridden Element method
    * @param visible Object
    * @param animate Object
    * @param duration Object
    * @param callback Object
    * @param easing Object
    * @returns Ext.dom.Element this
    */
  @JSName("setVisible")
  var setVisible_ILayer: js.UndefOr[
    js.Function5[
      /* visible */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] overridden Element method
    * @param w Object
    * @param animate Object
    * @param duration Object
    * @param callback Object
    * @param easing Object
    * @returns Ext.dom.Element this
    */
  @JSName("setWidth")
  var setWidth_ILayer: js.UndefOr[
    js.Function5[
      /* w */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Sets the z index of this layer and adjusts any shadow and shim z indexes
    * @param zindex Number The new z-index to set
    * @returns Ext.Layer The Layer
    */
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var shim: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useDisplay: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var visibilityCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var zindex: js.UndefOr[Double] = js.undefined
}
object ILayer {
  
  inline def apply(): ILayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayer]
  }
  
  extension [Self <: ILayer](x: Self) {
    
    inline def setCls(value: java.lang.String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setDh(value: js.Any): Self = StObject.set(x, "dh", value.asInstanceOf[js.Any])
    
    inline def setDhUndefined: Self = StObject.set(x, "dh", js.undefined)
    
    inline def setHideMode(value: java.lang.String): Self = StObject.set(x, "hideMode", value.asInstanceOf[js.Any])
    
    inline def setHideModeUndefined: Self = StObject.set(x, "hideMode", js.undefined)
    
    inline def setSetBounds(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setBounds", js.Any.fromFunction8(value))
    
    inline def setSetBoundsUndefined: Self = StObject.set(x, "setBounds", js.undefined)
    
    inline def setSetHeight(
      value: (/* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setHeight", js.Any.fromFunction5(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    inline def setSetLeftTop(
      value: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setLeftTop", js.Any.fromFunction2(value))
    
    inline def setSetLeftTopUndefined: Self = StObject.set(x, "setLeftTop", js.undefined)
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetSize(
      value: (/* w */ js.UndefOr[js.Any], /* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setSize", js.Any.fromFunction6(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetTop(value: /* top */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
    
    inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
    
    inline def setSetVisible(
      value: (/* visible */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setVisible", js.Any.fromFunction5(value))
    
    inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
    
    inline def setSetWidth(
      value: (/* w */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement
    ): Self = StObject.set(x, "setWidth", js.Any.fromFunction5(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSetZIndex(value: /* zindex */ js.UndefOr[Double] => ILayer): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
    
    inline def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
    
    inline def setShadow(value: js.Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShim(value: Boolean): Self = StObject.set(x, "shim", value.asInstanceOf[js.Any])
    
    inline def setShimUndefined: Self = StObject.set(x, "shim", js.undefined)
    
    inline def setUseDisplay(value: Boolean): Self = StObject.set(x, "useDisplay", value.asInstanceOf[js.Any])
    
    inline def setUseDisplayUndefined: Self = StObject.set(x, "useDisplay", js.undefined)
    
    inline def setVisibilityCls(value: java.lang.String): Self = StObject.set(x, "visibilityCls", value.asInstanceOf[js.Any])
    
    inline def setVisibilityClsUndefined: Self = StObject.set(x, "visibilityCls", js.undefined)
    
    inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
