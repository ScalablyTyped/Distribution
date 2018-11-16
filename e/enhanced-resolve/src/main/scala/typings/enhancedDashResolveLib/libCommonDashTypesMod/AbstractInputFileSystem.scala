package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractInputFileSystem extends js.Object {
  var purge: js.UndefOr[
    js.Function1[/* what */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], scala.Unit]
  ] = js.native
  var readFileSync: js.UndefOr[js.Function1[/* filename */ java.lang.String, nodeLib.Buffer]] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var readJsonSync: js.UndefOr[js.Function1[/* path */ java.lang.String, _]] = js.native
  var readdirSync: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  var readlinkSync: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ java.lang.String, nodeLib.fsMod.Stats]] = js.native
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
  def readdir(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

