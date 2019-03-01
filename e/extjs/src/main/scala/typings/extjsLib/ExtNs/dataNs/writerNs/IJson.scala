package typings
package extjsLib.ExtNs.dataNs.writerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJson extends IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
  		* @param data Object
  		*/
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object IJson {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    allowSingle: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    dateFormat: java.lang.String = null,
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    expandData: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getExpandedData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRecordData: js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* operation */ js.UndefOr[extjsLib.ExtNs.dataNs.IOperation], 
      _
    ] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IJson] = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    root: java.lang.String = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null,
    write: js.Function1[
      /* request */ js.UndefOr[extjsLib.ExtNs.dataNs.IRequest], 
      extjsLib.ExtNs.dataNs.IRequest
    ] = null,
    writeAllFields: js.UndefOr[scala.Boolean] = js.undefined,
    writeRecordId: js.UndefOr[scala.Boolean] = js.undefined
  ): IJson = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowSingle)) __obj.updateDynamic("allowSingle")(allowSingle)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(expandData)) __obj.updateDynamic("expandData")(expandData)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getExpandedData != null) __obj.updateDynamic("getExpandedData")(getExpandedData)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(getRecordData)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(write)
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    if (!js.isUndefined(writeRecordId)) __obj.updateDynamic("writeRecordId")(writeRecordId)
    __obj.asInstanceOf[IJson]
  }
}

