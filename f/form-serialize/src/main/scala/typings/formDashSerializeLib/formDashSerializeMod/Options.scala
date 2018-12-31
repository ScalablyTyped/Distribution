package typings
package formDashSerializeLib.formDashSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Result] extends js.Object {
  /** If true serialize disabled fields. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** If true serialize empty fields */
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  /** Configure the output type. If true, the output will be a js object. */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
    * value) and should return new result hash and url encoded str serializers are provided with this module
    */
  var serializer: js.UndefOr[
    js.Function3[/* result */ Result, /* key */ java.lang.String, /* value */ java.lang.String, Result]
  ] = js.undefined
}

