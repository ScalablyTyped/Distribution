package typings.diff.diffMod

import typings.diff.diffStrings.Space
import typings.diff.diffStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchesOptions extends ApplyPatchOptions {
  def complete(err: js.Any): Unit
  def loadFile(index: ParsedDiff, callback: js.Function2[/* err */ js.Any, /* data */ String, Unit]): Unit
  def patched(index: ParsedDiff, content: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
}

object ApplyPatchesOptions {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    loadFile: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => Unit,
    patched: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => Unit,
    compareLine: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean = null,
    fuzzFactor: Int | Double = null
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), loadFile = js.Any.fromFunction2(loadFile), patched = js.Any.fromFunction3(patched))
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4(compareLine))
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
}

