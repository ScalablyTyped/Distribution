package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Binding describes how to automatically set a property on a GraphObject
    * to a value of a property of data in the model.
    * The target property name and the data source property name are strings.
    * All name matching is case-sensitive.
    */
@JSImport("go", "Binding")
@js.native
class Binding ()
  extends goLib.goMod.goNs.Binding {
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
  def this(targetprop: java.lang.String) = this()
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
  def this(targetprop: java.lang.String, sourceprop: java.lang.String) = this()
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
  def this(targetprop: java.lang.String, sourceprop: java.lang.String, conv: js.Function2[/* a */ js.Any, /* b */ js.Any, _]) = this()
}

/**
    * A Binding describes how to automatically set a property on a GraphObject
    * to a value of a property of data in the model.
    * The target property name and the data source property name are strings.
    * All name matching is case-sensitive.
    */
@JSImport("go", "Binding")
@js.native
object Binding extends js.Object {
  /**This value for Binding.mode uses data source values and sets GraphObject properties.*/
  var OneWay: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Binding.mode uses data source values and GraphObject properties and keeps them in sync.*/
  var TwoWay: goLib.goMod.goNs.EnumValue = js.native
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
  def parseEnum(ctor: goLib.goMod.goNs.Constructor, defval: goLib.goMod.goNs.EnumValue): js.Function1[/* a */ java.lang.String, goLib.goMod.goNs.EnumValue] = js.native
  /**
          * This static function can be used to convert an object to a string,
          * looking for commonly defined data properties, such as "text", "name", "key", or "id".
          * If none are found, this just calls toString() on it.
          * @param {*} val
          */
  def toString(`val`: js.Any): java.lang.String = js.native
}

