package typings.emberDataSerializer

import typings.emberData.mod.DS.RESTSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember-data/serializer/rest", JSImport.Namespace)
@js.native
object restMod extends js.Object {
  
  var EmbeddedRecordsMixin: typings.emberData.mod.default.EmbeddedRecordsMixin = js.native
  
  /**
    * Normally, applications will use the `RESTSerializer` by implementing
    * the `normalize` method.
    */
  @js.native
  class default () extends RESTSerializer
}
