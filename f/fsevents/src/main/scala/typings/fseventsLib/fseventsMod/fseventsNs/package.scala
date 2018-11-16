package typings
package fseventsLib.fseventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fseventsNs {
  type BaseEventType = fseventsLib.fseventsLibStrings.created | fseventsLib.fseventsLibStrings.deleted | fseventsLib.fseventsLibStrings.modified | fseventsLib.fseventsLibStrings.`root-changed` | fseventsLib.fseventsLibStrings.unknown
  type EventType = fseventsLib.fseventsLibStrings.`moved-out` | fseventsLib.fseventsLibStrings.`moved-in` | BaseEventType
}
