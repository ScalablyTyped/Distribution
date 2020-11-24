package typings.doublearray

import typings.doublearray.doublearray.DoubleArray
import typings.doublearray.doublearray.DoubleArrayBuilder
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object doublearray extends js.Object {
    
    def builder(): DoubleArrayBuilder = js.native
    def builder(initial_size: Double): DoubleArrayBuilder = js.native
    
    def load(base_buffer: Int16Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Int16Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Int16Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Int16Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Int16Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Int16Array, check_buffer: Uint8Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Int32Array, check_buffer: Uint8Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Int8Array, check_buffer: Uint8Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Uint16Array, check_buffer: Uint8Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Uint32Array, check_buffer: Uint8Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Int16Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Int32Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Int8Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Uint16Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Uint32Array): DoubleArray = js.native
    def load(base_buffer: Uint8Array, check_buffer: Uint8Array): DoubleArray = js.native
  }
}
