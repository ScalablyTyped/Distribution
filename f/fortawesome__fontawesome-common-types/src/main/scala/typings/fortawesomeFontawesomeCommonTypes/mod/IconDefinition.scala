package typings.fortawesomeFontawesomeCommonTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefinition extends IconLookup {
  var icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData]
}

object IconDefinition {
  @scala.inline
  def apply(
    icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData],
    iconName: IconName,
    prefix: IconPrefix
  ): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IconDefinition]
  }
}

