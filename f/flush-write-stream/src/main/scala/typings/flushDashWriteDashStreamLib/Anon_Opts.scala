package typings
package flushDashWriteDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Opts
  extends org.scalablytyped.runtime.Instantiable3[
      /* opts */ nodeLib.streamMod.internalNs.WritableOptions, 
      /* write */ Write, 
      /* flush */ Flush, 
      nodeLib.streamMod.Writable
    ]
     with org.scalablytyped.runtime.Instantiable1[/* write */ Write, nodeLib.streamMod.Writable]
     with org.scalablytyped.runtime.Instantiable2[
      (/* opts */ nodeLib.streamMod.internalNs.WritableOptions) | (/* write */ Write), 
      (/* flush */ Flush) | (/* write */ Write), 
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

