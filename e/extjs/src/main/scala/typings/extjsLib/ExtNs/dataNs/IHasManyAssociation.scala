package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasManyAssociation
  extends extjsLib.ExtNs.dataNs.associationNs.IAssociation {
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IHasManyAssociation {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associatedModel: java.lang.String = null,
    associatedName: java.lang.String = null,
    associationKey: java.lang.String = null,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    filterProperty: java.lang.String = null,
    foreignKey: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getReader: js.Function0[extjsLib.ExtNs.dataNs.readerNs.IReader] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IHasManyAssociation] = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    name: java.lang.String = null,
    ownerModel: java.lang.String = null,
    ownerName: java.lang.String = null,
    primaryKey: java.lang.String = null,
    reader: extjsLib.ExtNs.dataNs.readerNs.IReader = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    storeConfig: js.Any = null,
    `type`: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null
  ): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel)
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName)
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterProperty != null) __obj.updateDynamic("filterProperty")(filterProperty)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel)
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeConfig != null) __obj.updateDynamic("storeConfig")(storeConfig)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHasManyAssociation]
  }
}

