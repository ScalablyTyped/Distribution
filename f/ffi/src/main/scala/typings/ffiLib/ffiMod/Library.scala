package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Library
  extends /**
     * @param libFile name of library
     * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
     * @param lib hash that will be extended
     */
org.scalablytyped.runtime.Instantiable1[/* libFile */ java.lang.String, js.Any]
     with /**
     * @param libFile name of library
     * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
     * @param lib hash that will be extended
     */
org.scalablytyped.runtime.Instantiable2[
      /* libFile */ java.lang.String, 
      /* funcs */ org.scalablytyped.runtime.StringDictionary[js.Array[js.Any]], 
      js.Any
    ]
     with /**
     * @param libFile name of library
     * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
     * @param lib hash that will be extended
     */
org.scalablytyped.runtime.Instantiable3[
      /* libFile */ java.lang.String, 
      /* funcs */ org.scalablytyped.runtime.StringDictionary[js.Array[js.Any]], 
      /* lib */ js.Object, 
      js.Any
    ] {
  /** The extension to use on libraries. */
  var EXT: java.lang.String = js.native
  /**
       * @param libFile name of library
       * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
       * @param lib hash that will be extended
       */
  def apply(libFile: java.lang.String): js.Any = js.native
  /**
       * @param libFile name of library
       * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
       * @param lib hash that will be extended
       */
  def apply(libFile: java.lang.String, funcs: org.scalablytyped.runtime.StringDictionary[js.Array[_]]): js.Any = js.native
  /**
       * @param libFile name of library
       * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
       * @param lib hash that will be extended
       */
  def apply(
    libFile: java.lang.String,
    funcs: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    lib: js.Object
  ): js.Any = js.native
}

