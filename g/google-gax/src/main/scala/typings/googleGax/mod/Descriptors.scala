package typings.googleGax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.descriptorMod.LongrunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptors extends js.Object {
  var longrunning: StringDictionary[LongrunningDescriptor]
  var page: StringDictionary[typings.googleGax.descriptorMod.PageDescriptor]
  var stream: StringDictionary[typings.googleGax.descriptorMod.StreamDescriptor]
}

object Descriptors {
  @scala.inline
  def apply(
    longrunning: StringDictionary[LongrunningDescriptor],
    page: StringDictionary[typings.googleGax.descriptorMod.PageDescriptor],
    stream: StringDictionary[typings.googleGax.descriptorMod.StreamDescriptor]
  ): Descriptors = {
    val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors]
  }
}

