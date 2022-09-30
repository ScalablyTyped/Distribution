package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportsColor extends StObject {
  
  var supportsColor: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
}
object SupportsColor {
  
  inline def apply(
    supportsColor: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
  ): SupportsColor = {
    val __obj = js.Dynamic.literal(supportsColor = supportsColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportsColor]
  }
  
  extension [Self <: SupportsColor](x: Self) {
    
    inline def setSupportsColor(
      value: `false` | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.ColorSupport */ Any)
    ): Self = StObject.set(x, "supportsColor", value.asInstanceOf[js.Any])
  }
}
