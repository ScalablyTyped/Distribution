package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mvc {
  import typings.dojo.dijit._WidgetBase
  import typings.dojo.dojo.Stateful

  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulArray.html
    *
    * An inheritance of native JavaScript array, that adds dojo/Stateful capability.
    * Supported methods are:
    *
    * pop() - watchElements() notification is done for the removed elements. watch() notification is done for the length.
    * push() - watchElements() notification is done for the added elements. watch() notification is done for the length.
    * reverse() - watchElements() notification is done, indicating that the change affects all elements.
    * shift() - watchElements() notification is done for the removed elements. watch() notification is done for the length.
    * sort() - watchElements() notification is done, indicating that the change affects all elements.
    * splice() - watchElements() notification is done for the removed/added elements. watch() notification is done for the length. Returns an instance of StatefulArray instead of the native array.
    * unshift() - watchElements() notification is done for the added elements. watch() notification is done for the length.
    * concat() - Returns an instance of StatefulArray instead of the native Array.
    * join() - The length as well as the elements are obtained via stateful getters, instead of direct access.
    * slice() - The length as well as the elements are obtained via stateful getters, instead of direct access.
    * Setting an element to this array via set() - watch() notification is done for the new element as well as the new length.
    * Setting a length to this array via set() - watchElements() notification is done for the removed/added elements. watch() notification is done for the new length.
    *
    * @param a
    */
  type StatefulArray = js.Function1[/* a */ js.Array[js.Any], Unit]
  type StatefulModel = StatefulModel_
  type _atBindingMixin = _atBindingMixin_
  type at = at_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/atBindingExtension.html
    *
    * Monkey-patch the given widget so that they looks at dojox/mvc/at set in them and start data binding specified there.
    *
    * @param w The widget.
    */
  type atBindingExtension = js.Function1[/* w */ js.Array[_WidgetBase], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/equals.html
    *
    * Compares two dojo/Stateful objects, by diving into the leaves.
    * Recursively iterates and compares stateful values.
    *
    * @param dst The stateful value to compare with.
    * @param src The stateful value to compare with.
    * @param options The object that defines how two stateful values are compared.
    */
  type equals = js.Function3[/* dst */ js.Any, /* src */ js.Any, /* options */ js.Object, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/getPlainValue.html
    *
    * Create a raw value from a dojo/Stateful object.
    * Recursively iterates the stateful value given, and convert them to raw ones.
    *
    * @param value The stateful value.
    * @param options The object that defines how plain value should be created from stateful value.
    */
  type getPlainValue = js.Function2[/* value */ js.Any, /* options */ js.Object, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/getStateful.html
    *
    * Create a dojo/Stateful object from a raw value.
    * Recursively iterates the raw value given, and convert them to stateful ones.
    *
    * @param value The raw value.
    * @param options The object that defines how model object should be created from plain object hierarchy.
    */
  type getStateful = js.Function2[/* value */ js.Any, /* options */ js.Object, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/sync.html
    *
    * Synchronize two dojo/Stateful properties.
    * Synchronize two dojo/Stateful properties.
    *
    * @param source Source dojo/Stateful to be synchronized.
    * @param sourceProp The property name in source to be synchronized.
    * @param target Target dojo/Stateful to be synchronized.
    * @param targetProp The property name in target to be synchronized.
    * @param options Data binding options.
    */
  type sync = js.Function5[
    /* source */ Stateful, 
    /* sourceProp */ String, 
    /* target */ Stateful, 
    /* targetProp */ String, 
    /* options */ js.Object, 
    Unit
  ]
}
