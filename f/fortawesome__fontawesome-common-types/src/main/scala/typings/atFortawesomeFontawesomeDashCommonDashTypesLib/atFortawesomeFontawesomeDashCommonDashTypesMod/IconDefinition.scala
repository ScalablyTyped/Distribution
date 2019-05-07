package typings
package atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefinition extends IconLookup {
  var icon: js.Tuple5[
    scala.Double, 
    scala.Double, 
    js.Array[java.lang.String], 
    java.lang.String, 
    java.lang.String
  ]
}

object IconDefinition {
  @scala.inline
  def apply(
    icon: js.Tuple5[
      scala.Double, 
      scala.Double, 
      js.Array[java.lang.String], 
      java.lang.String, 
      java.lang.String
    ],
    iconName: IconName,
    prefix: IconPrefix
  ): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon, iconName = iconName, prefix = prefix)
  
    __obj.asInstanceOf[IconDefinition]
  }
}

