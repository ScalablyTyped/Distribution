package typings.ffmpegJs.ffmpegMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var MEMFS: js.UndefOr[js.Array[Video]] = js.undefined
  var TOTAL_MEMORY: js.UndefOr[Double] = js.undefined
  var arguments: js.Array[String]
  var mounts: js.UndefOr[js.Array[Mount]] = js.undefined
  var onExit: js.UndefOr[js.Function1[/* code */ js.Any, Unit]] = js.undefined
  var print: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var printErr: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var stdin: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arguments: js.Array[String],
    MEMFS: js.Array[Video] = null,
    TOTAL_MEMORY: js.UndefOr[Double] = js.undefined,
    mounts: js.Array[Mount] = null,
    onExit: /* code */ js.Any => Unit = null,
    print: /* data */ js.Any => Unit = null,
    printErr: /* data */ js.Any => Unit = null,
    stdin: /* data */ js.Any => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    if (MEMFS != null) __obj.updateDynamic("MEMFS")(MEMFS.asInstanceOf[js.Any])
    if (!js.isUndefined(TOTAL_MEMORY)) __obj.updateDynamic("TOTAL_MEMORY")(TOTAL_MEMORY.get.asInstanceOf[js.Any])
    if (mounts != null) __obj.updateDynamic("mounts")(mounts.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction1(print))
    if (printErr != null) __obj.updateDynamic("printErr")(js.Any.fromFunction1(printErr))
    if (stdin != null) __obj.updateDynamic("stdin")(js.Any.fromFunction1(stdin))
    __obj.asInstanceOf[Options]
  }
}

