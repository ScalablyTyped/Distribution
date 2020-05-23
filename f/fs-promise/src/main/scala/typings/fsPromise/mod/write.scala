package typings.fsPromise.mod

import typings.fsExtra.mod.WriteResult
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): js.Promise[js.Tuple2[Double, Uint8Array]] = js.native
  def apply(fd: Double, buffer: Buffer): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: DataView): js.Promise[js.Tuple2[Double, DataView]] = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: DataView, offset: Double): js.Promise[js.Tuple2[Double, DataView]] = js.native
  def apply(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[js.Tuple2[Double, DataView]] = js.native
  def apply(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, DataView]] = js.native
  def apply(fd: Double, buffer: Float32Array): js.Promise[js.Tuple2[Double, Float32Array]] = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Float32Array, offset: Double): js.Promise[js.Tuple2[Double, Float32Array]] = js.native
  def apply(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Float32Array]] = js.native
  def apply(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Float32Array]] = js.native
  def apply(fd: Double, buffer: Float64Array): js.Promise[js.Tuple2[Double, Float64Array]] = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Float64Array, offset: Double): js.Promise[js.Tuple2[Double, Float64Array]] = js.native
  def apply(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Float64Array]] = js.native
  def apply(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Float64Array]] = js.native
  def apply(fd: Double, buffer: Int16Array): js.Promise[js.Tuple2[Double, Int16Array]] = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int16Array, offset: Double): js.Promise[js.Tuple2[Double, Int16Array]] = js.native
  def apply(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Int16Array]] = js.native
  def apply(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Int16Array]] = js.native
  def apply(fd: Double, buffer: Int32Array): js.Promise[js.Tuple2[Double, Int32Array]] = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int32Array, offset: Double): js.Promise[js.Tuple2[Double, Int32Array]] = js.native
  def apply(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Int32Array]] = js.native
  def apply(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Int32Array]] = js.native
  def apply(fd: Double, buffer: Int8Array): js.Promise[js.Tuple2[Double, Int8Array]] = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Int8Array, offset: Double): js.Promise[js.Tuple2[Double, Int8Array]] = js.native
  def apply(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Int8Array]] = js.native
  def apply(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Int8Array]] = js.native
  def apply(fd: Double, buffer: Uint16Array): js.Promise[js.Tuple2[Double, Uint16Array]] = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[js.Tuple2[Double, Uint16Array]] = js.native
  def apply(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Uint16Array]] = js.native
  def apply(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Uint16Array]] = js.native
  def apply(fd: Double, buffer: Uint32Array): js.Promise[js.Tuple2[Double, Uint32Array]] = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[js.Tuple2[Double, Uint32Array]] = js.native
  def apply(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Uint32Array]] = js.native
  def apply(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Uint32Array]] = js.native
  def apply(fd: Double, buffer: Uint8Array): js.Promise[js.Tuple2[Double, Uint8Array]] = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[js.Tuple2[Double, Uint8Array]] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Uint8Array]] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Uint8Array]] = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray): js.Promise[js.Tuple2[Double, Uint8ClampedArray]] = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[js.Tuple2[Double, Uint8ClampedArray]] = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[js.Tuple2[Double, Uint8ClampedArray]] = js.native
  def apply(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Uint8ClampedArray]] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    callback: js.Function3[(/* err */ ErrnoException) | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    data: js.Any,
    position: js.UndefOr[Double | Null],
    encoding: js.UndefOr[Null | String],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, string: js.Any): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Double): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[js.Tuple2[Double, String]] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[js.Tuple2[Double, String]] = js.native
}

