package typings
package giffferLib.giffferMod.GiffferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/krasimir/gifffer#styling|Styling}
  */
trait GiffferOptions extends js.Object {
  var playButtonIconStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var playButtonStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object GiffferOptions {
  @scala.inline
  def apply(
    playButtonIconStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    playButtonStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): GiffferOptions = {
    val __obj = js.Dynamic.literal(playButtonIconStyles = playButtonIconStyles, playButtonStyles = playButtonStyles)
  
    __obj.asInstanceOf[GiffferOptions]
  }
}

