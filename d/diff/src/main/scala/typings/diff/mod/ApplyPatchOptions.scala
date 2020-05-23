package typings.diff.mod

import typings.diff.diffStrings.Space
import typings.diff.diffStrings.`-_`
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
      /* lineNumber */ Double, 
      /* line */ String, 
      /* operation */ `-_` | Space, 
      /* patchContent */ String, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.undefined
}

object ApplyPatchOptions {
  @scala.inline
  def apply(
    compareLine: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean = null,
    fuzzFactor: js.UndefOr[Double] = js.undefined
  ): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    if (compareLine != null) __obj.updateDynamic("compareLine")(js.Any.fromFunction4(compareLine))
    if (!js.isUndefined(fuzzFactor)) __obj.updateDynamic("fuzzFactor")(fuzzFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPatchOptions]
  }
}

