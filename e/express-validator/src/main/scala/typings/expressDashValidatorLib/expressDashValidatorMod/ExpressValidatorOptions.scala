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

