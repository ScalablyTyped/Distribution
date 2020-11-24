package typings.from2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Chunk = java.lang.String | typings.node.Buffer | typings.std.Uint8Array | scala.Null
  
  type From2Ctor[R /* <: typings.from2.mod.ReadInput | typings.from2.mod.ReadObjectInput */] = org.scalablytyped.runtime.Instantiable1[/* read */ R, typings.node.NodeJS.ReadableStream]
  
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ typings.from2.mod.Chunk, scala.Unit]
  
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, scala.Unit]
  
  type ReadCallback[N /* <: typings.from2.mod.NextCallback | typings.from2.mod.NextObjectCallback */] = js.Function2[/* size */ scala.Double, /* next */ N, scala.Unit]
  
  type ReadInput = typings.from2.mod.ReadCallback[typings.from2.mod.NextCallback] | js.Array[typings.from2.mod.Chunk]
  
  type ReadObjectInput = typings.from2.mod.ReadCallback[typings.from2.mod.NextObjectCallback] | js.Array[js.Any]
}
