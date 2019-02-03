package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.Surface")
@js.native
class Surface () extends js.Object

/* static members */
@JSGlobal("Ext.draw.Surface")
@js.native
object Surface extends js.Object {
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
  /** [Method] Creates and returns a new concrete Surface instance appropriate for the current environment
  		* @param config Object Initial configuration for the Surface instance
  		* @param enginePriority String[] order of implementations to use; the first one that is available in the current environment will be used. Defaults to ['Svg', 'Vml'].
  		* @returns Object The created Surface or false.
  		*/
  def create(): js.Any = js.native
  def create(config: js.Any): js.Any = js.native
  def create(config: js.Any, enginePriority: extjsLib.ExtNs.Array): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  def createAlias(alias: js.Any): scala.Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Exports a surface in a different format
  		* @param surface Ext.draw.Surface The surface to export.
  		* @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
  		* @returns Object See the return types for the appropriate exporter
  		*/
  def save(): js.Any = js.native
  def save(surface: extjsLib.ExtNs.drawNs.ISurface): js.Any = js.native
  def save(surface: extjsLib.ExtNs.drawNs.ISurface, config: js.Any): js.Any = js.native
}

