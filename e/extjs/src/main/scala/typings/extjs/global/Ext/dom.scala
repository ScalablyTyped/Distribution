package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.dom.IElement
import typings.extjs.Ext.dom.element.IFly
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSGlobal("Ext.dom.AbstractElement")
  @js.native
  class AbstractElement_ ()
    extends StObject
       with typings.extjs.Ext.dom.AbstractElement_
  /* static members */
  object AbstractElement_ {
    
    @JSGlobal("Ext.dom.AbstractElement")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Gets the singleton flyweight element with the passed node as the active element
      * @param dom String/HTMLElement The dom node or id
      * @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global")
      * @returns Ext.dom.Element.Fly The singleton flyweight object (or null if no matching element was found)
      */
    inline def fly(): IFly = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")().asInstanceOf[IFly]
    inline def fly(dom: js.Any): IFly = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(dom.asInstanceOf[js.Any]).asInstanceOf[IFly]
    inline def fly(dom: js.Any, named: java.lang.String): IFly = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(dom.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[IFly]
    inline def fly(dom: Unit, named: java.lang.String): IFly = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(dom.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[IFly]
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    inline def fromPoint(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Unit, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    inline def get(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IElement]
    inline def get(el: js.Any): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(el.asInstanceOf[js.Any]).asInstanceOf[IElement]
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    inline def getDocumentHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    inline def getDocumentWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentWidth")().asInstanceOf[Double]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    inline def getOrientation(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    inline def getViewSize(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewSize")().asInstanceOf[js.Any]
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    inline def getViewportHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    inline def getViewportWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportWidth")().asInstanceOf[Double]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    inline def mergeClsList(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")().asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: Unit, clsList2: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    inline def normalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[java.lang.String]
    inline def normalize(prop: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(prop.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    inline def parseBox(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")().asInstanceOf[js.Any]
    inline def parseBox(box: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")(box.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    inline def parseStyles(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")().asInstanceOf[js.Any]
    inline def parseStyles(styles: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    inline def removeCls(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")().asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: Unit, removeClsList: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    inline def unitizeBox(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")().asInstanceOf[java.lang.String]
    inline def unitizeBox(box: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: Unit, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  }
  
  @JSGlobal("Ext.dom.Element")
  @js.native
  class Element_ ()
    extends StObject
       with typings.extjs.Ext.dom.Element_
  /* static members */
  object Element_ {
    
    @JSGlobal("Ext.dom.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    inline def fromPoint(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Unit, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    inline def get(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IElement]
    inline def get(el: js.Any): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(el.asInstanceOf[js.Any]).asInstanceOf[IElement]
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    inline def getDocumentHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    inline def getDocumentWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentWidth")().asInstanceOf[Double]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    inline def getOrientation(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    inline def getViewSize(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewSize")().asInstanceOf[js.Any]
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    inline def getViewportHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    inline def getViewportWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportWidth")().asInstanceOf[Double]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    inline def mergeClsList(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")().asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: Unit, clsList2: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    inline def normalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[java.lang.String]
    inline def normalize(prop: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(prop.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    inline def parseBox(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")().asInstanceOf[js.Any]
    inline def parseBox(box: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")(box.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    inline def parseStyles(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")().asInstanceOf[js.Any]
    inline def parseStyles(styles: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    inline def removeCls(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")().asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: Unit, removeClsList: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
      * @param selector String/HTMLElement[] The CSS selector or an array of elements
      * @param unique Boolean true to create a unique Ext.Element for each element (defaults to a shared flyweight object)
      * @param root HTMLElement/String The root element of the query or id of the root
      * @returns Ext.CompositeElementLite/Ext.CompositeElement
      */
    inline def select(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[js.Any]
    inline def select(selector: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def select(selector: js.Any, unique: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def select(selector: js.Any, unique: Boolean, root: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def select(selector: js.Any, unique: Unit, root: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def select(selector: Unit, unique: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def select(selector: Unit, unique: Boolean, root: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def select(selector: Unit, unique: Unit, root: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    inline def unitizeBox(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")().asInstanceOf[java.lang.String]
    inline def unitizeBox(box: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: Unit, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  }
  
  @JSGlobal("Ext.dom.Query")
  @js.native
  class Query ()
    extends StObject
       with typings.extjs.Ext.dom.Query
  /* static members */
  object Query {
    
    @JSGlobal("Ext.dom.Query")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Compiles a selector xpath query into a reusable function
      * @param selector String The selector/xpath query
      * @param type String Either "select" or "simple" for a simple selector match
      * @returns Function
      */
    inline def compile(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")().asInstanceOf[js.Any]
    inline def compile(selector: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def compile(selector: java.lang.String, `type`: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def compile(selector: Unit, `type`: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Filters an array of elements to only include matches of a simple selector e g
      * @param el HTMLElement[] An array of elements to filter
      * @param selector String The simple selector to test
      * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    inline def filter(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
    inline def is(el: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def is(el: js.Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def is(el: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Selects an array of DOM nodes using JavaScript only implementation
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query.
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    inline def jsSelect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")().asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: java.lang.String, root: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: Unit, root: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.matchers")
    @js.native
    def matchers: js.Any = js.native
    inline def matchers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchers")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.operators")
    @js.native
    def operators: js.Any = js.native
    inline def operators_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operators")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.pseudos")
    @js.native
    def pseudos: js.Any = js.native
    inline def pseudos_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pseudos")(x.asInstanceOf[js.Any])
    
    /** [Method] Selects an array of DOM nodes by CSS XPath selector
      * @param path String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
      * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
      * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
      */
    inline def select(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @returns HTMLElement The DOM element which matched the selector.
      */
    inline def selectNode(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")().asInstanceOf[HTMLElement]
    inline def selectNode(selector: java.lang.String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def selectNode(selector: java.lang.String, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def selectNode(selector: Unit, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /** [Method] Selects the value of a node parsing integers and floats
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue Number When specified, this is return as empty value.
      * @returns Number
      */
    inline def selectNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")().asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Selects the value of a node optionally replacing null with the defaultValue
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue String When specified, this is return as empty value.
      * @returns String
      */
    inline def selectValue(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")().asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  }
}
