package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPatchesOptions extends ApplyPatchOptions {
  def complete(err: js.Any): Unit = js.native
  def loadFile(index: ParsedDiff, callback: js.Function2[/* err */ js.Any, /* data */ String, Unit]): Unit = js.native
  def patched(index: ParsedDiff, content: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

object ApplyPatchesOptions {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    loadFile: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => Unit,
    patched: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => Unit
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), loadFile = js.Any.fromFunction2(loadFile), patched = js.Any.fromFunction3(patched))
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
  @scala.inline
  implicit class ApplyPatchesOptionsOps[Self <: ApplyPatchesOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFile(value: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => Unit): Self = this.set("loadFile", js.Any.fromFunction2(value))
    @scala.inline
    def setPatched(value: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = this.set("patched", js.Any.fromFunction3(value))
  }
  
}

