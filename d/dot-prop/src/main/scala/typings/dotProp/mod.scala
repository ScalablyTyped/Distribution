package typings.dotProp

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dot-prop", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  	@param object - Object to delete the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@example
  	```
  	import dotProp = require('dot-prop');
  	const object = {foo: {bar: 'a'}};
  	dotProp.delete(object, 'foo.bar');
  	console.log(object);
  	//=> {foo: {}}
  	object.foo.bar = {x: 'y', y: 'x'};
  	dotProp.delete(object, 'foo.bar.x');
  	console.log(object);
  	//=> {foo: {bar: {y: 'x'}}}
  	```
  	*/
  def delete(`object`: StringDictionary[js.Any], path: String): Unit = js.native
  /**
  	@param object - Object to get the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@param defaultValue - Default value.
  	@example
  	```
  	import dotProp = require('dot-prop');
  	dotProp.get({foo: {bar: 'unicorn'}}, 'foo.bar');
  	//=> 'unicorn'
  	dotProp.get({foo: {bar: 'a'}}, 'foo.notDefined.deep');
  	//=> undefined
  	dotProp.get({foo: {bar: 'a'}}, 'foo.notDefined.deep', 'default value');
  	//=> 'default value'
  	dotProp.get({foo: {'dot.dot': 'unicorn'}}, 'foo.dot\\.dot');
  	//=> 'unicorn'
  	```
  	*/
  def get[T](`object`: js.UndefOr[StringDictionary[js.Any]], path: String): js.UndefOr[T] = js.native
  def get[T](`object`: js.UndefOr[StringDictionary[js.Any]], path: String, defaultValue: T): T = js.native
  /**
  	@param object - Object to test the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@example
  	```
  	import dotProp = require('dot-prop');
  	dotProp.has({foo: {bar: 'unicorn'}}, 'foo.bar');
  	//=> true
  	```
  	*/
  def has(`object`: js.UndefOr[StringDictionary[js.Any]], path: String): Boolean = js.native
  /**
  	@param object - Object to set the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@param value - Value to set at `path`.
  	@example
  	```
  	import dotProp = require('dot-prop');
  	const object = {foo: {bar: 'a'}};
  	dotProp.set(object, 'foo.bar', 'b');
  	console.log(object);
  	//=> {foo: {bar: 'b'}}
  	const foo = dotProp.set({}, 'foo.bar', 'c');
  	console.log(foo);
  	//=> {foo: {bar: 'c'}}
  	dotProp.set(object, 'foo.baz', 'x');
  	console.log(object);
  	//=> {foo: {bar: 'b', baz: 'x'}}
  	```
  	*/
  def set[T /* <: StringDictionary[js.Any] */](`object`: T, path: String, value: js.Any): T = js.native
}

