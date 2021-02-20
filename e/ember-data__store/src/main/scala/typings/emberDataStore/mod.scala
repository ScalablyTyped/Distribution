package typings.emberDataStore

import typings.emberData.mod.default.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The store contains all of the data for records loaded from the server.
    * It is also responsible for creating instances of `DS.Model` that wrap
    * the individual data for a record, so that they can be bound to in your
    * Handlebars templates.
    */
  @JSImport("@ember-data/store", JSImport.Default)
  @js.native
  class default () extends Store
  
  /**
    * This method normalizes a modelName into the format Ember Data uses
    * internally.
    */
  @JSImport("@ember-data/store", "normalizeModelName")
  @js.native
  def normalizeModelName[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): String = js.native
}
