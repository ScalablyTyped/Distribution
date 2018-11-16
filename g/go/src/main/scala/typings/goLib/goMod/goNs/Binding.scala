package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Binding describes how to automatically set a property on a GraphObject
    * to a value of a property of data in the model.
    * The target property name and the data source property name are strings.
    * All name matching is case-sensitive.
    */
@js.native
trait Binding extends js.Object {
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
  /**
          * Gets or sets the name of the GraphObject that should act as a source object
          * whose property should be gotten by this data binding.
          * The default value is null, which uses the bound Panel.data as the source.
          * If the value is a string, it should be the name of a GraphObject in the
          * visual tree of the Panel that is bound to the data.
          * Use the empty string to refer to the root panel.
          */
  var sourceName: java.lang.String = js.native
  /**
          * Gets or sets the name of the property to get from the bound data object,
          * the value of Panel.data.
          * The default value is the empty string, which results in setting the target
          * property to the whole data object, rather than to a property value of the data object.
          */
  var sourceProperty: java.lang.String = js.native
  /**
          * Gets or sets the name of the property to be set on the target GraphObject.
          * The default value is the empty string; you normally set this to be the name of a property.
          */
  var targetProperty: java.lang.String = js.native
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
  /**
          * Modify this Binding to set its .mode to be Binding.TwoWay, and
          * provide an optional conversion function to convert GraphObject property
          * values back to data values.
          * Use TwoWay bindings to keep model data in sync with changes to GraphObject properties.
          * For efficiency, avoid TwoWay bindings on GraphObject properties that do not change value in your app.
          * You should not have a TwoWay binding on a node data object's key property.
          * @param {function(*,*=) | null=} backconv
          */
  def makeTwoWay(backconv: js.Function2[/* a */ js.Any, /* b */ js.Any, _]): Binding = js.native
  def ofModel(): Binding = js.native
  /**
          * Modify this Binding to set its .sourceName property so as to identify
          * a GraphObject in the visual tree of the bound Panel.
          * @param {string=} srcname the GraphObject.name of an element in the visual tree of the bound Panel;
          * use an empty string to refer to the root panel of that visual tree.
          */
  def ofObject(): Binding = js.native
  /**
          * Modify this Binding to set its .sourceName property so as to identify
          * a GraphObject in the visual tree of the bound Panel.
          * @param {string=} srcname the GraphObject.name of an element in the visual tree of the bound Panel;
          * use an empty string to refer to the root panel of that visual tree.
          */
  def ofObject(srcname: java.lang.String): Binding = js.native
}

