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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("Ext.util.CSS")
  @js.native
  class CSS ()
    extends StObject
       with typings.extjs.Ext.util.CSS
  /* static members */
  object CSS {
    
    @JSGlobal("Ext.util.CSS")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Creates a rule
      * @param styleSheet CSSStyleSheet The StyleSheet to create the rule in as returned from createStyleSheet.
      * @param selector String The selector to target the rule.
      * @param property String The cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
      * @returns CSSStyleRule The created rule
      */
    @scala.inline
    def createRule(): CSSStyleRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createRule")().asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: Unit, selector: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: Unit, selector: java.lang.String, property: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: Unit, selector: Unit, property: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: CSSStyleSheet): CSSStyleRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any]).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: CSSStyleSheet, selector: java.lang.String, property: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def createRule(styleSheet: CSSStyleSheet, selector: Unit, property: java.lang.String): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(styleSheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    
    /** [Method] Creates a stylesheet from a text blob of rules
      * @param cssText String The text containing the css rules
      * @param id String An id to add to the stylesheet for later removal
      * @returns CSSStyleSheet
      */
    @scala.inline
    def createStyleSheet(): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleSheet")().asInstanceOf[CSSStyleSheet]
    @scala.inline
    def createStyleSheet(cssText: java.lang.String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleSheet")(cssText.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
    @scala.inline
    def createStyleSheet(cssText: java.lang.String, id: java.lang.String): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStyleSheet")(cssText.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    @scala.inline
    def createStyleSheet(cssText: Unit, id: java.lang.String): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStyleSheet")(cssText.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Gets an an individual CSS rule by selector s
      * @param selector String/String[] The CSS selector or an array of selectors to try. The first selector that is found is returned.
      * @param refreshCache Boolean true to refresh the internal cache if you have recently updated any rules or added styles dynamically
      * @returns CSSStyleRule The CSS rule or null if one is not found
      */
    @scala.inline
    def getRule(): CSSStyleRule = ^.asInstanceOf[js.Dynamic].applyDynamic("getRule")().asInstanceOf[CSSStyleRule]
    @scala.inline
    def getRule(selector: js.Any): CSSStyleRule = ^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(selector.asInstanceOf[js.Any]).asInstanceOf[CSSStyleRule]
    @scala.inline
    def getRule(selector: js.Any, refreshCache: Boolean): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(selector.asInstanceOf[js.Any], refreshCache.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    @scala.inline
    def getRule(selector: Unit, refreshCache: Boolean): CSSStyleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(selector.asInstanceOf[js.Any], refreshCache.asInstanceOf[js.Any])).asInstanceOf[CSSStyleRule]
    
    /** [Method] Gets all css rules for the document
      * @param refreshCache Boolean true to refresh the internal cache
      * @returns Object An object (hash) of rules indexed by selector
      */
    @scala.inline
    def getRules(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Any]
    @scala.inline
    def getRules(refreshCache: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(refreshCache.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Refresh the rule cache if you have dynamically added stylesheets
      * @returns Object An object (hash) of rules indexed by selector
      */
    @scala.inline
    def refreshCache(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[js.Any]
    
    /** [Method] Removes a style or link tag by id
      * @param id String The id of the tag
      */
    @scala.inline
    def removeStyleSheet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleSheet")().asInstanceOf[Unit]
    @scala.inline
    def removeStyleSheet(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleSheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.CSS.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Dynamically swaps an existing stylesheet reference for a new one
      * @param id String The id of an existing link tag to remove
      * @param url String The href of the new stylesheet to include
      */
    @scala.inline
    def swapStyleSheet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("swapStyleSheet")().asInstanceOf[Unit]
    @scala.inline
    def swapStyleSheet(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("swapStyleSheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def swapStyleSheet(id: java.lang.String, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("swapStyleSheet")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def swapStyleSheet(id: Unit, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("swapStyleSheet")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Updates a rule property
      * @param selector String/String[] If it's an array it tries each selector until it finds one. Stops immediately once one is found.
      * @param property String The css property or a cssText specification eg "color:red;font-weight:bold;text-decoration:underline"
      * @param value String The new value for the property
      * @returns Boolean true If a rule was found and updated
      */
    @scala.inline
    def updateRule(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")().asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: js.Any, property: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: js.Any, property: java.lang.String, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: js.Any, property: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: Unit, property: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: Unit, property: java.lang.String, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def updateRule(selector: Unit, property: Unit, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(selector.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.util.Cookies")
  @js.native
  class Cookies ()
    extends StObject
       with typings.extjs.Ext.util.Cookies
  /* static members */
  object Cookies {
    
    @JSGlobal("Ext.util.Cookies")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes a cookie with the provided name from the browser if found by setting its expiration date to sometime in the p
      * @param name String The name of the cookie to remove
      * @param path String The path for the cookie. This must be included if you included a path while setting the cookie.
      */
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    @scala.inline
    def clear(name: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def clear(name: java.lang.String, path: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def clear(name: Unit, path: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Retrieves cookies that are accessible by the current page
      * @param name String The name of the cookie to get
      * @returns Object Returns the cookie value for the specified name; null if the cookie name does not exist.
      */
    @scala.inline
    def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    @scala.inline
    def get(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
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
    @scala.inline
    def set(
      name: js.UndefOr[java.lang.String],
      value: js.UndefOr[js.Any],
      expires: js.UndefOr[js.Any],
      path: js.UndefOr[java.lang.String],
      domain: js.UndefOr[java.lang.String],
      secure: js.UndefOr[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.util.Filter")
  @js.native
  class Filter ()
    extends StObject
       with typings.extjs.Ext.util.Filter
  /* static members */
  object Filter {
    
    @JSGlobal("Ext.util.Filter")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Creates a single filter function which encapsulates the passed Filter array
      * @param filters Ext.util.Filter[] The filter set for which to create a filter function
      * @returns Function a function, which when passed a candidate object returns true if the candidate passes all the specified Filters.
      */
    @scala.inline
    def createFilterFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterFn")().asInstanceOf[js.Any]
    @scala.inline
    def createFilterFn(filters: typings.extjs.Ext.Array): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterFn")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.util.Format")
  @js.native
  class Format ()
    extends StObject
       with typings.extjs.Ext.util.Format
  /* static members */
  object Format {
    
    @JSGlobal("Ext.util.Format")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Formats an object of name value properties as HTML element attribute values suitable for using when creating textual
      * @param attributes Object An object containing the HTML attributes as properties eg: {height:40, vAlign:'top'}
      */
    @scala.inline
    def attributes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")().asInstanceOf[Unit]
    @scala.inline
    def attributes(attributes: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Alias for Ext String capitalize
      * @param string String
      * @returns String
      */
    @scala.inline
    def capitalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")().asInstanceOf[java.lang.String]
    @scala.inline
    def capitalize(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Format a number as a currency
      * @param value Number/String The numeric value to format
      * @param sign String The currency sign to use (defaults to currencySign)
      * @param decimals Number The number of decimals to use for the currency (defaults to currencyPrecision)
      * @param end Boolean True if the currency sign should be at the end of the string (defaults to currencyAtEnd)
      * @returns String The formatted currency string
      */
    @scala.inline
    def currency(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("currency")().asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: java.lang.String, decimals: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: java.lang.String, decimals: Double, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: java.lang.String, decimals: Unit, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: Unit, decimals: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: Unit, decimals: Double, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: js.Any, sign: Unit, decimals: Unit, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: java.lang.String, decimals: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: java.lang.String, decimals: Double, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: java.lang.String, decimals: Unit, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: Unit, decimals: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: Unit, decimals: Double, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def currency(value: Unit, sign: Unit, decimals: Unit, end: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("currency")(value.asInstanceOf[js.Any], sign.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
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
    @scala.inline
    def date(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: js.Any, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: Unit, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Returns a date rendering function that can be reused to apply a date format multiple times efficiently
      * @param format String Any valid date format string. Defaults to Ext.Date.defaultFormat.
      * @returns Function The date formatting function
      */
    @scala.inline
    def dateRenderer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dateRenderer")().asInstanceOf[js.Any]
    @scala.inline
    def dateRenderer(format: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dateRenderer")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    @scala.inline
    def defaultValue(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")().asInstanceOf[java.lang.String]
    @scala.inline
    def defaultValue(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def defaultValue(value: js.Any, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def defaultValue(value: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValue")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Alias for Ext String ellipsis
      * @param value String The string to truncate.
      * @param length Number The maximum length to allow before truncating.
      * @param word Boolean true to try to find a common word break.
      * @returns String The converted text.
      */
    @scala.inline
    def ellipsis(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")().asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: java.lang.String, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: Unit, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: Unit, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def ellipsis(value: Unit, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Escapes the passed string for use in a regular expression
      * @param str String
      * @returns String
      */
    @scala.inline
    def escapeRegex(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")().asInstanceOf[java.lang.String]
    @scala.inline
    def escapeRegex(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Simple format for a file size xxx bytes xxx KB xxx MB
      * @param size Number/String The numeric value to format
      * @returns String The formatted file size
      */
    @scala.inline
    def fileSize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSize")().asInstanceOf[java.lang.String]
    @scala.inline
    def fileSize(size: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSize")(size.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Alias for Ext String format
      * @param string String The tokenized string to be formatted.
      * @param values Mixed... The values to replace tokens {0}, {1}, etc in order.
      * @returns String The formatted string.
      */
    @scala.inline
    def format(string: java.lang.String, values: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(string.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Alias for Ext String htmlDecode
      * @param value String The string to decode.
      * @returns String The decoded text.
      */
    @scala.inline
    def htmlDecode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")().asInstanceOf[java.lang.String]
    @scala.inline
    def htmlDecode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Alias for Ext String htmlEncode
      * @param value String The string to encode.
      * @returns String The encoded text.
      */
    @scala.inline
    def htmlEncode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")().asInstanceOf[java.lang.String]
    @scala.inline
    def htmlEncode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Alias for Ext String leftPad
      * @param string String The original string.
      * @param size Number The total length of the output string.
      * @param character String The character with which to pad the original string.
      * @returns String The padded string.
      */
    @scala.inline
    def leftPad(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")().asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Converts a string to all lower case letters
      * @param value String The text to convert
      * @returns String The converted text
      */
    @scala.inline
    def lowercase(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowercase")().asInstanceOf[java.lang.String]
    @scala.inline
    def lowercase(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowercase")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] It does simple math for use in a template for example  var tpl  new Ext Template  value 10 value math 10
      * @returns Function A function that operates on the passed value.
      */
    @scala.inline
    def math(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("math")().asInstanceOf[js.Any]
    
    /** [Method] Converts newline characters to the HTML tag lt br gt
      * @param v String The string value to format.
      * @returns String The string with embedded &lt;br/&gt; tags in place of newlines.
      */
    @scala.inline
    def nl2br(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("nl2br")().asInstanceOf[java.lang.String]
    @scala.inline
    def nl2br(v: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("nl2br")(v.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Formats the passed number according to the passed format string
      * @param v Number The number to format.
      * @param format String The way you would like to format this text.
      * @returns String The formatted number.
      */
    @scala.inline
    def number(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[java.lang.String]
    @scala.inline
    def number(v: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(v.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def number(v: Double, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(v.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def number(v: Unit, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(v.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Returns a number rendering function that can be reused to apply a number format multiple times efficiently
      * @param format String Any valid number format string for number
      * @returns Function The number formatting function
      */
    @scala.inline
    def numberRenderer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("numberRenderer")().asInstanceOf[js.Any]
    @scala.inline
    def numberRenderer(format: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("numberRenderer")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param v Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    @scala.inline
    def parseBox(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")().asInstanceOf[js.Any]
    @scala.inline
    def parseBox(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Selectively do a plural form of a word based on a numeric value
      * @param value Number The value to compare against
      * @param singular String The singular form of the word
      * @param plural String The plural form of the word (defaults to the singular with an "s")
      */
    @scala.inline
    def plural(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")().asInstanceOf[Unit]
    @scala.inline
    def plural(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Double, singular: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Double, singular: java.lang.String, plural: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Double, singular: Unit, plural: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Unit, singular: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Unit, singular: java.lang.String, plural: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(value: Unit, singular: Unit, plural: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Rounds the passed number to the required decimal precision
      * @param value Number/String The numeric value to round.
      * @param precision Number The number of decimal places to which to round the first parameter's value.
      * @returns Number The rounded value.
      */
    @scala.inline
    def round(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")().asInstanceOf[Double]
    @scala.inline
    def round(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def round(value: js.Any, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def round(value: Unit, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Strips all script tags
      * @param value Object The text from which to strip script tags
      * @returns String The stripped text
      */
    @scala.inline
    def stripScripts(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripScripts")().asInstanceOf[java.lang.String]
    @scala.inline
    def stripScripts(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripScripts")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Strips all HTML tags
      * @param value Object The text from which to strip tags
      * @returns String The stripped text
      */
    @scala.inline
    def stripTags(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTags")().asInstanceOf[java.lang.String]
    @scala.inline
    def stripTags(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTags")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Returns a substring from within an original string
      * @param value String The original text
      * @param start Number The start index of the substring
      * @param length Number The length of the substring
      * @returns String The substring
      */
    @scala.inline
    def substr(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("substr")().asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: java.lang.String, start: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: java.lang.String, start: Double, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: java.lang.String, start: Unit, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: Unit, start: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: Unit, start: Double, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def substr(value: Unit, start: Unit, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
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
    @scala.inline
    def trim(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")().asInstanceOf[java.lang.String]
    @scala.inline
    def trim(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Checks a reference and converts it to empty string if it is undefined
      * @param value Object Reference to check
      * @returns Object Empty string if converted, otherwise the original value
      */
    @scala.inline
    def undef(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undef")().asInstanceOf[js.Any]
    @scala.inline
    def undef(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undef")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Converts a string to all upper case letters
      * @param value String The text to convert
      * @returns String The converted text
      */
    @scala.inline
    def uppercase(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("uppercase")().asInstanceOf[java.lang.String]
    @scala.inline
    def uppercase(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("uppercase")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Format a number as US currency
      * @param value Number/String The numeric value to format
      * @returns String The formatted currency string
      */
    @scala.inline
    def usMoney(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("usMoney")().asInstanceOf[java.lang.String]
    @scala.inline
    def usMoney(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("usMoney")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSGlobal("Ext.util.Functions")
  @js.native
  class Functions ()
    extends StObject
       with typings.extjs.Ext.util.Functions
  /* static members */
  object Functions {
    
    @JSGlobal("Ext.util.Functions")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Create an alias to the provided method property with name methodName of object
      * @param object Object/Function
      * @param methodName String
      * @returns Function aliasFn
      */
    @scala.inline
    def alias(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")().asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the default global environment object (usually the browser window).
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
      * @returns Function The new function
      */
    @scala.inline
    def bind(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def clone(method: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(method.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
      * @param fn Function The function to invoke on a buffered timer.
      * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
      * @returns Function A function which invokes the passed function after buffering for the specified time.
      */
    @scala.inline
    def createBuffered(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")().asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates a delegate callback which when called executes after a specific delay
      * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
      * @param delay Number The number of milliseconds to defer execution by whenever called.
      * @param scope Object The scope (this reference) used by the function at execution time.
      * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function A function which, when called, executes the original function after the specified delay.
      */
    @scala.inline
    def createDelayed(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")().asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates an interceptor function
      * @param origFn Function The original function.
      * @param newFn Function The function to call before the original
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @param returnValue Object The value to return if the passed function return false.
      * @returns Function The new function
      */
    @scala.inline
    def createInterceptor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")().asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a combined function call sequence of the original function  the passed function
      * @param originalFn Function The original function.
      * @param newFn Function The function to sequence
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the default global environment object (usually the browser window).
      * @returns Function The new function
      */
    @scala.inline
    def createSequence(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")().asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
      * @param fn Function The function to execute at a regular time interval.
      * @param interval Number The interval in milliseconds on which the passed function is executed.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @returns Function A function which invokes the passed function at the specified interval.
      */
    @scala.inline
    def createThrottled(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")().asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Calls this function after the number of millseconds specified optionally in a specific scope
      * @param fn Function The function to defer.
      * @param millis Number The number of milliseconds for the setTimeout call (if less than or equal to 0 the function is executed immediately)
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
      * @returns Number The timeout id that can be used with clearTimeout
      */
    @scala.inline
    def defer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] A very commonly used method throughout the framework
      * @param setter Function
      * @returns Function flexSetter
      */
    @scala.inline
    def flexSetter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")().asInstanceOf[js.Any]
    @scala.inline
    def flexSetter(setter: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")(setter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @scala.inline
    def interceptAfter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")().asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @scala.inline
    def interceptBefore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")().asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
      * @param fn Function The original function
      * @param args Array The arguments to pass to new callback
      * @param scope Object The scope (this reference) in which the function is executed.
      * @returns Function The new callback function
      */
    @scala.inline
    def pass(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")().asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSGlobal("Ext.util.History")
  @js.native
  class History ()
    extends StObject
       with typings.extjs.Ext.util.History
  /* static members */
  object History {
    
    @JSGlobal("Ext.util.History")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add a new token to the history stack
      * @param token String The value that defines a particular application-specific history state
      * @param preventDuplicates Boolean When true, if the passed token matches the current token it will not save a new history step. Set to false if the same state can be saved more than once at the same history stack location.
      */
    @scala.inline
    def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
    @scala.inline
    def add(token: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def add(token: java.lang.String, preventDuplicates: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(token.asInstanceOf[js.Any], preventDuplicates.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def add(token: Unit, preventDuplicates: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(token.asInstanceOf[js.Any], preventDuplicates.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    @scala.inline
    def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    @scala.inline
    def addEvents(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @scala.inline
    def addListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @scala.inline
    def addManagedListener(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def addManagedListener(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Programmatically steps back one step in browser history equivalent to the user pressing the Back button */
    @scala.inline
    def back(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    @scala.inline
    def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method] Removes all managed listeners for this object  */
    @scala.inline
    def clearManagedListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearManagedListeners")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    @scala.inline
    def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    @scala.inline
    def enableBubble(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    @scala.inline
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    @scala.inline
    def fireEventArgs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")().asInstanceOf[Boolean]
    @scala.inline
    def fireEventArgs(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def fireEventArgs(eventName: java.lang.String, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def fireEventArgs(eventName: Unit, args: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEventArgs")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Programmatically steps forward one step in browser history equivalent to the user pressing the Forward button */
    @scala.inline
    def forward(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Retrieves the currently active history token
      * @returns String The token
      */
    @scala.inline
    def getToken(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[java.lang.String]
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    @scala.inline
    def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    @scala.inline
    def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
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
    @scala.inline
    def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    @scala.inline
    def init(onReady: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(onReady.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def init(onReady: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(onReady.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def init(onReady: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(onReady.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
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
    @scala.inline
    def mon(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: js.Any, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def mon(item: Unit, ename: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @scala.inline
    def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mun(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    @scala.inline
    def on(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def on(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    @scala.inline
    def relayEvents(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: js.Any, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: js.Any, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: Unit, events: Unit, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: Unit, events: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def relayEvents(origin: Unit, events: typings.extjs.Ext.Array, prefix: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(origin.asInstanceOf[js.Any], events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @scala.inline
    def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    @scala.inline
    def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: js.Any, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeManagedListener(item: Unit, ename: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(item.asInstanceOf[js.Any], ename.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    @scala.inline
    def resumeEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents */
    @scala.inline
    def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.History.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    @scala.inline
    def suspendEvent(eventName: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    @scala.inline
    def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    @scala.inline
    def suspendEvents(queueSuspended: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")(queueSuspended.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    @scala.inline
    def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    @scala.inline
    def un(eventName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def un(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    extends StObject
       with typings.extjs.Ext.util.Inflector
  /* static members */
  object Inflector {
    
    @JSGlobal("Ext.util.Inflector")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the correct Model name for a given string
      * @param word String The word to classify
      * @returns String The classified version of the word
      */
    @scala.inline
    def classify(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")().asInstanceOf[java.lang.String]
    @scala.inline
    def classify(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Removes all registered pluralization rules */
    @scala.inline
    def clearPlurals(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPlurals")().asInstanceOf[Unit]
    
    /** [Method] Removes all registered singularization rules */
    @scala.inline
    def clearSingulars(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSingulars")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
      * @param word String The word to test
      * @returns Boolean True if the word is transnumeral
      */
    @scala.inline
    def isTransnumeral(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransnumeral")().asInstanceOf[Boolean]
    @scala.inline
    def isTransnumeral(word: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransnumeral")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
      * @param number Number The number to ordinalize
      * @returns String The ordinalized number
      */
    @scala.inline
    def ordinalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalize")().asInstanceOf[java.lang.String]
    @scala.inline
    def ordinalize(number: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalize")(number.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Adds a new pluralization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    @scala.inline
    def plural(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")().asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: Unit, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: RegExp, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the pluralized form of a word e g
      * @param word String The word to pluralize
      * @returns String The pluralized form of the word
      */
    @scala.inline
    def pluralize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")().asInstanceOf[java.lang.String]
    @scala.inline
    def pluralize(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
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
    @scala.inline
    def singular(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")().asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: Unit, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: RegExp, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the singularized form of a word e g
      * @param word String The word to singularize
      * @returns String The singularized form of the word
      */
    @scala.inline
    def singularize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("singularize")().asInstanceOf[java.lang.String]
    @scala.inline
    def singularize(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("singularize")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.util.Observable")
  @js.native
  class Observable ()
    extends StObject
       with typings.extjs.Ext.util.Observable
  /* static members */
  object Observable {
    
    @JSGlobal("Ext.util.Observable")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Starts capture on the specified Observable
      * @param o Ext.util.Observable The Observable to capture events from.
      * @param fn Function The function to call when an event is fired.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
      */
    @scala.inline
    def capture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")().asInstanceOf[Unit]
    @scala.inline
    def capture(o: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def capture(o: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def capture(o: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def capture(o: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def capture(o: IObservable, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def capture(o: IObservable, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def capture(o: IObservable, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(o.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Sets observability on the passed class constructor
      * @param c Function The class constructor to make observable.
      * @param listeners Object An object containing a series of listeners to add. See addListener.
      */
    @scala.inline
    def observe(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")().asInstanceOf[Unit]
    @scala.inline
    def observe(c: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def observe(c: js.Any, listeners: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(c.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def observe(c: Unit, listeners: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(c.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Removes all added captures from the Observable
      * @param o Ext.util.Observable The Observable to release
      */
    @scala.inline
    def releaseCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")().asInstanceOf[Unit]
    @scala.inline
    def releaseCapture(o: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.util.Point")
  @js.native
  class Point ()
    extends StObject
       with typings.extjs.Ext.util.Point
  /* static members */
  object Point {
    
    @JSGlobal("Ext.util.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns a new instance of Ext util Point base on the pageX  pageY values of the given event
      * @param e Ext.EventObject/Event The event
      * @returns Ext.util.Point
      */
    @scala.inline
    def fromEvent(): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")().asInstanceOf[IPoint]
    @scala.inline
    def fromEvent(e: js.Any): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[IPoint]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.util.Region")
  @js.native
  class Region ()
    extends StObject
       with typings.extjs.Ext.util.Region
  /* static members */
  object Region {
    
    @JSGlobal("Ext.util.Region")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Creates a Region from a box Object which contains four numeric properties top right bottom and left
      * @param o Object An object with top, right, bottom and left properties.
      * @returns Ext.util.Region region The Region constructed based on the passed object
      */
    @scala.inline
    def from(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[IRegion]
    @scala.inline
    def from(o: js.Any): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(o.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves an Ext util Region for a particular element
      * @param el String/HTMLElement/Ext.Element An element ID, htmlElement or Ext.Element representing an element in the document.
      * @returns Ext.util.Region region
      */
    @scala.inline
    def getRegion(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")().asInstanceOf[IRegion]
    @scala.inline
    def getRegion(el: js.Any): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")(el.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.util.Sortable")
  @js.native
  class Sortable ()
    extends StObject
       with typings.extjs.Ext.util.Sortable
  /* static members */
  object Sortable {
    
    @JSGlobal("Ext.util.Sortable")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Creates a single comparator function which encapsulates the passed Sorter array
      * @param sorters Ext.util.Sorter[] The sorter set for which to create a comparator function
      * @returns Function a function, which when passed two comparable objects returns the result of the whole sorter comparator functions.
      */
    @scala.inline
    def createComparator(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createComparator")().asInstanceOf[js.Any]
    @scala.inline
    def createComparator(sorters: typings.extjs.Ext.Array): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createComparator")(sorters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.util.TaskManager")
  @js.native
  class TaskManager ()
    extends StObject
       with typings.extjs.Ext.util.TaskManager
  /* static members */
  object TaskManager {
    
    @JSGlobal("Ext.util.TaskManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Destroys this instance stopping all tasks that are currently running  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Creates a new Task instance
      * @param config Object The config object. For details on the supported properties, see start.
      */
    @scala.inline
    def newTask(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newTask")().asInstanceOf[Unit]
    @scala.inline
    def newTask(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newTask")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    @scala.inline
    def start(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Any]
    @scala.inline
    def start(task: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(task.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Stops an existing running task
      * @param task Object The task to stop
      * @returns Object The task
      */
    @scala.inline
    def stop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[js.Any]
    @scala.inline
    def stop(task: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(task.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Stops all tasks that are currently running  */
    @scala.inline
    def stopAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAll")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.util.TextMetrics")
  @js.native
  class TextMetrics ()
    extends StObject
       with typings.extjs.Ext.util.TextMetrics
  /* static members */
  object TextMetrics {
    
    @JSGlobal("Ext.util.TextMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Destroy the TextMetrics instance created by measure  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Adds members to class  */
    @scala.inline
    def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Measures the size of the specified text
      * @param el String/HTMLElement The element, dom node or id from which to copy existing CSS styles that can affect the size of the rendered text
      * @param text String The text to measure
      * @param fixedWidth Number If the text will be multiline, you have to set a fixed width in order to accurately measure the text height
      * @returns Object An object containing the text's size {width: (width), height: (height)}
      */
    @scala.inline
    def measure(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")().asInstanceOf[js.Any]
    @scala.inline
    def measure(el: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: js.Any, text: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: js.Any, text: java.lang.String, fixedWidth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fixedWidth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: js.Any, text: Unit, fixedWidth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fixedWidth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: Unit, text: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: Unit, text: java.lang.String, fixedWidth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fixedWidth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def measure(el: Unit, text: Unit, fixedWidth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(el.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fixedWidth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
}
