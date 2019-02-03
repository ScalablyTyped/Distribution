package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Cookies")
@js.native
class Cookies () extends js.Object

/* static members */
@JSGlobal("Ext.util.Cookies")
@js.native
object Cookies extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
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
  /** [Method] Removes a cookie with the provided name from the browser if found by setting its expiration date to sometime in the p
  		* @param name String The name of the cookie to remove
  		* @param path String The path for the cookie. This must be included if you included a path while setting the cookie.
  		*/
  def clear(): scala.Unit = js.native
  def clear(name: java.lang.String): scala.Unit = js.native
  def clear(name: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /** [Method] Retrieves cookies that are accessible by the current page
  		* @param name String The name of the cookie to get
  		* @returns Object Returns the cookie value for the specified name; null if the cookie name does not exist.
  		*/
  def get(): js.Any = js.native
  def get(name: java.lang.String): js.Any = js.native
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
  /** [Method] Creates a cookie with the specified name and value
  		* @param name String The name of the cookie to set.
  		* @param value Object The value to set for the cookie.
  		* @param expires Object Specify an expiration date the cookie is to persist until. Note that the specified Date object will be converted to Greenwich Mean Time (GMT).
  		* @param path String Setting a path on the cookie restricts access to pages that match that path. Defaults to all pages ('/').
  		* @param domain String Setting a domain restricts access to pages on a given domain (typically used to allow cookie access across subdomains). For example, "sencha.com" will create a cookie that can be accessed from any subdomain of sencha.com, including www.sencha.com, support.sencha.com, etc.
  		* @param secure Boolean Specify true to indicate that the cookie should only be accessible via SSL on a page using the HTTPS protocol. Defaults to false. Note that this will only work if the page calling this code uses the HTTPS protocol, otherwise the cookie will be created with default options.
  		*/
  def set(
    name: js.UndefOr[java.lang.String],
    value: js.UndefOr[js.Any],
    expires: js.UndefOr[js.Any],
    path: js.UndefOr[java.lang.String],
    domain: js.UndefOr[java.lang.String],
    secure: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

