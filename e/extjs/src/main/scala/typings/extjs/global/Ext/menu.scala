package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.menu.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.menu")
@js.native
object menu extends js.Object {
  @js.native
  class Manager ()
    extends typings.extjs.Ext.menu.Manager
  
  @js.native
  class MenuMgr ()
    extends typings.extjs.Ext.menu.MenuMgr
  
  /* static members */
  @js.native
  object Manager extends js.Object {
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
    /** [Method] Returns a Ext menu Menu object
      * @param menu String/Object The string menu id, an existing menu object reference, or a Menu config that will be used to generate and return a new Menu this.
      * @returns Ext.menu.Menu The specified menu, or null if none are found
      */
    def get(): IMenu = js.native
    def get(menu: js.Any): IMenu = js.native
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Hides all menus that are currently visible
      * @returns Boolean success True if any active menus were hidden.
      */
    def hideAll(): Boolean = js.native
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    def initConfig(): IBase = js.native
    def initConfig(config: js.Any): IBase = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object MenuMgr extends js.Object {
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
    /** [Method] Returns a Ext menu Menu object
      * @param menu String/Object The string menu id, an existing menu object reference, or a Menu config that will be used to generate and return a new Menu this.
      * @returns Ext.menu.Menu The specified menu, or null if none are found
      */
    def get(): IMenu = js.native
    def get(menu: js.Any): IMenu = js.native
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Hides all menus that are currently visible
      * @returns Boolean success True if any active menus were hidden.
      */
    def hideAll(): Boolean = js.native
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    def initConfig(): IBase = js.native
    def initConfig(config: js.Any): IBase = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
}

