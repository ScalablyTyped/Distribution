package typings.gifffer.giffferMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/krasimir/gifffer#styling|Styling}
  */
trait GiffferOptions extends js.Object {
  var playButtonIconStyles: StringDictionary[String]
  var playButtonStyles: StringDictionary[String]
}

object GiffferOptions {
  @scala.inline
  def apply(playButtonIconStyles: StringDictionary[String], playButtonStyles: StringDictionary[String]): GiffferOptions = {
    val __obj = js.Dynamic.literal(playButtonIconStyles = playButtonIconStyles.asInstanceOf[js.Any], playButtonStyles = playButtonStyles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GiffferOptions]
  }
}

