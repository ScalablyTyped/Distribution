package typings
package enhancedDashResolveLib.libStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var count: scala.Double = js.native
  var data: enhancedDashResolveLib.libConcordMod.Dictionary[_] = js.native
  var duration: scala.Double = js.native
  var interval: nodeLib.NodeJSNs.Timer | scala.Null = js.native
  var levels: js.Array[js.Array[java.lang.String]] = js.native
  var needTickCheck: scala.Boolean = js.native
  var nextTick: scala.Double | scala.Null = js.native
  var passive: scala.Boolean = js.native
  var running: enhancedDashResolveLib.libConcordMod.Dictionary[js.Array[js.Function]] = js.native
  def checkTicks(): scala.Unit = js.native
  def ensureTick(): scala.Unit = js.native
  def finished(name: java.lang.String, err: nodeLib.NodeJSNs.ErrnoException, result: js.Any): scala.Unit = js.native
  def finished(name: java.lang.String, err: scala.Null, result: js.Any): scala.Unit = js.native
  def finishedSync(name: java.lang.String): scala.Unit = js.native
  def finishedSync(name: java.lang.String, err: nodeLib.NodeJSNs.ErrnoException): scala.Unit = js.native
  def finishedSync(name: java.lang.String, err: nodeLib.NodeJSNs.ErrnoException, result: js.Any): scala.Unit = js.native
  def finishedSync(name: java.lang.String, err: scala.Null, result: js.Any): scala.Unit = js.native
  def provide(
    name: java.lang.String,
    provider: enhancedDashResolveLib.libCommonDashTypesMod.CommonFileSystemMethod,
    callback: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def provideSync(name: java.lang.String, provider: js.Function1[/* name */ java.lang.String, _]): js.Any = js.native
  def purge(): scala.Unit = js.native
  def purge(what: java.lang.String): scala.Unit = js.native
  def purge(what: js.Array[java.lang.String]): scala.Unit = js.native
  def tick(): js.UndefOr[enhancedDashResolveLib.enhancedDashResolveLibNumbers.`true`] = js.native
}

