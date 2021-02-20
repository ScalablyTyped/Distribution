package typings.emberDataSerializer

import typings.emberData.mod.default.EmbeddedRecordsMixin
import typings.emberData.mod.default.RESTSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restMod {
  
  @JSImport("@ember-data/serializer/rest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Normally, applications will use the `RESTSerializer` by implementing
    * the `normalize` method.
    */
  @JSImport("@ember-data/serializer/rest", JSImport.Default)
  @js.native
  class default () extends RESTSerializer
  
  @JSImport("@ember-data/serializer/rest", "EmbeddedRecordsMixin")
  @js.native
  def EmbeddedRecordsMixin: typings.emberData.mod.default.EmbeddedRecordsMixin = js.native
  @scala.inline
  def EmbeddedRecordsMixin_=(x: EmbeddedRecordsMixin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedRecordsMixin")(x.asInstanceOf[js.Any])
}
