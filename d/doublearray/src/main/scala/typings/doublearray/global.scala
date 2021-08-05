package typings.doublearray

import typings.doublearray.doublearray.DoubleArray
import typings.doublearray.doublearray.DoubleArrayBuilder
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object doublearray {
    
    @JSGlobal("doublearray")
    @js.native
    val ^ : js.Any = js.native
    
    inline def builder(): DoubleArrayBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")().asInstanceOf[DoubleArrayBuilder]
    inline def builder(initial_size: Double): DoubleArrayBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")(initial_size.asInstanceOf[js.Any]).asInstanceOf[DoubleArrayBuilder]
    
    inline def load(base_buffer: Int16Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int16Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int16Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int16Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int16Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int16Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int32Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Int8Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint16Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint32Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: Uint8Array, check_buffer: Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
  }
}
