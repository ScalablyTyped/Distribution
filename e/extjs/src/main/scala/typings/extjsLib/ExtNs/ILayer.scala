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

