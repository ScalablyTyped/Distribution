package typings.emberData

import typings.emberData.mod.default.DateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  /**
    * The `DS.DateTransform` class is used to serialize and deserialize
    * date attributes on Ember Data record objects. This transform is used
    * when `date` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function. It uses the [`ISO 8601`](https://en.wikipedia.org/wiki/ISO_8601)
    * standard.
    */
  @JSImport("ember-data/transforms/date", JSImport.Default)
  @js.native
  class default () extends DateTransform
}
