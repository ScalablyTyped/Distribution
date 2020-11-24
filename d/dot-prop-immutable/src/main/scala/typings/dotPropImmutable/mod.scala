package typings.dotPropImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dot-prop-immutable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def delete[T /* <: ArrayOrObject */](`object`: T, path: Path): T = js.native
  
  def get(`object`: js.UndefOr[ArrayOrObject], path: Path): js.Any = js.native
  def get[V](`object`: js.UndefOr[ArrayOrObject], path: Path, defaultValue: V): V = js.native
  
  def merge[T /* <: ArrayOrObject */](`object`: T, path: Path, value: ArrayOrObject): T = js.native
  
  def set[T /* <: ArrayOrObject */](`object`: T, path: Path, value: js.Any): T = js.native
  
  def toggle[T /* <: ArrayOrObject */](`object`: T, path: Path): T = js.native
  
  type ArrayOrObject = js.Array[js.Any] | js.Object
  
  type Path = Double | String | (js.Array[Double | String])
}
