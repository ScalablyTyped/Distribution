package typings.emberDashData

import typings.emberDashData.emberDashDataMod.default.DateTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/transforms/date", JSImport.Namespace)
@js.native
object transformsDateMod extends js.Object {
  /**
    * The `DS.DateTransform` class is used to serialize and deserialize
    * date attributes on Ember Data record objects. This transform is used
    * when `date` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function. It uses the [`ISO 8601`](https://en.wikipedia.org/wiki/ISO_8601)
    * standard.
    */
  @js.native
  class default () extends DateTransform
  
}

