package typings.go.global.go

import typings.go.mod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the abstract base class for all graphical objects.
  */
/* note: abstract class */ @JSGlobal("go.GraphObject")
@js.native
/**
  * This is an abstract class, so you should not use this constructor.
  */
open class GraphObject ()
  extends typings.go.mod.GraphObject
object GraphObject {
  
  @JSGlobal("go.GraphObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**GraphObjects with this as the value of GraphObject.stretch are stretched depending on the context they are used.*/
  /* static member */
  @JSGlobal("go.GraphObject.Default")
  @js.native
  def Default: typings.go.mod.EnumValue = js.native
  inline def Default_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled in both directions so as to fit exactly in the given bounds; there is no clipping but the aspect ratio may change, causing the object to appear stretched.*/
  /* static member */
  @JSGlobal("go.GraphObject.Fill")
  @js.native
  def Fill: typings.go.mod.EnumValue = js.native
  inline def Fill_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fill")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the x-axis*/
  /* static member */
  @JSGlobal("go.GraphObject.Horizontal")
  @js.native
  def Horizontal: typings.go.mod.EnumValue = js.native
  inline def Horizontal_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are not automatically scaled to fit in the given bounds; there may be clipping in one or both directions.*/
  /* static member */
  @JSGlobal("go.GraphObject.None")
  @js.native
  def None: typings.go.mod.EnumValue = js.native
  inline def None_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the arranged (actual) bounds.*/
  /* static member */
  @JSGlobal("go.GraphObject.Uniform")
  @js.native
  def Uniform: typings.go.mod.EnumValue = js.native
  
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the larger side of the image bounds.*/
  /* static member */
  @JSGlobal("go.GraphObject.UniformToFill")
  @js.native
  def UniformToFill: typings.go.mod.EnumValue = js.native
  inline def UniformToFill_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniformToFill")(x.asInstanceOf[js.Any])
  
  inline def Uniform_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uniform")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the y-axis*/
  /* static member */
  @JSGlobal("go.GraphObject.Vertical")
  @js.native
  def Vertical: typings.go.mod.EnumValue = js.native
  inline def Vertical_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
  
  /**
    * This static function defines a named function that GraphObject.make can use to build objects.
    * @param {string} name a capitalized name; must not be "" or "None"
    * @param {function(Array<*>):Object} func
    */
  /* static member */
  inline def defineBuilder(name: String, func: js.Function1[/* args */ js.Array[Any], js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineBuilder")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // undocumented
  /* static member */
  inline def getBuilders(): typings.go.mod.Map[String, js.Function1[/* args */ js.Array[Any], js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuilders")().asInstanceOf[typings.go.mod.Map[String, js.Function1[/* args */ js.Array[Any], js.Object]]]
  
  inline def make(`type`: String, initializers: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(scala.List(`type`.asInstanceOf[js.Any]).`++`(initializers.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  /**
    * This static function builds an object given its class and additional arguments providing initial properties or GraphObjects that become Panel elements.
    * @param {function()|string} type a class function or the name of a class in the "go" namespace,
    * or one of several predefined kinds of Panels: "Button", "TreeExpanderButton",
    * "SubGraphExpanderButton", or "ContextMenuButton".
    * @param {...*} initializers zero or more values that initialize the new object,
    * typically an Object with properties whose values that get set on the new object,
    * or a GraphObject that is added to a Panel,
    * or a Binding for one of the new object's properties,
    * or an EnumValue as the initial value of a single property of the new object that
    * is recognized to take that value,
    * or a string that is used as the value of a commonly set property.
    */
  /* static member */
  inline def make(`type`: Constructor, initializers: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(scala.List(`type`.asInstanceOf[js.Any]).`++`(initializers.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  /**
    * This static function returns the first argument from the arguments array passed
    * to a GraphObject.defineBuilder function by GraphObject.make.
    * By default this requires the first argument to be a string,
    * but you can provide a predicate to determine whether the argument is suitable.
    * @param {Array} args
    * @param {*=} defval the default value to return if the argument is optional and not present as the first argument
    * @param {function(*):boolean|null=} pred a predicate to determine the acceptability of the argument;
    *        the default predicate checks whether the argument is a string
    * @return {*}
    */
  /* static member */
  inline def takeBuilderArgument(args: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Any, pred: js.Function1[/* arg */ Any, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Unit, pred: js.Function1[/* arg */ Any, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Any]
}
