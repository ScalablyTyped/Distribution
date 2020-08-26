package typings.extjs.Ext.data.proxy

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
    * @param records Ext.data.Model[] The records array
    * @returns Array An array of record data objects
    */
  var encodeRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.native
}

object IJsonP {
  @scala.inline
  def apply(): IJsonP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonP]
  }
  @scala.inline
  implicit class IJsonPOps[Self <: IJsonP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAutoAppendParams(value: Boolean): Self = this.set("autoAppendParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAppendParams: Self = this.set("autoAppendParams", js.undefined)
    @scala.inline
    def setCallbackKey(value: String): Self = this.set("callbackKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackKey: Self = this.set("callbackKey", js.undefined)
    @scala.inline
    def setEncodeRecords(value: /* records */ js.UndefOr[Array] => Array): Self = this.set("encodeRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncodeRecords: Self = this.set("encodeRecords", js.undefined)
    @scala.inline
    def setRecordParam(value: String): Self = this.set("recordParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordParam: Self = this.set("recordParam", js.undefined)
  }
  
}

