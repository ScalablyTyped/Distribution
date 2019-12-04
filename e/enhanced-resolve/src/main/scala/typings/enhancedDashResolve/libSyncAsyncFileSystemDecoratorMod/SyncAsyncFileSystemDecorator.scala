package typings.enhancedDashResolve.libSyncAsyncFileSystemDecoratorMod

import typings.enhancedDashResolve.libCommonDashTypesMod.AbstractInputFileSystem
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncAsyncFileSystemDecorator extends js.Object {
  var fs: AbstractInputFileSystem
  var readFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]
  ] = js.undefined
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit], 
      Unit
    ]
  ] = js.undefined
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
  var stat: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit], 
      Unit
    ]
  ] = js.undefined
}

object SyncAsyncFileSystemDecorator {
  @scala.inline
  def apply(
    fs: AbstractInputFileSystem,
    readFile: (/* filename */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit]) => Unit = null,
    readJson: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit]) => Unit = null,
    readdir: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit]) => Unit = null,
    readlink: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit]) => Unit = null,
    stat: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]) => Unit = null
  ): SyncAsyncFileSystemDecorator = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction2(readFile))
    if (readJson != null) __obj.updateDynamic("readJson")(js.Any.fromFunction2(readJson))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2(readdir))
    if (readlink != null) __obj.updateDynamic("readlink")(js.Any.fromFunction2(readlink))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2(stat))
    __obj.asInstanceOf[SyncAsyncFileSystemDecorator]
  }
}

