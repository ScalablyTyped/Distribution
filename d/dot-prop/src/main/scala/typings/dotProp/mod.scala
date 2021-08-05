package typings.dotProp

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dot-prop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def delete(`object`: StringDictionary[js.Any], path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  inline def get[T](`object`: StringDictionary[js.Any], path: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def get[T](`object`: StringDictionary[js.Any], path: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def get[T](`object`: Unit, path: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def get[T](`object`: Unit, path: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def has(`object`: StringDictionary[js.Any], path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has(`object`: Unit, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  inline def set[T /* <: StringDictionary[js.Any] */](`object`: T, path: String, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
}
