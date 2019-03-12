package typings
package enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeJsInputFileSystem extends js.Object {
  def readFile(
    filename: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: enhancedDashResolveLib.Anon_Encoding,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: enhancedDashResolveLib.Anon_Flag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFileSync(filename: java.lang.String): nodeLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def readFileSync(filename: java.lang.String, options: enhancedDashResolveLib.Anon_Encoding): java.lang.String = js.native
  def readFileSync(filename: java.lang.String, options: enhancedDashResolveLib.Anon_Flag): nodeLib.Buffer = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def readdirSync(path: java.lang.String): js.Array[java.lang.String] = js.native
  def readlink(path: java.lang.String): scala.Unit = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* linkString */ java.lang.String, _]
  ): scala.Unit = js.native
  def readlinkSync(path: java.lang.String): java.lang.String = js.native
  def readlinkSync(path: nodeLib.Buffer): java.lang.String = js.native
  def stat(path: java.lang.String): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ nodeLib.fsMod.Stats, _]
  ): scala.Unit = js.native
  def statSync(path: java.lang.String): nodeLib.fsMod.Stats = js.native
  def statSync(path: nodeLib.Buffer): nodeLib.fsMod.Stats = js.native
}

