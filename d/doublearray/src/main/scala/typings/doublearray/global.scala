package typings.doublearray

import typings.doublearray.doublearray.DoubleArray
import typings.doublearray.doublearray.DoubleArrayBuilder
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
    
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int16Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Int8Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint16Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint32Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Int16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Int32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Int8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Uint16Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Uint32Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
    inline def load(base_buffer: js.typedarray.Uint8Array, check_buffer: js.typedarray.Uint8Array): DoubleArray = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(base_buffer.asInstanceOf[js.Any], check_buffer.asInstanceOf[js.Any])).asInstanceOf[DoubleArray]
  }
}
