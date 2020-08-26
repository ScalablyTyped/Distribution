package typings.enhancedResolve.syncAsyncFileSystemDecoratorMod

import typings.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncAsyncFileSystemDecorator extends js.Object {
  var fs: AbstractInputFileSystem = js.native
  var readFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]
  ] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit], 
      Unit
    ]
  ] = js.native
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
  var stat: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit], 
      Unit
    ]
  ] = js.native
}

object SyncAsyncFileSystemDecorator {
  @scala.inline
  def apply(fs: AbstractInputFileSystem): SyncAsyncFileSystemDecorator = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncAsyncFileSystemDecorator]
  }
  @scala.inline
  implicit class SyncAsyncFileSystemDecoratorOps[Self <: SyncAsyncFileSystemDecorator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFs(value: AbstractInputFileSystem): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadFile(
      value: (/* filename */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit]) => Unit
    ): Self = this.set("readFile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    @scala.inline
    def setReadJson(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("readJson", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReadJson: Self = this.set("readJson", js.undefined)
    @scala.inline
    def setReaddir(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit]) => Unit
    ): Self = this.set("readdir", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReaddir: Self = this.set("readdir", js.undefined)
    @scala.inline
    def setReadlink(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("readlink", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReadlink: Self = this.set("readlink", js.undefined)
    @scala.inline
    def setStat(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]) => Unit
    ): Self = this.set("stat", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
  }
  
}

