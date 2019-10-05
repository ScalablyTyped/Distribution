package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataWriter extends IBase {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Ext.data.Model The record that we are writing to the server.
  		* @param operation Ext.data.Operation An operation object.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], _]
  ] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns Ext.data.Request The modified request object
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var writeRecordId: js.UndefOr[Boolean] = js.undefined
}

object IDataWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    dateFormat: java.lang.String = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getRecordData: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDataWriter = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => IRequest = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined,
    writeRecordId: js.UndefOr[Boolean] = js.undefined
  ): IDataWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction2(getRecordData))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    if (!js.isUndefined(writeRecordId)) __obj.updateDynamic("writeRecordId")(writeRecordId)
    __obj.asInstanceOf[IDataWriter]
  }
}

