package typings.dotPropImmutable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dot-prop-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Delete a nested property/array by a dot path
    *
    * @param object - Object to delete the `path` value.
    * @param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
    * @example
    * ```
    * var obj = {foo: [{ bar: 'gold-unicorn'}, 'white-unicorn', 'silver-unicorn']};
    *
    * // delete
    * dotProp.delete(obj, 'foo.$end');
    * //=> {foo: [{ bar: 'gold-unicorn'}, 'white-unicorn']}
    *
    * dotProp.delete(obj, 'foo.0.bar');
    * //=> {foo: [{}, 'white-unicorn', 'silver-unicorn']}
    * ```
    */
  inline def delete[T /* <: ArrayOrObject */](`object`: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def get(`object`: Unit, path: Path): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(`object`: ArrayOrObject, path: Path): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get[V](`object`: Unit, path: Path, defaultValue: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def get[V](`object`: ArrayOrObject, path: Path, defaultValue: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def merge[T /* <: ArrayOrObject */](`object`: T, path: Path, value: ArrayOrObject): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def set[T /* <: ArrayOrObject */](`object`: T, path: Path, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def toggle[T /* <: ArrayOrObject */](`object`: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type ArrayOrObject = js.Array[js.Any] | js.Object
  
  type Path = Double | String | (js.Array[Double | String])
}
