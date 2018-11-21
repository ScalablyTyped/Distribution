package typings
package dplayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dplayerMod {
  type DirectionType = dplayerLib.dplayerLibStrings.top | dplayerLib.dplayerLibStrings.right | dplayerLib.dplayerLibStrings.bottom
  type FullScreenType = dplayerLib.dplayerLibStrings.web | dplayerLib.dplayerLibStrings.browser
  type Lang = dplayerLib.dplayerLibStrings.en | dplayerLib.dplayerLibStrings.`zh-cn` | dplayerLib.dplayerLibStrings.`zh-tw`
  type Preload = dplayerLib.dplayerLibStrings.none | dplayerLib.dplayerLibStrings.metadata | dplayerLib.dplayerLibStrings.auto
  type SubTitleType = dplayerLib.dplayerLibStrings.webvtt | dplayerLib.dplayerLibStrings.ass
  type VideoType = dplayerLib.dplayerLibStrings.auto | dplayerLib.dplayerLibStrings.hls | dplayerLib.dplayerLibStrings.flv | dplayerLib.dplayerLibStrings.dash | dplayerLib.dplayerLibStrings.webtorrent | dplayerLib.dplayerLibStrings.normal
}
