package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.draw.ISurface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draw {
  
  @JSGlobal("Ext.draw.Color")
  @js.native
  class Color ()
    extends StObject
       with typings.extjs.Ext.draw.Color
  /* static members */
  object Color {
    
    @JSGlobal("Ext.draw.Color")
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
    
    /** [Method] Create a new color based on the specified HSL values
      * @param h Number Hue component (0..359)
      * @param s Number Saturation component (0..1)
      * @param l Number Lightness component (0..1)
      * @returns Object Ext.draw.Color
      */
    @scala.inline
    def fromHSL(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")().asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Double, s: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Double, s: Double, l: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Double, s: Unit, l: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Unit, s: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Unit, s: Double, l: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def fromHSL(h: Unit, s: Unit, l: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Parse the string and create a new color
      * @param str String Color in string.
      * @returns Object Ext.draw.Color
      */
    @scala.inline
    def fromString(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")().asInstanceOf[js.Any]
    @scala.inline
    def fromString(str: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    
    /** [Method] Convert a color to hexadecimal format
      * @param color String/String[] The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
      * @returns String The color in hexadecimal format.
      */
    @scala.inline
    def toHex(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")().asInstanceOf[java.lang.String]
    @scala.inline
    def toHex(color: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(color.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSGlobal("Ext.draw.Draw")
  @js.native
  class Draw ()
    extends StObject
       with typings.extjs.Ext.draw.Draw
  /* static members */
  object Draw {
    
    @JSGlobal("Ext.draw.Draw")
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
    @JSGlobal("Ext.draw.Draw.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
      * @param from Date The minimum value in the data
      * @param to Date The maximum value in the data
      * @param stepsMax Number The maximum number of ticks
      * @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
      * @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
      */
    @scala.inline
    def snapEndsByDate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")().asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: Double, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: Unit, stepsMax: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: Unit, stepsMax: Double, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: js.Any, to: Unit, stepsMax: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: js.Any, stepsMax: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: js.Any, stepsMax: Double, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: js.Any, stepsMax: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: Unit, stepsMax: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: Unit, stepsMax: Double, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDate(from: Unit, to: Unit, stepsMax: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stepsMax.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
      * @param from Date The minimum value in the data
      * @param to Date The maximum value in the data
      * @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
      * @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
      * @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
      */
    @scala.inline
    def snapEndsByDateAndStep(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")().asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: Unit, step: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: Unit, step: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: js.Any, to: Unit, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: js.Any, step: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: js.Any, step: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: js.Any, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: Unit, step: Unit, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: Unit, step: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def snapEndsByDateAndStep(from: Unit, to: Unit, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapEndsByDateAndStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any], lockEnds.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.draw.Surface")
  @js.native
  class Surface ()
    extends StObject
       with typings.extjs.Ext.draw.Surface
  /* static members */
  object Surface {
    
    @JSGlobal("Ext.draw.Surface")
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
    
    /** [Method] Creates and returns a new concrete Surface instance appropriate for the current environment
      * @param config Object Initial configuration for the Surface instance
      * @param enginePriority String[] order of implementations to use; the first one that is available in the current environment will be used. Defaults to ['Svg', 'Vml'].
      * @returns Object The created Surface or false.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    @scala.inline
    def create(config: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create(config: js.Any, enginePriority: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], enginePriority.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(config: Unit, enginePriority: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], enginePriority.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Exports a surface in a different format
      * @param surface Ext.draw.Surface The surface to export.
      * @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
      * @returns Object See the return types for the appropriate exporter
      */
    @scala.inline
    def save(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("save")().asInstanceOf[js.Any]
    @scala.inline
    def save(surface: Unit, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def save(surface: ISurface): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(surface.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def save(surface: ISurface, config: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object engine {
    
    @JSGlobal("Ext.draw.engine.ImageExporter")
    @js.native
    class ImageExporter ()
      extends StObject
         with typings.extjs.Ext.draw.engine.ImageExporter
    /* static members */
    object ImageExporter {
      
      @JSGlobal("Ext.draw.engine.ImageExporter")
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
      
      /** [Property] (String) */
      @JSGlobal("Ext.draw.engine.ImageExporter.defaultUrl")
      @js.native
      def defaultUrl: java.lang.String = js.native
      @scala.inline
      def defaultUrl_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultUrl")(x.asInstanceOf[js.Any])
      
      /** [Method] Exports the surface to an image
        * @param surface Ext.draw.Surface The surface to export
        * @param config Object The following config options are supported:
        * @returns Boolean True if the surface was successfully sent to the server.
        */
      @scala.inline
      def generate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Boolean]
      @scala.inline
      def generate(surface: Unit, config: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      @scala.inline
      def generate(surface: ISurface): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      @scala.inline
      def generate(surface: ISurface, config: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      @scala.inline
      def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
      @scala.inline
      def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Property] (String) */
      @JSGlobal("Ext.draw.engine.ImageExporter.heightParam")
      @js.native
      def heightParam: java.lang.String = js.native
      @scala.inline
      def heightParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightParam")(x.asInstanceOf[js.Any])
      
      /** [Method] Initialize configuration for this class
        * @param config Object
        * @returns Ext.Base this
        */
      @scala.inline
      def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
      @scala.inline
      def initConfig(config: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.draw.engine.ImageExporter.self")
      @js.native
      def self: IClass = js.native
      @scala.inline
      def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      @scala.inline
      def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
      
      /** [Property] (Array) */
      @JSGlobal("Ext.draw.engine.ImageExporter.supportedTypes")
      @js.native
      def supportedTypes: typings.extjs.Ext.Array = js.native
      @scala.inline
      def supportedTypes_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTypes")(x.asInstanceOf[js.Any])
      
      /** [Property] (String) */
      @JSGlobal("Ext.draw.engine.ImageExporter.svgParam")
      @js.native
      def svgParam: java.lang.String = js.native
      @scala.inline
      def svgParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgParam")(x.asInstanceOf[js.Any])
      
      /** [Property] (String) */
      @JSGlobal("Ext.draw.engine.ImageExporter.typeParam")
      @js.native
      def typeParam: java.lang.String = js.native
      @scala.inline
      def typeParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeParam")(x.asInstanceOf[js.Any])
      
      /** [Property] (String) */
      @JSGlobal("Ext.draw.engine.ImageExporter.widthParam")
      @js.native
      def widthParam: java.lang.String = js.native
      @scala.inline
      def widthParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widthParam")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Ext.draw.engine.SvgExporter")
    @js.native
    class SvgExporter ()
      extends StObject
         with typings.extjs.Ext.draw.engine.SvgExporter
    /* static members */
    object SvgExporter {
      
      @JSGlobal("Ext.draw.engine.SvgExporter")
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
      
      /** [Method] Exports the passed surface to a SVG string representation
        * @param surface Ext.draw.Surface The surface to export
        * @param config Object Any configuration for the export. Currently this is unused but may provide more options in the future
        * @returns String The SVG as a string
        */
      @scala.inline
      def generate(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[java.lang.String]
      @scala.inline
      def generate(surface: Unit, config: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
      @scala.inline
      def generate(surface: ISurface): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
      @scala.inline
      def generate(surface: ISurface, config: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(surface.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
      
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
      @JSGlobal("Ext.draw.engine.SvgExporter.self")
      @js.native
      def self: IClass = js.native
      @scala.inline
      def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      @scala.inline
      def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
  }
}
