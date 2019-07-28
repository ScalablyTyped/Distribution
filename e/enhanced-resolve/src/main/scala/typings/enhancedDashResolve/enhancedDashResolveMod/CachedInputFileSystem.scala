package typings.enhancedDashResolve.enhancedDashResolveMod

import typings.enhancedDashResolve.Anon_Flag
import typings.enhancedDashResolve.libCommonDashTypesMod.AbstractInputFileSystem
import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "CachedInputFileSystem")
@js.native
class CachedInputFileSystem protected () extends js.Object {
  def this(fileSystem: AbstractInputFileSystem, duration: Double) = this()
  var fileSystem: AbstractInputFileSystem = js.native
  var readFile: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit], 
      Unit
    ]
  ] = js.native
  var readFileSync: js.UndefOr[js.Function2[/* filename */ String, /* options */ js.UndefOr[Anon_Flag], Buffer]] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var readJsonSync: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit], 
      Unit
    ]
  ] = js.native
  var readdirSync: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* linkString */ String, Unit], 
      Unit
    ]
  ] = js.native
  var readlinkSync: js.UndefOr[js.Function1[/* path */ String | Buffer, String]] = js.native
  var stat: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit], 
      Unit
    ]
  ] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ String | Buffer, Stats]] = js.native
  def purge(): Unit = js.native
  def purge(what: String): Unit = js.native
  def purge(what: js.Array[String]): Unit = js.native
}

