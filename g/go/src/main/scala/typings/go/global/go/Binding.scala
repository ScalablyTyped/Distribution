package typings.go.global.go

import typings.go.mod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Binding describes how to automatically set a property on a GraphObject
  * to a value of a property of data in the model.
  * The target property name and the data source property name are strings.
  * All name matching is case-sensitive.
  */
@JSGlobal("go.Binding")
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
open class Binding ()
  extends typings.go.mod.Binding {
  def this(targetprop: String) = this()
  def this(targetprop: String, sourceprop: String) = this()
  def this(targetprop: Unit, sourceprop: String) = this()
  def this(targetprop: String, sourceprop: String, conv: js.Function2[/* a */ Any, /* b */ Any, Any]) = this()
  def this(targetprop: String, sourceprop: Unit, conv: js.Function2[/* a */ Any, /* b */ Any, Any]) = this()
  def this(targetprop: Unit, sourceprop: String, conv: js.Function2[/* a */ Any, /* b */ Any, Any]) = this()
  def this(targetprop: Unit, sourceprop: Unit, conv: js.Function2[/* a */ Any, /* b */ Any, Any]) = this()
}
object Binding {
  
  @JSGlobal("go.Binding")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for Binding.mode uses data source values and sets GraphObject properties.*/
  /* static member */
  @JSGlobal("go.Binding.OneWay")
  @js.native
  def OneWay: typings.go.mod.EnumValue = js.native
  inline def OneWay_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneWay")(x.asInstanceOf[js.Any])
  
  /**This value for Binding.mode uses data source values and GraphObject properties and keeps them in sync.*/
  /* static member */
  @JSGlobal("go.Binding.TwoWay")
  @js.native
  def TwoWay: typings.go.mod.EnumValue = js.native
  inline def TwoWay_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoWay")(x.asInstanceOf[js.Any])
  
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
  inline def parseEnum(ctor: Constructor, defval: typings.go.mod.EnumValue): js.Function1[/* a */ String, typings.go.mod.EnumValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEnum")(ctor.asInstanceOf[js.Any], defval.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ String, typings.go.mod.EnumValue]]
  
  /**
    * This static function can be used to convert an object to a string,
    * looking for commonly defined data properties, such as "text", "name", "key", or "id".
    * If none are found, this just calls toString() on it.
    * @param {*} val
    */
  /* static member */
  inline def toString_(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
