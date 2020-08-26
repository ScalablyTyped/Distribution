package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw")
@js.native
object draw extends js.Object {
  @js.native
  class Color ()
    extends typings.extjs.Ext.draw.Color
  
  @js.native
  class Draw ()
    extends typings.extjs.Ext.draw.Draw
  
  @js.native
  class Surface ()
    extends typings.extjs.Ext.draw.Surface
  
  /* static members */
  @js.native
  object Color extends js.Object {
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
    /** [Method] Create a new color based on the specified HSL values
      * @param h Number Hue component (0..359)
      * @param s Number Saturation component (0..1)
      * @param l Number Lightness component (0..1)
      * @returns Object Ext.draw.Color
      */
    def fromHSL(): js.Any = js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: js.UndefOr[scala.Nothing], l: Double): js.Any = js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: Double): js.Any = js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: Double, l: Double): js.Any = js.native
    def fromHSL(h: Double): js.Any = js.native
    def fromHSL(h: Double, s: js.UndefOr[scala.Nothing], l: Double): js.Any = js.native
    def fromHSL(h: Double, s: Double): js.Any = js.native
    def fromHSL(h: Double, s: Double, l: Double): js.Any = js.native
    /** [Method] Parse the string and create a new color
      * @param str String Color in string.
      * @returns Object Ext.draw.Color
      */
    def fromString(): js.Any = js.native
    def fromString(str: java.lang.String): js.Any = js.native
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    def getName(): java.lang.String = js.native
    /** [Method] Adds members to class  */
    def implement(): Unit = js.native
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    def `override`(): IBase = js.native
    def `override`(members: js.Any): IBase = js.native
    /** [Method] Convert a color to hexadecimal format
      * @param color String/String[] The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
      * @returns String The color in hexadecimal format.
      */
    def toHex(): java.lang.String = js.native
    def toHex(color: js.Any): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Draw extends js.Object {
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
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    def initConfig(): IBase = js.native
    def initConfig(config: js.Any): IBase = js.native
    /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
      * @param from Date The minimum value in the data
      * @param to Date The maximum value in the data
      * @param stepsMax Number The maximum number of ticks
      * @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
      * @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
      */
    def snapEndsByDate(): js.Any = js.native
    def snapEndsByDate(
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      stepsMax: js.UndefOr[scala.Nothing],
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDate(from: js.UndefOr[scala.Nothing], to: js.UndefOr[scala.Nothing], stepsMax: Double): js.Any = js.native
    def snapEndsByDate(
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      stepsMax: Double,
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDate(from: js.UndefOr[scala.Nothing], to: js.Any): js.Any = js.native
    def snapEndsByDate(
      from: js.UndefOr[scala.Nothing],
      to: js.Any,
      stepsMax: js.UndefOr[scala.Nothing],
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDate(from: js.UndefOr[scala.Nothing], to: js.Any, stepsMax: Double): js.Any = js.native
    def snapEndsByDate(from: js.UndefOr[scala.Nothing], to: js.Any, stepsMax: Double, lockEnds: Boolean): js.Any = js.native
    def snapEndsByDate(from: js.Any): js.Any = js.native
    def snapEndsByDate(
      from: js.Any,
      to: js.UndefOr[scala.Nothing],
      stepsMax: js.UndefOr[scala.Nothing],
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.UndefOr[scala.Nothing], stepsMax: Double): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.UndefOr[scala.Nothing], stepsMax: Double, lockEnds: Boolean): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.Any): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: js.UndefOr[scala.Nothing], lockEnds: Boolean): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: Double): js.Any = js.native
    def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: Double, lockEnds: Boolean): js.Any = js.native
    /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
      * @param from Date The minimum value in the data
      * @param to Date The maximum value in the data
      * @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
      * @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
      * @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
      */
    def snapEndsByDateAndStep(): js.Any = js.native
    def snapEndsByDateAndStep(
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      step: js.UndefOr[scala.Nothing],
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDateAndStep(from: js.UndefOr[scala.Nothing], to: js.UndefOr[scala.Nothing], step: typings.extjs.Ext.Array): js.Any = js.native
    def snapEndsByDateAndStep(
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      step: typings.extjs.Ext.Array,
      lockEnds: Boolean
    ): js.Any = js.native
    def snapEndsByDateAndStep(from: js.UndefOr[scala.Nothing], to: js.Any): js.Any = js.native
    def snapEndsByDateAndStep(from: js.UndefOr[scala.Nothing], to: js.Any, step: js.UndefOr[scala.Nothing], lockEnds: Boolean): js.Any = js.native
    def snapEndsByDateAndStep(from: js.UndefOr[scala.Nothing], to: js.Any, step: typings.extjs.Ext.Array): js.Any = js.native
    def snapEndsByDateAndStep(from: js.UndefOr[scala.Nothing], to: js.Any, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.UndefOr[scala.Nothing], step: js.UndefOr[scala.Nothing], lockEnds: Boolean): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.UndefOr[scala.Nothing], step: typings.extjs.Ext.Array): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.UndefOr[scala.Nothing], step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.Any): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: js.UndefOr[scala.Nothing], lockEnds: Boolean): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: typings.extjs.Ext.Array): js.Any = js.native
    def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: typings.extjs.Ext.Array, lockEnds: Boolean): js.Any = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object Surface extends js.Object {
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
    /** [Method] Creates and returns a new concrete Surface instance appropriate for the current environment
      * @param config Object Initial configuration for the Surface instance
      * @param enginePriority String[] order of implementations to use; the first one that is available in the current environment will be used. Defaults to ['Svg', 'Vml'].
      * @returns Object The created Surface or false.
      */
    def create(): js.Any = js.native
    def create(config: js.UndefOr[scala.Nothing], enginePriority: typings.extjs.Ext.Array): js.Any = js.native
    def create(config: js.Any): js.Any = js.native
    def create(config: js.Any, enginePriority: typings.extjs.Ext.Array): js.Any = js.native
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    def createAlias(): Unit = js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    def createAlias(alias: js.Any): Unit = js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    def getName(): java.lang.String = js.native
    /** [Method] Adds members to class  */
    def implement(): Unit = js.native
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    def `override`(): IBase = js.native
    def `override`(members: js.Any): IBase = js.native
    /** [Method] Exports a surface in a different format
      * @param surface Ext.draw.Surface The surface to export.
      * @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
      * @returns Object See the return types for the appropriate exporter
      */
    def save(): js.Any = js.native
    def save(surface: js.UndefOr[scala.Nothing], config: js.Any): js.Any = js.native
    def save(surface: ISurface): js.Any = js.native
    def save(surface: ISurface, config: js.Any): js.Any = js.native
  }
  
  @js.native
  object engine extends js.Object {
    @js.native
    class ImageExporter ()
      extends typings.extjs.Ext.draw.engine.ImageExporter
    
    @js.native
    class SvgExporter ()
      extends typings.extjs.Ext.draw.engine.SvgExporter
    
    /* static members */
    @js.native
    object ImageExporter extends js.Object {
      /** [Property] (String) */
      var defaultUrl: java.lang.String = js.native
      /** [Property] (String) */
      var heightParam: java.lang.String = js.native
      /** [Property] (Ext.Class) */
      var self: IClass = js.native
      /** [Property] (Array) */
      var supportedTypes: typings.extjs.Ext.Array = js.native
      /** [Property] (String) */
      var svgParam: java.lang.String = js.native
      /** [Property] (String) */
      var typeParam: java.lang.String = js.native
      /** [Property] (String) */
      var widthParam: java.lang.String = js.native
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
      /** [Method] Exports the surface to an image
        * @param surface Ext.draw.Surface The surface to export
        * @param config Object The following config options are supported:
        * @returns Boolean True if the surface was successfully sent to the server.
        */
      def generate(): Boolean = js.native
      def generate(surface: js.UndefOr[scala.Nothing], config: js.Any): Boolean = js.native
      def generate(surface: ISurface): Boolean = js.native
      def generate(surface: ISurface, config: js.Any): Boolean = js.native
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
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
    object SvgExporter extends js.Object {
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
      /** [Method] Exports the passed surface to a SVG string representation
        * @param surface Ext.draw.Surface The surface to export
        * @param config Object Any configuration for the export. Currently this is unused but may provide more options in the future
        * @returns String The SVG as a string
        */
      def generate(): java.lang.String = js.native
      def generate(surface: js.UndefOr[scala.Nothing], config: js.Any): java.lang.String = js.native
      def generate(surface: ISurface): java.lang.String = js.native
      def generate(surface: ISurface, config: js.Any): java.lang.String = js.native
      /** [Method] Returns the initial configuration passed to constructor when instantiating this class
        * @param name String Name of the config option to return.
        * @returns Object/Mixed The full config object or a single config value when name parameter specified.
        */
      def getInitialConfig(): js.Any = js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
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
  
}

