package typings.diff.mod

import typings.diff.diffStrings.Space
import typings.diff.diffStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.native
}

object ApplyPatchOptions {
  @scala.inline
  def apply(): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPatchOptions]
  }
  @scala.inline
  implicit class ApplyPatchOptionsOps[Self <: ApplyPatchOptions] (val x: Self) extends AnyVal {
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
    def setCompareLine(
      value: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean
    ): Self = this.set("compareLine", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCompareLine: Self = this.set("compareLine", js.undefined)
    @scala.inline
    def setFuzzFactor(value: Double): Self = this.set("fuzzFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzFactor: Self = this.set("fuzzFactor", js.undefined)
  }
  
}

