package typings.egg.mod

import typings.egg.anon.FieldNameSize
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileStreamOptions extends js.Object {
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ String, 
      /* file */ js.Any, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit | Error
    ]
  ] = js.native
   // required file submit, default is true
  var defCharset: js.UndefOr[String] = js.native
  var limits: js.UndefOr[FieldNameSize] = js.native
  var requireFile: js.UndefOr[Boolean] = js.native
}

object GetFileStreamOptions {
  @scala.inline
  def apply(): GetFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileStreamOptions]
  }
  @scala.inline
  implicit class GetFileStreamOptionsOps[Self <: GetFileStreamOptions] (val x: Self) extends AnyVal {
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
    def setCheckFile(
      value: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | Error
    ): Self = this.set("checkFile", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCheckFile: Self = this.set("checkFile", js.undefined)
    @scala.inline
    def setDefCharset(value: String): Self = this.set("defCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefCharset: Self = this.set("defCharset", js.undefined)
    @scala.inline
    def setLimits(value: FieldNameSize): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setRequireFile(value: Boolean): Self = this.set("requireFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireFile: Self = this.set("requireFile", js.undefined)
  }
  
}

