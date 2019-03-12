package typings
package enigmaDotJsLib.enigmaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMixin extends js.Object {
  /**
    * mixin.extend is an object containing methods to extend the generated API with. These method names cannot already exist or enigma.js will throw an error.
    */
  var extend: js.UndefOr[js.Any] = js.undefined
  /**
    * mixin.override is an object containing methods that overrides existing API methods.
    * These method names needs to exist already* or engima.js will throw an error.
    * Be careful when overriding, you may break expected behaviors in other mixins or your application.
    * base is a reference to the previous mixin method, can be used to invoke the mixin chain before this mixin method.
    */
  var `override`: js.UndefOr[js.Any] = js.undefined
  /**
    * QIX Engine types like for example GenericObject, Doc, GenericBookmark, are supported but also custom GenericObject
    * types such as barchart, story and myCustomType.
    * An API will get both their generic type as well as custom type mixins applied.
    */
  var types: js.Array[MixinType]
  def init(args: enigmaDotJsLib.Anon_Api): scala.Unit
}

object IMixin {
  @scala.inline
  def apply(
    init: enigmaDotJsLib.Anon_Api => scala.Unit,
    types: js.Array[MixinType],
    extend: js.Any = null,
    `override`: js.Any = null
  ): IMixin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), types = types)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (`override` != null) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[IMixin]
  }
}

