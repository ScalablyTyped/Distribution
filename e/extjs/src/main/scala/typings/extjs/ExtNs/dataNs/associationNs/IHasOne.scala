package typings.extjs.ExtNs.dataNs.associationNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasOne
  extends typings.extjs.ExtNs.dataNs.associationNs.IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var getterName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var setterName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IHasOne {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: java.lang.String = null,
    associatedName: java.lang.String = null,
    associationKey: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    foreignKey: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getReader: () => typings.extjs.ExtNs.dataNs.readerNs.IReader = null,
    getterName: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IHasOne = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    ownerModel: java.lang.String = null,
    ownerName: java.lang.String = null,
    primaryKey: java.lang.String = null,
    reader: typings.extjs.ExtNs.dataNs.readerNs.IReader = null,
    requires: Array = null,
    self: IClass = null,
    setterName: java.lang.String = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: java.lang.String = null,
    uses: Array = null
  ): IHasOne = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel)
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName)
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getterName != null) __obj.updateDynamic("getterName")(getterName)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel)
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setterName != null) __obj.updateDynamic("setterName")(setterName)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHasOne]
  }
}

