package typings.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The store contains all of the data for records loaded from the server.
  * It is also responsible for creating instances of `DS.Model` that wrap
  * the individual data for a record, so that they can be bound to in your
  * Handlebars templates.
  */
@JSImport("ember-data", "Store")
@js.native
class Store ()
  extends typings.emberData.mod.DS.Store
