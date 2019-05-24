package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartOptions extends js.Object {
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ java.lang.String, 
      /* file */ js.Any, 
      /* filename */ java.lang.String, 
      /* encoding */ java.lang.String, 
      /* mimetype */ java.lang.String, 
      scala.Unit | stdLib.Error
    ]
  ] = js.undefined
   // required file submit, default is true
  var defCharset: js.UndefOr[java.lang.String] = js.undefined
  var limits: js.UndefOr[Anon_FieldNameSize] = js.undefined
  var requireFile: js.UndefOr[scala.Boolean] = js.undefined
}

object MultipartOptions {
  @scala.inline
  def apply(
    checkFile: (/* fieldname */ java.lang.String, /* file */ js.Any, /* filename */ java.lang.String, /* encoding */ java.lang.String, /* mimetype */ java.lang.String) => scala.Unit | stdLib.Error = null,
    defCharset: java.lang.String = null,
    limits: Anon_FieldNameSize = null,
    requireFile: js.UndefOr[scala.Boolean] = js.undefined
  ): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    if (checkFile != null) __obj.updateDynamic("checkFile")(js.Any.fromFunction5(checkFile))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(requireFile)) __obj.updateDynamic("requireFile")(requireFile)
    __obj.asInstanceOf[MultipartOptions]
  }
}

