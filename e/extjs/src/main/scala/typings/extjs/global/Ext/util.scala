package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.util.IPoint
import typings.extjs.Ext.util.IRegion
import typings.std.CSSStyleRule
import typings.std.CSSStyleSheet
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("Ext.util.CSS")
  @js.native
  class CSS ()
    extends typings.extjs.Ext.util.CSS
  /* static members */
  object CSS {
    
    @JSGlobal("Ext.util.CSS")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.util.CSS.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.util.CSS.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.util.CSS.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.util.CSS.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.util.CSS.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.util.CSS.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Creates a rule
      * @param styleSheet CSSStyleSheet The StyleSheet to create the rule in as returned from createStyleSheet.
      * @param selector String The selector to target the rule.
      * @param property String The cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
      * @returns CSSStyleRule The created rule
      */
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(
      styleSheet: js.UndefOr[scala.Nothing],
      selector: js.UndefOr[scala.Nothing],
      property: java.lang.String
    ): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: js.UndefOr[scala.Nothing], selector: java.lang.String): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: js.UndefOr[scala.Nothing], selector: java.lang.String, property: java.lang.String): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: CSSStyleSheet): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: CSSStyleSheet, selector: js.UndefOr[scala.Nothing], property: java.lang.String): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.createRule")
    @js.native
    def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String, property: java.lang.String): CSSStyleRule = js.native
    
    /** [Method] Creates a stylesheet from a text blob of rules
      * @param cssText String The text containing the css rules
      * @param id String An id to add to the stylesheet for later removal
      * @returns CSSStyleSheet
      */
    @JSGlobal("Ext.util.CSS.createStyleSheet")
    @js.native
    def createStyleSheet(): CSSStyleSheet = js.native
    @JSGlobal("Ext.util.CSS.createStyleSheet")
    @js.native
    def createStyleSheet(cssText: js.UndefOr[scala.Nothing], id: java.lang.String): CSSStyleSheet = js.native
    @JSGlobal("Ext.util.CSS.createStyleSheet")
    @js.native
    def createStyleSheet(cssText: java.lang.String): CSSStyleSheet = js.native
    @JSGlobal("Ext.util.CSS.createStyleSheet")
    @js.native
    def createStyleSheet(cssText: java.lang.String, id: java.lang.String): CSSStyleSheet = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.util.CSS.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.util.CSS.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Gets an an individual CSS rule by selector s
      * @param selector String/String[] The CSS selector or an array of selectors to try. The first selector that is found is returned.
      * @param refreshCache Boolean true to refresh the internal cache if you have recently updated any rules or added styles dynamically
      * @returns CSSStyleRule The CSS rule or null if one is not found
      */
    @JSGlobal("Ext.util.CSS.getRule")
    @js.native
    def getRule(): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.getRule")
    @js.native
    def getRule(selector: js.UndefOr[scala.Nothing], refreshCache: Boolean): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.getRule")
    @js.native
    def getRule(selector: js.Any): CSSStyleRule = js.native
    @JSGlobal("Ext.util.CSS.getRule")
    @js.native
    def getRule(selector: js.Any, refreshCache: Boolean): CSSStyleRule = js.native
    
    /** [Method] Gets all css rules for the document
      * @param refreshCache Boolean true to refresh the internal cache
      * @returns Object An object (hash) of rules indexed by selector
      */
    @JSGlobal("Ext.util.CSS.getRules")
    @js.native
    def getRules(): js.Any = js.native
    @JSGlobal("Ext.util.CSS.getRules")
    @js.native
    def getRules(refreshCache: Boolean): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.CSS.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.util.CSS.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Refresh the rule cache if you have dynamically added stylesheets
      * @returns Object An object (hash) of rules indexed by selector
      */
    @JSGlobal("Ext.util.CSS.refreshCache")
    @js.native
    def refreshCache(): js.Any = js.native
    
    /** [Method] Removes a style or link tag by id
      * @param id String The id of the tag
      */
    @JSGlobal("Ext.util.CSS.removeStyleSheet")
    @js.native
    def removeStyleSheet(): Unit = js.native
    @JSGlobal("Ext.util.CSS.removeStyleSheet")
    @js.native
    def removeStyleSheet(id: java.lang.String): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.CSS.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.util.CSS.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Dynamically swaps an existing stylesheet reference for a new one
      * @param id String The id of an existing link tag to remove
      * @param url String The href of the new stylesheet to include
      */
    @JSGlobal("Ext.util.CSS.swapStyleSheet")
    @js.native
    def swapStyleSheet(): Unit = js.native
    @JSGlobal("Ext.util.CSS.swapStyleSheet")
    @js.native
    def swapStyleSheet(id: js.UndefOr[scala.Nothing], url: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.CSS.swapStyleSheet")
    @js.native
    def swapStyleSheet(id: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.CSS.swapStyleSheet")
    @js.native
    def swapStyleSheet(id: java.lang.String, url: java.lang.String): Unit = js.native
    
    /** [Method] Updates a rule property
      * @param selector String/String[] If it's an array it tries each selector until it finds one. Stops immediately once one is found.
      * @param property String The css property or a cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
      * @param value String The new value for the property
      * @returns Boolean true If a rule was found and updated
      */
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.UndefOr[scala.Nothing], property: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.UndefOr[scala.Nothing], property: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.UndefOr[scala.Nothing], property: java.lang.String, value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.Any): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.Any, property: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.Any, property: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.CSS.updateRule")
    @js.native
    def updateRule(selector: js.Any, property: java.lang.String, value: java.lang.String): Boolean = js.native
  }
  
  @JSGlobal("Ext.util.Cookies")
  @js.native
  class Cookies ()
    extends typings.extjs.Ext.util.Cookies
  /* static members */
  object Cookies {
    
    @JSGlobal("Ext.util.Cookies")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.util.Cookies.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.util.Cookies.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.util.Cookies.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.util.Cookies.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.util.Cookies.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.util.Cookies.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes a cookie with the provided name from the browser if found by setting its expiration date to sometime in the p
      * @param name String The name of the cookie to remove
      * @param path String The path for the cookie. This must be included if you included a path while setting the cookie.
      */
    @JSGlobal("Ext.util.Cookies.clear")
    @js.native
    def clear(): Unit = js.native
    @JSGlobal("Ext.util.Cookies.clear")
    @js.native
    def clear(name: js.UndefOr[scala.Nothing], path: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Cookies.clear")
    @js.native
    def clear(name: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Cookies.clear")
    @js.native
    def clear(name: java.lang.String, path: java.lang.String): Unit = js.native
    
    /** [Method] Retrieves cookies that are accessible by the current page
      * @param name String The name of the cookie to get
      * @returns Object Returns the cookie value for the specified name; null if the cookie name does not exist.
      */
    @JSGlobal("Ext.util.Cookies.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.util.Cookies.get")
    @js.native
    def get(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.util.Cookies.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.util.Cookies.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Cookies.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.util.Cookies.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.Cookies.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Creates a cookie with the specified name and value
      * @param name String The name of the cookie to set.
      * @param value Object The value to set for the cookie.
      * @param expires Object Specify an expiration date the cookie is to persist until. Note that the specified Date object will be converted to Greenwich Mean Time (GMT).
      * @param path String Setting a path on the cookie restricts access to pages that match that path. Defaults to all pages ('/').
      * @param domain String Setting a domain restricts access to pages on a given domain (typically used to allow cookie access across subdomains). For example, "sencha.com" will create a cookie that can be accessed from any subdomain of sencha.com, including www.sencha.com, support.sencha.com, etc.
      * @param secure Boolean Specify true to indicate that the cookie should only be accessible via SSL on a page using the HTTPS protocol. Defaults to false. Note that this will only work if the page calling this code uses the HTTPS protocol, otherwise the cookie will be created with default options.
      */
    @JSGlobal("Ext.util.Cookies.set")
    @js.native
    def set(
      name: js.UndefOr[java.lang.String],
      value: js.UndefOr[js.Any],
      expires: js.UndefOr[js.Any],
      path: js.UndefOr[java.lang.String],
      domain: js.UndefOr[java.lang.String],
      secure: js.UndefOr[Boolean]
    ): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.util.Cookies.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.util.Filter")
  @js.native
  class Filter ()
    extends typings.extjs.Ext.util.Filter
  /* static members */
  object Filter {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.Filter.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.Filter.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Filter.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.Filter.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.Filter.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.Filter.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.Filter.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Filter.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Filter.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Creates a single filter function which encapsulates the passed Filter array
      * @param filters Ext.util.Filter[] The filter set for which to create a filter function
      * @returns Function a function, which when passed a candidate object returns true if the candidate passes all the specified Filters.
      */
    @JSGlobal("Ext.util.Filter.createFilterFn")
    @js.native
    def createFilterFn(): js.Any = js.native
    @JSGlobal("Ext.util.Filter.createFilterFn")
    @js.native
    def createFilterFn(filters: typings.extjs.Ext.Array): js.Any = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.Filter.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.Filter.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.Filter.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.Filter.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.util.Format")
  @js.native
  class Format ()
    extends typings.extjs.Ext.util.Format
  /* static members */
  object Format {
    
    @JSGlobal("Ext.util.Format")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Formats an object of name value properties as HTML element attribute values suitable for using when creating textual
      * @param attributes Object An object containing the HTML attributes as properties eg: {height:40, vAlign:'top'}
      */
    @JSGlobal("Ext.util.Format.attributes")
    @js.native
    def attributes(): Unit = js.native
    @JSGlobal("Ext.util.Format.attributes")
    @js.native
    def attributes(attributes: js.Any): Unit = js.native
    
    /** [Method] Alias for Ext String capitalize
      * @param string String
      * @returns String
      */
    @JSGlobal("Ext.util.Format.capitalize")
    @js.native
    def capitalize(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.capitalize")
    @js.native
    def capitalize(string: java.lang.String): java.lang.String = js.native
    
    /** [Method] Format a number as a currency
      * @param value Number/String The numeric value to format
      * @param sign String The currency sign to use (defaults to currencySign)
      * @param decimals Number The number of decimals to use for the currency (defaults to currencyPrecision)
      * @param end Boolean True if the currency sign should be at the end of the string (defaults to currencyAtEnd)
      * @returns String The formatted currency string
      */
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(
      value: js.UndefOr[scala.Nothing],
      sign: js.UndefOr[scala.Nothing],
      decimals: js.UndefOr[scala.Nothing],
      end: Boolean
    ): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], decimals: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], decimals: Double, end: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.UndefOr[scala.Nothing], sign: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(
      value: js.UndefOr[scala.Nothing],
      sign: java.lang.String,
      decimals: js.UndefOr[scala.Nothing],
      end: Boolean
    ): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.UndefOr[scala.Nothing], sign: java.lang.String, decimals: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.UndefOr[scala.Nothing], sign: java.lang.String, decimals: Double, end: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: js.UndefOr[scala.Nothing], decimals: js.UndefOr[scala.Nothing], end: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: js.UndefOr[scala.Nothing], decimals: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: js.UndefOr[scala.Nothing], decimals: Double, end: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: java.lang.String, decimals: js.UndefOr[scala.Nothing], end: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: java.lang.String, decimals: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.currency")
    @js.native
    def currency(value: js.Any, sign: java.lang.String, decimals: Double, end: Boolean): java.lang.String = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.util.Format.currencyAtEnd")
    @js.native
    def currencyAtEnd: Boolean = js.native
    @scala.inline
    def currencyAtEnd_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencyAtEnd")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.util.Format.currencyPrecision")
    @js.native
    def currencyPrecision: Double = js.native
    @scala.inline
    def currencyPrecision_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencyPrecision")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.Format.currencySign")
    @js.native
    def currencySign: java.lang.String = js.native
    @scala.inline
    def currencySign_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(x.asInstanceOf[js.Any])
    
    /** [Method] Formats the passed date using the specified format pattern
      * @param value String/Date The value to format. If a string is passed, it is converted to a Date by the Javascript's built-in Date.parse method.
      * @param format String Any valid date format string. Defaults to Ext.Date.defaultFormat.
      * @returns String The formatted date string.
      */
    @JSGlobal("Ext.util.Format.date")
    @js.native
    def date(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.date")
    @js.native
    def date(value: js.UndefOr[scala.Nothing], format: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.date")
    @js.native
    def date(value: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.date")
    @js.native
    def date(value: js.Any, format: java.lang.String): java.lang.String = js.native
    
    /** [Method] Returns a date rendering function that can be reused to apply a date format multiple times efficiently
      * @param format String Any valid date format string. Defaults to Ext.Date.defaultFormat.
      * @returns Function The date formatting function
      */
    @JSGlobal("Ext.util.Format.dateRenderer")
    @js.native
    def dateRenderer(): js.Any = js.native
    @JSGlobal("Ext.util.Format.dateRenderer")
    @js.native
    def dateRenderer(format: java.lang.String): js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.Format.decimalSeparator")
    @js.native
    def decimalSeparator: java.lang.String = js.native
    @scala.inline
    def decimalSeparator_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(x.asInstanceOf[js.Any])
    
    /** [Method] Checks a reference and converts it to the default value if it s empty
      * @param value Object Reference to check
      * @param defaultValue String The value to insert of it's undefined.
      * @returns String
      */
    @JSGlobal("Ext.util.Format.defaultValue")
    @js.native
    def defaultValue(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.defaultValue")
    @js.native
    def defaultValue(value: js.UndefOr[scala.Nothing], defaultValue: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.defaultValue")
    @js.native
    def defaultValue(value: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.defaultValue")
    @js.native
    def defaultValue(value: js.Any, defaultValue: java.lang.String): java.lang.String = js.native
    
    /** [Method] Alias for Ext String ellipsis
      * @param value String The string to truncate.
      * @param length Number The maximum length to allow before truncating.
      * @param word Boolean true to try to find a common word break.
      * @returns String The converted text.
      */
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: Double, word: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: java.lang.String, length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: java.lang.String, length: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.ellipsis")
    @js.native
    def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = js.native
    
    /** [Method] Escapes the passed string for use in a regular expression
      * @param str String
      * @returns String
      */
    @JSGlobal("Ext.util.Format.escapeRegex")
    @js.native
    def escapeRegex(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.escapeRegex")
    @js.native
    def escapeRegex(str: java.lang.String): java.lang.String = js.native
    
    /** [Method] Simple format for a file size xxx bytes xxx KB xxx MB
      * @param size Number/String The numeric value to format
      * @returns String The formatted file size
      */
    @JSGlobal("Ext.util.Format.fileSize")
    @js.native
    def fileSize(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.fileSize")
    @js.native
    def fileSize(size: js.Any): java.lang.String = js.native
    
    /** [Method] Alias for Ext String format
      * @param string String The tokenized string to be formatted.
      * @param values Mixed... The values to replace tokens {0}, {1}, etc in order.
      * @returns String The formatted string.
      */
    @JSGlobal("Ext.util.Format.format")
    @js.native
    def format(string: java.lang.String, values: js.Any*): java.lang.String = js.native
    
    /** [Method] Alias for Ext String htmlDecode
      * @param value String The string to decode.
      * @returns String The decoded text.
      */
    @JSGlobal("Ext.util.Format.htmlDecode")
    @js.native
    def htmlDecode(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.htmlDecode")
    @js.native
    def htmlDecode(value: java.lang.String): java.lang.String = js.native
    
    /** [Method] Alias for Ext String htmlEncode
      * @param value String The string to encode.
      * @returns String The encoded text.
      */
    @JSGlobal("Ext.util.Format.htmlEncode")
    @js.native
    def htmlEncode(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.htmlEncode")
    @js.native
    def htmlEncode(value: java.lang.String): java.lang.String = js.native
    
    /** [Method] Alias for Ext String leftPad
      * @param string String The original string.
      * @param size Number The total length of the output string.
      * @param character String The character with which to pad the original string.
      * @returns String The padded string.
      */
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: js.UndefOr[scala.Nothing], character: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: Double, character: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: java.lang.String, size: js.UndefOr[scala.Nothing], character: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: java.lang.String, size: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.leftPad")
    @js.native
    def leftPad(string: java.lang.String, size: Double, character: java.lang.String): java.lang.String = js.native
    
    /** [Method] Converts a string to all lower case letters
      * @param value String The text to convert
      * @returns String The converted text
      */
    @JSGlobal("Ext.util.Format.lowercase")
    @js.native
    def lowercase(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.lowercase")
    @js.native
    def lowercase(value: java.lang.String): java.lang.String = js.native
    
    /** [Method] It does simple math for use in a template for example  var tpl  new Ext Template  value 10 value math 10
      * @returns Function A function that operates on the passed value.
      */
    @JSGlobal("Ext.util.Format.math")
    @js.native
    def math(): js.Any = js.native
    
    /** [Method] Converts newline characters to the HTML tag lt br gt
      * @param v String The string value to format.
      * @returns String The string with embedded &lt;br/&gt; tags in place of newlines.
      */
    @JSGlobal("Ext.util.Format.nl2br")
    @js.native
    def nl2br(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.nl2br")
    @js.native
    def nl2br(v: java.lang.String): java.lang.String = js.native
    
    /** [Method] Formats the passed number according to the passed format string
      * @param v Number The number to format.
      * @param format String The way you would like to format this text.
      * @returns String The formatted number.
      */
    @JSGlobal("Ext.util.Format.number")
    @js.native
    def number(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.number")
    @js.native
    def number(v: js.UndefOr[scala.Nothing], format: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.number")
    @js.native
    def number(v: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.number")
    @js.native
    def number(v: Double, format: java.lang.String): java.lang.String = js.native
    
    /** [Method] Returns a number rendering function that can be reused to apply a number format multiple times efficiently
      * @param format String Any valid number format string for number
      * @returns Function The number formatting function
      */
    @JSGlobal("Ext.util.Format.numberRenderer")
    @js.native
    def numberRenderer(): js.Any = js.native
    @JSGlobal("Ext.util.Format.numberRenderer")
    @js.native
    def numberRenderer(format: java.lang.String): js.Any = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param v Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    @JSGlobal("Ext.util.Format.parseBox")
    @js.native
    def parseBox(): js.Any = js.native
    @JSGlobal("Ext.util.Format.parseBox")
    @js.native
    def parseBox(v: js.Any): js.Any = js.native
    
    /** [Method] Selectively do a plural form of a word based on a numeric value
      * @param value Number The value to compare against
      * @param singular String The singular form of the word
      * @param plural String The plural form of the word (defaults to the singular with an "s")
      */
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: js.UndefOr[scala.Nothing], singular: js.UndefOr[scala.Nothing], plural: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: js.UndefOr[scala.Nothing], singular: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: js.UndefOr[scala.Nothing], singular: java.lang.String, plural: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: Double): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: Double, singular: js.UndefOr[scala.Nothing], plural: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: Double, singular: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Format.plural")
    @js.native
    def plural(value: Double, singular: java.lang.String, plural: java.lang.String): Unit = js.native
    
    /** [Method] Rounds the passed number to the required decimal precision
      * @param value Number/String The numeric value to round.
      * @param precision Number The number of decimal places to which to round the first parameter's value.
      * @returns Number The rounded value.
      */
    @JSGlobal("Ext.util.Format.round")
    @js.native
    def round(): Double = js.native
    @JSGlobal("Ext.util.Format.round")
    @js.native
    def round(value: js.UndefOr[scala.Nothing], precision: Double): Double = js.native
    @JSGlobal("Ext.util.Format.round")
    @js.native
    def round(value: js.Any): Double = js.native
    @JSGlobal("Ext.util.Format.round")
    @js.native
    def round(value: js.Any, precision: Double): Double = js.native
    
    /** [Method] Strips all script tags
      * @param value Object The text from which to strip script tags
      * @returns String The stripped text
      */
    @JSGlobal("Ext.util.Format.stripScripts")
    @js.native
    def stripScripts(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.stripScripts")
    @js.native
    def stripScripts(value: js.Any): java.lang.String = js.native
    
    /** [Method] Strips all HTML tags
      * @param value Object The text from which to strip tags
      * @returns String The stripped text
      */
    @JSGlobal("Ext.util.Format.stripTags")
    @js.native
    def stripTags(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.stripTags")
    @js.native
    def stripTags(value: js.Any): java.lang.String = js.native
    
    /** [Method] Returns a substring from within an original string
      * @param value String The original text
      * @param start Number The start index of the substring
      * @param length Number The length of the substring
      * @returns String The substring
      */
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], length: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: js.UndefOr[scala.Nothing], start: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: js.UndefOr[scala.Nothing], start: Double, length: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: java.lang.String, start: js.UndefOr[scala.Nothing], length: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: java.lang.String, start: Double): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.substr")
    @js.native
    def substr(value: java.lang.String, start: Double, length: Double): java.lang.String = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.Format.thousandSeparator")
    @js.native
    def thousandSeparator: java.lang.String = js.native
    @scala.inline
    def thousandSeparator_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparator")(x.asInstanceOf[js.Any])
    
    /** [Method] Alias for Ext String trim
      * @param string String The string to trim.
      * @returns String The trimmed string.
      */
    @JSGlobal("Ext.util.Format.trim")
    @js.native
    def trim(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.trim")
    @js.native
    def trim(string: java.lang.String): java.lang.String = js.native
    
    /** [Method] Checks a reference and converts it to empty string if it is undefined
      * @param value Object Reference to check
      * @returns Object Empty string if converted, otherwise the original value
      */
    @JSGlobal("Ext.util.Format.undef")
    @js.native
    def undef(): js.Any = js.native
    @JSGlobal("Ext.util.Format.undef")
    @js.native
    def undef(value: js.Any): js.Any = js.native
    
    /** [Method] Converts a string to all upper case letters
      * @param value String The text to convert
      * @returns String The converted text
      */
    @JSGlobal("Ext.util.Format.uppercase")
    @js.native
    def uppercase(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.uppercase")
    @js.native
    def uppercase(value: java.lang.String): java.lang.String = js.native
    
    /** [Method] Format a number as US currency
      * @param value Number/String The numeric value to format
      * @returns String The formatted currency string
      */
    @JSGlobal("Ext.util.Format.usMoney")
    @js.native
    def usMoney(): java.lang.String = js.native
    @JSGlobal("Ext.util.Format.usMoney")
    @js.native
    def usMoney(value: js.Any): java.lang.String = js.native
  }
  
  @JSGlobal("Ext.util.Functions")
  @js.native
  class Functions ()
    extends typings.extjs.Ext.util.Functions
  /* static members */
  object Functions {
    
    /** [Method] Create an alias to the provided method property with name methodName of object
      * @param object Object/Function
      * @param methodName String
      * @returns Function aliasFn
      */
    @JSGlobal("Ext.util.Functions.alias")
    @js.native
    def alias(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.alias")
    @js.native
    def alias(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.Functions.alias")
    @js.native
    def alias(`object`: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.alias")
    @js.native
    def alias(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the default global environment object (usually the browser window).
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
      * @returns Function The new function
      */
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.bind")
    @js.native
    def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
    
    @JSGlobal("Ext.util.Functions.clone")
    @js.native
    def clone(method: js.Any): js.Any = js.native
    
    /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
      * @param fn Function The function to invoke on a buffered timer.
      * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
      * @returns Function A function which invokes the passed function after buffering for the specified time.
      */
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(
      fn: js.Any,
      buffer: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createBuffered")
    @js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    
    /** [Method] Creates a delegate callback which when called executes after a specific delay
      * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
      * @param delay Number The number of milliseconds to defer execution by whenever called.
      * @param scope Object The scope (this reference) used by the function at execution time.
      * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function A function which, when called, executes the original function after the specified delay.
      */
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(
      fn: js.Any,
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createDelayed")
    @js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
    
    /** [Method] Creates an interceptor function
      * @param origFn Function The original function.
      * @param newFn Function The function to call before the original
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @param returnValue Object The value to return if the passed function return false.
      * @returns Function The new function
      */
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      returnValue: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(
      origFn: js.Any,
      newFn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any, returnValue: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.UndefOr[scala.Nothing], returnValue: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createInterceptor")
    @js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = js.native
    
    /** [Method] Create a combined function call sequence of the original function  the passed function
      * @param originalFn Function The original function.
      * @param newFn Function The function to sequence
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the default global environment object (usually the browser window).
      * @returns Function The new function
      */
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createSequence")
    @js.native
    def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
      * @param fn Function The function to execute at a regular time interval.
      * @param interval Number The interval in milliseconds on which the passed function is executed.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @returns Function A function which invokes the passed function at the specified interval.
      */
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: Double, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.Any, interval: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.Any, interval: Double): js.Any = js.native
    @JSGlobal("Ext.util.Functions.createThrottled")
    @js.native
    def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = js.native
    
    /** [Method] Calls this function after the number of millseconds specified optionally in a specific scope
      * @param fn Function The function to defer.
      * @param millis Number The number of milliseconds for the setTimeout call (if less than or equal to 0 the function is executed immediately)
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
      * @returns Number The timeout id that can be used with clearTimeout
      */
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double, scope: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.extjs.Ext.Array): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double, scope: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(
      fn: js.Any,
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.extjs.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = js.native
    @JSGlobal("Ext.util.Functions.defer")
    @js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = js.native
    
    /** [Method] A very commonly used method throughout the framework
      * @param setter Function
      * @returns Function flexSetter
      */
    @JSGlobal("Ext.util.Functions.flexSetter")
    @js.native
    def flexSetter(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.flexSetter")
    @js.native
    def flexSetter(setter: js.Any): js.Any = js.native
    
    /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: java.lang.String,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(
      `object`: js.Any,
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptAfter")
    @js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: java.lang.String,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(
      `object`: js.Any,
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.interceptBefore")
    @js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
      * @param fn Function The original function
      * @param args Array The arguments to pass to new callback
      * @param scope Object The scope (this reference) in which the function is executed.
      * @returns Function The new callback function
      */
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.Any, args: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.Functions.pass")
    @js.native
    def pass(fn: js.Any, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = js.native
  }
  
  @JSGlobal("Ext.util.History")
  @js.native
  class History ()
    extends typings.extjs.Ext.util.History
  /* static members */
  object History {
    
    @JSGlobal("Ext.util.History")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add a new token to the history stack
      * @param token String The value that defines a particular application-specific history state
      * @param preventDuplicates Boolean When true, if the passed token matches the current token it will not save a new history step. Set to false if the same state can be saved more than once at the same history stack location.
      */
    @JSGlobal("Ext.util.History.add")
    @js.native
    def add(): Unit = js.native
    @JSGlobal("Ext.util.History.add")
    @js.native
    def add(token: js.UndefOr[scala.Nothing], preventDuplicates: Boolean): Unit = js.native
    @JSGlobal("Ext.util.History.add")
    @js.native
    def add(token: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.History.add")
    @js.native
    def add(token: java.lang.String, preventDuplicates: Boolean): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    @JSGlobal("Ext.util.History.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.util.History.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.addManagedListener")
    @js.native
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Programmatically steps back one step in browser history equivalent to the user pressing the Back button */
    @JSGlobal("Ext.util.History.back")
    @js.native
    def back(): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.util.History.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.util.History.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.util.History.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.util.History.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.util.History.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.util.History.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    @JSGlobal("Ext.util.History.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method] Removes all managed listeners for this object  */
    @JSGlobal("Ext.util.History.clearManagedListeners")
    @js.native
    def clearManagedListeners(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.util.History.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.util.History.enableBubble")
    @js.native
    def enableBubble(eventNames: js.Any): Unit = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.History.fieldId")
    @js.native
    def fieldId: java.lang.String = js.native
    @scala.inline
    def fieldId_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(x.asInstanceOf[js.Any])
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.util.History.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @JSGlobal("Ext.util.History.fireEventArgs")
    @js.native
    def fireEventArgs(): Boolean = js.native
    @JSGlobal("Ext.util.History.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: js.UndefOr[scala.Nothing], args: typings.extjs.Ext.Array): Boolean = js.native
    @JSGlobal("Ext.util.History.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.util.History.fireEventArgs")
    @js.native
    def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = js.native
    
    /** [Method] Programmatically steps forward one step in browser history equivalent to the user pressing the Forward button */
    @JSGlobal("Ext.util.History.forward")
    @js.native
    def forward(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.util.History.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.util.History.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Retrieves the currently active history token
      * @returns String The token
      */
    @JSGlobal("Ext.util.History.getToken")
    @js.native
    def getToken(): java.lang.String = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    @JSGlobal("Ext.util.History.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.util.History.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.util.History.hasListeners")
    @js.native
    def hasListeners: js.Any = js.native
    @scala.inline
    def hasListeners_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasListeners")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.History.iframeId")
    @js.native
    def iframeId: java.lang.String = js.native
    @scala.inline
    def iframeId_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iframeId")(x.asInstanceOf[js.Any])
    
    /** [Method] Initializes the global History instance
      * @param onReady Function A callback function that will be called once the history component is fully initialized.
      * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the browser window.
      */
    @JSGlobal("Ext.util.History.init")
    @js.native
    def init(): Unit = js.native
    @JSGlobal("Ext.util.History.init")
    @js.native
    def init(onReady: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.init")
    @js.native
    def init(onReady: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.init")
    @js.native
    def init(onReady: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.History.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.util.History.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.util.History.isObservable")
    @js.native
    def isObservable: Boolean = js.native
    @scala.inline
    def isObservable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservable")(x.asInstanceOf[js.Any])
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.UndefOr[scala.Nothing],
      ename: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(
      item: js.Any,
      ename: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.mon")
    @js.native
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.mun")
    @js.native
    def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.UndefOr[scala.Nothing], events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: js.UndefOr[scala.Nothing], prefix: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.util.History.relayEvents")
    @js.native
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeListener")
    @js.native
    def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(
      item: js.UndefOr[scala.Nothing],
      ename: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.UndefOr[scala.Nothing], ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.removeManagedListener")
    @js.native
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    @JSGlobal("Ext.util.History.resumeEvent")
    @js.native
    def resumeEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents */
    @JSGlobal("Ext.util.History.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.History.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.util.History.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    @JSGlobal("Ext.util.History.suspendEvent")
    @js.native
    def suspendEvent(eventName: js.Any*): Unit = js.native
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    @JSGlobal("Ext.util.History.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    @JSGlobal("Ext.util.History.suspendEvents")
    @js.native
    def suspendEvents(queueSuspended: Boolean): Unit = js.native
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.History.un")
    @js.native
    def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.util.History.useTopWindow")
    @js.native
    def useTopWindow: Boolean = js.native
    @scala.inline
    def useTopWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTopWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.util.Inflector")
  @js.native
  class Inflector ()
    extends typings.extjs.Ext.util.Inflector
  /* static members */
  object Inflector {
    
    @JSGlobal("Ext.util.Inflector")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.util.Inflector.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.util.Inflector.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.util.Inflector.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.util.Inflector.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.util.Inflector.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.util.Inflector.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Returns the correct Model name for a given string
      * @param word String The word to classify
      * @returns String The classified version of the word
      */
    @JSGlobal("Ext.util.Inflector.classify")
    @js.native
    def classify(): java.lang.String = js.native
    @JSGlobal("Ext.util.Inflector.classify")
    @js.native
    def classify(word: java.lang.String): java.lang.String = js.native
    
    /** [Method] Removes all registered pluralization rules */
    @JSGlobal("Ext.util.Inflector.clearPlurals")
    @js.native
    def clearPlurals(): Unit = js.native
    
    /** [Method] Removes all registered singularization rules */
    @JSGlobal("Ext.util.Inflector.clearSingulars")
    @js.native
    def clearSingulars(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.util.Inflector.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.util.Inflector.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Inflector.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.util.Inflector.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
      * @param word String The word to test
      * @returns Boolean True if the word is transnumeral
      */
    @JSGlobal("Ext.util.Inflector.isTransnumeral")
    @js.native
    def isTransnumeral(): Boolean = js.native
    @JSGlobal("Ext.util.Inflector.isTransnumeral")
    @js.native
    def isTransnumeral(word: java.lang.String): Boolean = js.native
    
    /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
      * @param number Number The number to ordinalize
      * @returns String The ordinalized number
      */
    @JSGlobal("Ext.util.Inflector.ordinalize")
    @js.native
    def ordinalize(): java.lang.String = js.native
    @JSGlobal("Ext.util.Inflector.ordinalize")
    @js.native
    def ordinalize(number: Double): java.lang.String = js.native
    
    /** [Method] Adds a new pluralization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    @JSGlobal("Ext.util.Inflector.plural")
    @js.native
    def plural(): Unit = js.native
    @JSGlobal("Ext.util.Inflector.plural")
    @js.native
    def plural(matcher: js.UndefOr[scala.Nothing], replacer: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Inflector.plural")
    @js.native
    def plural(matcher: RegExp): Unit = js.native
    @JSGlobal("Ext.util.Inflector.plural")
    @js.native
    def plural(matcher: RegExp, replacer: java.lang.String): Unit = js.native
    
    /** [Method] Returns the pluralized form of a word e g
      * @param word String The word to pluralize
      * @returns String The pluralized form of the word
      */
    @JSGlobal("Ext.util.Inflector.pluralize")
    @js.native
    def pluralize(): java.lang.String = js.native
    @JSGlobal("Ext.util.Inflector.pluralize")
    @js.native
    def pluralize(word: java.lang.String): java.lang.String = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.Inflector.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Adds a new singularization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    @JSGlobal("Ext.util.Inflector.singular")
    @js.native
    def singular(): Unit = js.native
    @JSGlobal("Ext.util.Inflector.singular")
    @js.native
    def singular(matcher: js.UndefOr[scala.Nothing], replacer: java.lang.String): Unit = js.native
    @JSGlobal("Ext.util.Inflector.singular")
    @js.native
    def singular(matcher: RegExp): Unit = js.native
    @JSGlobal("Ext.util.Inflector.singular")
    @js.native
    def singular(matcher: RegExp, replacer: java.lang.String): Unit = js.native
    
    /** [Method] Returns the singularized form of a word e g
      * @param word String The word to singularize
      * @returns String The singularized form of the word
      */
    @JSGlobal("Ext.util.Inflector.singularize")
    @js.native
    def singularize(): java.lang.String = js.native
    @JSGlobal("Ext.util.Inflector.singularize")
    @js.native
    def singularize(word: java.lang.String): java.lang.String = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.util.Inflector.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.util.Observable")
  @js.native
  class Observable ()
    extends typings.extjs.Ext.util.Observable
  /* static members */
  object Observable {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.Observable.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.Observable.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Observable.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.Observable.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Starts capture on the specified Observable
      * @param o Ext.util.Observable The Observable to capture events from.
      * @param fn Function The function to call when an event is fired.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
      */
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: IObservable): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: IObservable, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: IObservable, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.capture")
    @js.native
    def capture(o: IObservable, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.Observable.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.Observable.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.Observable.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.Observable.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.Observable.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Sets observability on the passed class constructor
      * @param c Function The class constructor to make observable.
      * @param listeners Object An object containing a series of listeners to add. See addListener.
      */
    @JSGlobal("Ext.util.Observable.observe")
    @js.native
    def observe(): Unit = js.native
    @JSGlobal("Ext.util.Observable.observe")
    @js.native
    def observe(c: js.UndefOr[scala.Nothing], listeners: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.observe")
    @js.native
    def observe(c: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Observable.observe")
    @js.native
    def observe(c: js.Any, listeners: js.Any): Unit = js.native
    
    /** [Method] Removes all added captures from the Observable
      * @param o Ext.util.Observable The Observable to release
      */
    @JSGlobal("Ext.util.Observable.releaseCapture")
    @js.native
    def releaseCapture(): Unit = js.native
    @JSGlobal("Ext.util.Observable.releaseCapture")
    @js.native
    def releaseCapture(o: IObservable): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.Observable.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.Observable.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.util.Point")
  @js.native
  class Point ()
    extends typings.extjs.Ext.util.Point
  /* static members */
  object Point {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.Point.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.Point.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Point.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.Point.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.Point.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.Point.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.Point.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Point.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Point.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns a new instance of Ext util Point base on the pageX  pageY values of the given event
      * @param e Ext.EventObject/Event The event
      * @returns Ext.util.Point
      */
    @JSGlobal("Ext.util.Point.fromEvent")
    @js.native
    def fromEvent(): IPoint = js.native
    @JSGlobal("Ext.util.Point.fromEvent")
    @js.native
    def fromEvent(e: js.Any): IPoint = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.Point.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.Point.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.Point.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.Point.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.util.Region")
  @js.native
  class Region ()
    extends typings.extjs.Ext.util.Region
  /* static members */
  object Region {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.Region.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.Region.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Region.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.Region.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.Region.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.Region.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.Region.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Region.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Region.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Creates a Region from a box Object which contains four numeric properties top right bottom and left
      * @param o Object An object with top, right, bottom and left properties.
      * @returns Ext.util.Region region The Region constructed based on the passed object
      */
    @JSGlobal("Ext.util.Region.from")
    @js.native
    def from(): IRegion = js.native
    @JSGlobal("Ext.util.Region.from")
    @js.native
    def from(o: js.Any): IRegion = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.Region.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Retrieves an Ext util Region for a particular element
      * @param el String/HTMLElement/Ext.Element An element ID, htmlElement or Ext.Element representing an element in the document.
      * @returns Ext.util.Region region
      */
    @JSGlobal("Ext.util.Region.getRegion")
    @js.native
    def getRegion(): IRegion = js.native
    @JSGlobal("Ext.util.Region.getRegion")
    @js.native
    def getRegion(el: js.Any): IRegion = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.Region.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.Region.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.Region.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.util.Sortable")
  @js.native
  class Sortable ()
    extends typings.extjs.Ext.util.Sortable
  /* static members */
  object Sortable {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.Sortable.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.Sortable.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.Sortable.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.Sortable.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.Sortable.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.Sortable.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.Sortable.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Sortable.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.Sortable.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Creates a single comparator function which encapsulates the passed Sorter array
      * @param sorters Ext.util.Sorter[] The sorter set for which to create a comparator function
      * @returns Function a function, which when passed two comparable objects returns the result of the whole sorter comparator functions.
      */
    @JSGlobal("Ext.util.Sortable.createComparator")
    @js.native
    def createComparator(): js.Any = js.native
    @JSGlobal("Ext.util.Sortable.createComparator")
    @js.native
    def createComparator(sorters: typings.extjs.Ext.Array): js.Any = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.Sortable.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.Sortable.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.Sortable.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.Sortable.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.util.TaskManager")
  @js.native
  class TaskManager ()
    extends typings.extjs.Ext.util.TaskManager
  /* static members */
  object TaskManager {
    
    @JSGlobal("Ext.util.TaskManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.util.TaskManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.util.TaskManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.util.TaskManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Destroys this instance stopping all tasks that are currently running  */
    @JSGlobal("Ext.util.TaskManager.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.util.TaskManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.TaskManager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.util.TaskManager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Creates a new Task instance
      * @param config Object The config object. For details on the supported properties, see start.
      */
    @JSGlobal("Ext.util.TaskManager.newTask")
    @js.native
    def newTask(): Unit = js.native
    @JSGlobal("Ext.util.TaskManager.newTask")
    @js.native
    def newTask(config: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.TaskManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Starts a new task
      * @param task Object A config object that supports the following properties:
      * @returns Object The task
      */
    @JSGlobal("Ext.util.TaskManager.start")
    @js.native
    def start(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.start")
    @js.native
    def start(task: js.Any): js.Any = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.util.TaskManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Stops an existing running task
      * @param task Object The task to stop
      * @returns Object The task
      */
    @JSGlobal("Ext.util.TaskManager.stop")
    @js.native
    def stop(): js.Any = js.native
    @JSGlobal("Ext.util.TaskManager.stop")
    @js.native
    def stop(task: js.Any): js.Any = js.native
    
    /** [Method] Stops all tasks that are currently running  */
    @JSGlobal("Ext.util.TaskManager.stopAll")
    @js.native
    def stopAll(): Unit = js.native
  }
  
  @JSGlobal("Ext.util.TextMetrics")
  @js.native
  class TextMetrics ()
    extends typings.extjs.Ext.util.TextMetrics
  /* static members */
  object TextMetrics {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.util.TextMetrics.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.util.TextMetrics.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.util.TextMetrics.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.util.TextMetrics.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.util.TextMetrics.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.util.TextMetrics.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.util.TextMetrics.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.util.TextMetrics.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.util.TextMetrics.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Destroy the TextMetrics instance created by measure  */
    @JSGlobal("Ext.util.TextMetrics.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.util.TextMetrics.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.util.TextMetrics.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Measures the size of the specified text
      * @param el String/HTMLElement The element, dom node or id from which to copy existing CSS styles that can affect the size of the rendered text
      * @param text String The text to measure
      * @param fixedWidth Number If the text will be multiline, you have to set a fixed width in order to accurately measure the text height
      * @returns Object An object containing the text's size {width: (width), height: (height)}
      */
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.UndefOr[scala.Nothing], text: js.UndefOr[scala.Nothing], fixedWidth: Double): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.UndefOr[scala.Nothing], text: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.UndefOr[scala.Nothing], text: java.lang.String, fixedWidth: Double): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.Any): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.Any, text: js.UndefOr[scala.Nothing], fixedWidth: Double): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.Any, text: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.util.TextMetrics.measure")
    @js.native
    def measure(el: js.Any, text: java.lang.String, fixedWidth: Double): js.Any = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.util.TextMetrics.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.util.TextMetrics.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
}
