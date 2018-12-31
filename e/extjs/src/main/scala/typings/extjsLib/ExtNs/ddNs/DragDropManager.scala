package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.dd.DragDropManager")
@js.native
class DragDropManager () extends js.Object

@JSGlobal("Ext.dd.DragDropManager")
@js.native
object DragDropManager extends js.Object {
  /** [Property] (Number) */
  var INTERSECT: scala.Double = js.native
  /** [Property] (Number) */
  var POINT: scala.Double = js.native
  /** [Property] (Number) */
  var clickPixelThresh: scala.Double = js.native
  /** [Property] (Number) */
  var clickTimeThresh: scala.Double = js.native
  /** [Property] (String) */
  var dragCls: java.lang.String = js.native
  /** [Property] (Number) */
  var mode: scala.Double = js.native
  /** [Property] (Boolean) */
  var notifyOccluded: scala.Boolean = js.native
  /** [Property] (Boolean) */
  var preventDefault: scala.Boolean = js.native
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Property] (Boolean) */
  var stopPropagation: scala.Boolean = js.native
  /** [Property] (Boolean) */
  var useCache: scala.Boolean = js.native
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
  def getBestMatch(): extjsLib.ExtNs.ddNs.IDragDrop = js.native
  def getBestMatch(dds: extjsLib.ExtNs.Array): extjsLib.ExtNs.ddNs.IDragDrop = js.native
  /** [Method] Returns the style property for the DOM element i e  document getElById id style
  		* @param id String the id of the elment to get
  		* @returns Object The style property of the element
  		*/
  def getCss(): js.Any = js.native
  def getCss(id: java.lang.String): js.Any = js.native
  /** [Method] Returns the DragDrop instance for a given id
  		* @param id String the id of the DragDrop object
  		* @returns Ext.dd.DragDrop the drag drop object, null if it is not found
  		*/
  def getDDById(): extjsLib.ExtNs.ddNs.IDragDrop = js.native
  def getDDById(id: java.lang.String): extjsLib.ExtNs.ddNs.IDragDrop = js.native
  /** [Method] Returns the actual DOM element
  		* @param id String the id of the elment to get
  		* @returns Object The element
  		*/
  def getElement(): js.Any = js.native
  def getElement(id: java.lang.String): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
  		* @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
  		* @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
  		*/
  def getLocation(): extjsLib.ExtNs.utilNs.IRegion = js.native
  def getLocation(oDD: extjsLib.ExtNs.ddNs.IDragDrop): extjsLib.ExtNs.utilNs.IRegion = js.native
  /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
  		* @param p_oDD Ext.dd.DragDrop the obj to get related data for
  		* @param bTargetsOnly Boolean if true, only return targetable objs
  		* @returns Ext.dd.DragDrop[] the related instances
  		*/
  def getRelated(): extjsLib.ExtNs.Array = js.native
  def getRelated(p_oDD: extjsLib.ExtNs.ddNs.IDragDrop): extjsLib.ExtNs.Array = js.native
  def getRelated(p_oDD: extjsLib.ExtNs.ddNs.IDragDrop, bTargetsOnly: scala.Boolean): extjsLib.ExtNs.Array = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Utility function to determine if a given element has been registered as a drag drop item
  		* @param id String the element id to check
  		* @returns Boolean true if this element is a DragDrop item, false otherwise
  		*/
  def isDragDrop(): scala.Boolean = js.native
  def isDragDrop(id: java.lang.String): scala.Boolean = js.native
  /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
  		* @param id String the element id to check
  		* @returns Boolean true if this element is a DragDrop handle, false otherwise
  		*/
  def isHandle(): scala.Boolean = js.native
  def isHandle(id: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
  		* @param oDD Ext.dd.DragDrop the drag obj
  		* @param oTargetDD Ext.dd.DragDrop the target
  		* @returns Boolean true if the target is a legal target for the dd obj
  		*/
  def isLegalTarget(): scala.Boolean = js.native
  def isLegalTarget(oDD: extjsLib.ExtNs.ddNs.IDragDrop): scala.Boolean = js.native
  def isLegalTarget(oDD: extjsLib.ExtNs.ddNs.IDragDrop, oTargetDD: extjsLib.ExtNs.ddNs.IDragDrop): scala.Boolean = js.native
  /** [Method] Is drag and drop locked
  		* @returns Boolean True if drag and drop is locked, false otherwise.
  		*/
  def isLocked(): scala.Boolean = js.native
  /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
  		* @param the Object object to evaluate
  		* @returns Boolean true if typeof oDD = DragDrop
  		*/
  def isTypeOfDD(): scala.Boolean = js.native
  def isTypeOfDD(the: js.Any): scala.Boolean = js.native
  /** [Method] Lock all drag and drop functionality */
  def lock(): scala.Unit = js.native
  /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
  		* @param groups Object an associative array of groups to refresh
  		*/
  def refreshCache(): scala.Unit = js.native
  def refreshCache(groups: js.Any): scala.Unit = js.native
  /** [Method] Each DragDrop instance must be registered with the DragDropManager
  		* @param oDD Ext.dd.DragDrop the DragDrop object to register
  		* @param sGroup String the name of the group this element belongs to
  		*/
  def regDragDrop(): scala.Unit = js.native
  def regDragDrop(oDD: extjsLib.ExtNs.ddNs.IDragDrop): scala.Unit = js.native
  def regDragDrop(oDD: extjsLib.ExtNs.ddNs.IDragDrop, sGroup: java.lang.String): scala.Unit = js.native
  /** [Method] Each DragDrop handle element must be registered
  		* @param sDDId String the DragDrop id this element is a handle for
  		* @param sHandleId String the id of the element that is the drag handle
  		*/
  def regHandle(): scala.Unit = js.native
  def regHandle(sDDId: java.lang.String): scala.Unit = js.native
  def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): scala.Unit = js.native
  /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
  		* @param x Number the X position of the original mousedown
  		* @param y Number the Y position of the original mousedown
  		*/
  def startDrag(): scala.Unit = js.native
  def startDrag(x: scala.Double): scala.Unit = js.native
  def startDrag(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
  /** [Method] Utility to stop event propagation and event default if these features are turned on
  		* @param e Event the event as returned by this.getEvent()
  		*/
  def stopEvent(): scala.Unit = js.native
  def stopEvent(e: stdLib.Event): scala.Unit = js.native
  /** [Method] Unlock all drag and drop functionality */
  def unlock(): scala.Unit = js.native
  /** [Method] This checks to make sure an element exists and is in the DOM
  		* @param el HTMLElement the element to check
  		* @returns Boolean true if the element looks usable
  		*/
  def verifyEl(): scala.Boolean = js.native
  def verifyEl(el: stdLib.HTMLElement): scala.Boolean = js.native
}

