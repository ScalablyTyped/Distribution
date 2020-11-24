package typings.extjs.global.Ext.data

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.data.NodeInterface")
@js.native
class NodeInterface ()
  extends typings.extjs.Ext.data.NodeInterface
/* static members */
@JSGlobal("Ext.data.NodeInterface")
@js.native
object NodeInterface extends js.Object {
  
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
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  
  /** [Method] This method allows you to decorate a Model s class to implement the NodeInterface
    * @param modelClass Ext.Class/Ext.data.Model The Model class or an instance of the Model class you want to decorate the prototype of.
    */
  def decorate(): Unit = js.native
  def decorate(modelClass: js.Any): Unit = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}
