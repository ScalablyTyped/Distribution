package typings.egg.eggMod

import typings.egg.Anon_FieldNameSize
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
   // required file submit, default is true
  var defCharset: js.UndefOr[String] = js.undefined
  var limits: js.UndefOr[Anon_FieldNameSize] = js.undefined
  var requireFile: js.UndefOr[Boolean] = js.undefined
}

object GetFileStreamOptions {
  @scala.inline
  def apply(
    checkFile: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | Error = null,
    defCharset: String = null,
    limits: Anon_FieldNameSize = null,
    requireFile: js.UndefOr[Boolean] = js.undefined
  ): GetFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (checkFile != null) __obj.updateDynamic("checkFile")(js.Any.fromFunction5(checkFile))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(requireFile)) __obj.updateDynamic("requireFile")(requireFile)
    __obj.asInstanceOf[GetFileStreamOptions]
  }
}

