package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/has.html
  *
  * Return the current value of the named feature.
  * Returns the value of the feature named by name. The feature must have been
  * previously added to the cache by has.add.
  *
  * @param name The name (if a string) or identifier (if an integer) of the feature to test.
  */
@js.native
trait has extends js.Object {
  /**
    *
    */
  var cache: String = js.native
  def apply(name: String): Unit = js.native
  def apply(name: Double): Unit = js.native
  /**
    * Register a new feature test for some named feature.
    *
    * @param name The name (if a string) or identifier (if an integer) of the feature to test.
    * @param test A test function to register. If a function, queued for testing until actuallyneeded. The test function should return a boolean indicatingthe presence of a feature or bug.
    * @param now               OptionalOptional. Omit if test is not a function. Provides a way to immediatelyrun the test and cache the result.
    * @param force               OptionalOptional. If the test already exists and force is truthy, then the existingtest will be replaced; otherwise, add does not replace an existing test (thatis, by default, the first test advice wins).
    */
  def add(name: String, test: js.Function): js.Any = js.native
  def add(name: String, test: js.Function, now: Boolean): js.Any = js.native
  def add(name: String, test: js.Function, now: Boolean, force: Boolean): js.Any = js.native
  /**
    * Register a new feature test for some named feature.
    *
    * @param name The name (if a string) or identifier (if an integer) of the feature to test.
    * @param test A test function to register. If a function, queued for testing until actuallyneeded. The test function should return a boolean indicatingthe presence of a feature or bug.
    * @param now               OptionalOptional. Omit if test is not a function. Provides a way to immediatelyrun the test and cache the result.
    * @param force               OptionalOptional. If the test already exists and force is truthy, then the existingtest will be replaced; otherwise, add does not replace an existing test (thatis, by default, the first test advice wins).
    */
  def add(name: Double, test: js.Function): js.Any = js.native
  def add(name: Double, test: js.Function, now: Boolean): js.Any = js.native
  def add(name: Double, test: js.Function, now: Boolean, force: Boolean): js.Any = js.native
  /**
    * Deletes the contents of the element passed to test functions.
    *
    * @param element
    */
  def clearElement(element: js.Any): Unit = js.native
  /**
    * Conditional loading of AMD modules based on a has feature test value.
    *
    * @param id Gives the resolved module id to load.
    * @param parentRequire The loader require function with respect to the module that contained the plugin resource in it'sdependency list.
    * @param loaded Callback to loader that consumes result of plugin demand.
    */
  def load(id: String, parentRequire: js.Function, loaded: js.Function): Unit = js.native
  /**
    * Resolves id into a module id based on possibly-nested tenary expression that branches on has feature test value(s).
    *
    * @param id
    * @param toAbsMid Resolves a relative module id into an absolute module id
    */
  def normalize(id: js.Any, toAbsMid: js.Function): Unit = js.native
}

