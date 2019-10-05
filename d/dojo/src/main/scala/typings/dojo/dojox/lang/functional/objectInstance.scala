package typings.dojo.dojox.lang.functional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/functional/object.html
  *
  *
  */
@js.native
trait objectInstance extends js.Object {
  /**
    * builds a function from a snippet, returns a string, which
    * represents the function.
    * This method returns a textual representation of a function
    * built from the snippet. It is meant to be evaled in the
    * proper context, so local variables can be pulled from the
    * environment.
    *
    * @param s
    */
  def buildLambda(s: String): String = js.native
  /**
    * clears internal cache of lambdas
    *
    */
  def clearLambdaCache(): Unit = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: String, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: String, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: String, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Array[_], f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Array[_], f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Array[_], f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Object, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Object, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def every(a: js.Object, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: String, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: String, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: String, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: js.Array[_], f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: js.Array[_], f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether all elements in the array pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def everyRev(a: js.Array[_], f: js.Function, o: js.Object): Boolean = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: String, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: String, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: String, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Array[_], f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Array[_], f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Array[_], f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Object, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Object, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filter(a: js.Object, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates new object with all attributes that pass the test
    * implemented by the provided function.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def filterIn(obj: js.Object, f: String, o: js.Object): js.Object = js.native
  /**
    * creates new object with all attributes that pass the test
    * implemented by the provided function.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def filterIn(obj: js.Object, f: js.Array[_], o: js.Object): js.Object = js.native
  /**
    * creates new object with all attributes that pass the test
    * implemented by the provided function.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def filterIn(obj: js.Object, f: js.Function, o: js.Object): js.Object = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: String, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: String, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: String, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: js.Array[_], f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: js.Array[_], f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with all elements that pass the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def filterRev(a: js.Array[_], f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldl(a: String, f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldl(a: js.Array[_], f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldl(a: js.Object, f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: String, f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: String, f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: String, f: js.Function, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Array[_], f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Array[_], f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Array[_], f: js.Function, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Object, f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Object, f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldl1(a: js.Object, f: js.Function, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: String, f: String, z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: String, f: js.Array[_], z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: String, f: js.Function, z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: js.Array[_], f: String, z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: js.Array[_], f: js.Array[_], z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns the final
    * value.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def foldr(a: js.Array[_], f: js.Function, z: js.Object, o: js.Object): js.Object = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: String, f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: String, f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: String, f: js.Function, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: js.Array[_], f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: js.Array[_], f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns the final value.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def foldr1(a: js.Array[_], f: js.Function, o: js.Object): js.Any = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: String, f: String, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: String, f: js.Array[_], o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: String, f: js.Function, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Array[_], f: String, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Array[_], f: js.Array[_], o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Array[_], f: js.Function, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Object, f: String, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Object, f: js.Array[_], o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEach(a: js.Object, f: js.Function, o: js.Object): String = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: String, f: String, o: js.Object): Unit = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: String, f: js.Array[_], o: js.Object): Unit = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: String, f: js.Function, o: js.Object): Unit = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: js.Array[_], f: String, o: js.Object): Unit = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: js.Array[_], f: js.Array[_], o: js.Object): Unit = js.native
  /**
    * executes a provided function once per array element.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def forEachRev(a: js.Array[_], f: js.Function, o: js.Object): Unit = js.native
  /**
    * iterates over all object attributes.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def forIn(obj: js.Object, f: String, o: js.Object): String = js.native
  /**
    * iterates over all object attributes.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def forIn(obj: js.Object, f: js.Array[_], o: js.Object): String = js.native
  /**
    * iterates over all object attributes.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def forIn(obj: js.Object, f: js.Function, o: js.Object): String = js.native
  /**
    * returns an array of all keys in the object
    *
    * @param obj
    */
  def keys(obj: js.Object): js.Array[_] = js.native
  /**
    * builds a function from a snippet, or array (composing),
    * returns a function object; functions are passed through
    * unmodified.
    * This method is used to normalize a functional
    * representation (a text snippet, an array, or a function) to
    * a function object.
    *
    * @param s
    */
  def lambda(s: String): js.Function = js.native
  /**
    * builds a function from a snippet, or array (composing),
    * returns a function object; functions are passed through
    * unmodified.
    * This method is used to normalize a functional
    * representation (a text snippet, an array, or a function) to
    * a function object.
    *
    * @param s
    */
  def lambda(s: js.Array[_]): js.Function = js.native
  /**
    * builds a function from a snippet, or array (composing),
    * returns a function object; functions are passed through
    * unmodified.
    * This method is used to normalize a functional
    * representation (a text snippet, an array, or a function) to
    * a function object.
    *
    * @param s
    */
  def lambda(s: js.Function): js.Function = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: String, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: String, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: String, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Array[_], f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Array[_], f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Array[_], f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Object, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Object, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def map(a: js.Object, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * creates new object with the results of calling
    * a provided function on every attribute in this object.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def mapIn(obj: js.Object, f: String, o: js.Object): js.Object = js.native
  /**
    * creates new object with the results of calling
    * a provided function on every attribute in this object.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def mapIn(obj: js.Object, f: js.Array[_], o: js.Object): js.Object = js.native
  /**
    * creates new object with the results of calling
    * a provided function on every attribute in this object.
    *
    * @param obj
    * @param f
    * @param o               Optional
    */
  def mapIn(obj: js.Object, f: js.Function, o: js.Object): js.Object = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: String, f: String, o: js.Object): js.Any = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: String, f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: String, f: js.Function, o: js.Object): js.Any = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: js.Array[_], f: String, o: js.Object): js.Any = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: js.Array[_], f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * creates a new array with the results of calling
    * a provided function on every element in this array.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def mapRev(a: js.Array[_], f: js.Function, o: js.Object): js.Any = js.native
  /**
    * builds a function from a snippet, or array (composing),
    * returns an object describing the function; functions are
    * passed through unmodified.
    * This method is to normalize a functional representation (a
    * text snippet) to an object that contains an array of
    * arguments, and a body , which is used to calculate the
    * returning value.
    *
    * @param s
    */
  def rawLambda(s: String): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: String, f: String, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: String, f: js.Array[_], z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: String, f: js.Function, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Array[_], f: String, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Array[_], f: js.Array[_], z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Array[_], f: js.Function, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Object, f: String, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Object, f: js.Array[_], z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from left-to-right) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduce(a: js.Object, f: js.Function, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: String, f: String, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: String, f: js.Array[_], z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: String, f: js.Function, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: js.Array[_], f: String, z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: js.Array[_], f: js.Array[_], z: js.Object): js.Any = js.native
  /**
    * apply a function simultaneously against two values of the array
    * (from right-to-left) as to reduce it to a single value.
    *
    * @param a
    * @param f
    * @param z               Optional
    */
  def reduceRight(a: js.Array[_], f: js.Function, z: js.Object): js.Any = js.native
  /**
    * builds an array by repeatedly applying a unary function N times
    * with a seed value Z. N should be greater than 0.
    *
    * @param n
    * @param f
    * @param z
    * @param o               Optional
    */
  def repeat(n: Double, f: String, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * builds an array by repeatedly applying a unary function N times
    * with a seed value Z. N should be greater than 0.
    *
    * @param n
    * @param f
    * @param z
    * @param o               Optional
    */
  def repeat(n: Double, f: js.Array[_], z: js.Object, o: js.Object): js.Any = js.native
  /**
    * builds an array by repeatedly applying a unary function N times
    * with a seed value Z. N should be greater than 0.
    *
    * @param n
    * @param f
    * @param z
    * @param o               Optional
    */
  def repeat(n: Double, f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: String, f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: String, f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: String, f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Array[_], f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Array[_], f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Array[_], f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Object, f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Object, f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right using a seed value as a starting point; returns an array
    * of values produced by foldl() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanl(a: js.Object, f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: String, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: String, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: String, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Array[_], f: String, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Array[_], f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Array[_], f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Object, f: String, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Object, f: js.Array[_], o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from left
    * to right; returns an array of values produced by foldl1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanl1(a: js.Object, f: js.Function, o: js.Object): js.Array[_] = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: String, f: String, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: String, f: js.Array[_], z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: String, f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: js.Array[_], f: String, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: js.Array[_], f: js.Array[_], z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left using a seed value as a starting point; returns an array
    * of values produced by foldr() at that point.
    *
    * @param a
    * @param f
    * @param z
    * @param o               Optional
    */
  def scanr(a: js.Array[_], f: js.Function, z: js.Object, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: String, f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: String, f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: String, f: js.Function, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: js.Array[_], f: String, o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: js.Array[_], f: js.Array[_], o: js.Object): js.Any = js.native
  /**
    * repeatedly applies a binary function to an array from right
    * to left; returns an array of values produced by foldr1() at that
    * point.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def scanr1(a: js.Array[_], f: js.Function, o: js.Object): js.Any = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: String, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: String, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: String, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Array[_], f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Array[_], f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Array[_], f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Object, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Object, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def some(a: js.Object, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: String, f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: String, f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: String, f: js.Function, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: js.Array[_], f: String, o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: js.Array[_], f: js.Array[_], o: js.Object): Boolean = js.native
  /**
    * tests whether some element in the array passes the test
    * implemented by the provided function.
    *
    * @param a
    * @param f
    * @param o               Optional
    */
  def someRev(a: js.Array[_], f: js.Function, o: js.Object): Boolean = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: String, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: String, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: String, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Array[_], g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Array[_], g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Array[_], g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Function, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Function, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: String, f: js.Function, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: String, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: String, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: String, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Array[_], g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Array[_], g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Array[_], g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Function, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Function, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Array[_], f: js.Function, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: String, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: String, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: String, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Array[_], g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Array[_], g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Array[_], g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Function, g: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Function, g: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by unfolding a value
    *
    * @param pr
    * @param f
    * @param g
    * @param z
    * @param o               Optional
    */
  def unfold(pr: js.Function, f: js.Function, g: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: String, f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: String, f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: String, f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Array[_], f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Array[_], f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Array[_], f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Function, f: String, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Function, f: js.Array[_], z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * builds an array by repeatedly applying a unary function with
    * a seed value Z until the predicate is satisfied.
    *
    * @param pr
    * @param f
    * @param z
    * @param o               Optional
    */
  def until(pr: js.Function, f: js.Function, z: js.Object, o: js.Object): js.Array[_] = js.native
  /**
    * returns an array of all values in the object
    *
    * @param obj
    */
  def values(obj: js.Object): js.Array[_] = js.native
}

