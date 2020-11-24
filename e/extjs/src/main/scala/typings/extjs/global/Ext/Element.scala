package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Element")
@js.native
class Element ()
  extends typings.extjs.Ext.Element
/* static members */
@JSGlobal("Ext.Element")
@js.native
object Element extends js.Object {
  
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
  
  /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
    * @param x Number The x coordinate
    * @param y Number The y coordinate
    * @returns String The found Element
    */
  def fromPoint(): java.lang.String = js.native
  def fromPoint(x: js.UndefOr[scala.Nothing], y: Double): java.lang.String = js.native
  def fromPoint(x: Double): java.lang.String = js.native
  def fromPoint(x: Double, y: Double): java.lang.String = js.native
  
  /** [Method] Retrieves Ext dom Element objects
    * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element The Element object (or null if no matching element was found)
    */
  def get(): IElement = js.native
  def get(el: js.Any): IElement = js.native
  
  /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
    * @returns Number documentHeight
    */
  def getDocumentHeight(): Double = js.native
  
  /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
    * @returns Number documentWidth
    */
  def getDocumentWidth(): Double = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): java.lang.String = js.native
  
  /** [Method] Retrieves the current orientation of the window
    * @returns String Orientation of window: 'portrait' or 'landscape'
    */
  def getOrientation(): java.lang.String = js.native
  
  /** [Method] Retrieves the viewport size of the window
    * @returns Object object containing width and height properties
    */
  def getViewSize(): js.Any = js.native
  
  /** [Method] Retrieves the viewport height of the window
    * @returns Number viewportHeight
    */
  def getViewportHeight(): Double = js.native
  
  /** [Method] Retrieves the viewport width of the window
    * @returns Number viewportWidth
    */
  def getViewportWidth(): Double = js.native
  
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  
  /** [Method] Returns an array of unique class names based upon the input strings or string arrays
    * @param clsList1 Mixed A string of class names, or an array of class names.
    * @param clsList2 Mixed A string of class names, or an array of class names.
    * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
    */
  def mergeClsList(): typings.extjs.Ext.Array = js.native
  def mergeClsList(clsList1: js.UndefOr[scala.Nothing], clsList2: js.Any): typings.extjs.Ext.Array = js.native
  def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = js.native
  def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = js.native
  
  /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
    * @param prop String The property to normalize
    * @returns String The normalized string
    */
  def normalize(): java.lang.String = js.native
  def normalize(prop: java.lang.String): java.lang.String = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  
  /** [Method] Parses a number or string representing margin sizes into an object
    * @param box Number/String The encoded margins
    * @returns Object An object with margin sizes for top, right, bottom and left
    */
  def parseBox(): js.Any = js.native
  def parseBox(box: js.Any): js.Any = js.native
  
  /** [Method] Converts a CSS string into an object with a property for each style
    * @param styles String A CSS string
    * @returns Object styles
    */
  def parseStyles(): js.Any = js.native
  def parseStyles(styles: java.lang.String): js.Any = js.native
  
  /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
    * @param existingClsList Mixed A string of class names, or an array of class names.
    * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
    * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
    */
  def removeCls(): typings.extjs.Ext.Array = js.native
  def removeCls(existingClsList: js.UndefOr[scala.Nothing], removeClsList: js.Any): typings.extjs.Ext.Array = js.native
  def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = js.native
  def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = js.native
  
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param unique Boolean true to create a unique Ext.Element for each element (defaults to a shared flyweight object)
    * @param root HTMLElement/String The root element of the query or id of the root
    * @returns Ext.CompositeElementLite/Ext.CompositeElement
    */
  def select(): js.Any = js.native
  def select(selector: js.UndefOr[scala.Nothing], unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
  def select(selector: js.UndefOr[scala.Nothing], unique: Boolean): js.Any = js.native
  def select(selector: js.UndefOr[scala.Nothing], unique: Boolean, root: js.Any): js.Any = js.native
  def select(selector: js.Any): js.Any = js.native
  def select(selector: js.Any, unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
  def select(selector: js.Any, unique: Boolean): js.Any = js.native
  def select(selector: js.Any, unique: Boolean, root: js.Any): js.Any = js.native
  
  /** [Method] Parses a number or string representing margin sizes into an object
    * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
    * @param units String The type of units to add
    * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
    */
  def unitizeBox(): java.lang.String = js.native
  def unitizeBox(box: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
  def unitizeBox(box: js.Any): java.lang.String = js.native
  def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
}
