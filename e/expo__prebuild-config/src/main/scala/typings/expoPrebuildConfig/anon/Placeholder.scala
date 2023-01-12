package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBViewController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var placeholder: js.Array[IBItemidstringplaceholder]
  
  var viewController: js.Array[IBViewController]
}
object Placeholder {
  
  inline def apply(placeholder: js.Array[IBItemidstringplaceholder], viewController: js.Array[IBViewController]): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], viewController = viewController.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
    
    inline def setPlaceholder(value: js.Array[IBItemidstringplaceholder]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderVarargs(value: IBItemidstringplaceholder*): Self = StObject.set(x, "placeholder", js.Array(value*))
    
    inline def setViewController(value: js.Array[IBViewController]): Self = StObject.set(x, "viewController", value.asInstanceOf[js.Any])
    
    inline def setViewControllerVarargs(value: IBViewController*): Self = StObject.set(x, "viewController", js.Array(value*))
  }
}
