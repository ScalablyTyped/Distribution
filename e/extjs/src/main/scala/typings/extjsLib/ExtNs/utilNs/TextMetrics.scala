package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.TextMetrics")
@js.native
class TextMetrics () extends js.Object

@JSGlobal("Ext.util.TextMetrics")
@js.native
object TextMetrics extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): extjsLib.ExtNs.IBase = js.native
  def addStatics(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  def createAlias(alias: js.Any): scala.Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Destroy the TextMetrics instance created by measure  */
  def destroy(): scala.Unit = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Measures the size of the specified text
  		* @param el String/HTMLElement The element, dom node or id from which to copy existing CSS styles that can affect the size of the rendered text
  		* @param text String The text to measure
  		* @param fixedWidth Number If the text will be multiline, you have to set a fixed width in order to accurately measure the text height
  		* @returns Object An object containing the text's size {width: (width), height: (height)}
  		*/
  def measure(): js.Any = js.native
  def measure(el: js.Any): js.Any = js.native
  def measure(el: js.Any, text: java.lang.String): js.Any = js.native
  def measure(el: js.Any, text: java.lang.String, fixedWidth: scala.Double): js.Any = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
}

