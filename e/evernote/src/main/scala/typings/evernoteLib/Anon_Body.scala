package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var bodyHash: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    bodyHash: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyHash != null) __obj.updateDynamic("bodyHash")(bodyHash)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

