package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.JsonP")
@js.native
class JsonP () extends js.Object

/* static members */
@JSGlobal("Ext.data.JsonP")
@js.native
object JsonP extends js.Object {
  /** [Property] (String) */
  var callbackKey: java.lang.String = js.native
  /** [Property] (Boolean) */
  var disableCaching: scala.Boolean = js.native
  /** [Property] (String) */
  var disableCachingParam: java.lang.String = js.native
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Property] (Number) */
  var timeout: scala.Double = js.native
  /** [Method] Abort a request
  		* @param request Object/String The request to abort
  		*/
  def abort(): scala.Unit = js.native
  def abort(request: js.Any): scala.Unit = js.native
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
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Makes a JSONP request
  		* @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.  url : String The URL to request. params : Object (Optional)An object containing a series of key value pairs that will be sent along with the request. timeout : Number (Optional) See timeout callbackKey : String (Optional) See callbackKey callbackName : String (Optional) The function name to use for this request. By default this name will be auto-generated: Ext.data.JsonP.callback1, Ext.data.JsonP.callback2, etc. Setting this option to "my_name" will force the function name to be Ext.data.JsonP.my_name. Use this if you want deterministic behavior, but be careful - the callbackName should be different in each JsonP request that you make. disableCaching : Boolean (Optional) See disableCaching disableCachingParam : String (Optional) See disableCachingParam success : Function (Optional) A function to execute if the request succeeds. failure : Function (Optional) A function to execute if the request fails. callback : Function (Optional) A function to execute when the request completes, whether it is a success or failure. scope : Object (Optional)The scope in which to execute the callbacks: The "this" object for the callback function. Defaults to the browser window.
  		* @returns Object request An object containing the request details.
  		*/
  def request(): js.Any = js.native
  def request(options: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

