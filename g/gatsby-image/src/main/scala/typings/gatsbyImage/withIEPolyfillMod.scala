package typings.gatsbyImage

import typings.gatsbyImage.anon.ObjectFit
import typings.gatsbyImage.mod.GatsbyImageProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-image/withIEPolyfill", JSImport.Namespace)
@js.native
object withIEPolyfillMod extends js.Object {
  
  @js.native
  class default ()
    extends Component[GatsbyImageWithIEPolyfillProps, js.Object, js.Any]
  
  type GatsbyImageWithIEPolyfill = Component[GatsbyImageWithIEPolyfillProps, js.Object, js.Any]
  
  type GatsbyImageWithIEPolyfillProps = GatsbyImageProps with ObjectFit
}
