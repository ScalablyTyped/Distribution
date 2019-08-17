package typings.atEmberObject.dashPrivateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/-private/types", "ComputedPropertyMarker")
@js.native
class ComputedPropertyMarker[Get, Set] () extends js.Object {
  // Necessary in order to avoid losing type information
  //    see: https://github.com/typed-ember/ember-cli-typescript/issues/246#issuecomment-414812013
  var ______getType: Get = js.native
  var ______setType: Set = js.native
}

