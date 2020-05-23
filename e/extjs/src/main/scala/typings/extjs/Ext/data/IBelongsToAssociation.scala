package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBelongsToAssociation
  extends typings.extjs.Ext.data.association.IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object IBelongsToAssociation {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    foreignKey: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getReader: () => typings.extjs.Ext.data.reader.IReader = null,
    getterName: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBelongsToAssociation = null,
    mixins: js.Any = null,
    model: String = null,
    ownerModel: String = null,
    ownerName: String = null,
    primaryKey: String = null,
    reader: typings.extjs.Ext.data.reader.IReader = null,
    requires: Array = null,
    self: IClass = null,
    setterName: String = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IBelongsToAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getterName != null) __obj.updateDynamic("getterName")(getterName.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setterName != null) __obj.updateDynamic("setterName")(setterName.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBelongsToAssociation]
  }
}

