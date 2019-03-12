package typings
package getoptsLib.getoptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  var boolean: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* optionName */ java.lang.String, scala.Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    boolean: js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    unknown: /* optionName */ java.lang.String => scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (default != null) __obj.updateDynamic("default")(default)
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[Options]
  }
}

