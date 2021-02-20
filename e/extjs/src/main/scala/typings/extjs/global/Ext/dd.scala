package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.dd.IDragDrop
import typings.extjs.Ext.util.IRegion
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dd {
  
  @JSGlobal("Ext.dd.DDM")
  @js.native
  class DDM ()
    extends typings.extjs.Ext.dd.DDM
  /* static members */
  object DDM {
    
    @JSGlobal("Ext.dd.DDM")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    @scala.inline
    def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.POINT")
    @js.native
    def POINT: Double = js.native
    @scala.inline
    def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.dd.DDM.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.dd.DDM.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.dd.DDM.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    @scala.inline
    def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    @scala.inline
    def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DDM.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    @scala.inline
    def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    @JSGlobal("Ext.dd.DDM.getBestMatch")
    @js.native
    def getBestMatch(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DDM.getBestMatch")
    @js.native
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = js.native
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @JSGlobal("Ext.dd.DDM.getCss")
    @js.native
    def getCss(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.getCss")
    @js.native
    def getCss(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @JSGlobal("Ext.dd.DDM.getDDById")
    @js.native
    def getDDById(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DDM.getDDById")
    @js.native
    def getDDById(id: java.lang.String): IDragDrop = js.native
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @JSGlobal("Ext.dd.DDM.getElement")
    @js.native
    def getElement(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.getElement")
    @js.native
    def getElement(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.dd.DDM.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.dd.DDM.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @JSGlobal("Ext.dd.DDM.getLocation")
    @js.native
    def getLocation(): IRegion = js.native
    @JSGlobal("Ext.dd.DDM.getLocation")
    @js.native
    def getLocation(oDD: IDragDrop): IRegion = js.native
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @JSGlobal("Ext.dd.DDM.getRelated")
    @js.native
    def getRelated(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DDM.getRelated")
    @js.native
    def getRelated(p_oDD: js.UndefOr[scala.Nothing], bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DDM.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DDM.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dd.DDM.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.dd.DDM.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @JSGlobal("Ext.dd.DDM.isDragDrop")
    @js.native
    def isDragDrop(): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isDragDrop")
    @js.native
    def isDragDrop(id: java.lang.String): Boolean = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @JSGlobal("Ext.dd.DDM.isHandle")
    @js.native
    def isHandle(): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isHandle")
    @js.native
    def isHandle(id: java.lang.String): Boolean = js.native
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @JSGlobal("Ext.dd.DDM.isLegalTarget")
    @js.native
    def isLegalTarget(): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: js.UndefOr[scala.Nothing], oTargetDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = js.native
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @JSGlobal("Ext.dd.DDM.isLocked")
    @js.native
    def isLocked(): Boolean = js.native
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @JSGlobal("Ext.dd.DDM.isTypeOfDD")
    @js.native
    def isTypeOfDD(): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.isTypeOfDD")
    @js.native
    def isTypeOfDD(the: js.Any): Boolean = js.native
    
    /** [Method] Lock all drag and drop functionality */
    @JSGlobal("Ext.dd.DDM.lock")
    @js.native
    def lock(): Unit = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.mode")
    @js.native
    def mode: Double = js.native
    @scala.inline
    def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    @scala.inline
    def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    @scala.inline
    def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    @JSGlobal("Ext.dd.DDM.refreshCache")
    @js.native
    def refreshCache(): Unit = js.native
    @JSGlobal("Ext.dd.DDM.refreshCache")
    @js.native
    def refreshCache(groups: js.Any): Unit = js.native
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @JSGlobal("Ext.dd.DDM.regDragDrop")
    @js.native
    def regDragDrop(): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regDragDrop")
    @js.native
    def regDragDrop(oDD: js.UndefOr[scala.Nothing], sGroup: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = js.native
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @JSGlobal("Ext.dd.DDM.regHandle")
    @js.native
    def regHandle(): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regHandle")
    @js.native
    def regHandle(sDDId: js.UndefOr[scala.Nothing], sHandleId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DDM.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DDM.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    @JSGlobal("Ext.dd.DDM.startDrag")
    @js.native
    def startDrag(): Unit = js.native
    @JSGlobal("Ext.dd.DDM.startDrag")
    @js.native
    def startDrag(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    @JSGlobal("Ext.dd.DDM.startDrag")
    @js.native
    def startDrag(x: Double): Unit = js.native
    @JSGlobal("Ext.dd.DDM.startDrag")
    @js.native
    def startDrag(x: Double, y: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.dd.DDM.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @JSGlobal("Ext.dd.DDM.stopEvent")
    @js.native
    def stopEvent(): Unit = js.native
    @JSGlobal("Ext.dd.DDM.stopEvent")
    @js.native
    def stopEvent(e: Event): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @JSGlobal("Ext.dd.DDM.unlock")
    @js.native
    def unlock(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.useCache")
    @js.native
    def useCache: Boolean = js.native
    @scala.inline
    def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    @JSGlobal("Ext.dd.DDM.verifyEl")
    @js.native
    def verifyEl(): Boolean = js.native
    @JSGlobal("Ext.dd.DDM.verifyEl")
    @js.native
    def verifyEl(el: HTMLElement): Boolean = js.native
  }
  
  @JSGlobal("Ext.dd.DragDropManager")
  @js.native
  class DragDropManager_ ()
    extends typings.extjs.Ext.dd.DragDropManager_
  /* static members */
  object DragDropManager_ {
    
    @JSGlobal("Ext.dd.DragDropManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    @scala.inline
    def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.POINT")
    @js.native
    def POINT: Double = js.native
    @scala.inline
    def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.dd.DragDropManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.dd.DragDropManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.dd.DragDropManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    @scala.inline
    def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    @scala.inline
    def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DragDropManager.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    @scala.inline
    def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    @JSGlobal("Ext.dd.DragDropManager.getBestMatch")
    @js.native
    def getBestMatch(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DragDropManager.getBestMatch")
    @js.native
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = js.native
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @JSGlobal("Ext.dd.DragDropManager.getCss")
    @js.native
    def getCss(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.getCss")
    @js.native
    def getCss(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @JSGlobal("Ext.dd.DragDropManager.getDDById")
    @js.native
    def getDDById(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DragDropManager.getDDById")
    @js.native
    def getDDById(id: java.lang.String): IDragDrop = js.native
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @JSGlobal("Ext.dd.DragDropManager.getElement")
    @js.native
    def getElement(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.getElement")
    @js.native
    def getElement(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.dd.DragDropManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @JSGlobal("Ext.dd.DragDropManager.getLocation")
    @js.native
    def getLocation(): IRegion = js.native
    @JSGlobal("Ext.dd.DragDropManager.getLocation")
    @js.native
    def getLocation(oDD: IDragDrop): IRegion = js.native
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @JSGlobal("Ext.dd.DragDropManager.getRelated")
    @js.native
    def getRelated(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropManager.getRelated")
    @js.native
    def getRelated(p_oDD: js.UndefOr[scala.Nothing], bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropManager.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropManager.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dd.DragDropManager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.dd.DragDropManager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @JSGlobal("Ext.dd.DragDropManager.isDragDrop")
    @js.native
    def isDragDrop(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isDragDrop")
    @js.native
    def isDragDrop(id: java.lang.String): Boolean = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @JSGlobal("Ext.dd.DragDropManager.isHandle")
    @js.native
    def isHandle(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isHandle")
    @js.native
    def isHandle(id: java.lang.String): Boolean = js.native
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @JSGlobal("Ext.dd.DragDropManager.isLegalTarget")
    @js.native
    def isLegalTarget(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: js.UndefOr[scala.Nothing], oTargetDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = js.native
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @JSGlobal("Ext.dd.DragDropManager.isLocked")
    @js.native
    def isLocked(): Boolean = js.native
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @JSGlobal("Ext.dd.DragDropManager.isTypeOfDD")
    @js.native
    def isTypeOfDD(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.isTypeOfDD")
    @js.native
    def isTypeOfDD(the: js.Any): Boolean = js.native
    
    /** [Method] Lock all drag and drop functionality */
    @JSGlobal("Ext.dd.DragDropManager.lock")
    @js.native
    def lock(): Unit = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.mode")
    @js.native
    def mode: Double = js.native
    @scala.inline
    def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    @scala.inline
    def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    @scala.inline
    def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    @JSGlobal("Ext.dd.DragDropManager.refreshCache")
    @js.native
    def refreshCache(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.refreshCache")
    @js.native
    def refreshCache(groups: js.Any): Unit = js.native
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @JSGlobal("Ext.dd.DragDropManager.regDragDrop")
    @js.native
    def regDragDrop(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regDragDrop")
    @js.native
    def regDragDrop(oDD: js.UndefOr[scala.Nothing], sGroup: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = js.native
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @JSGlobal("Ext.dd.DragDropManager.regHandle")
    @js.native
    def regHandle(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regHandle")
    @js.native
    def regHandle(sDDId: js.UndefOr[scala.Nothing], sHandleId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DragDropManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    @JSGlobal("Ext.dd.DragDropManager.startDrag")
    @js.native
    def startDrag(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.startDrag")
    @js.native
    def startDrag(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.startDrag")
    @js.native
    def startDrag(x: Double): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.startDrag")
    @js.native
    def startDrag(x: Double, y: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.dd.DragDropManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @JSGlobal("Ext.dd.DragDropManager.stopEvent")
    @js.native
    def stopEvent(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropManager.stopEvent")
    @js.native
    def stopEvent(e: Event): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @JSGlobal("Ext.dd.DragDropManager.unlock")
    @js.native
    def unlock(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.useCache")
    @js.native
    def useCache: Boolean = js.native
    @scala.inline
    def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    @JSGlobal("Ext.dd.DragDropManager.verifyEl")
    @js.native
    def verifyEl(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropManager.verifyEl")
    @js.native
    def verifyEl(el: HTMLElement): Boolean = js.native
  }
  
  @JSGlobal("Ext.dd.DragDropMgr")
  @js.native
  class DragDropMgr ()
    extends typings.extjs.Ext.dd.DragDropMgr
  /* static members */
  object DragDropMgr {
    
    @JSGlobal("Ext.dd.DragDropMgr")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    @scala.inline
    def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.POINT")
    @js.native
    def POINT: Double = js.native
    @scala.inline
    def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.dd.DragDropMgr.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.dd.DragDropMgr.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.dd.DragDropMgr.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    @scala.inline
    def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    @scala.inline
    def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DragDropMgr.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    @scala.inline
    def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    @JSGlobal("Ext.dd.DragDropMgr.getBestMatch")
    @js.native
    def getBestMatch(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getBestMatch")
    @js.native
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = js.native
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @JSGlobal("Ext.dd.DragDropMgr.getCss")
    @js.native
    def getCss(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getCss")
    @js.native
    def getCss(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @JSGlobal("Ext.dd.DragDropMgr.getDDById")
    @js.native
    def getDDById(): IDragDrop = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getDDById")
    @js.native
    def getDDById(id: java.lang.String): IDragDrop = js.native
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @JSGlobal("Ext.dd.DragDropMgr.getElement")
    @js.native
    def getElement(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getElement")
    @js.native
    def getElement(id: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.dd.DragDropMgr.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @JSGlobal("Ext.dd.DragDropMgr.getLocation")
    @js.native
    def getLocation(): IRegion = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getLocation")
    @js.native
    def getLocation(oDD: IDragDrop): IRegion = js.native
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @JSGlobal("Ext.dd.DragDropMgr.getRelated")
    @js.native
    def getRelated(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getRelated")
    @js.native
    def getRelated(p_oDD: js.UndefOr[scala.Nothing], bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dd.DragDropMgr.getRelated")
    @js.native
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dd.DragDropMgr.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.dd.DragDropMgr.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @JSGlobal("Ext.dd.DragDropMgr.isDragDrop")
    @js.native
    def isDragDrop(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isDragDrop")
    @js.native
    def isDragDrop(id: java.lang.String): Boolean = js.native
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @JSGlobal("Ext.dd.DragDropMgr.isHandle")
    @js.native
    def isHandle(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isHandle")
    @js.native
    def isHandle(id: java.lang.String): Boolean = js.native
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @JSGlobal("Ext.dd.DragDropMgr.isLegalTarget")
    @js.native
    def isLegalTarget(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: js.UndefOr[scala.Nothing], oTargetDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isLegalTarget")
    @js.native
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = js.native
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @JSGlobal("Ext.dd.DragDropMgr.isLocked")
    @js.native
    def isLocked(): Boolean = js.native
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @JSGlobal("Ext.dd.DragDropMgr.isTypeOfDD")
    @js.native
    def isTypeOfDD(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.isTypeOfDD")
    @js.native
    def isTypeOfDD(the: js.Any): Boolean = js.native
    
    /** [Method] Lock all drag and drop functionality */
    @JSGlobal("Ext.dd.DragDropMgr.lock")
    @js.native
    def lock(): Unit = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.mode")
    @js.native
    def mode: Double = js.native
    @scala.inline
    def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    @scala.inline
    def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    @scala.inline
    def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    @JSGlobal("Ext.dd.DragDropMgr.refreshCache")
    @js.native
    def refreshCache(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.refreshCache")
    @js.native
    def refreshCache(groups: js.Any): Unit = js.native
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @JSGlobal("Ext.dd.DragDropMgr.regDragDrop")
    @js.native
    def regDragDrop(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regDragDrop")
    @js.native
    def regDragDrop(oDD: js.UndefOr[scala.Nothing], sGroup: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regDragDrop")
    @js.native
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = js.native
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @JSGlobal("Ext.dd.DragDropMgr.regHandle")
    @js.native
    def regHandle(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regHandle")
    @js.native
    def regHandle(sDDId: js.UndefOr[scala.Nothing], sHandleId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.regHandle")
    @js.native
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DragDropMgr.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    @JSGlobal("Ext.dd.DragDropMgr.startDrag")
    @js.native
    def startDrag(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.startDrag")
    @js.native
    def startDrag(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.startDrag")
    @js.native
    def startDrag(x: Double): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.startDrag")
    @js.native
    def startDrag(x: Double, y: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.dd.DragDropMgr.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @JSGlobal("Ext.dd.DragDropMgr.stopEvent")
    @js.native
    def stopEvent(): Unit = js.native
    @JSGlobal("Ext.dd.DragDropMgr.stopEvent")
    @js.native
    def stopEvent(e: Event): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @JSGlobal("Ext.dd.DragDropMgr.unlock")
    @js.native
    def unlock(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.useCache")
    @js.native
    def useCache: Boolean = js.native
    @scala.inline
    def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    @JSGlobal("Ext.dd.DragDropMgr.verifyEl")
    @js.native
    def verifyEl(): Boolean = js.native
    @JSGlobal("Ext.dd.DragDropMgr.verifyEl")
    @js.native
    def verifyEl(el: HTMLElement): Boolean = js.native
  }
  
  @JSGlobal("Ext.dd.Registry")
  @js.native
  class Registry ()
    extends typings.extjs.Ext.dd.Registry
  /* static members */
  object Registry {
    
    @JSGlobal("Ext.dd.Registry")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.dd.Registry.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.dd.Registry.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.dd.Registry.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Returns the handle registered for a DOM Node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object handle The custom handle data
      */
    @JSGlobal("Ext.dd.Registry.getHandle")
    @js.native
    def getHandle(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.getHandle")
    @js.native
    def getHandle(id: js.Any): js.Any = js.native
    
    /** [Method] Returns the handle that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object handle The custom handle data
      */
    @JSGlobal("Ext.dd.Registry.getHandleFromEvent")
    @js.native
    def getHandleFromEvent(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.getHandleFromEvent")
    @js.native
    def getHandleFromEvent(e: Event): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.dd.Registry.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns a custom data object that is registered for a DOM node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object data The custom data
      */
    @JSGlobal("Ext.dd.Registry.getTarget")
    @js.native
    def getTarget(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.getTarget")
    @js.native
    def getTarget(id: js.Any): js.Any = js.native
    
    /** [Method] Returns a custom data object that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object data The custom data
      */
    @JSGlobal("Ext.dd.Registry.getTargetFromEvent")
    @js.native
    def getTargetFromEvent(): js.Any = js.native
    @JSGlobal("Ext.dd.Registry.getTargetFromEvent")
    @js.native
    def getTargetFromEvent(e: Event): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dd.Registry.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.dd.Registry.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Registers a drag drop element
      * @param element String/HTMLElement The id or DOM node to register
      * @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
      */
    @JSGlobal("Ext.dd.Registry.register")
    @js.native
    def register(): Unit = js.native
    @JSGlobal("Ext.dd.Registry.register")
    @js.native
    def register(element: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    @JSGlobal("Ext.dd.Registry.register")
    @js.native
    def register(element: js.Any): Unit = js.native
    @JSGlobal("Ext.dd.Registry.register")
    @js.native
    def register(element: js.Any, data: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.Registry.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.dd.Registry.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Unregister a drag drop element
      * @param element String/HTMLElement The id or DOM node to unregister
      */
    @JSGlobal("Ext.dd.Registry.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.dd.Registry.unregister")
    @js.native
    def unregister(element: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.dd.ScrollManager")
  @js.native
  class ScrollManager ()
    extends typings.extjs.Ext.dd.ScrollManager
  /* static members */
  object ScrollManager {
    
    @JSGlobal("Ext.dd.ScrollManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.animDuration")
    @js.native
    def animDuration: Double = js.native
    @scala.inline
    def animDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animDuration")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.ScrollManager.animate")
    @js.native
    def animate: Boolean = js.native
    @scala.inline
    def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.dd.ScrollManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.dd.ScrollManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.dd.ScrollManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.dd.ScrollManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.dd.ScrollManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.dd.ScrollManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.ScrollManager.ddGroup")
    @js.native
    def ddGroup: java.lang.String = js.native
    @scala.inline
    def ddGroup_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.frequency")
    @js.native
    def frequency: Double = js.native
    @scala.inline
    def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @JSGlobal("Ext.dd.ScrollManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.dd.ScrollManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.hthresh")
    @js.native
    def hthresh: Double = js.native
    @scala.inline
    def hthresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hthresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.increment")
    @js.native
    def increment: Double = js.native
    @scala.inline
    def increment_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("increment")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dd.ScrollManager.initConfig")
    @js.native
    def initConfig(): IBase = js.native
    @JSGlobal("Ext.dd.ScrollManager.initConfig")
    @js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Manually trigger a cache refresh  */
    @JSGlobal("Ext.dd.ScrollManager.refreshCache")
    @js.native
    def refreshCache(): Unit = js.native
    
    /** [Method] Registers new overflow element s to auto scroll
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be scrolled or an array of either
      */
    @JSGlobal("Ext.dd.ScrollManager.register")
    @js.native
    def register(): Unit = js.native
    @JSGlobal("Ext.dd.ScrollManager.register")
    @js.native
    def register(el: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.ScrollManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.dd.ScrollManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Unregisters overflow element s so they are no longer scrolled
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be removed or an array of either
      */
    @JSGlobal("Ext.dd.ScrollManager.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.dd.ScrollManager.unregister")
    @js.native
    def unregister(el: js.Any): Unit = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.vthresh")
    @js.native
    def vthresh: Double = js.native
    @scala.inline
    def vthresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vthresh")(x.asInstanceOf[js.Any])
  }
}
