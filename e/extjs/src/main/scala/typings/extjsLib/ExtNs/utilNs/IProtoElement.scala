package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtoElement
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds class to the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Property] (String) */
  var clsProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Indicates that the current state of the object has been flushed to the DOM so we need to track any subsequent changes */
  var flush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] True if the element has given class
  		* @param cls String
  		* @returns Boolean
  		*/
  var hasCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Removes class from the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Property] (String) */
  var removedProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Adds styles to the element
  		* @param prop String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property.
  		* @returns Ext.util.ProtoElement this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], this.type]
  ] = js.undefined
  /** [Property] (Boolean) */
  var styleIsText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var styleProp: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Writes style and class properties to given object
  		* @param to Object
  		* @returns Object to
  		*/
  var writeTo: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], _]] = js.undefined
}

object IProtoElement {
  @scala.inline
  def apply(
    addCls: /* cls */ js.UndefOr[java.lang.String] => IProtoElement = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clsProp: java.lang.String = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    flush: () => scala.Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    hasCls: /* cls */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IProtoElement = null,
    mixins: js.Any = null,
    removeCls: /* cls */ js.UndefOr[java.lang.String] => IProtoElement = null,
    removedProp: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setStyle: (/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => IProtoElement = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    styleIsText: js.UndefOr[scala.Boolean] = js.undefined,
    styleProp: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null,
    writeTo: /* to */ js.UndefOr[js.Any] => _ = null
  ): IProtoElement = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1(addCls))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clsProp != null) __obj.updateDynamic("clsProp")(clsProp)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction0(flush))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1(hasCls))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1(removeCls))
    if (removedProp != null) __obj.updateDynamic("removedProp")(removedProp)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(styleIsText)) __obj.updateDynamic("styleIsText")(styleIsText)
    if (styleProp != null) __obj.updateDynamic("styleProp")(styleProp)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (writeTo != null) __obj.updateDynamic("writeTo")(js.Any.fromFunction1(writeTo))
    __obj.asInstanceOf[IProtoElement]
  }
}

