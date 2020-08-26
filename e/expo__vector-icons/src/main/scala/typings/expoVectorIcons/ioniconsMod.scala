package typings.expoVectorIcons

import org.scalablytyped.runtime.TopLevel
import typings.expoVectorIcons.createIconSetMod.Icon
import typings.expoVectorIcons.createIconSetMod.IconProps
import typings.expoVectorIcons.expoVectorIconsStrings.ionicons
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons/build/Ionicons", JSImport.Namespace)
@js.native
object ioniconsMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[IconProps[String], js.Object, js.Any] {
    def this(props: IconProps[String]) = this()
  }
  
  @js.native
  object default extends TopLevel[Icon[String, ionicons]]
  
}

