package typings.extjs.Ext.draw.engine

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.engine.ImageExporter")
@js.native
class ImageExporter () extends js.Object

/* static members */
@JSGlobal("Ext.draw.engine.ImageExporter")
@js.native
object ImageExporter extends js.Object {
  /** [Property] (String) */
  var defaultUrl: String = js.native
  /** [Property] (String) */
  var heightParam: String = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Array) */
  var supportedTypes: Array = js.native
  /** [Property] (String) */
  var svgParam: String = js.native
  /** [Property] (String) */
  var typeParam: String = js.native
  /** [Property] (String) */
  var widthParam: String = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Exports the surface to an image
  		* @param surface Ext.draw.Surface The surface to export
  		* @param config Object The following config options are supported:
  		* @returns Boolean True if the surface was successfully sent to the server.
  		*/
  def generate(): Boolean = js.native
  def generate(surface: ISurface): Boolean = js.native
  def generate(surface: ISurface, config: js.Any): Boolean = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

