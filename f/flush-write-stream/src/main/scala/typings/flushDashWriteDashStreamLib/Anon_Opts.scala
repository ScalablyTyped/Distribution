package typings
package flushDashWriteDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Opts
  extends ScalablyTyped.runtime.Instantiable3[
      /* opts */ nodeLib.streamMod.internalNs.WritableOptions, 
      /* write */ Write, 
      /* flush */ Flush, 
      nodeLib.streamMod.Writable
    ]
     with ScalablyTyped.runtime.Instantiable1[/* write */ Write, nodeLib.streamMod.Writable]
     with ScalablyTyped.runtime.Instantiable2[
      (/* opts */ nodeLib.streamMod.internalNs.WritableOptions) | (/* write */ Write), 
      (/* write */ Write) | (/* flush */ Flush), 
      nodeLib.streamMod.Writable
    ] {
  def apply(opts: nodeLib.streamMod.internalNs.WritableOptions, write: Write): nodeLib.streamMod.Writable = js.native
  def apply(opts: nodeLib.streamMod.internalNs.WritableOptions, write: Write, flush: Flush): nodeLib.streamMod.Writable = js.native
  def apply(write: Write): nodeLib.streamMod.Writable = js.native
  def apply(write: Write, flush: Flush): nodeLib.streamMod.Writable = js.native
  def obj(opts: nodeLib.streamMod.internalNs.WritableOptions, write: Write): nodeLib.streamMod.Writable = js.native
  def obj(opts: nodeLib.streamMod.internalNs.WritableOptions, write: Write, flush: Flush): nodeLib.streamMod.Writable = js.native
  def obj(write: Write): nodeLib.streamMod.Writable = js.native
  def obj(write: Write, flush: Flush): nodeLib.streamMod.Writable = js.native
}

