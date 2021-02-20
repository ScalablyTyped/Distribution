package typings.emberDataAdapter

import typings.emberData.mod.DS.Adapter
import typings.emberData.mod.default.BuildURLMixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember-data/adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An adapter is an object that receives requests from a store and
    * translates them into the appropriate action to take against your
    * persistence layer. The persistence layer is usually an HTTP API, but
    * may be anything, such as the browser's local storage. Typically the
    * adapter is not invoked directly instead its functionality is accessed
    * through the `store`.
    */
  @JSImport("@ember-data/adapter", JSImport.Default)
  @js.native
  class default () extends Adapter
  
  @JSImport("@ember-data/adapter", "BuildURLMixin")
  @js.native
  def BuildURLMixin: typings.emberData.mod.default.BuildURLMixin = js.native
  @scala.inline
  def BuildURLMixin_=(x: BuildURLMixin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BuildURLMixin")(x.asInstanceOf[js.Any])
}
