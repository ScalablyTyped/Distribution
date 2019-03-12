package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressValidatorOptions extends js.Object {
  var customSanitizers: js.UndefOr[stdLib.Record[java.lang.String, js.Function1[/* repeated */ _, _]]] = js.undefined
  var customValidators: js.UndefOr[
    stdLib.Record[java.lang.String, js.Function1[/* repeated */ _, scala.Boolean | js.Promise[_]]]
  ] = js.undefined
  var errorFormatter: js.UndefOr[
    js.Function4[
      /* param */ java.lang.String, 
      /* msg */ java.lang.String, 
      /* value */ js.Any, 
      /* location */ expressDashValidatorLib.checkLocationMod.Location, 
      _
    ]
  ] = js.undefined
}

object ExpressValidatorOptions {
  @scala.inline
  def apply(
    customSanitizers: stdLib.Record[java.lang.String, js.Function1[/* repeated */ _, _]] = null,
    customValidators: stdLib.Record[java.lang.String, js.Function1[/* repeated */ _, scala.Boolean | js.Promise[_]]] = null,
    errorFormatter: (/* param */ java.lang.String, /* msg */ java.lang.String, /* value */ js.Any, /* location */ expressDashValidatorLib.checkLocationMod.Location) => _ = null
  ): ExpressValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (customSanitizers != null) __obj.updateDynamic("customSanitizers")(customSanitizers)
    if (customValidators != null) __obj.updateDynamic("customValidators")(customValidators)
    if (errorFormatter != null) __obj.updateDynamic("errorFormatter")(js.Any.fromFunction4(errorFormatter))
    __obj.asInstanceOf[ExpressValidatorOptions]
  }
}

