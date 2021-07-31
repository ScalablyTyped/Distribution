package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Binding describes how to automatically set a property on a GraphObject
  * to a value of a property of data in the model.
  * The target property name and the data source property name are strings.
  * All name matching is case-sensitive.
  */
@JSImport("go", "Binding")
@js.native
/**
  * The constructor creates an empty one-way binding.
  * @param {string=} targetprop A string naming the target property on the target object.
  *   If this is the empty string or not supplied, the whole GraphObject is used in the call to the conversion function,
  *   which should modify the GraphObject directly.
  * @param {string=} sourceprop A string naming the source property on the bound data object.
  *   If this is the empty string, the whole Panel.data object is used.
  *   If this argument is not supplied, the source property is assumed to be the same as the target property.
  * @param {function(*,*=) | null=} conv A function converting the data property value to the value to set the target property.
  *   If the function is null or not supplied, no conversion takes place.
  */
class Binding () extends StObject {
  def this(targetprop: String) = this()
  def this(targetprop: String, sourceprop: String) = this()
  def this(targetprop: Unit, sourceprop: String) = this()
  def this(targetprop: String, sourceprop: String, conv: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]) = this()
  def this(targetprop: String, sourceprop: Unit, conv: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]) = this()
  def this(targetprop: Unit, sourceprop: String, conv: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]) = this()
  def this(targetprop: Unit, sourceprop: Unit, conv: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]) = this()
  
  /**
    * Gets or sets a converter function to apply to the GraphObject property value
    * in order to produce the value to set to a data property.
    * This conversion function is only used in a TwoWay binding,
    * when transferring a value from the target to the source.
    * The default value is null -- no conversion takes place.
    * Otherwise the value should be a function that takes one or two arguments
    * and returns the desired value.
    * However, the return value is ignored when the .sourceProperty
    * is the empty string.
    * The function is passed the value from the target
    * (the first argument) and the source Panel.data object (the second argument).
    * If the .sourceProperty is a property name, that property is set to
    * the function's return value.
    * If the .sourceProperty is the empty string, the function should
    * modify the second argument, which will be the source data object.
    */
  def backConverter(a: js.Any, b: js.Any): js.Any = js.native
  
  /**
    * Gets or sets a converter function to apply to the data property value
    * in order to produce the value to set to the target property.
    * This conversion function is used in both OneWay and TwoWay bindings,
    * when transferring a value from the source to the target.
    * The default value is null -- no conversion takes place.
    * Otherwise the value should be a function that takes one or two arguments
    * and returns the desired value.
    * However, the return value is ignored when the .targetProperty
    * is the empty string.
    * The function is passed the value from the source
    * (the first argument) and the target GraphObject (the second argument).
    * If the .targetProperty is a property name, that property is set to
    * the function's return value.
    * If the .targetProperty is the empty string, the function should
    * modify the second argument, which will be the target object.
    */
  def converter(a: js.Any, b: js.Any): js.Any = js.native
  
  /**
    * Modify this Binding to set its .mode to be Binding.TwoWay, and
    * provide an optional conversion function to convert GraphObject property
    * values back to data values.
    * Use TwoWay bindings to keep model data in sync with changes to GraphObject properties.
    * For efficiency, avoid TwoWay bindings on GraphObject properties that do not change value in your app.
    * You should not have a TwoWay binding on a node data object's key property.
    * @param {function(*,*=) | null=} backconv
    */
  def makeTwoWay(): Binding = js.native
  def makeTwoWay(backconv: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]): Binding = js.native
  
  /**
    * Gets or sets the directions and frequency in which the binding may be evaluated.
    * The default value is Binding.OneWay.
    * Binding.TwoWay is the other choice.
    * Use OneWay bindings to initialize GraphObject properties based on model data,
    * or to modify GraphObject properties when the model data changes will a call to Model.setDataProperty.
    * Use TwoWay bindings to keep model data in sync with changes to GraphObject properties.
    * For efficiency, avoid TwoWay bindings on GraphObject properties that do not change value in your app.
    * You should not have a TwoWay binding on a node data object's key property.
    */
  var mode: EnumValue = js.native
  
  def ofModel(): Binding = js.native
  
  /**
    * Modify this Binding to set its .sourceName property so as to identify
    * a GraphObject in the visual tree of the bound Panel.
    * @param {string=} srcname the GraphObject.name of an element in the visual tree of the bound Panel;
    * use an empty string to refer to the root panel of that visual tree.
    */
  def ofObject(): Binding = js.native
  def ofObject(srcname: String): Binding = js.native
  
  /**
    * Gets or sets the name of the GraphObject that should act as a source object
    * whose property should be gotten by this data binding.
    * The default value is null, which uses the bound Panel.data as the source.
    * If the value is a string, it should be the name of a GraphObject in the
    * visual tree of the Panel that is bound to the data.
    * Use the empty string to refer to the root panel.
    */
  var sourceName: String = js.native
  
  /**
    * Gets or sets the name of the property to get from the bound data object,
    * the value of Panel.data.
    * The default value is the empty string, which results in setting the target
    * property to the whole data object, rather than to a property value of the data object.
    */
  var sourceProperty: String = js.native
  
  /**
    * Gets or sets the name of the property to be set on the target GraphObject.
    * The default value is the empty string; you normally set this to be the name of a property.
    */
  var targetProperty: String = js.native
}
object Binding {
  
  @JSImport("go", "Binding")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for Binding.mode uses data source values and sets GraphObject properties.*/
  /* static member */
  @JSImport("go", "Binding.OneWay")
  @js.native
  def OneWay: EnumValue = js.native
  @scala.inline
  def OneWay_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneWay")(x.asInstanceOf[js.Any])
  
  /**This value for Binding.mode uses data source values and GraphObject properties and keeps them in sync.*/
  /* static member */
  @JSImport("go", "Binding.TwoWay")
  @js.native
  def TwoWay: EnumValue = js.native
  @scala.inline
  def TwoWay_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoWay")(x.asInstanceOf[js.Any])
  
  /**
    * This static function can be used to create a function that parses
    * a string into an enumerated value, given the class that the enumeration values
    * are defined on and a default value if the string cannot be parsed successfully.
    * The normal usage is to pass the result of this function as the conversion function of a Binding.
    * This binding will try to parse the string that is the value of the bound data's "dataPropName" property.
    * If it is a legitimate enumerated value defined on the Link class, the conversion
    * function will return that value.
    * If the bound data's "dataPropName" property is not present or has an unrecognized value,
    * the Link.routing property gets the default value, Link.Normal.
    * @param {function()} ctor the class constructor that defines the enumerated values that are being parsed.
    * @param {EnumValue} defval the default enumerated value to return if it fails to parse the given string.
    */
  /* static member */
  @scala.inline
  def parseEnum(ctor: Constructor, defval: EnumValue): js.Function1[/* a */ String, EnumValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEnum")(ctor.asInstanceOf[js.Any], defval.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ String, EnumValue]]
  
  /**
    * This static function can be used to convert an object to a string,
    * looking for commonly defined data properties, such as "text", "name", "key", or "id".
    * If none are found, this just calls toString() on it.
    * @param {*} val
    */
  /* static member */
  @scala.inline
  def toString_(`val`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
