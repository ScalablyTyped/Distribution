package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchDelegate extends js.Object {
  var change: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var create: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var mkdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var rmdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
  var unlink: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.undefined
}

object PatchDelegate {
  @scala.inline
  def apply(
    change: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit = null,
    create: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit = null,
    mkdir: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit = null,
    rmdir: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit = null,
    unlink: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit = null
  ): PatchDelegate = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction3(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction3(create))
    if (mkdir != null) __obj.updateDynamic("mkdir")(js.Any.fromFunction3(mkdir))
    if (rmdir != null) __obj.updateDynamic("rmdir")(js.Any.fromFunction3(rmdir))
    if (unlink != null) __obj.updateDynamic("unlink")(js.Any.fromFunction3(unlink))
    __obj.asInstanceOf[PatchDelegate]
  }
}

