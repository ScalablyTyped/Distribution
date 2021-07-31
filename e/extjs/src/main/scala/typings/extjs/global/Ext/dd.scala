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
  class DDM ()
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
    @scala.inline
    def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    @scala.inline
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @scala.inline
    def getCss(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[js.Any]
    @scala.inline
    def getCss(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @scala.inline
    def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    @scala.inline
    def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @scala.inline
    def getElement(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[js.Any]
    @scala.inline
    def getElement(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @scala.inline
    def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    @scala.inline
    def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @scala.inline
    def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @scala.inline
    def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    @scala.inline
    def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @scala.inline
    def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    @scala.inline
    def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @scala.inline
    def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @scala.inline
    def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @scala.inline
    def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    @scala.inline
    def isTypeOfDD(the: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    @scala.inline
    def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    @scala.inline
    def refreshCache(groups: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @scala.inline
    def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @scala.inline
    def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    @scala.inline
    def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @scala.inline
    def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    @scala.inline
    def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DDM.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @scala.inline
    def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    @scala.inline
    def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.DragDropManager")
  @js.native
  class DragDropManager_ ()
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
    @scala.inline
    def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    @scala.inline
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @scala.inline
    def getCss(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[js.Any]
    @scala.inline
    def getCss(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @scala.inline
    def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    @scala.inline
    def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @scala.inline
    def getElement(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[js.Any]
    @scala.inline
    def getElement(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @scala.inline
    def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    @scala.inline
    def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @scala.inline
    def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @scala.inline
    def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    @scala.inline
    def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @scala.inline
    def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    @scala.inline
    def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @scala.inline
    def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @scala.inline
    def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @scala.inline
    def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    @scala.inline
    def isTypeOfDD(the: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    @scala.inline
    def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    @scala.inline
    def refreshCache(groups: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @scala.inline
    def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @scala.inline
    def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    @scala.inline
    def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @scala.inline
    def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    @scala.inline
    def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropManager.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @scala.inline
    def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    @scala.inline
    def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.DragDropMgr")
  @js.native
  class DragDropMgr ()
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
    @scala.inline
    def getBestMatch(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")().asInstanceOf[IDragDrop]
    @scala.inline
    def getBestMatch(dds: typings.extjs.Ext.Array): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestMatch")(dds.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the style property for the DOM element i e  document getElById id style
      * @param id String the id of the elment to get
      * @returns Object The style property of the element
      */
    @scala.inline
    def getCss(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")().asInstanceOf[js.Any]
    @scala.inline
    def getCss(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCss")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the DragDrop instance for a given id
      * @param id String the id of the DragDrop object
      * @returns Ext.dd.DragDrop the drag drop object, null if it is not found
      */
    @scala.inline
    def getDDById(): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")().asInstanceOf[IDragDrop]
    @scala.inline
    def getDDById(id: java.lang.String): IDragDrop = ^.asInstanceOf[js.Dynamic].applyDynamic("getDDById")(id.asInstanceOf[js.Any]).asInstanceOf[IDragDrop]
    
    /** [Method] Returns the actual DOM element
      * @param id String the id of the elment to get
      * @returns Object The element
      */
    @scala.inline
    def getElement(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[js.Any]
    @scala.inline
    def getElement(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a Region object containing the drag and drop element s position and size including the padding configured fo
      * @param oDD Ext.dd.DragDrop the drag and drop object to get the location for.
      * @returns Ext.util.Region a Region object representing the total area the element occupies, including any padding the instance is configured for.
      */
    @scala.inline
    def getLocation(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[IRegion]
    @scala.inline
    def getLocation(oDD: IDragDrop): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(oDD.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Returns the drag and drop instances that are in all groups the passed in instance belongs to
      * @param p_oDD Ext.dd.DragDrop the obj to get related data for
      * @param bTargetsOnly Boolean if true, only return targetable objs
      * @returns Ext.dd.DragDrop[] the related instances
      */
    @scala.inline
    def getRelated(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")().asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: Unit, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    @scala.inline
    def getRelated(p_oDD: IDragDrop, bTargetsOnly: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelated")(p_oDD.asInstanceOf[js.Any], bTargetsOnly.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop item
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop item, false otherwise
      */
    @scala.inline
    def isDragDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")().asInstanceOf[Boolean]
    @scala.inline
    def isDragDrop(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragDrop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Utility function to determine if a given element has been registered as a drag drop handle for the given Drag Drop ob
      * @param id String the element id to check
      * @returns Boolean true if this element is a DragDrop handle, false otherwise
      */
    @scala.inline
    def isHandle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")().asInstanceOf[Boolean]
    @scala.inline
    def isHandle(id: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Returns true if the specified dd target is a legal target for the specifice drag obj
      * @param oDD Ext.dd.DragDrop the drag obj
      * @param oTargetDD Ext.dd.DragDrop the target
      * @returns Boolean true if the target is a legal target for the dd obj
      */
    @scala.inline
    def isLegalTarget(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")().asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: Unit, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def isLegalTarget(oDD: IDragDrop, oTargetDD: IDragDrop): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLegalTarget")(oDD.asInstanceOf[js.Any], oTargetDD.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Is drag and drop locked
      * @returns Boolean True if drag and drop is locked, false otherwise.
      */
    @scala.inline
    def isLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocked")().asInstanceOf[Boolean]
    
    /** [Method] My goal is to be able to transparently determine if an object is typeof DragDrop and the exact subclass of DragDrop
      * @param the Object object to evaluate
      * @returns Boolean true if typeof oDD = DragDrop
      */
    @scala.inline
    def isTypeOfDD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")().asInstanceOf[Boolean]
    @scala.inline
    def isTypeOfDD(the: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfDD")(the.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Lock all drag and drop functionality */
    @scala.inline
    def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    @scala.inline
    def refreshCache(groups: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")(groups.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop instance must be registered with the DragDropManager
      * @param oDD Ext.dd.DragDrop the DragDrop object to register
      * @param sGroup String the name of the group this element belongs to
      */
    @scala.inline
    def regDragDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")().asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: Unit, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regDragDrop(oDD: IDragDrop, sGroup: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regDragDrop")(oDD.asInstanceOf[js.Any], sGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Each DragDrop handle element must be registered
      * @param sDDId String the DragDrop id this element is a handle for
      * @param sHandleId String the id of the element that is the drag handle
      */
    @scala.inline
    def regHandle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")().asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: java.lang.String, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def regHandle(sDDId: Unit, sHandleId: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regHandle")(sDDId.asInstanceOf[js.Any], sHandleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    @scala.inline
    def startDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")().asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def startDrag(x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDrag")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility to stop event propagation and event default if these features are turned on
      * @param e Event the event as returned by this.getEvent()
      */
    @scala.inline
    def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    @scala.inline
    def stopEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.dd.DragDropMgr.stopPropagation")
    @js.native
    def stopPropagation: Boolean = js.native
    @scala.inline
    def stopPropagation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    /** [Method] Unlock all drag and drop functionality */
    @scala.inline
    def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
    
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
    @scala.inline
    def verifyEl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")().asInstanceOf[Boolean]
    @scala.inline
    def verifyEl(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEl")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Ext.dd.Registry")
  @js.native
  class Registry ()
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
    
    /** [Method] Returns the handle registered for a DOM Node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object handle The custom handle data
      */
    @scala.inline
    def getHandle(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandle")().asInstanceOf[js.Any]
    @scala.inline
    def getHandle(id: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandle")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the handle that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object handle The custom handle data
      */
    @scala.inline
    def getHandleFromEvent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleFromEvent")().asInstanceOf[js.Any]
    @scala.inline
    def getHandleFromEvent(e: Event): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a custom data object that is registered for a DOM node by id
      * @param id String/HTMLElement The DOM node or id to look up
      * @returns Object data The custom data
      */
    @scala.inline
    def getTarget(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")().asInstanceOf[js.Any]
    @scala.inline
    def getTarget(id: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns a custom data object that is registered for the DOM node that is the target of the event
      * @param e Event The event
      * @returns Object data The custom data
      */
    @scala.inline
    def getTargetFromEvent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFromEvent")().asInstanceOf[js.Any]
    @scala.inline
    def getTargetFromEvent(e: Event): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Registers a drag drop element
      * @param element String/HTMLElement The id or DOM node to register
      * @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
      */
    @scala.inline
    def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    @scala.inline
    def register(element: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def register(element: js.Any, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def register(element: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.Registry.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregister a drag drop element
      * @param element String/HTMLElement The id or DOM node to unregister
      */
    @scala.inline
    def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    @scala.inline
    def unregister(element: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.dd.ScrollManager")
  @js.native
  class ScrollManager ()
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
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    @scala.inline
    def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    @scala.inline
    def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Manually trigger a cache refresh  */
    @scala.inline
    def refreshCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCache")().asInstanceOf[Unit]
    
    /** [Method] Registers new overflow element s to auto scroll
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be scrolled or an array of either
      */
    @scala.inline
    def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    @scala.inline
    def register(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.dd.ScrollManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Unregisters overflow element s so they are no longer scrolled
      * @param el String/HTMLElement/Ext.Element/String[]/HTMLElement[]/Ext.Element[] The id of or the element to be removed or an array of either
      */
    @scala.inline
    def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    @scala.inline
    def unregister(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.dd.ScrollManager.vthresh")
    @js.native
    def vthresh: Double = js.native
    @scala.inline
    def vthresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vthresh")(x.asInstanceOf[js.Any])
  }
}
