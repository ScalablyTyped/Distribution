package typings.emberDashData.emberDashDataMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PromiseManyArray is a PromiseArray that also proxies certain method calls
  * to the underlying manyArray.
  * Right now we proxy:
  */
@JSImport("ember-data", "PromiseManyArray")
@js.native
class PromiseManyArray[T /* <: typings.emberDashData.emberDashDataMod.DS.Model */] ()
  extends typings.emberDashData.emberDashDataMod.DS.PromiseManyArray[T]

