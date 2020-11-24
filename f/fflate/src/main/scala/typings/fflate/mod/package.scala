package typings.fflate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncFlateStreamHandler = js.Function3[
    /* err */ typings.std.Error, 
    /* data */ typings.std.Uint8Array, 
    /* final */ scala.Boolean, 
    scala.Unit
  ]
  
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
}
