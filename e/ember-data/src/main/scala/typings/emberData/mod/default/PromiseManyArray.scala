package typings.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PromiseManyArray is a PromiseArray that also proxies certain method calls
  * to the underlying manyArray.
  * Right now we proxy:
  */
@JSImport("ember-data", "PromiseManyArray")
@js.native
class PromiseManyArray[T /* <: typings.emberData.mod.DS.Model */] ()
  extends typings.emberData.mod.DS.PromiseManyArray[T]
