package typings.extjs.global.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.proxy.IProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.Record")
@js.native
class Record ()
  extends typings.extjs.Ext.data.Record

/* static members */
@JSGlobal("Ext.data.Record")
@js.native
object Record extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  def createAlias(): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
    * @returns Ext.data.Field[] The defined Fields for this Model.
    */
  def getFields(): Array = js.native
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  /** [Method] Returns the configured Proxy for this Model
    * @returns Ext.data.proxy.Proxy The proxy
    */
  def getProxy(): IProxy = js.native
  /** [Method] Generates a sequential id
    * @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
    * @returns String auto-generated string id, "ext-record-i++";
    */
  def id(): String = js.native
  def id(rec: IModel): String = js.native
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  /** [Method] Asynchronously loads a model instance by id
    * @param id Number/String The id of the model to load
    * @param config Object config object containing success, failure and callback functions, plus optional scope
    */
  def load(): Unit = js.native
  def load(id: js.Any): Unit = js.native
  def load(id: js.Any, config: js.Any): Unit = js.native
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  /** [Method] Apply a new set of field and or property definitions to the existing model
    * @param fields Object
    * @param idProperty Object
    * @param clientIdProperty Object
    */
  def setFields(): Unit = js.native
  def setFields(fields: js.Any): Unit = js.native
  def setFields(fields: js.Any, idProperty: js.Any): Unit = js.native
  def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): Unit = js.native
  /** [Method] Sets the Proxy to use for this model
    * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
    * @returns Ext.data.proxy.Proxy
    */
  def setProxy(): IProxy = js.native
  def setProxy(proxy: js.Any): IProxy = js.native
}

