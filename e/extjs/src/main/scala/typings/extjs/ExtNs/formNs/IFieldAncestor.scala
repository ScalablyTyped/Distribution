package typings.extjs.ExtNs.formNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldAncestor extends IBase {
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typings.extjs.ExtNs.formNs.fieldNs.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
}

object IFieldAncestor {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    fieldDefaults: js.Any = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IFieldAncestor = null,
    initFieldAncestor: () => Unit = null,
    mixins: js.Any = null,
    onFieldErrorChange: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[java.lang.String]) => Unit = null,
    onFieldValidityChange: (/* field */ js.UndefOr[typings.extjs.ExtNs.formNs.fieldNs.IField], /* valid */ js.UndefOr[Boolean]) => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initFieldAncestor != null) __obj.updateDynamic("initFieldAncestor")(js.Any.fromFunction0(initFieldAncestor))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2(onFieldErrorChange))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2(onFieldValidityChange))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IFieldAncestor]
  }
}

