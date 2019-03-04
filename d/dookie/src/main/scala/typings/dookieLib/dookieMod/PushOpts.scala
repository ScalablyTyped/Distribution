package typings
package dookieLib.dookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushOpts extends js.Object {
  var dropDatabase: scala.Boolean
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object PushOpts {
  @scala.inline
  def apply(dropDatabase: scala.Boolean, filename: java.lang.String = null): PushOpts = {
    val __obj = js.Dynamic.literal(dropDatabase = dropDatabase)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[PushOpts]
  }
}

