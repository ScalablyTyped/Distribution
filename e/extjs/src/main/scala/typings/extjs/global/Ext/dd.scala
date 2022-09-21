package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.dd.IDragDrop
import typings.extjs.Ext.util.IRegion
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dd {
  
  @JSGlobal("Ext.dd.DDM")
  @js.native
  open class DDM ()
    extends StObject
       with typings.extjs.Ext.dd.DDM
  /* static members */
  object DDM {
    
    @JSGlobal("Ext.dd.DDM")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    inline def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.POINT")
    @js.native
    def POINT: Double = js.native
    inline def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    inline def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    inline def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DDM.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    inline def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    inline def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    inline def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    inline def getCss(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[Any]
    inline def getCss(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    inline def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    inline def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    inline def getElement(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[Any]
    inline def getElement(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    inline def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    inline def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    inline def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    inline def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    inline def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    inline def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    inline def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    inline def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    inline def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    inline def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    inline def isTypeOfDD(the: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DDM.mode")
    @js.native
    def mode: Double = js.native
    inline def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    inline def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    inline def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    inline def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    inline def refreshCache(groups: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    inline def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    inline def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    inline def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DDM.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    inline def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    inline def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    inline def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    inline def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    inline def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    inline def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.useCache")
    @js.native
    def useCache: Boolean = js.native
    inline def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    inline def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    inline def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.DragDropManager")
  @js.native
  open class DragDropManager_ ()
    extends StObject
       with typings.extjs.Ext.dd.DragDropManager_
  /* static members */
  object DragDropManager_ {
    
    @JSGlobal("Ext.dd.DragDropManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    inline def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.POINT")
    @js.native
    def POINT: Double = js.native
    inline def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    inline def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    inline def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DragDropManager.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    inline def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    inline def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    inline def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    inline def getCss(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[Any]
    inline def getCss(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    inline def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    inline def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    inline def getElement(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[Any]
    inline def getElement(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    inline def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    inline def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    inline def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    inline def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    inline def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    inline def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    inline def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    inline def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    inline def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    inline def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    inline def isTypeOfDD(the: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropManager.mode")
    @js.native
    def mode: Double = js.native
    inline def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    inline def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    inline def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    inline def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    inline def refreshCache(groups: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    inline def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    inline def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    inline def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DragDropManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    inline def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    inline def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    inline def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    inline def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    inline def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    inline def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.useCache")
    @js.native
    def useCache: Boolean = js.native
    inline def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    inline def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    inline def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.DragDropMgr")
  @js.native
  open class DragDropMgr ()
    extends StObject
       with typings.extjs.Ext.dd.DragDropMgr
  /* static members */
  object DragDropMgr {
    
    @JSGlobal("Ext.dd.DragDropMgr")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.INTERSECT")
    @js.native
    def INTERSECT: Double = js.native
    inline def INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERSECT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.POINT")
    @js.native
    def POINT: Double = js.native
    inline def POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.clickPixelThresh")
    @js.native
    def clickPixelThresh: Double = js.native
    inline def clickPixelThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickPixelThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.clickTimeThresh")
    @js.native
    def clickTimeThresh: Double = js.native
    inline def clickTimeThresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.DragDropMgr.dragCls")
    @js.native
    def dragCls: java.lang.String = js.native
    inline def dragCls_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragCls")(x.asInstanceOf[js.Any])
    
    /** [Method] Helper function for getting the best match from the list of drag and drop objects returned by the drag and drop event
      * @param dds Ext.dd.DragDrop[] The array of drag and drop objects targeted
      * @returns Ext.dd.DragDrop The best single match
      */
    inline def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    inline def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    inline def getCss(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[Any]
    inline def getCss(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    inline def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    inline def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    inline def getElement(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[Any]
    inline def getElement(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    inline def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    inline def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    inline def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    inline def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    inline def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    inline def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    inline def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    inline def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    inline def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    inline def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    inline def isTypeOfDD(the: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.DragDropMgr.mode")
    @js.native
    def mode: Double = js.native
    inline def mode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.notifyOccluded")
    @js.native
    def notifyOccluded: Boolean = js.native
    inline def notifyOccluded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyOccluded")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.preventDefault")
    @js.native
    def preventDefault: Boolean = js.native
    inline def preventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(x.asInstanceOf[js.Any])
    
    /** [Method] Refreshes the cache of the top left and bottom right points of the drag and drop objects in the specified group s
      * @param groups Object an associative array of groups to refresh
      */
    inline def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    inline def refreshCache(groups: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    inline def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    inline def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    inline def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.DragDropMgr.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Fired when either the drag pixel threshold or the mousedown hold time threshold has been met
      * @param x Number the X position of the original mousedown
      * @param y Number the Y position of the original mousedown
      */
    inline def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    inline def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    inline def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    inline def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    inline def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    inline def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.useCache")
    @js.native
    def useCache: Boolean = js.native
    inline def useCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCache")(x.asInstanceOf[js.Any])
    
    /** [Method] This checks to make sure an element exists and is in the DOM
      * @param el HTMLElement the element to check
      * @returns Boolean true if the element looks usable
      */
    inline def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    inline def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.Registry")
  @js.native
  open class Registry ()
    extends StObject
       with typings.extjs.Ext.dd.Registry
  /* static members */
  object Registry {
    
    @JSGlobal("Ext.dd.Registry")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the handle registered for a DOM Node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object handle The custom handle data
      */
    inline def getHandle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandle")().asInstanceOf[Any]
    inline def getHandle(id: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the handle that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object handle The custom handle data
      */
    inline def getHandleFromEvent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleFromEvent")().asInstanceOf[Any]
    inline def getHandleFromEvent(e: Event): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a custom data object that is registered for a DOM node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object data The custom data
      */
    inline def getTarget(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")().asInstanceOf[Any]
    inline def getTarget(id: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a custom data object that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object data The custom data
      */
    inline def getTargetFromEvent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFromEvent")().asInstanceOf[Any]
    inline def getTargetFromEvent(e: Event): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Registers a drag drop element
      * @param element String/HTMLElement The id or DOM node to register
      * @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
      */
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    inline def register(element: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def register(element: Any, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(element: Unit, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.Registry.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregister a drag drop element
      * @param element String/HTMLElement The id or DOM node to unregister
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(element: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.dd.ScrollManager")
  @js.native
  open class ScrollManager ()
    extends StObject
       with typings.extjs.Ext.dd.ScrollManager
  /* static members */
  object ScrollManager {
    
    @JSGlobal("Ext.dd.ScrollManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.animDuration")
    @js.native
    def animDuration: Double = js.native
    inline def animDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animDuration")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.ScrollManager.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (String) */
    @JSGlobal("Ext.dd.ScrollManager.ddGroup")
    @js.native
    def ddGroup: java.lang.String = js.native
    inline def ddGroup_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.frequency")
    @js.native
    def frequency: Double = js.native
    inline def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.hthresh")
    @js.native
    def hthresh: Double = js.native
    inline def hthresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hthresh")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.increment")
    @js.native
    def increment: Double = js.native
    inline def increment_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("increment")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Manually trigger a cache refresh  */
    inline def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    
    /** [Method] Registers new overflow element s to auto scroll
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be scrolled or an array of either
      */
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    inline def register(el: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.ScrollManager.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregisters overflow element s so they are no longer scrolled
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be removed or an array of either
      */
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    inline def unregister(el: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.vthresh")
    @js.native
    def vthresh: Double = js.native
    inline def vthresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vthresh")(x.asInstanceOf[js.Any])
  }
}
