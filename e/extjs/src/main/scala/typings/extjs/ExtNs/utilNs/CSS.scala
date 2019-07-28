package typings.extjs.ExtNs.utilNs

import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import typings.std.CSSStyleRule
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.CSS")
@js.native
class CSS () extends js.Object

/* static members */
@JSGlobal("Ext.util.CSS")
@js.native
object CSS extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
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
  /** [Method] Creates a rule
  		* @param styleSheet CSSStyleSheet The StyleSheet to create the rule in as returned from createStyleSheet.
  		* @param selector String The selector to target the rule.
  		* @param property String The cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
  		* @returns CSSStyleRule The created rule
  		*/
  def createRule(): CSSStyleRule = js.native
  def createRule(styleSheet: CSSStyleSheet): CSSStyleRule = js.native
  def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String): CSSStyleRule = js.native
  def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String, property: java.lang.String): CSSStyleRule = js.native
  /** [Method] Creates a stylesheet from a text blob of rules
  		* @param cssText String The text containing the css rules
  		* @param id String An id to add to the stylesheet for later removal
  		* @returns CSSStyleSheet
  		*/
  def createStyleSheet(): CSSStyleSheet = js.native
  def createStyleSheet(cssText: java.lang.String): CSSStyleSheet = js.native
  def createStyleSheet(cssText: java.lang.String, id: java.lang.String): CSSStyleSheet = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Gets an an individual CSS rule by selector s
  		* @param selector String/String[] The CSS selector or an array of selectors to try. The first selector that is found is returned.
  		* @param refreshCache Boolean true to refresh the internal cache if you have recently updated any rules or added styles dynamically
  		* @returns CSSStyleRule The CSS rule or null if one is not found
  		*/
  def getRule(): CSSStyleRule = js.native
  def getRule(selector: js.Any): CSSStyleRule = js.native
  def getRule(selector: js.Any, refreshCache: Boolean): CSSStyleRule = js.native
  /** [Method] Gets all css rules for the document
  		* @param refreshCache Boolean true to refresh the internal cache
  		* @returns Object An object (hash) of rules indexed by selector
  		*/
  def getRules(): js.Any = js.native
  def getRules(refreshCache: Boolean): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Refresh the rule cache if you have dynamically added stylesheets
  		* @returns Object An object (hash) of rules indexed by selector
  		*/
  def refreshCache(): js.Any = js.native
  /** [Method] Removes a style or link tag by id
  		* @param id String The id of the tag
  		*/
  def removeStyleSheet(): Unit = js.native
  def removeStyleSheet(id: java.lang.String): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Dynamically swaps an existing stylesheet reference for a new one
  		* @param id String The id of an existing link tag to remove
  		* @param url String The href of the new stylesheet to include
  		*/
  def swapStyleSheet(): Unit = js.native
  def swapStyleSheet(id: java.lang.String): Unit = js.native
  def swapStyleSheet(id: java.lang.String, url: java.lang.String): Unit = js.native
  /** [Method] Updates a rule property
  		* @param selector String/String[] If it's an array it tries each selector until it finds one. Stops immediately once one is found.
  		* @param property String The css property or a cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
  		* @param value String The new value for the property
  		* @returns Boolean true If a rule was found and updated
  		*/
  def updateRule(): Boolean = js.native
  def updateRule(selector: js.Any): Boolean = js.native
  def updateRule(selector: js.Any, property: java.lang.String): Boolean = js.native
  def updateRule(selector: js.Any, property: java.lang.String, value: java.lang.String): Boolean = js.native
}

