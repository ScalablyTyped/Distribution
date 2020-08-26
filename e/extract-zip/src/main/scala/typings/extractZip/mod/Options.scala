package typings.extractZip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var defaultDirMode: js.UndefOr[Double] = js.native
  var defaultFileMode: js.UndefOr[Double] = js.native
  var dir: js.UndefOr[String] = js.native
  var onEntry: js.UndefOr[js.Function2[/* entry */ js.Any, /* zipfile */ js.Any, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDefaultDirMode(value: Double): Self = this.set("defaultDirMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDirMode: Self = this.set("defaultDirMode", js.undefined)
    @scala.inline
    def setDefaultFileMode(value: Double): Self = this.set("defaultFileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFileMode: Self = this.set("defaultFileMode", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setOnEntry(value: (/* entry */ js.Any, /* zipfile */ js.Any) => Unit): Self = this.set("onEntry", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEntry: Self = this.set("onEntry", js.undefined)
  }
  
}

