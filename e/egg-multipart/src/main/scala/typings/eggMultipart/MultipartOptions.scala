package typings.eggMultipart

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartOptions extends js.Object {
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
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  var requireFile: js.UndefOr[Boolean] = js.undefined
}

object MultipartOptions {
  @scala.inline
  def apply(
    checkFile: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | Error = null,
    defCharset: String = null,
    limits: AnonFieldNameSize = null,
    requireFile: js.UndefOr[Boolean] = js.undefined
  ): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    if (checkFile != null) __obj.updateDynamic("checkFile")(js.Any.fromFunction5(checkFile))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(requireFile)) __obj.updateDynamic("requireFile")(requireFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartOptions]
  }
}

