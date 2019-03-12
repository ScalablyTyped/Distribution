package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchesOptions extends ApplyPatchOptions {
  def complete(err: js.Any): scala.Unit
  def loadFile(
    index: ParsedDiff,
    callback: js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit
  def patched(index: ParsedDiff, content: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
}

object ApplyPatchesOptions {
  @scala.inline
  def apply(
    complete: js.Any => scala.Unit,
    loadFile: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit]) => scala.Unit,
    patched: (ParsedDiff, java.lang.String, js.Function1[/* err */ js.Any, scala.Unit]) => scala.Unit,
    compareLine: (/* lineNumber */ scala.Double, /* line */ java.lang.String, /* operation */ diffLib.diffLibStrings.`-` | (diffLib.diffLibStrings.` `), /* patchContent */ java.lang.String) => scala.Boolean = null,
    fuzzFactor: scala.Int | scala.Double = null
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), loadFile = js.Any.fromFunction2(loadFile), patched = js.Any.fromFunction3(patched))
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4(compareLine))
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
}

