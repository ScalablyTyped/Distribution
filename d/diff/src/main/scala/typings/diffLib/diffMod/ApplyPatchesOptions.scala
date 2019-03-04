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
    complete: js.Function1[js.Any, scala.Unit],
    loadFile: js.Function2[
      ParsedDiff, 
      js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    patched: js.Function3[ParsedDiff, java.lang.String, js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    compareLine: js.Function4[
      /* lineNumber */ scala.Double, 
      /* line */ java.lang.String, 
      /* operation */ diffLib.diffLibStrings.`-` | (diffLib.diffLibStrings.` `), 
      /* patchContent */ java.lang.String, 
      scala.Boolean
    ] = null,
    fuzzFactor: scala.Int | scala.Double = null
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = complete, loadFile = loadFile, patched = patched)
    if (compareLine != null) __obj.updateDynamic("compareLine")(compareLine)
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
}

