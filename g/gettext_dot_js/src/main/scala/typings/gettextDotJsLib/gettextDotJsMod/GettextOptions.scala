package typings
package gettextDotJsLib.gettextDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GettextOptions extends js.Object {
  var ctxt_delimiter: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var plural_func: js.UndefOr[PluralForm] = js.undefined
}

object GettextOptions {
  @scala.inline
  def apply(
    ctxt_delimiter: java.lang.String = null,
    domain: java.lang.String = null,
    locale: java.lang.String = null,
    plural_func: PluralForm = null
  ): GettextOptions = {
    val __obj = js.Dynamic.literal()
    if (ctxt_delimiter != null) __obj.updateDynamic("ctxt_delimiter")(ctxt_delimiter)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (plural_func != null) __obj.updateDynamic("plural_func")(plural_func)
    __obj.asInstanceOf[GettextOptions]
  }
}

