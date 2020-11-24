package typings.extjs.Ext.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayer
  extends typings.extjs.Ext.IElement {
  
  /** [Config Option] (String) */
  var cls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var dh: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[String] = js.native
  
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
      IElement
    ]
  ] = js.native
  
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
      IElement
    ]
  ] = js.native
  
  /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
    * @param left Object
    * @param top Object
    * @returns Ext.dom.Element this
    */
  @JSName("setLeftTop")
  var setLeftTop_ILayer: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any], IElement]
  ] = js.native
  
  /** [Method] overridden Element method
    * @param left Object
    * @returns Ext.dom.Element this
    */
  @JSName("setLeft")
  var setLeft_ILayer: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], IElement]] = js.native
  
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
      IElement
    ]
  ] = js.native
  
  /** [Method] Sets the element s top position directly using CSS style instead of setY
    * @param top Object
    * @returns Ext.dom.Element this
    */
  @JSName("setTop")
  var setTop_ILayer: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], IElement]] = js.native
  
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
      IElement
    ]
  ] = js.native
  
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
      IElement
    ]
  ] = js.native
  
  /** [Method] Sets the z index of this layer and adjusts any shadow and shim z indexes
    * @param zindex Number The new z-index to set
    * @returns Ext.Layer The Layer
    */
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var shim: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var useDisplay: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var visibilityCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var zindex: js.UndefOr[Double] = js.native
}
object ILayer {
  
  @scala.inline
  def apply(): ILayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayer]
  }
  
  @scala.inline
  implicit class ILayerOps[Self <: ILayer] (val x: Self) extends AnyVal {
    
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
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setConstrain(value: Boolean): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setDh(value: js.Any): Self = this.set("dh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDh: Self = this.set("dh", js.undefined)
    
    @scala.inline
    def setHideMode(value: String): Self = this.set("hideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMode: Self = this.set("hideMode", js.undefined)
    
    @scala.inline
    def setSetBounds(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = this.set("setBounds", js.Any.fromFunction8(value))
    
    @scala.inline
    def deleteSetBounds: Self = this.set("setBounds", js.undefined)
    
    @scala.inline
    def setSetHeight(
      value: (/* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = this.set("setHeight", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[js.Any] => IElement): Self = this.set("setLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    
    @scala.inline
    def setSetLeftTop(value: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => IElement): Self = this.set("setLeftTop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetLeftTop: Self = this.set("setLeftTop", js.undefined)
    
    @scala.inline
    def setSetSize(
      value: (/* w */ js.UndefOr[js.Any], /* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = this.set("setSize", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setSetTop(value: /* top */ js.UndefOr[js.Any] => IElement): Self = this.set("setTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTop: Self = this.set("setTop", js.undefined)
    
    @scala.inline
    def setSetVisible(
      value: (/* visible */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = this.set("setVisible", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteSetVisible: Self = this.set("setVisible", js.undefined)
    
    @scala.inline
    def setSetWidth(
      value: (/* w */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = this.set("setWidth", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setSetZIndex(value: /* zindex */ js.UndefOr[Double] => ILayer): Self = this.set("setZIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetZIndex: Self = this.set("setZIndex", js.undefined)
    
    @scala.inline
    def setShadow(value: js.Any): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Double): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    
    @scala.inline
    def setShim(value: Boolean): Self = this.set("shim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShim: Self = this.set("shim", js.undefined)
    
    @scala.inline
    def setUseDisplay(value: Boolean): Self = this.set("useDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDisplay: Self = this.set("useDisplay", js.undefined)
    
    @scala.inline
    def setVisibilityCls(value: String): Self = this.set("visibilityCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilityCls: Self = this.set("visibilityCls", js.undefined)
    
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
