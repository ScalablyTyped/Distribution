package typings
package enhancedDashResolveLib.enhancedDashResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "CachedInputFileSystem")
@js.native
class CachedInputFileSystem protected () extends js.Object {
  def this(fileSystem: enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem, duration: scala.Double) = this()
  var fileSystem: enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem = js.native
  var readFile: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var readFileSync: js.UndefOr[
    js.Function2[
      /* filename */ java.lang.String, 
      /* options */ js.UndefOr[enhancedDashResolveLib.Anon_Flag], 
      nodeLib.Buffer
    ]
  ] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var readJsonSync: js.UndefOr[js.Function1[/* path */ java.lang.String, _]] = js.native
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* files */ js.Array[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  var readdirSync: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* linkString */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  var readlinkSync: js.UndefOr[js.Function1[/* path */ java.lang.String | nodeLib.Buffer, java.lang.String]] = js.native
  var stat: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ java.lang.String | nodeLib.Buffer, nodeLib.fsMod.Stats]] = js.native
  def purge(): scala.Unit = js.native
  def purge(what: java.lang.String): scala.Unit = js.native
  def purge(what: js.Array[java.lang.String]): scala.Unit = js.native
}

