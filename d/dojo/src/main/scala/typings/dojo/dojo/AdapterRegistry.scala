package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/AdapterRegistry.html
  *
  * A registry to make contextual calling/searching easier.
  * Objects of this class keep list of arrays in the form [name, check,
  * wrap, directReturn] that are used to determine what the contextual
  * result of a set of checked arguments is. All check/wrap functions
  * in this registry should be of the same arity.
  *
  * @param returnWrappers       Optional
  */
@js.native
trait AdapterRegistry extends js.Object {
  /**
    *
    */
  var pairs: js.Array[_] = js.native
  /**
    *
    */
  var returnWrappers: Boolean = js.native
  def apply(): Unit = js.native
  def apply(returnWrappers: Boolean): Unit = js.native
  /**
    * Find an adapter for the given arguments. If no suitable adapter
    * is found, throws an exception. match() accepts any number of
    * arguments, all of which are passed to all matching functions
    * from the registered pairs.
    *
    */
  def `match`(): js.Any = js.native
  /**
    * register a check function to determine if the wrap function or
    * object gets selected
    *
    * @param name a way to identify this matcher.
    * @param check a function that arguments are passed to from the adapter'smatch() function.  The check function should return true if thegiven arguments are appropriate for the wrap function.
    * @param wrap
    * @param directReturn               OptionalIf directReturn is true, the value passed in for wrap will bereturned instead of being called. Alternately, theAdapterRegistry can be set globally to "return not call" usingthe returnWrappers property. Either way, this behavior allowsthe registry to act as a "search" function instead of afunction interception library.
    * @param override               OptionalIf override is given and true, the check function will be givenhighest priority. Otherwise, it will be the lowest priorityadapter.
    */
  def register(name: String, check: js.Function, wrap: js.Function): Unit = js.native
  def register(name: String, check: js.Function, wrap: js.Function, directReturn: Boolean): Unit = js.native
  def register(name: String, check: js.Function, wrap: js.Function, directReturn: Boolean, `override`: Boolean): Unit = js.native
  /**
    * Remove a named adapter from the registry
    *
    * @param name The name of the adapter.
    */
  def unregister(name: String): js.Any = js.native
}

