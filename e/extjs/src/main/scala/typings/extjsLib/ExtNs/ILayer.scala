package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayer extends IElement {
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[scala.Boolean] = js.undefined
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
      extjsLib.ExtNs.domNs.IElement
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
      extjsLib.ExtNs.domNs.IElement
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
      extjsLib.ExtNs.domNs.IElement
    ]
  ] = js.undefined
  /** [Method] overridden Element method
  		* @param left Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setLeft")
  var setLeft_ILayer: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], extjsLib.ExtNs.domNs.IElement]] = js.undefined
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
      extjsLib.ExtNs.domNs.IElement
    ]
  ] = js.undefined
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setTop")
  var setTop_ILayer: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], extjsLib.ExtNs.domNs.IElement]] = js.undefined
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
      extjsLib.ExtNs.domNs.IElement
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
      extjsLib.ExtNs.domNs.IElement
    ]
  ] = js.undefined
  /** [Method] Sets the z index of this layer and adjusts any shadow and shim z indexes
  		* @param zindex Number The new z-index to set
  		* @returns Ext.Layer The Layer
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var shim: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useDisplay: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var visibilityCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object ILayer {
  @scala.inline
  def apply(
    IElement: IElement = null,
    cls: java.lang.String = null,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    dh: js.Any = null,
    hideMode: java.lang.String = null,
    remove: js.Function0[scala.Unit] = null,
    setBounds: js.Function8[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setHeight: js.Function5[
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setLeft: js.Function1[/* left */ js.UndefOr[js.Any], extjsLib.ExtNs.domNs.IElement] = null,
    setLeftTop: js.Function2[
      /* left */ js.UndefOr[js.Any], 
      /* top */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setSize: js.Function6[
      /* w */ js.UndefOr[js.Any], 
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setTop: js.Function1[/* top */ js.UndefOr[js.Any], extjsLib.ExtNs.domNs.IElement] = null,
    setVisible: js.Function5[
      /* visible */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setWidth: js.Function5[
      /* w */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.domNs.IElement
    ] = null,
    setZIndex: js.Function1[/* zindex */ js.UndefOr[scala.Double], ILayer] = null,
    shadow: js.Any = null,
    shadowOffset: scala.Int | scala.Double = null,
    shim: js.UndefOr[scala.Boolean] = js.undefined,
    useDisplay: js.UndefOr[scala.Boolean] = js.undefined,
    visibilityCls: java.lang.String = null,
    zindex: scala.Int | scala.Double = null
  ): ILayer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElement)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (dh != null) __obj.updateDynamic("dh")(dh)
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (setBounds != null) __obj.updateDynamic("setBounds")(setBounds)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setLeft != null) __obj.updateDynamic("setLeft")(setLeft)
    if (setLeftTop != null) __obj.updateDynamic("setLeftTop")(setLeftTop)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setTop != null) __obj.updateDynamic("setTop")(setTop)
    if (setVisible != null) __obj.updateDynamic("setVisible")(setVisible)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(setZIndex)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shim)) __obj.updateDynamic("shim")(shim)
    if (!js.isUndefined(useDisplay)) __obj.updateDynamic("useDisplay")(useDisplay)
    if (visibilityCls != null) __obj.updateDynamic("visibilityCls")(visibilityCls)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayer]
  }
}

