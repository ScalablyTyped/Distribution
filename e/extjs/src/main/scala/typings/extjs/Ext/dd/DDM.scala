package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IRegion
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.dd.DDM")
@js.native
class DDM () extends js.Object

/* static members */
@JSGlobal("Ext.dd.DDM")
@js.native
object DDM extends js.Object {
  /** [Property] (Number) */
  var INTERSECT: Double = js.native
  /** [Property] (Number) */
  var POINT: Double = js.native
  /** [Property] (Number) */
  var clickPixelThresh: Double = js.native
  /** [Property] (Number) */
  var clickTimeThresh: Double = js.native
  /** [Property] (String) */
  var dragCls: String = js.native
  /** [Property] (Number) */
  var mode: Double = js.native
  /** [Property] (Boolean) */
  var notifyOccluded: Boolean = js.native
  /** [Property] (Boolean) */
  var preventDefault: Boolean = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Boolean) */
  var stopPropagation: Boolean = js.native
  /** [Property] (Boolean) */
  var useCache: Boolean = js.native
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
  /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
  		* @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
  		* @returns Ext.dd.DragDrop The best single match
  		*/
  def getBestMatch(): IDragDrop = js.native
  def getBestMatch(dds: Array): IDragDrop = js.native
  /** [Method] Returns the style property for the DOM element i e  document getElById id style
  		* @param id String the id of the elment to get
  		* @returns Object The style property of the element
  		*/
  def getCss(): js.Any = js.native
  def getCss(id: String): js.Any = js.native
  /** [Method] Returns the DragDrop instance for a given id
  		* @param id String the id of the DragDrop object
  		* @returns Ext.dd.DragDrop the drag drop object, null if it is not found
  		*/
  def getDDById(): IDragDrop = js.native
  def getDDById(id: String): IDragDrop = js.native
  /** [Method] Returns the actual DOM element
  		* @param id String the id of the elment to get
  		* @returns Object The element
  		*/
  def getElement(): js.Any = js.native
  def getElement(id: String): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
  		* @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
  		* @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
  		*/
  def getLocation(): IRegion = js.native
  def getLocation(oDD: IDragDrop): IRegion = js.native
  /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
  		* @param p_oDD Ext.dd.DragDrop the obj to get related data for
  		* @param bTargetsOnly Boolean if true, only return targetable objs
  		* @returns Ext.dd.DragDrop[] the related instances
  		*/
  def getRelated(): Array = js.native
  def getRelated(p_oDD: IDragDrop): Array = js.native
  def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): Array = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Utility function to determine if a given element has been registered as a drag drop item
  		* @param id String the element id to check
  		* @returns Boolean true if this element is a DragDrop item, false otherwise
  		*/
  def isDragDrop(): Boolean = js.native
  def isDragDrop(id: String): Boolean = js.native
  /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
  		* @param id String the element id to check
  		* @returns Boolean true if this element is a DragDrop handle, false otherwise
  		*/
  def isHandle(): Boolean = js.native
  def isHandle(id: String): Boolean = js.native
  /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
  		* @param oDD Ext.dd.DragDrop the drag obj
  		* @param oTargetDD Ext.dd.DragDrop the target
  		* @returns Boolean true if the target is a legal target for the dd obj
  		*/
  def isLegalTarget(): Boolean = js.native
  def isLegalTarget(oDD: IDragDrop): Boolean = js.native
  def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = js.native
  /** [Method] Is drag and drop locked
  		* @returns Boolean True if drag and drop is locked, false otherwise.
  		*/
  def isLocked(): Boolean = js.native
  /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
  		* @param the Object object to evaluate
  		* @returns Boolean true if typeof oDD = DragDrop
  		*/
  def isTypeOfDD(): Boolean = js.native
  def isTypeOfDD(the: js.Any): Boolean = js.native
  /** [Method] Lock all drag and drop functionality */
  def lock(): Unit = js.native
  /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
  		* @param groups Object an associative array of groups to refresh
  		*/
  def refreshCache(): Unit = js.native
  def refreshCache(groups: js.Any): Unit = js.native
  /** [Method] Each DragDrop instance must be registered with the DragDropManager
  		* @param oDD Ext.dd.DragDrop the DragDrop object to register
  		* @param sGroup String the name of the group this element belongs to
  		*/
  def regDragDrop(): Unit = js.native
  def regDragDrop(oDD: IDragDrop): Unit = js.native
  def regDragDrop(oDD: IDragDrop, sGroup: String): Unit = js.native
  /** [Method] Each DragDrop handle element must be registered
  		* @param sDDId String the DragDrop id this element is a handle for
  		* @param sHandleId String the id of the element that is the drag handle
  		*/
  def regHandle(): Unit = js.native
  def regHandle(sDDId: String): Unit = js.native
  def regHandle(sDDId: String, sHandleId: String): Unit = js.native
  /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
  		* @param x Number the X position of the original mousedown
  		* @param y Number the Y position of the original mousedown
  		*/
  def startDrag(): Unit = js.native
  def startDrag(x: Double): Unit = js.native
  def startDrag(x: Double, y: Double): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Utility to stop event propagation and event default if these features are turned on
  		* @param e Event the event as returned by this.getEvent()
  		*/
  def stopEvent(): Unit = js.native
  def stopEvent(e: Event_): Unit = js.native
  /** [Method] Unlock all drag and drop functionality */
  def unlock(): Unit = js.native
  /** [Method] This checks to make sure an element exists and is in the DOM
  		* @param el HTMLElement the element to check
  		* @returns Boolean true if the element looks usable
  		*/
  def verifyEl(): Boolean = js.native
  def verifyEl(el: HTMLElement): Boolean = js.native
}

