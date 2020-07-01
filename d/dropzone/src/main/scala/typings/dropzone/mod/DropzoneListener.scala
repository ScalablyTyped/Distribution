package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.mod.global.HTMLElement
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneListener extends js.Object {
  var element: HTMLElement
  var events: StringDictionary[js.Function1[/* e */ Event, _]]
}

object DropzoneListener {
  @scala.inline
  def apply(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ Event, _]]): DropzoneListener = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneListener]
  }
}

