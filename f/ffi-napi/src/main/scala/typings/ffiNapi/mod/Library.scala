package typings.ffiNapi.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library
  extends /**
  * @param libFile name of library
  * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
  * @param lib hash that will be extended
  */
Instantiable0[js.Any]
     with Instantiable1[/* libFile */ String, js.Any]
     with Instantiable2[
      (/* libFile */ Null) | (/* libFile */ String), 
      /* funcs */ StringDictionary[js.Array[js.Any]], 
      js.Any
    ]
     with Instantiable3[
      (/* libFile */ Null) | (/* libFile */ String), 
      js.UndefOr[/* funcs */ StringDictionary[js.Array[js.Any]]], 
      /* lib */ js.Object, 
      js.Any
    ] {
  
  /**
    * @param libFile name of library
    * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
    * @param lib hash that will be extended
    */
  def apply(): js.Any = js.native
  def apply(libFile: String): js.Any = js.native
  def apply(libFile: String, funcs: js.UndefOr[scala.Nothing], lib: js.Object): js.Any = js.native
  def apply(libFile: String, funcs: StringDictionary[js.Array[_]]): js.Any = js.native
  def apply(libFile: String, funcs: StringDictionary[js.Array[_]], lib: js.Object): js.Any = js.native
  def apply(libFile: Null, funcs: js.UndefOr[scala.Nothing], lib: js.Object): js.Any = js.native
  def apply(libFile: Null, funcs: StringDictionary[js.Array[_]]): js.Any = js.native
  def apply(libFile: Null, funcs: StringDictionary[js.Array[_]], lib: js.Object): js.Any = js.native
  
  /** The extension to use on libraries. */
  var EXT: String = js.native
}
@JSImport("ffi-napi", "Library")
@js.native
object Library extends TopLevel[Library]
