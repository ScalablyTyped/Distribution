package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchOptions extends js.Object {
  /**
    * Callback used to compare to given lines to determine if they should be considered equal when patching.
    * Should return `false` if the lines should be rejected.
    *
    * @default strict equality
    */
  var compareLine: js.UndefOr[
    js.Function4[
      /* lineNumber */ scala.Double, 
      /* line */ java.lang.String, 
      /* operation */ diffLib.diffLibStrings.`-` | (diffLib.diffLibStrings.` `), 
      /* patchContent */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[scala.Double] = js.undefined
}

object ApplyPatchOptions {
  @scala.inline
  def apply(
    compareLine: (/* lineNumber */ scala.Double, /* line */ java.lang.String, /* operation */ diffLib.diffLibStrings.`-` | (diffLib.diffLibStrings.` `), /* patchContent */ java.lang.String) => scala.Boolean = null,
    fuzzFactor: scala.Int | scala.Double = null
  ): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4(compareLine))
    if (fuzzFactor != null) __obj.updateDynamic("fuzzFactor")(fuzzFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchOptions]
  }
}

