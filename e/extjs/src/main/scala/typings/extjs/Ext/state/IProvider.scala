package typings.extjs.Ext.state

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProvider extends IObservable {
  
  /** [Method] Clears a value from the state
    * @param name String The key name
    */
  var clear: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Decodes a string previously encoded with encodeValue
    * @param value String The value to decode
    * @returns Object The decoded value
    */
  var decodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Encodes a value including type information
    * @param value Object The value to encode
    * @returns String The encoded value
    */
  var encodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], String]] = js.native
  
  /** [Method] Returns the current value for a key
    * @param name String The key name
    * @param defaultValue Object A default value to return if the key's value is not found
    * @returns Object The state data
    */
  var get: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* defaultValue */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value for a key
    * @param name String The key name
    * @param value Object The value to set
    */
  var set: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IProvider {
  
  @scala.inline
  def apply(): IProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProvider]
  }
  
  @scala.inline
  implicit class IProviderOps[Self <: IProvider] (val x: Self) extends AnyVal {
    
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
    def setClear(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setDecodeValue(value: /* value */ js.UndefOr[String] => _): Self = this.set("decodeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDecodeValue: Self = this.set("decodeValue", js.undefined)
    
    @scala.inline
    def setEncodeValue(value: /* value */ js.UndefOr[js.Any] => String): Self = this.set("encodeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncodeValue: Self = this.set("encodeValue", js.undefined)
    
    @scala.inline
    def setGet(value: (/* name */ js.UndefOr[String], /* defaultValue */ js.UndefOr[js.Any]) => _): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSet(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
