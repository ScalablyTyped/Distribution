package typings.dotProp

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Delete the property at the given path.
  	@param object - Object to delete the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@returns A boolean of whether the property existed before being deleted.
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
  @JSImport("dot-prop", "delete")
  @js.native
  def delete(`object`: StringDictionary[js.Any], path: String): Boolean = js.native
  
  @JSImport("dot-prop", "get")
  @js.native
  def get[T](`object`: js.UndefOr[scala.Nothing], path: String): js.UndefOr[T] = js.native
  @JSImport("dot-prop", "get")
  @js.native
  def get[T](`object`: js.UndefOr[scala.Nothing], path: String, defaultValue: T): T = js.native
  /**
  	Get the value of the property at the given path.
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
  @JSImport("dot-prop", "get")
  @js.native
  def get[T](`object`: StringDictionary[js.Any], path: String): js.UndefOr[T] = js.native
  @JSImport("dot-prop", "get")
  @js.native
  def get[T](`object`: StringDictionary[js.Any], path: String, defaultValue: T): T = js.native
  
  @JSImport("dot-prop", "has")
  @js.native
  def has(`object`: js.UndefOr[scala.Nothing], path: String): Boolean = js.native
  /**
  	Check whether the property at the given path exists.
  	@param object - Object to test the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@example
  	```
  	import dotProp = require('dot-prop');
  	dotProp.has({foo: {bar: 'unicorn'}}, 'foo.bar');
  	//=> true
  	```
  	*/
  @JSImport("dot-prop", "has")
  @js.native
  def has(`object`: StringDictionary[js.Any], path: String): Boolean = js.native
  
  /**
  	Set the property at the given path to the given value.
  	@param object - Object to set the `path` value.
  	@param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
  	@param value - Value to set at `path`.
  	@returns The object.
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
  @JSImport("dot-prop", "set")
  @js.native
  def set[T /* <: StringDictionary[js.Any] */](`object`: T, path: String, value: js.Any): T = js.native
}
