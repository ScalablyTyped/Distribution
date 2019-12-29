package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUuidGenerator extends IIdGenerator {
  /** [Method] Reconfigures this generator given new config properties
  		* @param config Object
  		*/
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.undefined
}

object IUuidGenerator {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    generate: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IUuidGenerator = null,
    isGenerator: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    reconfigure: /* config */ js.UndefOr[js.Any] => Unit = null,
    requires: Array = null,
    salt: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    timestamp: js.Any = null,
    uses: Array = null,
    version: Int | Double = null
  ): IUuidGenerator = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (generate != null) __obj.updateDynamic("generate")(js.Any.fromFunction0(generate))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isGenerator)) __obj.updateDynamic("isGenerator")(isGenerator.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(js.Any.fromFunction1(reconfigure))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUuidGenerator]
  }
}

