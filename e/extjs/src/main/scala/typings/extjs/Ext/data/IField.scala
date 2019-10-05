package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends IBase {
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dateReadFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dateWriteFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var serialize: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Function/String) */
  var sortType: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    convert: js.Any = null,
    dateFormat: java.lang.String = null,
    dateReadFormat: java.lang.String = null,
    dateWriteFormat: java.lang.String = null,
    defaultValue: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IField = null,
    mapping: js.Any = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    requires: Array = null,
    self: IClass = null,
    serialize: js.Any = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortDir: java.lang.String = null,
    sortType: js.Any = null,
    statics: js.Any = null,
    `type`: js.Any = null,
    useNull: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (convert != null) __obj.updateDynamic("convert")(convert)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dateReadFormat != null) __obj.updateDynamic("dateReadFormat")(dateReadFormat)
    if (dateWriteFormat != null) __obj.updateDynamic("dateWriteFormat")(dateWriteFormat)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortDir != null) __obj.updateDynamic("sortDir")(sortDir)
    if (sortType != null) __obj.updateDynamic("sortType")(sortType)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useNull)) __obj.updateDynamic("useNull")(useNull)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IField]
  }
}

