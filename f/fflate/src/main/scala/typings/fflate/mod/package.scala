package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def compress(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def compress(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncGzipOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def compressSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def compressSync(data: typings.std.Uint8Array, opts: typings.fflate.mod.GzipOptions): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def decompress(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def decompress(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncInflateOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def decompressSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def decompressSync(data: typings.std.Uint8Array, out: typings.std.Uint8Array): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def deflate(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def deflate(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncDeflateOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def deflateSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def deflateSync(data: typings.std.Uint8Array, opts: typings.fflate.mod.DeflateOptions): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def gunzip(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def gunzip(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncGunzipOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def gunzipSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def gunzipSync(data: typings.std.Uint8Array, out: typings.std.Uint8Array): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def gzip(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def gzip(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncGzipOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def gzipSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def gzipSync(data: typings.std.Uint8Array, opts: typings.fflate.mod.GzipOptions): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def inflate(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def inflate(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncInflateOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def inflateSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def inflateSync(data: typings.std.Uint8Array, out: typings.std.Uint8Array): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def strFromU8(dat: typings.std.Uint8Array): java.lang.String = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
@scala.inline
def strFromU8(dat: typings.std.Uint8Array, latin1: scala.Boolean): java.lang.String = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def strToU8(str: java.lang.String): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def strToU8(str: java.lang.String, latin1: scala.Boolean): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def unzip(data: typings.std.Uint8Array, cb: typings.fflate.mod.UnzipCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def unzipSync(data: typings.std.Uint8Array): typings.fflate.mod.Unzipped = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.fflate.mod.Unzipped]

@scala.inline
def unzlib(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def unzlib(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncGunzipOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def unzlibSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def unzlibSync(data: typings.std.Uint8Array, out: typings.std.Uint8Array): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def zip(data: typings.fflate.mod.AsyncZippable, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def zip(
  data: typings.fflate.mod.AsyncZippable,
  opts: typings.fflate.mod.AsyncZipOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def zipSync(data: typings.fflate.mod.Zippable): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def zipSync(data: typings.fflate.mod.Zippable, opts: typings.fflate.mod.ZipOptions): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

@scala.inline
def zlib(data: typings.std.Uint8Array, cb: typings.fflate.mod.FlateCallback): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]
@scala.inline
def zlib(
  data: typings.std.Uint8Array,
  opts: typings.fflate.mod.AsyncZlibOptions,
  cb: typings.fflate.mod.FlateCallback
): typings.fflate.mod.AsyncTerminable = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[typings.fflate.mod.AsyncTerminable]

@scala.inline
def zlibSync(data: typings.std.Uint8Array): typings.std.Uint8Array = typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
@scala.inline
def zlibSync(data: typings.std.Uint8Array, opts: typings.fflate.mod.ZlibOptions): typings.std.Uint8Array = (typings.fflate.mod.^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

type AsyncFlateStreamHandler = js.Function3[
/* err */ typings.std.Error, 
/* data */ typings.std.Uint8Array, 
/* final */ scala.Boolean, 
scala.Unit]

type AsyncGunzipOptions = typings.fflate.mod.AsyncOptions

type AsyncTerminable = js.Function0[scala.Unit]

type AsyncUnzlibOptions = typings.fflate.mod.AsyncInflateOptions

type AsyncZippableFile = typings.std.Uint8Array | (js.Tuple2[typings.std.Uint8Array, typings.fflate.mod.AsyncZipOptions])

type FlateCallback = js.Function2[/* err */ typings.std.Error, /* data */ typings.std.Uint8Array, scala.Unit]

type FlateStreamHandler = js.Function2[/* data */ typings.std.Uint8Array, /* final */ scala.Boolean, scala.Unit]

type UnzipCallback = js.Function2[/* err */ typings.std.Error, /* data */ typings.fflate.mod.Unzipped, scala.Unit]

type Unzipped = typings.std.Record[java.lang.String, typings.std.Uint8Array]

type ZippableFile = typings.std.Uint8Array | (js.Tuple2[typings.std.Uint8Array, typings.fflate.mod.ZipOptions])

type ZlibOptions = typings.fflate.mod.DeflateOptions
